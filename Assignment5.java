import java.util.Scanner;
//imported my scanner class for taking input
interface Vehicles{
    //In interface we do not define method body
    void gearChange();
    void speedup();
    void applyBreak();
}
 class Bicycle implements Vehicles{
    // Create method
    public void gearChange(){
        System.out.println("Gear changed in Bicycle.");
    }
    public void speedup(){
        System.out.println("Speedup in Bicycle.");
    }
    public  void applyBreak(){
        System.out.println("Breaks Applied in Bicycle");
    }
}
class Bike implements Vehicles {
    // Create method
    public void gearChange() {
        System.out.println("Gear changed in Bike.");
    }

    public void speedup() {
        System.out.println("Speedup in Bike.");
    }

    public void applyBreak() {
        System.out.println("Breaks Applied in Bike");
    }
}
class Car implements Vehicles {
    // Create method
    public void gearChange() {
        System.out.println("Gear changed in Car.");
    }

    public void speedup() {
        System.out.println("Speedup in Car.");
    }

    public void applyBreak() {
        System.out.println("Breaks Applied in car");
    }
}

public class Assignment5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Choice;
        do {
            System.out.println("\n******** Choole from below vertix********");
            System.out.println("1.Bicycle\n2.Bike\n3.Car\n4.Exit");
            Choice = sc.nextInt();
            switch (Choice){
                case 1:
                    Bicycle byc = new Bicycle();
                    byc.gearChange();
                    byc.speedup();
                    byc.applyBreak();
                    break;
                case 2:
                    Bike bk = new Bike();
                    bk.gearChange();
                    bk.speedup();
                    bk.applyBreak();
                    break;
                case 3:
                    Car cr = new Car();
                    cr.gearChange();
                    cr.speedup();
                    cr.applyBreak();
                    break;
                case 4:
                    System.out.println("Successfully Exited!!");
                    break;
                default :
                    System.out.println("Invalid Choice......!!!");
            }


        }while(4!=Choice);
    }
}
