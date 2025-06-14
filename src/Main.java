import java.util.Scanner;
import java.io.File;
import java.io.FileReader;
public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Welcome to Vish World");
        System.out.println();
        openingMenu();
    }

    public static int openingMenu() {
        boolean running = true;
        int choice = 0;
        while(running) {
            System.out.println("|===============================================|");
            System.out.println("|                      VFlix                    |");
            System.out.println("|===============================================|");
            System.out.println("| 1.View All Movies                             |");
            System.out.println("| 2.Search Movie by Title                       |");
            System.out.println("| 3.Search by Genre                             |");
            System.out.println("| 4.Rate a Movie                                |");
            System.out.println("| 5.Get Movie Recommendations                   |");
            System.out.println("| 6.Exit                                        |");
            System.out.println("|===============================================|");
            System.out.println("|             Enter 1/2/3/4/5/6                 |");
            System.out.println("|===============================================|");

            System.out.print("Enter you Choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("...");
                    viewAllMovies();
                    break;
                case 2:
                    System.out.println("..");
                    break;
                case 3:
                    System.out.println(".");
                    break;
                case 4:
                    System.out.println(".,");
                    break;
                case 5:
                    System.out.println("..,");
                    break;
                case 6:
                    System.out.println("....");
                    running=false;
                    break;
                default:
                    System.out.println("Invalid choice");


            }
        }
        return choice;
    }
    public static void viewAllMovies() {
        try {
            File file = new File("movies.xlsx");
            Scanner reader = new Scanner (file);
            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                System.out.println(data);
            }
            reader.close();
        }catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
