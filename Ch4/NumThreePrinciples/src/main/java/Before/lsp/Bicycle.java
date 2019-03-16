package Before.lsp;

public class Bicycle extends Liskov_Substitution_Principle{
    public Bicycle(String name, double speed, String engine) {
        super("Mongoose", 30.0, "N/A");
    }

    @Override
    void startEngine() {
        System.out.println("???");
    }
}
