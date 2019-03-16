package After.lsp;

public class Bicycle extends NoEngine{
    public Bicycle(String name, double speed, String engine) {
        super("Mongoose", 30.0);
    }

    @Override
    public void move() { System.out.println("Moving");}
}
