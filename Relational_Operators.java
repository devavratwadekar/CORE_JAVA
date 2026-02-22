
public class Relational_Operators {

    public static void main(String[] args) {
        int a = 10;
        double b = 10.7;

        System.out.println("a : is " + a + "\nb is : " + b + "\n");

        boolean result_greater_than = a > b;
        System.out.println("a is greater than b         : " + result_greater_than);

        boolean result_less_than = a < b;
        System.out.println("a is less than b            : " + result_less_than);

        boolean result_equals_to = a == b;
        System.out.println("a is equals to b            : " + result_equals_to);

        boolean result_not_equals_to = a != b;
        System.out.println("a is not equals to b        : " + result_not_equals_to);

        boolean result_less_than_equals_to = a <= b;
        System.out.println("a is less than equals to b  : " + result_less_than_equals_to);

        boolean result_greater_than_equals_to = a >= b;
        System.out.println("a is greater than equals to b : " + result_greater_than_equals_to);
    }
}
