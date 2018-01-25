public class Main {
    public static void main(String[] args) {

        // int has a width of 32
        int myMinValue = -2_147_483_648;
        int myMaxValue = 2_147_483_647;
        int myTotal = (myMinValue / 2);
        System.out.println("myTotal = " + myTotal);

        // byte has a width of 8
        byte myByteValue = -128;
        byte myNewByteValue = (byte) (myByteValue / 2); // java threads expressions as int per default, so we need to cast to byte her
        System.out.println("myNewByteValue = " + myNewByteValue);

        // short has a width of 16
        short myShortValue = 32767;
        short myNewShortValue = (short) (myShortValue / 2); // same as byte comment
        System.out.println("myNewShortValue = " + myNewShortValue);

        // long has a width of 64
        long myLongValue = 100L;

        // 1. Create a byte variable and set it to any valid byte number
        byte aByteValue = 10;

        // 2. Create a short variable and set it to any sort number
        short aShortValue = 20;

        // 3. Create a int variable and set it to any int number
        int aIntValue = 50;

        // 4. Create a variabale of type long, and make it equal to
        //      50000 + 10 times the sum of the byte, plus the short plus the int
        long longTotal = 50000 + 10 * (aByteValue + aShortValue + aIntValue);
        System.out.println("longTotal = " + longTotal);

        short shortTotal = (short) (1000 + 10 * (aByteValue + aShortValue + aIntValue));
        System.out.println("shortTotal = " + shortTotal);
    }
}
