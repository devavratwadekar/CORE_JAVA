
class Calculator {

    public int addition(int n1, int n2) {
        int r = n1 + n2;
        return r;
    }
}

public class Calculator_Example {

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 30;

        System.out.println("Hello");
        Calculator calc = new Calculator();
        int result = calc.addition(num1, num2);
        System.out.println("Addition of " + num1 + " and " + num2 + " is " + result);
    }
}
