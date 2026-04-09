import java.util.HashMap;
import java.util.Map;

public class TrainApp {
    public static void main(String[] args) {

        // Create HashMap to store bogie and its capacity
        HashMap<String, Integer> bogieCapacity = new HashMap<>();

        // Add bogie-capacity mappings
        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 78);
        bogieCapacity.put("First Class", 24);

        // Display bogie capacities
        System.out.println("Bogie Capacity Details:");

        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue() + " seats");
        }
    }
}