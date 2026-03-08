
public class Ternary_example {

    // The ternary operator is a concise way to write an if-else statement. It involves three
    // operands: a condition, a result for when the condition is true, and a result for when the
    // condition is false. This operator can help reduce the lines of code required for simple
    // conditional assignments.
    public static void main(String[] args) {
        int x = 10;

        // if (x > 13) {
        //     System.out.println(x + " is greater than 13");
        // } else {
        //     System.out.println(x + " is less than 13");
        // }
        // (condition)?(true):(false)
        String result = (x > 13) ? (x + " is greater than 13") : (x + " is less than 13");
        System.out.println(result);
    }
}
