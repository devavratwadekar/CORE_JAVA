
public class Arithmetic_Operations {

    public static void main(String[] args) {
        int num1 = 7;
        int num2 = 3;

        // Addition
        int result_add = num1 + num2;
        System.out.println("Addition        num1 " + num1 + " and num2 " + num2 + " is " + result_add);

        // Substraction
        int result_sub = num1 - num2;
        System.out.println("Substration     num1 " + num1 + " and num2 " + num2 + " is " + result_sub);

        // Multiplication
        int result_multi = num1 * num2;
        System.out.println("Multiplication  num1 " + num1 + " and num2 " + num2 + " is " + result_multi);

        // Division
        int result_div = num1 / num2;
        System.out.println("Division        num1 " + num1 + " and num2 " + num2 + " is " + result_div);

        // Modulus
        int result_mod = num1 % num2;
        System.out.println("Modulus         num1 " + num1 + " and num2 " + num2 + " is " + result_mod);

        // Post Inccrement : fetch the value and then increment
        int result_post_increment = num1++;
        System.out.println("Post Increment  num1 " + num1 + " is " + result_post_increment);

        // Pre Inccrement : first increment and then fetch the value
        int result_pre_increment = ++num1;
        System.out.println("Pre Increment   num1 " + num1 + " is " + result_pre_increment);
    }
}
