
public class Excercise_2 {

    public static void main(String[] args) {
        // write code here
        int a = 20;
        int b = 10;

        // 1. task a: Add, subtract, multiply, and divide
        int result_add = a + b;
        System.out.println("Addition: " + result_add);

        int result_sub = a - b;
        System.out.println("Subtraction: " + result_sub);

        int result_multi = a * b;
        System.out.println("Multiplication: " + result_multi);

        int result_div = a / b;
        System.out.println("Division: " + result_div);

        // 1. task b: Compare a is greater than b
        boolean result_greater_than = a > b;
        System.out.println("Is a greater than b? " + result_greater_than);

        // 1. task c: check logical operation 
        Boolean result = (a > b) && (b > 0);
        System.out.println("Is a > b and b > 0? " + result);

    }
}
