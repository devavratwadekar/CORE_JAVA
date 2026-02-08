
public class Literals {

    public static void main(String[] args) {
        // Integer Literals
        int binary_num = 0b101;       // 5 - Binary Literals
        System.out.println("Binary Literals 0b101 : " + binary_num);

        int hexa_num = 0x101;       // 102 - Hexadecimal Literals
        System.out.println("Hexadecimal Literals 0x101 : " + hexa_num);

        int octal_num = 0146;       // 102 - Octal Literals
        System.out.println("Octal literal 0146 : " + octal_num);

        int decimal_num = 101;       // 101 - Decimal Literals
        System.out.println("Decimal literal 101 : " + decimal_num);

        // Character Literals
        char letter = 'a';
        System.out.println("Character literal a : " + letter);

        char symbol = '%';
        System.out.println("Character literal % : " + symbol);

        // Boolean Literals
        boolean isJavaFun = true;
        boolean isFishMammal = false;
        System.out.println("Is Java Fun : " + isJavaFun);
        System.out.println("Is Fish Mammal : " + isFishMammal);

        // String Literals
        String name = "Devavrat";
        System.out.println("Name : " + name);

        String number = "12345";
        System.out.println("Number : " + number);

        String newLine = "\n";
        System.out.println("New Line : " + newLine);

        // Floating Point Literals
        float price = 12.56f;
        System.out.println("Price : " + price);

        double weight = 55.6;
        System.out.println("Weight : " + weight);

        double scientific = 1.234e2;
        System.out.println("Scientific : " + scientific);

    }
}
