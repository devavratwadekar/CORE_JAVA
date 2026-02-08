
public class Type_Casting {

    public static void main(String[] args) {
        byte b1 = 10;
        byte b2 = 20;

        // byte b3 = b1 + b2;  //error: incompatible types: possible lossy conversion from int to byte
        byte b3 = (byte) (b1 * b2);
        System.out.println("result of byte b1 + b2 is " + b3);
        // Java wraps the value around: 200 - 256 = -56

    }
}
