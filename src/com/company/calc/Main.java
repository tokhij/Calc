package com.company.calc;

public class Main {

    public static void main(String[] args) {
        double val1 = 100.0;
        double val2 = 50.0;
        double result;
        char opCode = 'd';

        if(opCode == 'a')
            result = val1 + val2;
        else if(opCode == 's')
            result = val1 - val2;
        else if(opCode == 'd')
            result = val2 != 0.0 ? val1 / val2 : 0.0;
// ternary operator replaces the next 4 lines
//            if(val2 != 0.0)
//                result = val1 / val2;
//            else
//                result = 0.0;
        else if(opCode == 'm')
            result = val1 * val2;
        else {
            System.out.println("Error - invalid opCode");
            result = 0.0;
        }
        System.out.println(result);
    }
}
