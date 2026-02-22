
public class Logical_Operators {

    public static void main(String[] args) {

        int x = 10;
        int y = 20;

        double a = 3.16;
        float b = 3.11f;

        System.out.println("x: " + 10 + ", y: " + y + ", a: " + a + ", b: " + b);

        // AND Operation
        boolean and_result = (x < y) && (a < b);
        System.out.println("AND Result (x < y) && (a < b) : " + and_result);    //  T && F = F

        and_result = (x > y) && (a > b);
        System.out.println("AND Result (x > y) && (a > b) : " + and_result);    //  F && T = F

        and_result = (x < y) && (a > b);
        System.out.println("AND Result (x < y) && (a > b) : " + and_result);    // T && T = T

        and_result = (x > y) && (a < b);
        System.out.println("AND Result (x > y) && (a < b) : " + and_result);    // F && F = F
        System.out.println();

        // OR Operation
        boolean or_result = (x < y) || (a < b);
        System.out.println("OR Result (x < y) || (a < b) : " + or_result);    //  T || F = T

        or_result = (x > y) || (a > b);
        System.out.println("OR Result (x > y) || (a > b) : " + or_result);    //  F || T = T

        or_result = (x < y) || (a > b);
        System.out.println("OR Result (x < y) || (a > b) : " + or_result);    // T || T = T

        or_result = (x > y) || (a < b);
        System.out.println("OR Result (x > y) || (a < b) : " + or_result);    // F || F = F
        System.out.println();

        // NOT Operation
        boolean not_result = !(x < y);
        System.out.println("NOT Result (x < y) : " + not_result);    //  !T  = F

        not_result = !(x > y);
        System.out.println("NOT Result (x > y) : " + not_result);    //  !F  = T
        System.out.println();

        // XOR Operation
        boolean xor_result = (x < y) ^ (a < b);
        System.out.println("XOR Result (x < y) ^ (a < b) : " + xor_result);    //  T ^ F = T

        xor_result = (x > y) ^ (a > b);
        System.out.println("XOR Result (x > y) ^ (a > b) : " + xor_result);    //  F ^ T = T

        xor_result = (x < y) ^ (a > b);
        System.out.println("XOR Result (x < y) ^ (a > b) : " + xor_result);    // T ^ T = T

        xor_result = (x > y) ^ (a < b);
        System.out.println("XOR Result (x > y) ^ (a < b) : " + xor_result);    // F ^ F = F
    }
}
