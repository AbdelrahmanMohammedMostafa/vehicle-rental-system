import java.time.LocalDate;

public class Main {

    static boolean hasLicense = true;
    static boolean vehicleAvailable = true;
    static double pricePerDay = 50;

    public static void main(String[] args) {

        Rental r1 = rentVehicle("C001", "V001", LocalDate.now(), LocalDate.now().plusDays(3));
        if (r1 != null) {
            System.out.println(r1.id + " " + r1.customerId + " " + r1.vehicleId + " " + r1.totalCost + " " + r1.status);
        }

        Rental r2 = rentVehicle("C002", "V001", LocalDate.now(), LocalDate.now().plusDays(2));
        if (r2 == null) {
            System.out.println("car is not available");
        }

        returnVehicle(r1);
        System.out.println(r1.id + " status: " + r1.status);

        Rental r3 = rentVehicle("C003", "V001", LocalDate.now(), LocalDate.now().plusDays(1));
        cancelRental(r3);

        boolean done = markCompleted(r3);
        if (!done) {
            System.out.println("NO CANCEL");
        }
    }

    static Rental rentVehicle(String customerId, String vehicleId, LocalDate rentalDate, LocalDate returnDate) {

        if (hasLicense == false) {
            System.out.println("NO LICENSE");
            return null;
        }

        if (vehicleAvailable == false) {
            System.out.println("car is not here");
            return null;
        }

        if (rentalDate.isBefore(LocalDate.now())) {
            System.out.println("date expired");
            return null;
        }

        if (returnDate.isBefore(rentalDate) || returnDate.isEqual(rentalDate)) {
            System.out.println("back date must after rent date");
            return null;
        }

        int days = 0;
        LocalDate temp = rentalDate;
        while (temp.isBefore(returnDate)) {
            temp = temp.plusDays(1);
            days = days + 1;
        }

        double cost = days * pricePerDay;

        Rental rental = new Rental();
        rental.id = "R001";
        rental.customerId = customerId;
        rental.vehicleId = vehicleId;
        rental.rentalDate = rentalDate;
        rental.returnDate = returnDate;
        rental.totalCost = cost;
        rental.status = "Active";

        vehicleAvailable = false;

        return rental;
    }

    static void returnVehicle(Rental rental) {
        rental.status = "Completed";
        vehicleAvailable = true;
    }

    static void cancelRental(Rental rental) {
        rental.status = "Cancelled";
        vehicleAvailable = true;
    }

    static boolean markCompleted(Rental rental) {
        if (rental.status.equals("Cancelled")) {
            return false;
        }
        rental.status = "Completed";
        return true;
    }
}

class Rental {
    String id;
    String customerId;
    String vehicleId;
    LocalDate rentalDate;
    LocalDate returnDate;
    double totalCost;
    String status;
}
