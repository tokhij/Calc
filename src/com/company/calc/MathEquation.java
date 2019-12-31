package com.company.calc;

public class MathEquation {
    private double leftVal;
    private double rightVal;
    private char opCode = 'a';
    private double result;

    public void setLeftVal(double leftVal) { this.leftVal = leftVal; }
    public void setRightVal(double rightVal) { this.rightVal = rightVal; }
    public void setOpCode(char opCode) { this.opCode = opCode; }
    public double getRightVal() { return rightVal; }
    public char getOpCode() { return opCode; }

    public double getResult() { return result; }

    public MathEquation(){
    }

    public MathEquation(char opCode){
        this.opCode = opCode;
    }

    public MathEquation(char opCode, double leftVal, double rightVal){
        this(opCode);
        this.leftVal = leftVal;
        this.rightVal = rightVal;
    }

    public void execute() {
        switch(opCode){
            case 'a':
                result = leftVal + rightVal;
                break;
            case 's':
                result = leftVal - rightVal;
                break;
            case 'd':
                result = rightVal != 0.0 ? leftVal / rightVal : 0.0;
                // ternary operator replaces the next 4 lines
                //            if(val2 != 0.0)
                //                result = val1 / val2;
                //            else
                //                result = 0.0;
                break;
            case 'm':
                result = leftVal * rightVal;
                break;
            default:
                System.out.println("Error - invalid opCode");
                result = 0.0;
                break;
        }
    }


}
