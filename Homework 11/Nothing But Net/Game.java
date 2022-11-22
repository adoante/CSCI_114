
/**
 * Game.java: Tests the method in the Parent class Player and its child classes (AllStar,Pro,Scrub).
 *
 * <p>
 * <b>Problem Statement</b>: <br /b> Rewrite the code so that it promotes encapsulation and uses
 *                           inheritance to represent the different types of players instead of a
 *                           “type” variable. This means that should have three child classes (AllStar,
 *                           Pro, and Scrub) which are children of the  Player  class. Doing this
 *                           should result in removing the “type” variable in  Player. Also rewrite
 *                           the  Player  class to hide the instance variables (making them  private).
 * </p>
 *
 * <p>
 * <b>Algorithm</b>:
 *    <ol>
 *         <li> Create a  printTeam  method which prints a columnar report of all of the players on the team </li>
 *         <li> Create a calculateScore method which uses a loop to add all of the point scores and returns the
 *              total estimated score for the team. </li>
 *         <li> Create an array of  Players  named  "team"  which can hold up to 10  Player  objects. </li>
 *         <li> Add at least one  AllStar  and two of the other types of  Players (Pro and Scrub) to the team array. </li>
 *         <li> Do not add more than 8  Player  objects to  team, so that the array remains partially empty. </li>
 *         <li> Use the  printTeam  method to print report of all of the players in the  team  array. 
 *              Use nicely-formatted columns labelled "Player Name", "Score", and "Class". </li>
 *         <li> Use the  calculateScore  method calculate the total score that the players in the
 *              team  array can achieve, and print below the report. </li>
 *    </ol>
 * </p>
 *
 * @author Adolfo Sanpedro Gante
 * @version Module 11, Homework #1
 */
public class Game
{
    public static void main(String[] args) {
        //Creates an array of players, max 10
        Player[] team = new Player[10];

        //Adds players to array
        team[0] = new AllStar("Joshua");
        team[1] = new AllStar("Gustavo");
        team[2] = new Pro("Adolfo");
        team[3] = new Pro("Gabriel");
        team[5] = new Scrub("Da Baby");
        team[6] = new Scrub("Sheeeeeeesh");
        
        //Prints a nicely-formatted report of player names, scores, and class.
        printTeam(team);
    }

    /**
     * 
     * 
     */
    public static void printTeam(Player[] team) {
        int slot = 1;
        System.out.println("Here's the players on the team:");
        System.out.println();
        System.out.printf("Slot  Player-Name  Score  Class\n");
        System.out.printf("----  -----------  -----  -----\n");
        for (Player i : team){
            if (i == null){
                System.out.printf("%4d  %-12s %5s  %s", slot++, "(open)", "-", "       " + "\n");
            }
            else {
                System.out.printf("%4d  %-12s %5s  %s", slot++, i.getName(), i.getScore(), i.getClass().getSimpleName() + "\n");
            }
        }
        System.out.println();
        System.out.printf("  Total estimated points: " + calculateScore(team));
    }

    public static int calculateScore(Player[] team){
        int totalScore = 0;
        for (Player i : team) {
            if (i == null) {
                continue; 
            }
            else {
                totalScore = totalScore + i.getScore();
            }
        }
        return (totalScore);
    }

}
