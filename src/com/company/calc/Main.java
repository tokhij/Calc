package com.company.calc;

public class Main {

    public static void main(String[] args) {
        double[] leftVal = {100.0, 25.0, 225.0, 11.0};
        double[] rightVal = {50.0, 92.0, 17.0, 3.0};
        char[] opCodes = {'d', 'a', 's', 'm'};
        double[] results = new double[opCodes.length];
//        double val1 = 100.0;
//        double val2 = 50.0;
//        double result;
//        char opCode = 'd';

        for(int i = 0; i < opCodes.length; i++) {
            switch(opCodes[i]){
                case 'a':
                    results[i] = leftVal[i] + rightVal[i];
                    break;
                case 's':
                    results[i] = leftVal[i] - rightVal[i];
                    break;
                case 'd':
                    results[i] = rightVal[i] != 0.0 ? leftVal[i] / rightVal[i] : 0.0;
                    // ternary operator replaces the next 4 lines
                    //            if(val2 != 0.0)
                    //                result = val1 / val2;
                    //            else
                    //                result = 0.0;
                    break;
                case 'm':
                    results[i] = leftVal[i] * rightVal[i];
                    break;
                default:
                    System.out.println("Error - invalid opCode");
                    results[i] = 0.0;
                    break;
            }
        }
        for (double theResult : results) {
            System.out.print("result = ");
            System.out.println(theResult);
        }
    }
}
