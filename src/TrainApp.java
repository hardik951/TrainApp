public class TrainConsistManagementApp {

    public static boolean searchBogie(String[] bogieIds, String key) {
        if (bogieIds == null || bogieIds.length == 0) {
            throw new IllegalStateException("No bogies available in the train to search.");
        }

        for (int i = 0; i < bogieIds.length; i++) {
            if (bogieIds[i].equals(key)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        String[] bogies1 = {"BG101","BG205","BG309","BG412","BG550"};
        System.out.println(searchBogie(bogies1, "BG309"));

        String[] bogies2 = {};
        System.out.println(searchBogie(bogies2, "BG101"));
    }
}