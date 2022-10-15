import java.util.Scanner;

/**
 * @author Drumstyle92
 * Class that contains the program.
 */
public class test {
    /**
     * @param args main parameter.
     * main method that contains a scanner object, a while loop and a scanner output.
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
         // the word we put.
          String used;
          System.out.println("-------------WhileLoop---------------");
        do{
            System.out.println("Please enter a command; ");
            used = scanner.nextLine();
            System.out.println(used);

        }while(!(used.equals("stop")));{
            scanner.close();
        }
    }
}



