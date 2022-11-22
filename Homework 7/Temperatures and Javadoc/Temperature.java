/**
 * Temperature.java: Creates new temperature class with degrees and scale (C or F)
 * 
 * @author Adolfo Sanpedro Gante
 * @version Homework, Module 7
 */

public class Temperature {
    //Instance Variables
    private double degrees = 0 ;         // number of degrees in this temperature
    private char scale ;                 // 'C'=Celsius, 'F'=Fahrenheit

    /**
     * <p>
     * Creates a Temperature Object with degrees <code>0.0</code> and scale 'C'
     * </p>
     */
    public Temperature() {
        this(0.0, 'C') ;
    }

    /**
     * <p>
     * Creates a Temperature Object with degrees <code>0.0</code>
     * </p>
     * 
     * @param degrees The amount of degrees in terms of temperature
     */
    public Temperature(double degrees) {
        this(degrees, 'C') ;
    }

    /**
     * <p>
     * Creates a Temperature Object with scale 'C'
     * </p>
     * 
     * @param scale A type of tempature scale either C or F
     */
    public Temperature(char scale) {
        this(0.0, scale) ;
    }

    /**
     * <p>
     * Creates a Temperature Object
     * </p>
     * 
     * @param degrees The amount of degrees in terms of temperature
     * @param scale A type of tempature scale either C or F
     */
    public Temperature(double degrees, char scale) {
        setDegrees(degrees) ;
        setScale(scale) ;
    }

    /**
     * <p>
     * Sets a Temperature Objects degrees <code>0.0</code>
     * </p>
     * 
     * <p>
     * Precondition: A named Temperature Object Exists <br />
     * Postcondition: none
     * </p>
     * 
     * @param degrees The amount of degrees in terms of temperature
     */
    public void setDegrees(double degrees) {
        this.degrees = degrees ;
    }

    /**
     * <p>
     * Sets a Temperature Objects scale
     * </p>
     * 
     * <p>
     * Precondition: A named Temperature Object Exists <br />
     * Postcondition: none
     * </p>
     * 
     * @param scale A type of tempature scale either C or F
     */
    public void setScale(char scale) {
        this.scale = scale ;
    }

    /**
     * <p>
     * Sets a Temperature Objects scale and degrees
     * </p>
     * 
     * <p>
     * Precondition: A named Temperature Object Exists <br />
     * Postcondition: none
     * </p>
     * 
     * @param scale A type of tempature scale either C or F
     * @param degrees The amount of degrees in terms of temperature
     */
    public void setTemperatureAndScale(double degrees, char scale) {
        setDegrees(degrees) ;
        setScale(scale) ;
    }

    /**
     * <p>
     * Gives a Temperature Objects degrees
     * </p>
     * 
     * <p>
     * Precondition: A named Temperature Object Exists <br />
     * Postcondition: none
     * </p>
     * 
     * @return the degree amount of a Temperature Object
     */
    public double getDegrees() {
        return degrees ;
    }

    /**
     * <p>
     * Gives a Temperature Objects scale
     * </p>
     * 
     * <p>
     * Precondition: A named Temperature Object Exists <br />
     * Postcondition: none
     * </p>
     * 
     * @return the scale type of a Temperature Object
     */
    public char getScale() {
        return scale ;
    }

    /**
     * <p>
     * Gives a Temperature Objects degrees in Fahrenheit
     * </p>
     * 
     * <p>
     * Precondition: A named Temperature Object Exists <br />
     * Postcondition: none
     * </p>
     * 
     * @return a number representing the temperature's degrees in Fahrenheit. 
     */
    public double getFahrenheit() {
        if (scale == 'f' || scale == 'F') {
            return degrees ;
        }
        return Math.round((degrees * (9.0 / 5.0) + 32.0) * 100.0) / 100.0 ;   // round to 2 decimals
    }

    /**
     * <p>
     * Gives a Temperature Objects degrees in Celsius
     * </p>
     * 
     * <p>
     * Precondition: A named Temperature Object Exists <br />
     * Postcondition: none
     * </p>
     * 
     * @return a number representing the temperature's degrees in Celsius. 
     */
    public double getCelsius() {
        if (scale == 'c' || scale == 'C') {
            return degrees ;
        }
        return Math.round((degrees - 32.0) * (5.0 / 9.0) * 100.0) / 100.0 ;   // round to 2 decimals
    }

    /**
     * <p>
     * Used to print a Temperature Objects degrees and scale
     * </p>
     * 
     * <p>
     * Precondition: A named Temperature Object Exists <br />
     * Postcondition: none
     * </p>
     * 
     * @return a neatly formated temperature with its degrees and scale 
     *         which uses the degree symbol.
     */
    public String toString() {
        return String.format("%.1f\u00b0%c", degrees, scale) ;
    }

    /**
     * <p>
     * Compares two temperatures either C or F and determines if they are equal
     * </p>
     * 
     * <p>
     * Precondition: A named Temperature Object Exists <br />
     * Postcondition: none
     * </p>
     * 
     * @param another A different Temperature object
     * @return either true or false dependent on whether or not the two Temperatures are equal
     * 
     */
    public boolean equals(Temperature another) {
        double temp1 = this.degrees;
        double temp2 = another.degrees;
        double newTemp1 = 0.0;
        double newTemp2 = 0.0;

        //If scales are equal simply compare the degrees
        if (Character.toLowerCase(this.scale) == Character.toLowerCase(another.scale)) {

            if(this.degrees == another.degrees) {
                return (true);
            }
            else {
                return(false);
            }

        }
        //If scales are not equal convert each temperature to either F and C
        //Compare new temperature to old temperatures
        //If equal return true false otherwise
        else if (Character.toLowerCase(this.scale) != Character.toLowerCase(another.scale)) {

            if (Character.toLowerCase(this.scale) == 'f') {
                newTemp1 = (5 * (temp1 - 32)) / 9;
            }
            else if (Character.toLowerCase(this.scale) == 'c') {
                newTemp1 = ((9 * temp1) / 5) + 32;
            }

            if (Character.toLowerCase(another.scale) == 'f') {
                newTemp2 = (5 * (temp2 - 32)) / 9;
            }
            else if (Character.toLowerCase(another.scale) == 'c') {
                newTemp2 = ((9 * temp1) / 5) + 32;
            }

            if (temp1 == newTemp2 & temp2 == newTemp1){
                return (true);
            }
            else {
                return (false);
            }
        }

        return (false);
    }

} // end of Temperature class

/*
 * 
if (this.scale == 'F') {
newTemp1 = 5 * (temp1 - 32) / 9;
}
else if (this.scale == 'C') {
newTemp1 = (9 * (temp1 - 32) / 5) + 32;
}

if (another.scale == 'F') {
newTemp2 = 5 * (temp2 - 32) / 9;
}
else if (another.scale == 'C') {
newTemp2 = (9 * (temp2 - 32) / 5) + 32;
}

if (temp1 == newTemp2 & temp2 == newTemp2) {
return (true);
}
else {
return (false);
}

 */
