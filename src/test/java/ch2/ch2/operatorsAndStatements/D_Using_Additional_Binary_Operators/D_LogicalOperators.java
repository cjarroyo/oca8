package ch2.ch2.operatorsAndStatements.D_Using_Additional_Binary_Operators;

/*
 * Created by: Cristian Arroyo
 * on 09 May 2018 - 12:10 PM
 */

import org.junit.Test;

public class D_LogicalOperators {

    @Test
    public void logicalOperators() {
        /*
        The logical operators, ( & ), ( | ), and ( ^ ), may be applied to both numeric and boolean data types
        when they’re applied to numeric data types, they’re referred to as bitwise(bit a bit) operators

            x & y       x | y           x ^ y
            (AND)   (INCLUSIVE OR)  (EXCLUSIVE OR)

            AND is only true if both operands are true.
            Inclusive OR is only false if both operands are false.
            Exclusive OR is only true if the operands are different.

            short-circuit operators --> && and ||
            identical to the
            logical operators -->  & and |

            the final result can be determined by the left-hand side of the expression.
         */
        int y = 9;
        boolean x = true || (y < 4); //always TRUE

        /*if(x != null && x.getValue() < 5) {// if x was null , then the short-circuit prevents a NullPointerException
            // Do something
        }*/
        //si x es null since the evaluation of x.getValue() < 5 is never reached, correct


        int a = 6;
        boolean b = (a >= 6) || (++a <= 7); //(a >= 6) es TRUE el otro ya no se usa entonces --a sigue siendo 6
        System.out.println(a);

    }
}
