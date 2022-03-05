package com.company;

public class Main {

    public static void main(String[] args) {
	    float earthWeightSande;
        float marsWeightSande;
        double marsWeightDoubleSande;
        int marsWeightIntSande;

        earthWeightSande = 70;
        marsWeightSande = (earthWeightSande * 0.38f);
        System.out.println(earthWeightSande + "Kg on earth is equivalent to " + marsWeightSande + " kg on Mars" );

        //CHANGING RESULT FROM FLOAT TO DOUBLE
        marsWeightDoubleSande = marsWeightSande;
        System.out.println("Weight on mars after converting to double is "+ marsWeightDoubleSande);

        //PRINTING WEIGHT ON MARS ROUNDED TO 4 DECIMAL PLACES
        System.out.printf("Weight in kgs on Mars rounded to 4 decimal places is: %.4f %n", marsWeightDoubleSande);

        //CASTING FLOAT TO INTEGER
        marsWeightIntSande = (int) marsWeightDoubleSande;
        System.out.println("Weight on mars in Kgs casted to int is " + marsWeightIntSande);

        //CASTING INT TO CHAR
        char c = (char)marsWeightIntSande;
        System.out.println("The ASCII value equivalent of marsWeightIntSande is " + c);

        //MATHEMATICAL OPERATION WITH CHAR TYPE
        int charMath = c + c;
        System.out.println("An example of mathematical operation is " + charMath);
        
    }
}
