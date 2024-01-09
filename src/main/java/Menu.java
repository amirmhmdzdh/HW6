import java.util.Scanner;

public class Menu {

    Scanner scanner = new Scanner(System.in);


    public void publicMenu() {
        System.out.println("***** WELCOME *****");
        System.out.println("1-SAVE UP");
        System.out.println("2-LOAD IN");
        System.out.println("3-EXIT");
        System.out.println("Choose your number: ");
        int number = scanner.nextInt();
        scanner.nextLine();
        System.out.println(number);
    }
}
