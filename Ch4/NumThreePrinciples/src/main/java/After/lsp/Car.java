package After.lsp;

public class Car extends Engine {
    public Car(String name, double speed, String engine) {
        super("Jeep", 100.00, "Medium");
    }

    @Override
    void startEngine() {
        System.out.println("Vroom");
    }
}
