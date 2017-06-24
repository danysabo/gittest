package com.ds;

import java.text.ParseException;
import java.util.Arrays;

public class Second extends First {
    String[][] vNiz = {{"prvi", "drugi"},{"prvi1", "drugi1", "treci1"}};

    public Second() {
        super();
    }

    public Second(int i) {
        super();
        br = i;
    }

    public void pokreni() throws ParseException {
        super.pokreni("test");
        System.out.println("Second" );
    }

    @Override
    public void pokreni1() {
        System.out.println("pokreni1 second");
        for (String[] strings : vNiz) {
            for (String string : strings) {
                System.out.println(string);
            }
        }
    }

    @Override
    public String toString() {
        return "Second{" +
                "vNiz=" + Arrays.toString(vNiz) +
                '}';
    }
}
