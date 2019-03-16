package Before.lsp;

public class Car extends Liskov_Substitution_Principle {
    public Car(String name, double speed, String engine) {
        super("Jeep", 100.00, "Medium");
    }

    @Override
    void startEngine() {
        System.out.println("Vroom");
    }
}
