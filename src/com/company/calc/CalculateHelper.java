package com.company.calc;

public class CalculateHelper {
    MathCommand command;
    double leftVal;
    double rightVal;
    double result;

    public void process(String statement){
        // add 1.0 2.0
        String[] parts = statement.split("");
        String commandSTring = parts[0]; // add
        leftVal = Double.parseDouble(parts[1]); // 1.0
        rightVal = Double.parseDouble(parts[2]); // 2.0


    }

    private void setCommandFromString(String commandString){
        // add -> MathCommand.Add

        if(commandString.equalsIgnoreCase(MathCommand.Add.toString()))
            command = MathCommand.Add;
        else if(commandString.equalsIgnoreCase(MathCommand.Subtract.toString()))
            command = MathCommand.Subtract;
        else if(commandString.equalsIgnoreCase(MathCommand.Multiply.toString()))
            command = MathCommand.Multiply;
        else if(commandString.equalsIgnoreCase(MathCommand.Divide.toString()))
            command = MathCommand.Divide;
    }

}
