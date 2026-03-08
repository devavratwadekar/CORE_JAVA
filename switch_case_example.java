
public class switch_case_example {

    // The switch statement is used to evaluate a variable against a series of values, offering a more
    // readable alternative to lengthy if-else-if chains. Each block in a switch statement is
    // represented by a case, and typically, the execution of a case block is terminated using the
    // break keyword.
    public static void main(String[] args) {
        int day = 4;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Please enter valid number");
        }
    }
}
