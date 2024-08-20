package JavaWeek2Tut;
import java.util.Scanner;

public class metercentimeterConvertion {
    public static void main(String[] args) {
        float centimeters=0;
        Scanner meters=new Scanner(System.in);
        System.out.println("Enter meter value: ");
        float value=meters.nextFloat();
        centimeters=(value*100);
        System.out.println("Meters in Centimeters: "+centimeters);
    }

}
