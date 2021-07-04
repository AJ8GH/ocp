public class Primitives {
    public static void main(String[] args) {
        byte myByte = 123;
        System.out.println(myByte);

        byte myByte2 = 125;
        System.out.println(myByte2);

        byte myByte3 = 127;
        System.out.println(myByte3);

        // byte range = -128 to +127

        // sizes of primitive data values

        // boolean => 1 bit => true or false
        // byte => 8 bit => integral value
        // short => 16 bit => integral value
        // int => 32 bit => integral value
        // long => 64 bit => integral value
        // float => 32 bit => floating point value
        // double => 64 bit => floating point value
        // char => 12 bit => Unicode value

        short myShort = (short) (Math.pow(2, 14));
        System.out.println(myShort);

        short myShort2 = (short) (Math.pow(2, 15));
        System.out.println(myShort2);

        short myShort3 = 32767;
        System.out.println(myShort3);

        // max short val
        // 2 ^ 16 == 65536
        // 65536 / 2 = 32768
        // max postiive
        // max negative = -32768

        short myShort4 = 'A';
        System.out.println(myShort4);

        char myChar = 32767;
        System.out.println(myChar);

        char myChar2 = 97;
        System.out.println(myChar2);
    }
}
