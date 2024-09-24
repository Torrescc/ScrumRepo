import java.util.Scanner;

public class Calculator{

    public static int addInts(int x, int y) {
        return x + y;
    }

    public static void main(String[] args){
        Scanner scrn = new Scanner(System.in);
        int x = scrn.nextInt();
        int y = scrn.nextInt();

        System.out.println("x: " + x);
        System.out.println("y: " + y);

        System.out.println("Answer: " + addInts(x, y));
    }
}