package com.company.calc;

public class Main {

    public static void main(String[] args) {
//        double[] leftVal = {100.0, 25.0, 225.0, 11.0};
//        double[] rightVal = {50.0, 92.0, 17.0, 3.0};
//        char[] opCodes = {'d', 'a', 's', 'm'};
//        double[] results = new double[opCodes.length];
//        double val1 = 100.0;
//        double val2 = 50.0;
//        double result;
//        char opCode = 'd';

        MathEquation[] equations = new MathEquation[4];
        equations[0] = create(100.0, 50.0, 'd');
        equations[1] =  create(25.0, 92.0, 'a');
        equations[2] =  create(225.0, 17.0, 's');
        equations[3] =  create(11.0, 3.0, 'm');
        for (MathEquation equation: equations) {
            equation.execute();
            System.out.print("result = ");
            System.out.println(equation.result);
        }
    }


    public static MathEquation create(double leftVal, double rightVal, char opCode){
        MathEquation equation = new MathEquation();
        equation.leftVal = leftVal;
        equation.rightVal = rightVal;
        equation.opCode = opCode;

        return equation;
    }
}
