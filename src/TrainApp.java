import java.util.Scanner;

public class TrainConsistManagementApp {

    public static void bubbleSort(int[] capacities) {
        int n = capacities.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (capacities[j] > capacities[j + 1]) {
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;
                }
            }
        }
    }

    public static void display(int[] capacities) {
        for (int cap : capacities) {
            System.out.print(cap + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of passenger bogies: ");
        int n = scanner.nextInt();

        int[] capacities = new int[n];

        System.out.println("Enter capacities of passenger bogies:");
        for (int i = 0; i < n; i++) {
            capacities[i] = scanner.nextInt();
        }

        System.out.print("Before Sorting: ");
        display(capacities);

        bubbleSort(capacities);

        System.out.print("After Sorting (Ascending): ");
        display(capacities);

        scanner.close();
    }
}