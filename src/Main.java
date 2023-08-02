import controllers.MoviesController;

import java.util.Scanner;

import static java.lang.System.exit;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void printMenu(String[] options) {
        for (String option : options ) {
            System.out.println(option);
        }
        System.out.println("Choose your option : ");
    }

    public static void main(String[] args){
        MoviesController controller = new MoviesController();

        String[] options = {"1- Create", "2- Update", "3-  Delete", "4- Exit"};
        Scanner scanner = new Scanner(System.in);
        int option = 1;
        while (option!=4){
            printMenu(options);
            try {
                option = scanner.nextInt();
                switch (option) {
                    case 1: createMovie(); break;
                    case 2: updateMovie(); break;
                    case 3: deleteMovie(); break;
                    case 4: exit(0);
                }
            }
            catch (Exception ex){
                System.out.println("Please enter an integer value between 1 and " + options.length);
                scanner.next();
            }
        }

    }

    //Options
    private static void createMovie(){
        System.out.println("Thanks for choosing Create");
    }

    private static void updateMovie() {
        System.out.println("Thanks for choosing Update");
    }
    private static void deleteMovie(){
        System.out.println("Thanks for choosing delete");
    }
}