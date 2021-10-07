package Calculator;

public class Main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator("Casio");

        double addition = calculator.add(10,15);
        System.out.println(addition);

        double sumOfSubtract = calculator.subtract(20,15);
        System.out.println(sumOfSubtract);

        double sumOfMultiply = calculator.multiply(30,10);
        System.out.println(sumOfMultiply);

        double sumOfDivide = calculator.divide(8,4);
        System.out.println(sumOfDivide);
    }
}

