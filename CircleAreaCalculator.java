import java.util.Scanner; 
public class CircleAreaCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double radius = sc.nextDouble();

        double area = Math.PI * radius * radius;

        System.out.println("The area of the circle is: " + area);
    }
}
