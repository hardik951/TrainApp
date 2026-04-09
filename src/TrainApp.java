class InvalidCapacityException extends Exception {
    public InvalidCapacityException(String message) {
        super(message);
    }
}

class PassengerBogie {
    private String bogieId;
    private int capacity;

    public PassengerBogie(String bogieId, int capacity) throws InvalidCapacityException {
        if (capacity <= 0) {
            throw new InvalidCapacityException("Capacity must be greater than zero. Received: " + capacity);
        }
        this.bogieId = bogieId;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "PassengerBogie [ID=" + bogieId + ", Capacity=" + capacity + "]";
    }
}

public class TrainApp {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management System (UC14) ===\n");

        try {
            System.out.println("Scenario 1: Creating a Sleeper Bogie with 72 seats...");
            PassengerBogie b1 = new PassengerBogie("S1", 72);
            System.out.println("Result: " + b1 + " successfully added.\n");
        } catch (InvalidCapacityException e) {
            System.out.println("Result: Error occurred - " + e.getMessage() + "\n");
        }

        try {
            System.out.println("Scenario 2: Creating a Bogie with 0 seats...");
            PassengerBogie b2 = new PassengerBogie("Z0", 0);
            System.out.println("Result: " + b2);
        } catch (InvalidCapacityException e) {
            System.err.println("Result: EXCEPTION CAUGHT -> " + e.getMessage() + "\n");
        }

        try {
            Thread.sleep(50);
            System.out.println("Scenario 3: Creating a Bogie with -10 seats...");
            PassengerBogie b3 = new PassengerBogie("N10", -10);
            System.out.println("Result: " + b3);
        } catch (InvalidCapacityException e) {
            System.err.println("Result: EXCEPTION CAUGHT -> " + e.getMessage());
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
        }

        System.out.println("\nProgram execution continues safely...");
    }
}