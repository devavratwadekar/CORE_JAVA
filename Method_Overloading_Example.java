
class Calculator_Add {

    // Method Overloading in Java allows multiple methods to share the same name but differ in their signatures
    public int add(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }

    public int add(int n1, int n2) {
        return n1 + n2;
    }

    public double add(double n1, int n2) {
        return n1 + n2;
    }
}

public class Method_Overloading_Example {

    public static void main(String[] args) {
        Calculator_Add obj = new Calculator_Add();

        int add_two_numbers = obj.add(3, 7);
        System.out.println(add_two_numbers);

        double add_two_decimal_numbers = obj.add(3.7, 7);
        System.out.println(add_two_decimal_numbers);

        int add_three_numbre = obj.add(3, 7, 9);
        System.out.println(add_three_numbre);
    }
}
