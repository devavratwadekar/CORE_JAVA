
public class for_loop_example {

    // A for loop is a control flow structure in programming that iterates over a sequence of
    // elements, such as a range of numbers, items in a list, or characters in a string. It is an entrycontrolled loop, meaning it determines the number of iterations before entering the loop. The
    // for loop provides a concise way of writing the loop control structure in a single line, unlike
    // other loops where initialization, condition, and increment/decrement steps are specified
    // separately.
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            System.out.println("DAY " + i);
            for (int j = 1; j <= 9; j++) {
                System.out.println("    " + (j + 8) + " - " + (j + 9));
            }
        }
    }
}
