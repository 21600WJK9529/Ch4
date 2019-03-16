package After.dip;

public class Fish implements Dependency_Inversion_Principle {
    @Override
    public void move() {
        System.out.println("Swimming");
    }
}
