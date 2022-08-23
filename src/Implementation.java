import java.util.Scanner;

public class Implementation {
    public static void main(String[] args) {
        Scanner obj =new Scanner(System.in);
        int a,b;
        System.out.print("Enter first number : ");
        a=obj.nextInt();
        System.out.print("Enter second number : ");
        b=obj.nextInt();
        GameDemo gameDemo= new GameDemo();
        String s= gameDemo.divideByNumber(a,b);
    }
}
