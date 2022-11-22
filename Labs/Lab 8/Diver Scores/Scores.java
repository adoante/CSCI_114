import java.util.Scanner;

/**
 * Scores.java: Calculates a divers score.
 *
 * @author Adolfo Sanpedro Gante
 * @version Lab, Module 8
 */
public class Scores
{
    public static void main(String [] args) {
        //Instance Variables
        double totalScores = 0.0;
        double minusHighLow = 0.0;
        double finalScore = 0.0;
        
        //Creates array with double type to hold Judges Scores
        double score[] = new double[7];
        
        Scanner sc = new Scanner(System.in);

        System.out.println("   ** Diving Score Calculator **");
        System.out.println();
            
        //Asks for judges scores
        //Performs error checking on all user entries
        for (int i = 0; i < score.length; i++) {

            System.out.printf("Enter the score from Judge #" + (i + 1) + " (0 - 10): ");
            score[i] = sc.nextDouble();

            do {
                if (score[i] < 0 || score[i] > 10) {
                    System.out.println("** Plese Enter a number from 0 to 10.");
                    System.out.printf("Enter the score from Judge #" + (i + 1) + " (0 - 10): ");
                    score[i] = sc.nextDouble();
                }
            } while  (score[i] < 0 || score[i] > 10);

        }

        //Asks for degree of difficulty
        //Performs error checking on user entry
        System.out.printf("Enter the degree of difficulty (1.2 – 3.8): ");
        double difficulty = sc.nextDouble();
        do {
            if (difficulty < 1.2 || difficulty > 3.8) {
                System.out.println("** Please enter a number from 1.2 to 3.8).");
                System.out.printf("Enter the degree of difficulty (1.2 – 3.8): ");
                difficulty = sc.nextDouble();
            }
        } while  (difficulty < 1.2 || difficulty > 3.8);
        
        double minScore = score[0];          //Saves smallest value in score array
        double maxScore = score[0];          //Saves largest value in score array
        
        //Loops through the array to find Min/Max values
        for (int i = 0; i < score.length; i++) {
            maxScore = Math.max(score[i], maxScore);
            minScore = Math.min(score[i], minScore);
        }
        
        //Calculates the sum of all Judges Scores
        for (int i = 0; i < score.length; i++) {
            totalScores = totalScores + score[i];
        }
        
        //Subtracts the highest and lowest scores
        minusHighLow = totalScores - (maxScore + minScore);
        
        //Multiplies minusHighLow by degree of difficulty value
        //then by 0.6
        finalScore = (minusHighLow * difficulty) * 0.6;
        
        //Prints all 3 score totals
        System.out.println();
        System.out.println("The total of all scores: " + totalScores);
        System.out.println("Minus high and low: " + minusHighLow);
        System.out.printf("Final Score: %.2f",finalScore);
        
    }
}
