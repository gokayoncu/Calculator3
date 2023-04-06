import java.util.Scanner;

public class project {
    static void add(int x, int y) {
        System.out.println(x + y);
    }

    static void sub(int a, int b) {
        System.out.println(a - b);
    }

    static void mult(int a, int b) {
        System.out.println(a * b);
    }

    static void div(int a, double b) {
        if (b == 0) {
            System.out.println("Error");
        } else {
            System.out.println(a / b);
        }
    }

    static void exp(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        System.out.println(result);
    }

    static int fac(int a) {
        if (a >= 1)
            return a * fac(a - 1);
        else
            return 1;
    }

    static int mod(int a, int b) {
        return a % b;
    }

    static void rect(int a, int b) {
        System.out.println("Area : "+a*b);
        System.out.println("Perimeter : "+2*(a+b));
    }


    public static void main(String[] args) {
        int select;
        int a, b;
        Scanner input = new Scanner(System.in);
        String menu = "1 - Add\n"
                + "2 -Subtract\n"
                + "3 - multiplication\n"
                + "4 - Divide işlemi\n"
                + "5 - Exponents\n"
                + "6 - factorial\n"
                + "7 - Mod \n"
                + "8 - Rectangle Area ve Perimeter\n"
                + "0-Exit";

        while (true) {
            System.out.println("------------------------");
            System.out.println(menu);
            System.out.println("Select the operation you want to perform:");
            select = input.nextInt();
            if (select == 0) {
                break;
            }

            System.out.print("Enter First Number : ");
            a = input.nextInt();
            System.out.print("Enter Second Number : ");
            b = input.nextInt();

            switch (select) {
                case 1:
                    add(a, b);
                    break;
                case 2:
                    sub(a, b);
                    break;
                case 3:
                    mult(a, b);
                    break;
                case 4:
                    div(a, b);
                    break;
                case 5:
                    exp(a, b);
                    break;
                case 6:
                    System.out.println(fac(a));
                case 7:
                    System.out.println(mod(a, b));
                    break;
                case 8:
                    rect(a,b);
                    break;
            }


        }
        System.out.println("See you later . ");

    }
}
