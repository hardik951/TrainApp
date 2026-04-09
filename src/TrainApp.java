import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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

        // Create list of passenger bogies (reuse from UC7)
        List<Bogie> passengerBogies = new ArrayList<>();
        passengerBogies.add(new Bogie("Sleeper", 72));
        passengerBogies.add(new Bogie("AC Chair", 78));
        passengerBogies.add(new Bogie("First Class", 24));

        // Filter bogies with capacity > 60
        List<Bogie> highCapacityBogies = passengerBogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        // Display filtered bogies
        System.out.println("Passenger bogies with capacity > 60:");
        highCapacityBogies.forEach(System.out::println);

        // Original list remains unchanged
        System.out.println("\nOriginal bogie list:");
        passengerBogies.forEach(System.out::println);
    }
}