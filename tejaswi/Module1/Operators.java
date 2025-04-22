public class Operators {
    public static void main(String[] args) {
        boolean setValue = true;
        boolean unsetValue = false;

        int number = 7;
        int result1 = 0;

        int age = 21;

        //Arithmetic Operators


        int num1 = 7;
        int num2 = 9;
        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        int division = num1 / num2;

        System.out.println("Addition is: " + sum);
        System.out.println("Subtraction is: " + difference);
        System.out.println("Product is: " + product);
        System.out.println("Division is: " + division);

        //Bitwise Operators

        int bitAnd = num1 & num2;
        int bitOr = num1 | num2;
        int bitXor = num1 ^ num2;
        int leftShift = num1 << num2;
        int rightShift = num1 >> num2;
        int notOperation = ~num1;

        System.out.println("Bitwise AND result: " + bitAnd);
        System.out.println("Bitwise OR result: " + bitOr);
        System.out.println("Bitwise XOR result: " + bitXor);
        System.out.println("Left shift result: " + leftShift);
        System.out.println("Right shift result: " + rightShift);
        System.out.println("Not operation result : " + notOperation);

        //Relational Operators
        boolean greaterCheck = 'a' > 12;
        boolean smallerCheck = 'a' < 12;
        boolean equalCheck = 'a' == 97;
        boolean notEqualCheck = 'a' != 97;
        boolean greaterEqualCheck = 'a' >= 98;
        boolean smallerEqualCheck = 'a' <= 90;

        System.out.println("Greater check: " + greaterCheck);
        System.out.println("Smaller check: " + smallerCheck);
        System.out.println("Equal check: " + equalCheck);
        System.out.println("Not equal check: " + notEqualCheck);
        System.out.println("Greater equal check: " + greaterEqualCheck);
        System.out.println("Smaller equal check: " + smallerEqualCheck);

        //Logical Operators

        boolean andResult = setValue && unsetValue;
        boolean orResult = setValue || unsetValue;
        boolean notResult = !setValue;

        System.out.println("AND result: " + andResult);
        System.out.println("OR result: " + orResult);
        System.out.println("NOT result: " + notResult);

        //Assignment Operators

        result1 += number;
        System.out.println("After += : " + result1);
        result1 -= number;
        System.out.println("After -= : " + result1);
        result1 *= number;
        System.out.println("After *= : " + result1);
        result1 /= number;
        System.out.println("After /= : " + result1);
        result1 %= number;
        System.out.println("After %= : " + result1);

        //Unary operators

        int value = 7;

        ++value;
        System.out.println(value);

        value++;
        System.out.println(value);

        --value;
        System.out.println(value);

        value--;
        System.out.println(value);

        //Ternary Operators



        boolean isEligible = (age >= 18) ? true : false;

         

        
    }
}