
import java.util.*;
public class Addition{
public void add(int a, int b){
    System.out.println(a+b);
}

public static void main(String [] args){

Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int b = sc.nextInt();

Addition addition = new Addition();

addition.add(a , b);

}
}