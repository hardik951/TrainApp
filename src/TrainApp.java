public class TrainConsistManagementApp {

    public static boolean binarySearch(String[] bogieIds, String key) {
        int low = 0;
        int high = bogieIds.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int result = bogieIds[mid].compareTo(key);

            if (result == 0) {
                return true;
            } else if (result < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        String[] bogies1 = {"BG101","BG205","BG309","BG412","BG550"};
        System.out.println(binarySearch(bogies1, "BG309"));

        String[] bogies2 = {"BG101","BG205","BG309","BG412","BG550"};
        System.out.println(binarySearch(bogies2, "BG999"));

        String[] bogies3 = {"BG101","BG205","BG309","BG412","BG550"};
        System.out.println(binarySearch(bogies3, "BG101"));

        String[] bogies4 = {"BG101","BG205","BG309","BG412","BG550"};
        System.out.println(binarySearch(bogies4, "BG550"));

        String[] bogies5 = {"BG101"};
        System.out.println(binarySearch(bogies5, "BG101"));
    }
}