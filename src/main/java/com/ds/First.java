package com.ds;

import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;

public abstract class First extends Object {
    int br; //mali int
    Integer br1;
    First f1;


    public static final String KON;

    private static final Map<Integer, String> weekend;

    static {
        weekend = new HashMap<>();
        KON = "konstanta";
    }

    public static String toNumbers(String str) {
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < str.length(); i++) {
            sb.append(Integer.valueOf(str.charAt(i)));
        }
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        First first = (First) o;

        if (br != first.br) return false;
        if (br1 != null ? !br1.equals(first.br1) : first.br1 != null) return false;
        return true;//f1 != null ? f1.equals(first.f1) : first.f1 == null;
    }

    @Override
    public int hashCode() {
        int result = br;
        result = 31 * result + (br1 != null ? br1.hashCode() : 0);
        result = 31 * result + (f1 != null ? f1.hashCode() : 0);
        return result;
    }

    public void pokreni(String ime) throws ParseException {
        if (ime.equals("Ime")) {
            throw new ParseException("Wrong ime", 0);
        }
        System.out.println("First " + ime);
        pokreni1();
    }

    public abstract void pokreni1();

}
