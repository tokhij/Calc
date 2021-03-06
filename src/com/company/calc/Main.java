package com.company.calc;

public class Main {

    public static void main(String[] args) {
//        useMathEquation();
//        useCalculatorBase();

        String[] statements = {
                "add 1.0",                  // Error: incorrect num of vals
                "add xx 25.0",              // Error: non-numeric data
                "addX 0.0 0.0",             // Error: invalid command
                "divide 100.0 50.0",         // 100.0 / 50.0 = 2.0
                "add 25.0 92.0",            // 25.0 + 92.0 = 117.0
                "subtract 225.0 17.0",      // 225.0 - 17.0 = 108.0
                "multiply 11.0 3.0"         // 11.0 * 3.0 = 33.0
        };

        CalculateHelper helper = new CalculateHelper();
        for (String statement:statements) {
            try {
                helper.process(statement);
                System.out.println(helper);
            } catch (InvalidStatementException e){
                System.out.println(e.getMessage());
                if(e.getCause() != null)
                    System.out.println("   Original exception: " + e.getCause().getMessage());
            }
        }


    }

    static void useMathEquation(){
        MathEquation[] equations = new MathEquation[4];
        equations[0] = new MathEquation('d',100.0, 50.0);
        equations[1] = new MathEquation('a',25.0, 92.0);
        equations[2] = new MathEquation('s',225.0, 17.0);
        equations[3] = new MathEquation('m',11.0, 3.0);

        for (MathEquation equation: equations) {
            equation.execute();
            System.out.print("result = ");
            System.out.println(equation.getResult());
        }

        System.out.println();
        System.out.println("Using OLs");
        System.out.println();

        double leftD = 9.0;
        double rightD = 4.0;
        int leftI = 9;
        int rightI = 4;

        MathEquation equationOverload = new MathEquation('d');

        equationOverload.execute(leftD, rightD);
        System.out.print("result = ");
        System.out.println(equationOverload.getResult());

        equationOverload.execute(leftI, rightI);
        System.out.print("result = ");
        System.out.println(equationOverload.getResult());

        equationOverload.execute((double)leftI, rightI);
        System.out.print("result = ");
        System.out.println(equationOverload.getResult());

        System.out.println();
        System.out.println("Using Inheritance");
        System.out.println();

        CalculateBase[] calculators = {
                new Divider(100.0, 50.0),
                new Adder(25.0, 92.0),
                new Subtracter(225.0, 17.0),
                new Multiplier(11.0, 3.0)
        };

        for (CalculateBase calculator: calculators) {
            calculator.calculate();
            System.out.print("result = ");
            System.out.println(calculator.getResult());
        }
    }


//    public static MathEquation create(double leftVal, double rightVal, char opCode){
//        MathEquation equation = new MathEquation();
//        equation.setLeftVal(leftVal);
//        equation.setRightVal(rightVal);
//        equation.setOpCode(opCode);
//
//        return equation;
//    }
}
