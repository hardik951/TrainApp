import java.util.ArrayList;
import java.util.List;

class Bogie {
    String name;
    int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return name + " (" + capacity + " seats)";
    }
}

public class TrainApp {
    public static void main(String[] args) {

        // Reuse list of passenger bogies
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 78));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("Sleeper", 72));

        // Aggregate total seating capacity using Stream and reduce
        int totalSeats = bogies.stream()
                .map(b -> b.capacity)           // Extract capacities
                .reduce(0, Integer::sum);      // Sum them

        // Display total seating capacity
        System.out.println("Total seating capacity of the train: " + totalSeats + " seats");

        // Original list remains unchanged
        System.out.println("\nOriginal bogie list:");
        bogies.forEach(System.out::println);
    }
}