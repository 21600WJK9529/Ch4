package Before.lsp;

public class Liskov_Substitution_Principle {
    private String name;
    private double speed;
    private String engine;
    public Liskov_Substitution_Principle(String name, double speed, String engine) {
        this.name = name;
        this.speed = speed;
        this.engine = engine;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    void startEngine() {

    }
}
