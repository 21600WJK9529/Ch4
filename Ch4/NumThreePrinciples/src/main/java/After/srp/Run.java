package After.srp;

public class Run {
    public static void main(String[] args) {
        Single_Responsibility_Principle srp=new Single_Responsibility_Principle();
        srp.customer();
        SrpPrint srpPrint=new SrpPrint();
        srpPrint.print();
    }
}
