
/**
 *sortStrings.java: sorts and displays strings in reverse lexicographic
 *<br />
 *<br />
 * <b>Methods</b>:
 * <ol>
 *     <li> string1Pos: Using a multi-way if statement it determines the lexicographic order
 *                      of String1 based on String2 and String3</li>
 *     <li> string2Pos: Using a multi-way if statement it determines the lexicographic order
 *                      of String2 based on String1 and String3</li>
 *     <li> string3Pos: Using a multi-way if statement it determines the lexicographic order
 *                      of String3 based on String1 and String2</li>                
 * </ol>
 *
 * @author Adolfo Sanpedro Gante
 * @version Homework, Module 6
 */
public class sortStrings
{
    //Instance Varibles
    private String string1 = " ";
    private String string2 = " ";
    private String string3 = " ";
    public String first = " ";
    public String second = " ";
    public String third = " ";
    
    public sortStrings(String string1,String string2 ,String string3) {
        this.string1 = string1;
        this.string2 = string2;
        this.string3 = string3;
    }
    
    public void string1Pos() {
        int result1 = string1.compareTo(string2);
        int result2 = string1.compareTo(string3);
        
        if (result1 < 0 && result2 < 0) {
            first = string1;
        } else if (result1 > 0 && result2 < 0) {
            second = string1;
        } else if (result1 < 0 && result2 > 0) {
            second = string1;
        } else if (result1 > 0 && result2 > 0) {
            third = string1;
        }
    }
    
    public void string2Pos() {
        int result1 = string2.compareTo(string1);
        int result2 = string2.compareTo(string3);
        
        if (result1 < 0 && result2 < 0) {
            first = string2;
        } else if (result1 > 0 && result2 < 0) {
            second = string2;
        } else if (result1 < 0 && result2 > 0) {
            second = string2;
        } else if (result1 > 0 && result2 > 0) {
            third = string2;
        }
    }

    public void string3Pos() {
        int result1 = string3.compareTo(string2);
        int result2 = string3.compareTo(string1);
        
        if (result1 < 0 && result2 < 0) {
            first = string3;
        } else if (result1 > 0 && result2 < 0) {
            second = string3;
        } else if (result1 < 0 && result2 > 0) {
            second = string3;
        } else if (result1 > 0 && result2 > 0) {
            third = string3;
        }
    }
}
