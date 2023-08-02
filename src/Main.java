import controllers.MoviesController;

import java.util.Date;
import java.util.Scanner;

import static java.lang.System.exit;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    static MoviesController controller;

    public static void printMenu(String[] options) {
        for (String option : options ) {
            System.out.println(option);
        }
        System.out.println("Choose your option : ");
    }

    public static void main(String[] args){
        controller = new MoviesController();

        String[] options = {"\n1- Create", "2- Update", "3-  Delete", "4- List movies", "5- Exit\n"};
        Scanner scanner = new Scanner(System.in);
        int option = 1;
        while (option!=5){
            printMenu(options);
            try {
                option = scanner.nextInt();
                switch (option) {
                    case 1: createMovie(); break;
                    case 2: updateMovie(); break;
                    case 3: deleteMovie(); break;
                    case 4: listMovies(); break;
                    case 5: exit(0);
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

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the movie title: ");
        String name = in.nextLine();

        System.out.println("Enter the author's name: ");
        String author = in.nextLine();

        System.out.println("Enter the release date: ");
        String releaseDate = in.nextLine();

        boolean result = controller.create(name, author, releaseDate);
        if (result){
            System.out.printf("Your movie %s was successfully saved", name);
        }else {
            System.out.println("Your movie was not saved");
        }
    }

    private static void updateMovie() {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the movie id: ");
        String id = in.nextLine();

        System.out.println("Enter the new movie title: ");
        String name = in.nextLine();

        System.out.println("Enter the new author's name: ");
        String author = in.nextLine();

        System.out.println("Enter the new release date: ");
        String releaseDate = in.nextLine();

        boolean result = controller.update(id, name, author, releaseDate);
        if (result){
            System.out.printf("Your movie %s was successfully updated", name);
        }else {
            System.out.println("Your movie was not saved");
        }
    }
    private static void deleteMovie(){
        System.out.println("Thanks for choosing delete");
    }

    private static void listMovies() {
        controller.allMovies().forEach(movie -> {
            System.out.println(movie.toString());
        });
    }
}