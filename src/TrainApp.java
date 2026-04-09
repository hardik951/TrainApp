import java.util.LinkedHashSet;

public class TrainApp {
    public static void main(String[] args) {

        // Create LinkedHashSet for train formation
        LinkedHashSet<String> train = new LinkedHashSet<>();

        // Add bogies
        train.add("Engine");
        train.add("Sleeper");
        train.add("Cargo");
        train.add("Guard");

        // Attempt to add duplicate bogie
        train.add("Sleeper"); // duplicate

        // Display final train formation
        System.out.println("Final Train Formation:");
        System.out.println(train);
    }
}