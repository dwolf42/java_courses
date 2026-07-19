import java.util.Scanner;

public class Battleship {
    public Battleship() {
        System.out.print(" ");
        for (int i = 1; i <= 10; i++) {
            System.out.print(" ");
            System.out.print(i);
        }
        System.out.println();

        char rowLetter = 'A';
        
        for (int i = 0; i <= 9; i++) {
            System.out.print(rowLetter);
            for (int j = 0; j <= 9; j++) {
                System.out.print(" " + "~"); 
            }
            System.out.println();
            rowLetter++;
        }

    System.out.println("Enter the coordinates of the ship:");
    String usrInput = " "; 
    Scanner scanner = new Scanner(System.in);
    usrInput = scanner.nextLine().toUpperCase();
    String[] inputParts = usrInput.split(" ");

    int x1 = (int) inputParts[0].charAt(0) - 65;
    String y1Part = inputParts[0].substring(1);
    int y1 = Integer.parseInt(y1Part) - 1;
    
    int x2 = (int) inputParts[1].charAt(1);
    String y2Part = inputParts[1].substring(1);
    int y2 = Integer.parseInt(y2Part) - 1;
    System.out.print(x1);
    System.out.println(y1);
    System.out.print(x2);
    System.out.println(y2);
    // 65 74
    }

    public static void main(String[] args) {
        new Battleship();
    }

}
