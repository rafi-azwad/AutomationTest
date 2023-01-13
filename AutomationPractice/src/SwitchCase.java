import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = input.nextInt();

        switch(age){
            case 15:
                System.out.println("You are under 18");
                break;
            case 18:
                System.out.println("You are eligible for vote");
                break;
            case 55:
                System.out.println("You are senior citizen");
                break;
            default:
                System.out.println("Please input the correct age");
        }
    }
}
