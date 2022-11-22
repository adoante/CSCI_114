
/**
 * HotDogStandTester.java: Tests the methods in the HotDogStand class
 * 
 * <p>
 * <b>Problem Statement</b>: <br /> Test the HotDogStand class by creating at least three hot dog stands.
 *                           Each stand should sell a different number of hot dogs.
 * </p>
 * 
 * <b>Algorithm</b>:
 *    <ol>
 *         <li> Create at three different HotDogStand Objects all with different ID's and initial hotDogSold. </li>
 *         <li> Increase the amount of hotdogSold for each stand by at least 20. </li>
 *         <li> Be sure to update the running total of all hotdogs sold by all hotdog stands. </li>
 *         <li> Print the number of hot dogs sold by each stand for the day. </li>
 *         <li> Print running total of all hotdogs sold by all hotdog stands. </li>
 *    </ol>
 * 
 * @author Adolfo Sanpedro Gante
 * @version Homework, Module 10
 */
public class HotDogStandTester
{
    public static void main(String[] args) {
        //Creates three new HotDogStand objects 
        HotDogStand howards = new HotDogStand(101, 26);
        HotDogStand aprils = new HotDogStand(110, 16);
        HotDogStand lorenzos = new HotDogStand(105, 36);

        //Increases lorenzos hotdogSold by 20
        for (int i = 0; i < 20; i++) {
            lorenzos.justSold();
        }
        //updates the totalHotdogSold
        lorenzos.totalSold(lorenzos.getHotdogSold());
        
        //Increases aprils hotdogSold by 25
        for (int i = 0; i < 25; i++) {
            aprils.justSold();
        }
        //updates the totalHotdogSold
        aprils.totalSold(aprils.getHotdogSold());
        
        //Increases howards hotdogSold by 29
        for (int i = 0; i < 29; i++) {
            howards.justSold();
        }
        //updates the totalHotdogSold
        howards.totalSold(howards.getHotdogSold());
        
        //Prints all of the hotdog stands number of hotdogs sold
        //Prints the running total of all hotdogs sold by all hotdog stands
        System.out.printf("Stand ID      Hotdogs Sold\n");
        System.out.printf("--------      ------------\n");
        System.out.printf("%8d %,17d\n", howards.getId(), howards.getHotdogSold());
        System.out.printf("%8d %,17d\n", aprils.getId(), aprils.getHotdogSold());
        System.out.printf("%8d %,17d\n", lorenzos.getId(), lorenzos.getHotdogSold());
        System.out.printf("                    ======\n");
        System.out.printf("Total sold: %14d", HotDogStand.getTotalSold());
    }

}
