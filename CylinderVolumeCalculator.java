import java.util.Scanner; 

public class CylinderVolumeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();

        double height = sc.nextDouble();

        double volume = Math.PI * radius * radius * height;

        System.out.println("The volume of the cylinder is: " + volume);
    }
}
