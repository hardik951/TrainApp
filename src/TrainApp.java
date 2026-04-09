class CargoSafetyException extends RuntimeException {
    public CargoSafetyException(String message) {
        super(message);
    }
}

class GoodsBogie {
    private String bogieId;
    private String shape;
    private String currentCargo = "Empty";

    public GoodsBogie(String bogieId, String shape) {
        this.bogieId = bogieId;
        this.shape = shape;
    }

    public void assignCargo(String cargo) {
        System.out.println("Processing: " + cargo + " for " + shape + " bogie " + bogieId);

        if (cargo.equalsIgnoreCase("Petroleum") && shape.equalsIgnoreCase("Rectangular")) {
            throw new CargoSafetyException("Safety Violation: Petroleum in Rectangular bogie");
        }

        this.currentCargo = cargo;
        System.out.println("Status: Success");
    }

    public String getCurrentCargo() {
        return currentCargo;
    }
}

public class TrainApp {
    public static void main(String[] args) {
        GoodsBogie myBogie = new GoodsBogie("GB-101", "Rectangular");
        String[] cargoList = {"Grain", "Petroleum"};

        for (String cargo : cargoList) {
            try {
                myBogie.assignCargo(cargo);
            } catch (CargoSafetyException e) {
                System.out.println("Caught: " + e.getMessage());
            } finally {
                System.out.println("Clean-up: Safety check cycle finished for " + cargo);
            }
        }

        System.out.println("Final Bogie State: " + myBogie.getCurrentCargo());
    }
}