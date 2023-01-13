import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int flag =0;
        System.out.println("Enter any positive number ");
        int num = input.nextInt();

        if(num==0 || num==1)
            System.out.println(num+ " is not prime number");
        else {
            for (int i=2; i<=num/2; i++) {
                if (num % i == 0) {
                    System.out.println(num + " is not prime number");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0)
                System.out.println(num + " is prime number ");
        }
    }
}
