import java.util.ArrayList;
import java.util.List;
import java.util.Map;
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

        // Reuse list of passenger bogies
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 78));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("Sleeper", 72)); // Duplicate name to test grouping

        // Group bogies by type (name)
        Map<String, List<Bogie>> groupedBogies = bogies.stream()
                .collect(Collectors.groupingBy(b -> b.name));

        // Display grouped result
        System.out.println("Grouped bogies by type:");
        groupedBogies.forEach((type, bogieList) -> {
            System.out.println(type + " -> " + bogieList);
        });

        // Original list remains unchanged
        System.out.println("\nOriginal bogie list:");
        bogies.forEach(System.out::println);
    }
}