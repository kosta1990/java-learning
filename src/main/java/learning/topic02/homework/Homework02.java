package learning.topic02.homework;

public class Homework02 {
    void main() {

        byte bDecimalValue = 12;
        byte bBinaryValue = 0b1100;
        byte bOctalValue = 014;
        byte bHexValue = 0xC;
        IO.println(bDecimalValue + " " + bBinaryValue + " " + bOctalValue + " " + bHexValue);

        short sDecimalValue = 1300;
        short sBinaryValue = 0b10100010100;
        short sOctalValue = 02424;
        short sHexValue = 0x514;
        IO.println(sDecimalValue + " " + sBinaryValue + " " + sOctalValue + " " + sHexValue);

        int iDecimalValue = 0;
        int iBinaryValue = 0b0;
        int iOctalValue = 00;
        int iHexValue = 0x0;
        IO.println(iDecimalValue + " " + iBinaryValue + " " + iOctalValue + " " + iHexValue);

        long lDecimalValue = 123456789L;
        long lBinaryValue = 0b111010110111100110100010101L;
        long lOctalValue = 0726746425L;
        long lHexValue = 0x75BCD15L;
        IO.println(lDecimalValue + " " + lBinaryValue + " " + lOctalValue + " " + lHexValue);

        float f1 = 0.01f;
        float f2 = 0.02F;
        IO.println(f1);
        IO.println(f2);

        double d1 = 0.03d;
        double d2 = 0.04D;
        IO.println(d1);
        IO.println(d2);

        boolean b1 = true;
        boolean b2 = false;
        IO.println(b1);
        IO.println(b2);

        char symbol1 = 'b';
        char symbol2 = 98;
        char symbol3 = '\u0062';
        IO.println(symbol1 + " " + symbol2 + " " + symbol3);
    }
}

