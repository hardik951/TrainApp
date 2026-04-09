import java.util.HashSet;

public class TrainApp {
    public static void main(String[] args) {

        // Create HashSet to store unique bogie IDs
        HashSet<String> bogieIds = new HashSet<>();

        // Add bogie IDs (including duplicates intentionally)
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG101"); // duplicate
        bogieIds.add("BG104");
        bogieIds.add("BG102"); // duplicate

        // Display final unique bogie IDs
        System.out.println("Final Unique Bogie IDs:");
        for (String id : bogieIds) {
            System.out.println(id);
        }
    }
}