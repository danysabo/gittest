package com.ds;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Daniel on 24.6.2017..
 */
public class Kolekcije {
    public static void main(String[] args) {
        Collection<Integer> a = new ArrayList<>();

        a.add(1);
        a.add(3);
        a.add(3);
        a.add(10);
        System.out.println(a.size());
        /*for (Integer integer : a) {
            if (integer > 9) {
                a.remove(integer);
            }
        }*/
        Iterator<Integer> iter = a.iterator();
        while (iter.hasNext()) {
            Integer el = iter.next();
            if (el > 9) {
                iter.remove();
            }
        }
        for (Integer integer : a) {
            System.out.println(integer);
        }
    }
}
