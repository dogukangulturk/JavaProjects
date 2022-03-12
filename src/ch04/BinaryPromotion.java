package ch04;

public class BinaryPromotion {

    public static void main(String[] args) {
        byte b1 = 5;
        byte b2 = 8;
//		byte b3 = b1 * b2; // compile error: possible loss of precision
        byte b3 = (byte) (b1 * b2); // OK
        System.out.println(b3);

        byte b = 3;
//		byte c = b >>> b;
        byte c = (byte) (b >>> b);
    }
}
