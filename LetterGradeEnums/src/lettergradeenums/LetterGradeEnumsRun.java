/** 
 * 
 * Solve the same problem as the previous challenge activity, but
 * this time use the custom java Enum in the Grade.java so rather than writing:
 * 
 *         if (finalGrade >=90) {
 *           finalLetter = "A";
 *         }
 * 
 *  You'll use this more readable version with enums:
 * 
 *         if (finalGrade >=Grade.A.Min()) {
 *            finalLetter = Grade.A;
 *       }
 * 
 * Same input and output as before:
 
 * PROGRAM OUTPUT SAMPLES:
 *  Enter your final average [0-100] : 67.8
 *  A final average of 67.800000 translates to a letter grade of D
 * 
 *  Enter your final average [0-100] : 90.0
 *  A final average of 90.000000 translates to a letter grade of A
 * 
 * Enter your final average [0-100] : 89.999999
 * A final average of 89.999999 translates to a letter grade of B
 */
package lettergradeenums;

import java.util.Scanner;

public class LetterGradeEnumsRun {

    public static void main(String[] args) {
        /* TODO: Re-write this code to use the Grade Enum
         *  Grade.A.Min(), Grade.A.Max(), etc...
         */
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your final average [0-100] : ");
        double finalGrade = input.nextDouble();
        Grade finalLetter;
        if (finalGrade >=Grade.A.Min()) {
            finalLetter = Grade.A;
        } else if (finalGrade >=Grade.B.Min()) {
            finalLetter = Grade.B;
        } else if (finalGrade >=Grade.C.Min()) {
            finalLetter = Grade.C;
        } else if (finalGrade >=Grade.D.Min() ) {
            finalLetter = Grade.D;
        } else {
            finalLetter = Grade.F;
        }
        System.out.printf("A final average of %f translates to a letter grade of %s\n"
                , finalGrade, finalLetter);
    }
}
