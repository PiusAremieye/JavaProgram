public class Refrigerator {
    private String make;
    private int layers;

    public Refrigerator( String make, int layers) {
        this.make = make;
        this.layers = layers;
    }

    public void freeze() {
        System.out.println("Refrigerator is freezing");
    }
}
