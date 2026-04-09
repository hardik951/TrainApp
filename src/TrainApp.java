import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Bogie {
    private String id;
    private int capacity;

    public Bogie(String id, int capacity) {
        this.id = id;
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }
}

public class TrainApp {

    public static void main(String[] args) {
        // 1. Prepare a collection of bogies (Large dataset for meaningful benchmark)
        List<Bogie> trainConsist = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            trainConsist.add(new Bogie("B" + i, (int) (Math.random() * 100)));
        }

        System.out.println("--- UC13: Performance Comparison (Loops vs Streams) ---");
        System.out.println("Dataset Size: " + trainConsist.size() + " bogies\n");

        // 2. Loop-Based Filtering
        long startLoop = System.nanoTime();
        List<Bogie> loopFiltered = new ArrayList<>();
        for (Bogie b : trainConsist) {
            if (b.getCapacity() > 60) {
                loopFiltered.add(b);
            }
        }
        long endLoop = System.nanoTime();
        long loopDuration = endLoop - startLoop;

        System.out.println("Loop-Based Filtering:");
        System.out.println("Filtered Count: " + loopFiltered.size());
        System.out.println("Execution Time: " + loopDuration + " ns");

        // 3. Stream-Based Filtering
        long startStream = System.nanoTime();
        List<Bogie> streamFiltered = trainConsist.stream()
                .filter(b -> b.getCapacity() > 60)
                .collect(Collectors.toList());
        long endStream = System.nanoTime();
        long streamDuration = endStream - startStream;

        System.out.println("\nStream-Based Filtering:");
        System.out.println("Filtered Count: " + streamFiltered.size());
        System.out.println("Execution Time: " + streamDuration + " ns");

        // 4. Comparison Summary
        System.out.println("\n--- Performance Summary ---");
        if (loopDuration < streamDuration) {
            System.out.println("Loop was faster by " + (streamDuration - loopDuration) + " ns");
        } else {
            System.out.println("Stream was faster by " + (loopDuration - streamDuration) + " ns");
        }
    }
}