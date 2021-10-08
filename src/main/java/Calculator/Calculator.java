package Calculator;

import java.text.DecimalFormat;

public class Calculator {

    private String calculatorName;
    DecimalFormat df = new DecimalFormat("###.##");
    //это для того что бы не округлять числа(определенный формат)

    public Calculator(String calculatorName) {
        this.calculatorName = calculatorName;
    }

    public double add(double firstNumber, double secondNumber){
        return Double.parseDouble(df.format(firstNumber + secondNumber));
        //double result = firstNumber + secondNumber;
    }

    public double subtract(double firstNumber, double secondNumber){
        return Double.parseDouble(df.format( firstNumber - secondNumber));
    }

    public double multiply (double firstNumber, double secondNumber){
        return Double.parseDouble(df.format(firstNumber * secondNumber));
    }

    public double divide( double firstNumber,double secondNumber){
        return Double.parseDouble( df.format(firstNumber / secondNumber));
    }


}
