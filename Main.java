import java.util.Scanner;


public class Main {
    // 1)
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);

//        System.out.print("Enter the starting value: ");
//        int start = scanner.nextInt();

//        System.out.print("Enter the ending value: ");
//        int end = scanner.nextInt();

//        for (int i = start; i <= end; i++) {
//            System.out.println(i);
//        }


    // 2)
//    public static void main(String[] args){
//        Scanner s = new Scanner(System.in);
//
//        System.out.print("Enter a number: ");
//        int number = s.nextInt();
//
//        if (number > 0) {
//            System.out.println(number + " IT IS POSITIVE");
//        } else if (number < 0) {
//            System.out.println(number + " IT IS NEGATIVE");
//        } else {
//            System.out.println("NONE OF THESE");
//        }
//    }



    // 3)

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter the value of a: ");
//        int a = scanner.nextInt();
//
//        System.out.print("Enter the value of b: ");
//        int b = scanner.nextInt();
//
//        System.out.print("Enter the value of c: ");
//        int c = scanner.nextInt();
//
//        if (a <= b && a <= c) {
//            System.out.println(a + " A IS SMALLEST");
//        } else if (b <= a && b <= c) {
//            System.out.println(b + " B IS SMALLEST");
//        } else {
//            System.out.println(c + " C IS SMALLEST");
//        }
//        scanner.close();
//    }


    // 4)

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter the Purchase Amount: ");
//
//        double PurchaseAmount = scanner.nextDouble();
//        double FinalePayable;
//        double Discount;
//
//        if (PurchaseAmount < 500) {
//            Discount = 0;
//        } else if (PurchaseAmount <= 1000) {
//            Discount = 0.10 * PurchaseAmount;
//        } else {
//            Discount = 0.20 * PurchaseAmount;
//        }
//        FinalePayable = PurchaseAmount - Discount;
//        System.out.println("Original Purchase Amount: rupees " + PurchaseAmount);
//        System.out.println("Discount Applied: rupees " + Discount);
//        System.out.println("Final Payable Amount: rupees " + FinalePayable);
//        scanner.close();
//    }


//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter the size of the pattern: ");
//        int n = scanner.nextInt();
//
//        for (int i = 1; i <= n; i++) {
//            for (int j = n; j >= 1; j--) {
//                if (j > i) {
//                    System.out.print(n + " ");
//                } else {
//                    System.out.print(j + " ");
//                }
//            }
//            System.out.println();
//        }
//        scanner.close();
//    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a = s.nextInt();
        System.out.println("Entered the number: " + a);
    }
}


