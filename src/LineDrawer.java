import java.util.Scanner;

public class LineDrawer {

    public static void main(String[] args){
        do{
            Scanner scanner = new Scanner(System.in);
            System.out.println("\nInput length:");
            int length = scanner.nextInt();
            System.out.println("Input symbol:");
            char symbol = scanner.next().charAt(0);
            System.out.println("Input direction 1 - horizontal , 2 - vertical");
            int dir = scanner.nextInt();
            draw(length, dir, symbol);
        }while (true);

    }
    public static void draw(int length, int direction, char symbol) {
        if (length <= 0) {
            System.out.println("The line length must be a positive number.");
            return;
        }
        switch (direction) {
            case 1:
                drawHorizontal(length, symbol);
                break;
            case 2:
                drawVertical(length, symbol);
                break;
            default:
                System.out.println("Incorrect line direction.");
        }
    }
    private static void drawHorizontal(int length, char symbol) {
        for (int i = 0; i < length; i++) {
            System.out.print(symbol);
        }
    }
    private static void drawVertical(int length, char symbol) {
        for (int i = 0; i < length; i++) {
            System.out.println(symbol);
        }
    }
}
