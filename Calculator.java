import java.util.Scanner;

public class Calculator{

    public static int addInts(int x, int y) {
        return x + y;
    }

    public static int subInts(int x, int y) {
        return x - y;
    }

    public static int mulInts(int x, int y) {
        return x * y;
    }

    public static int divInts(int x, int y) {
        return x / y;
    }

    public static void main(String[] args){
        Scanner scrn = new Scanner(System.in);
        try {
            int x = scrn.nextInt();
            int y = scrn.nextInt();

            System.out.println("x: " + x);
            System.out.println("y: " + y);

            System.out.println("Add (1), Subtract (2), Multiply (3) or Divide (4)?");

            int operator = scrn.nextInt();

            switch (operator) {
                case 1:
                    System.out.println("Answer: " + addInts(x, y));
                    break;
                case 2:
                    System.out.println("Answer: " + subInts(x, y));
                    break;
                case 3:
                    System.out.println("Answer: " + mulInts(x, y));
                    break;
                case 4:
                    System.out.println("Answer: " + divInts(x, y));
                    break;
                default:
                    System.out.println("Invalid Operator");
                    break;
            }
        } finally {
            scrn.close();
        }
    }
}