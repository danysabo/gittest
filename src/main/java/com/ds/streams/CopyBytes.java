package com.ds.streams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class CopyBytes {
    public static void main(String[] args) throws IOException {

        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream("xanadu.txt");
            out = new FileOutputStream("outagain.txt");
            int c;

            while ((c = in.read()) != -1) {
                final char c1 = (char) c;
                System.out.println(c1);
                out.write(c);
                String str = Integer.toBinaryString(c1);
                System.out.println(addLeadingZeroes(str));
                System.out.println("---------------------------------");
            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }

    private static String addLeadingZeroes(String s) {
        int zeroes = s.length() % 8;
        byte[] bzero = new byte[(8 - zeroes) % 8];
        Arrays.fill(bzero, (byte)0x30);
        return new String(bzero) + s;
    }
}
