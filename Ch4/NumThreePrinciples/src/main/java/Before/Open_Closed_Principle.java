package Before;

import java.util.Scanner;

public class Open_Closed_Principle {
    private int selection;

    static Scanner input=new Scanner(System.in);

    public static void main(String[] args) {
        Open_Closed_Principle ocp=new Open_Closed_Principle();
        ocp.optionSelector();
        ocp.doTask();
    }

    public int optionSelector(){
        System.out.println("Select option: 1.Save 2.Delete");
        selection=input.nextInt();
        while(selection<1 || selection>2){
            System.out.println("Invalid selection");
            selection=input.nextInt();
        }
        System.out.println(selection);
        return selection;
    }

    public void doTask(){
        int a=getSelection();
        if(a==1){
            optionA();
        }else if(a==2){
            optionB();
        }
    }

    public void optionA(){
        System.out.println("Saving");
    }
    public void optionB(){
        System.out.println("Deleting");
    }

    public int getSelection() {
        return selection;
    }
}
