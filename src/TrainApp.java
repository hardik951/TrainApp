public class TrainConsistManagementApp {

    public static boolean searchBogie(String[] bogieIds, String key) {
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

        String[] bogies2 = {"BG101","BG205","BG309","BG412","BG550"};
        System.out.println(searchBogie(bogies2, "BG999"));

        String[] bogies3 = {"BG101","BG205","BG309","BG412","BG550"};
        System.out.println(searchBogie(bogies3, "BG101"));

        String[] bogies4 = {"BG101","BG205","BG309","BG412","BG550"};
        System.out.println(searchBogie(bogies4, "BG550"));

        String[] bogies5 = {"BG101"};
        System.out.println(searchBogie(bogies5, "BG101"));
    }
}