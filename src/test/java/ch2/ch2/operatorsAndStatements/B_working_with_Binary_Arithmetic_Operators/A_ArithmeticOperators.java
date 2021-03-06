package ch2.ch2.operatorsAndStatements.B_working_with_Binary_Arithmetic_Operators;

/*
 * Created by: Cristian Arroyo
 * on 09 May 2018 - 12:07 PM
 */

/*
    binary operators, can be used to perform mathematical operations on variables, create logical expressions.
    Binary operators, are commonly combined in complex expressions with more than two variables;
*/

import org.junit.Test;

public class A_ArithmeticOperators {

    @Test
    public void arithmeticOperators(){
        // addition (+), subtraction (-), multiplication (*), division (/), and modulus (%), unary operators, ++ and --

		/*the multiplicative operators (*, /, %) have a higher order of precedence
		than the additive operators (+, -).*/
        int x = 2 * 5 + 3 * 4 - 8;
        System.out.println(x);
        /*
         * x = 10 + 12 - 8
         * x = 14
         * */
        //con parentesis, las cosas cambian
        int y = 2 * ((5 + 3) * 4 - 8);
        System.out.println(y);
		/*
		  y = 2 * (8 * 4 - 8);
		  y = 2 * (32 - 8);
		  y = 2 * 24;
		  y = 48
		 */

        /*the modulus operator: % */
        System.out.print(9 / 3); // Outputs 3
        System.out.print(9 % 3); // Outputs 0
        System.out.print(10 / 3); // Outputs 3
        System.out.print(10 % 3); // Outputs 1
        System.out.print(11 / 3); // Outputs 3
        System.out.print(11 % 3); // Outputs 2
        System.out.print(12 / 3); // Outputs 4
        System.out.print(12 % 3); // Outputs 0
    }
}
