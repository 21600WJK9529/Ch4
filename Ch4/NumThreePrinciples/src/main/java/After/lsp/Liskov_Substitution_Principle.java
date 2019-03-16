package After.lsp;

public class Liskov_Substitution_Principle {
    private String name;
    private double speed;

    public Liskov_Substitution_Principle(String name, double speed) {
        this.name = name;
        this.speed = speed;
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


}
