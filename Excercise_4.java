
public class Excercise_4 {

    //Loop statement Excercise
    public static void main(String[] args) {
        // TODO: Print numbers 1 to 5 using for loop
        System.out.print("For Loop: ");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }

        // TODO: Print numbers 1 to 5 using while loop
        System.out.print("\nWhile Loop: ");
        int x = 1;
        while (x <= 5) {
            System.out.print(x + " ");
            x++;
        }

        // TODO: Print numbers 1 to 5 using do-while loop
        System.out.print("\nDo-While Loop: ");
        int y = 1;
        do {
            System.out.print(y + " ");
            y++;

        } while (y <= 5);
    }
}
