
public class If_else_If_example {

    // The if-else if statement allows for multiple conditions to be checked in sequence. If the if
    // condition is false, the program checks the next else if condition, and so on.
    public static void main(String[] args) {
        int x = 8, y = 7, z = 6;

        if (x > y && x > z) {
            System.out.println(x);
        } else if (y > z) {
            System.out.println(y);
        } else {
            System.out.println(z);
        }

    }
}
