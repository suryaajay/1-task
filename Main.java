import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the starting value: ");
        int start = scanner.nextInt();

        System.out.print("Enter the ending value: ");
        int end = scanner.nextInt();

        for (int i = start; i <= end; i++) {
            System.out.println(i);
        }
    }
}
