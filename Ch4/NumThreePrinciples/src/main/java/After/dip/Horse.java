package After.dip;

public class Horse implements Dependency_Inversion_Principle {
    @Override
    public void move() {
        System.out.println("Galloping");
    }
}
