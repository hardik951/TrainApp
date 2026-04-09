import java.util.ArrayList;
import java.util.List;

class GoodsBogie {
    private String type;
    private String cargo;

    public GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    public String getType() { return type; }
    public String getCargo() { return cargo; }

    @Override
    public String toString() {
        return String.format("[%s : %s]", type, cargo);
    }
}

public class TrainApp {
    public static void main(String[] args) {
        // 1. Prepare a list of goods bogies (Simulating User Input)
        List<GoodsBogie> goodsConsist = new ArrayList<>();
        goodsConsist.add(new GoodsBogie("Rectangular", "Coal"));
        goodsConsist.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goodsConsist.add(new GoodsBogie("Open", "Iron Ore"));

        // Try changing "Petroleum" to "Water" to see the safety check fail!
        goodsConsist.add(new GoodsBogie("Cylindrical", "Petroleum"));

        System.out.println("--- Current Train Consist ---");
        goodsConsist.forEach(System.out::println);

        // 2. Stream API for Safety Compliance Check
        // allMatch returns true only if EVERY bogie satisfies the predicate
        boolean isSafetyCompliant = goodsConsist.stream().allMatch(bogie -> {
            if ("Cylindrical".equalsIgnoreCase(bogie.getType())) {
                return "Petroleum".equalsIgnoreCase(bogie.getCargo());
            }
            return true; // Non-cylindrical bogies are inherently safe in this UC
        });

        // 3. Display the result
        System.out.println("\n--- Safety Validation Report ---");
        if (isSafetyCompliant) {
            System.out.println("STATUS: ✅ SAFE");
            System.out.println("MESSAGE: All bogies comply with hazardous material protocols.");
        } else {
            System.out.println("STATUS: ❌ UNSAFE");
            System.out.println("CRITICAL: Safety violation detected! Cylindrical bogies found with non-petroleum cargo.");
        }
    }
}