import java.util.Scanner;
public class MenuRunner {
    public static void main(String[] args) {
        int num1;
        int num2;
        int results = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number 1: ");
        num1 = sc.nextInt();

        System.out.println("Enter Number 2: ");
        num2 = sc.nextInt();

        System.out.println("1 - Add");
        System.out.println("2 - Subtract");
        System.out.println("3 - Divide");
        System.out.println("4 - Multiply");
        System.out.print("Choose Operation: ");

        int userChoice = sc.nextInt();
        switch (userChoice) {
            case 1: {
                results = num1 + num2;
                break;
            }
            case 2:
                results = num1 - num2;
                break;
            case 3:
                results = num1 / num2;
                break;
            case 4:
                results = num1 * num2;
                break;
            default:
                System.out.println("Invalid number");
                break;
        }

        System.out.println(results);
    }
}
