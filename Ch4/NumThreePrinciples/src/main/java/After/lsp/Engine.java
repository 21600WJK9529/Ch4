package After.lsp;

public class Engine extends Liskov_Substitution_Principle{
    public Engine(String name, double speed, String engine) {
        super(name, speed);
        this.engine = engine;
    }

    private String engine;
    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    void startEngine() {

    }
}
