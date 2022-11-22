import java.util.Scanner;

/**
 * Triangle.java: prints triangle based on 0 - 20
 *
 * @author Adolfo Sanpedro Gante
 * @version Lab, Module 7
 */
public class Triangle
{
    public static void main(String [] args) {
        //Instance Variables
        int size = 0;

        Scanner sc = new Scanner(System.in);

        while (true) {
            size = sc.nextInt();

            if (size == 0) {
                System.out.println("Exiting Program.");
                System.exit(0);
            } 
            else if (size > 20) {
                System.out.println("Number to large.");
            }
            else if (size < 0) {
                System.out.println("Number to small.");
            }
            else {

                for (int i = 0; i < (size); i++) {

                    for (int j = 0; j <= i; j++) {
                        System.out.print("*");
                    }

                    System.out.println();
                }

                for (int i = size - 1; i >= 0; i--) {

                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();

                }
            }
        }
    }
}
