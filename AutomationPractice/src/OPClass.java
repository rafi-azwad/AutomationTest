import java.util.Scanner;

public class OPClass {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first value: ");
        int num1 = input.nextInt();
        System.out.println("Enter second value: ");
        int num2 = input.nextInt();
        OPClass ob = new OPClass();
        ob.add(num1, num2);
        ob.sub(num1, num2);

    }

    public void add(int n1 , int n2){
        int sum = n1 + n2;
        System.out.println("Summation value is: "+sum);

    }
    public void sub(int n1, int n2){
        int sub = n1 - n2;
        System.out.println("Subtraction value is: "+sub);
    }
}
