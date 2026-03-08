
public class Excercise_3 {

    public static void main(String[] args) {
        int score = 75;

        if (score >= 90) {
            System.out.println("Passed");
            System.out.println("\nGrade: A");
        } else if (score >= 75 && score < 90) {
            System.out.println("Passed");
            System.out.println("\nGrade: B");
        } else if (score >= 60 && score < 75) {
            System.out.println("Passed");
            System.out.println("\nGrade: C");
        } else if (score >= 50 && score < 60) {
            System.out.println("Passed");
            System.out.println("\nGrade: D");
        } else {
            System.out.println("Failed");
        }

    }
}
