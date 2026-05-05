import java.util.Arrays;

public class TrainConsistManagementApp {

    public static String[] sortBogieNames(String[] bogieNames) {
        Arrays.sort(bogieNames);
        return bogieNames;
    }

    public static void main(String[] args) {

        String[] input1 = {"Sleeper","AC Chair","First Class","General","Luxury"};
        System.out.println(Arrays.toString(sortBogieNames(input1)));

        String[] input2 = {"Luxury","General","Sleeper","AC Chair"};
        System.out.println(Arrays.toString(sortBogieNames(input2)));

        String[] input3 = {"AC Chair","First Class","General"};
        System.out.println(Arrays.toString(sortBogieNames(input3)));

        String[] input4 = {"Sleeper","AC Chair","Sleeper","General"};
        System.out.println(Arrays.toString(sortBogieNames(input4)));

        String[] input5 = {"Sleeper"};
        System.out.println(Arrays.toString(sortBogieNames(input5)));
    }
}