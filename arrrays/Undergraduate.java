package arrrays;

public class Undergraduate extends Student {
    private static final double BASE_RATE = 500.0;
    private int credits;

    public Undergraduate(String name, int id, int credits) {
        super(name, id);
        this.credits = credits;
    }

    @Override
    public double calculateTuition() {
        // Simple calculation for undergrads
        return BASE_RATE * credits;
    }
}