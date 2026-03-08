
public class while_loop_example {

    // A while loop is an "entry-controlled" control flow structure in programming that repeatedly
    // executes a block of code as long as a specified condition remains true. The loop continues to
    // iterate while the condition is true and terminates once the condition evaluates to false.
    public static void main(String[] args) {
        int i = 1;

        while (i <= 4) {
            System.out.println("Hi " + i);
            int j = 1;
            while (j <= 3) {
                System.out.println("Hello " + j);
                j++;
            }
            i++;
        }

        System.out.println("Bye " + i);
    }
}
