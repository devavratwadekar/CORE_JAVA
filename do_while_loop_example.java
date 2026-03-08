
public class do_while_loop_example {

    // A do-while loop is an exit-controlled control flow structure in programming. It ensures that a block of
    // code is executed at least once and then continues to execute the block as long as a specified
    // condition remains true. The key feature of a do-while loop is that the condition is evaluated after the
    // code block, guaranteeing at least one execution, even if the condition is initially false
    public static void main(String[] args) {
        int i = 1;

        do {
            System.out.println("Hi " + i);
            i++;
        } while (i <= 4);

        System.out.println("Bye " + i);
    }
}
