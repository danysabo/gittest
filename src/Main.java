import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Soba soba = new Soba(new Fotelja(120, 160, 110),
                new RadniSto(180, 80, 80),
                new Osvetljenje(new NocnoSvetlo(20, false),
                        new GlavnoSvetlo(160, true)),
                new Prozor(100, 160, false));

        soba.prozor.openWindow(false);
        soba.prozor.openWindow(true);

        soba.osvetljenje.glavnoOnOff(false);
        soba.osvetljenje.nocnoOnOff(true);

        System.out.println(soba.osvetljenje.nocnoSvetlo.getPower() + "W");

        soba.radniSto.learning("Boris", 6);

        soba.fotelja.sitDown("Nikola");
    }

    public static void main5(String[] args) {
        GenericClass<First> gc = new GenericClass<>(new Second());
        First polje = gc.getElem();
        System.out.println(polje);
    }
    public static void main1(String[] args) {
        System.out.println(First.toNumbers("ABC"));

        First f = new First() {
            @Override
            public void pokreni1() {
                System.out.println("radi nesto");
            }
        };
        f = new Second();
        f.pokreni1();
        System.out.println(f);
    }
    public static void main3(String[] args) {
        First f1 = new Second();
        f1.br = 3;
        First f2 = new Second();
        First f3 = new Second();
        f3.br = 3;
        f1.f1 = f2;
        boolean equals = f1.equals(f3);
        System.out.println(equals);

        System.out.println(f1.hashCode());
        System.out.println(f3.hashCode());

        Set<First> fs = new HashSet<>();
        fs.add(f1);
        fs.add(f3);
        System.out.println(fs.size());
    }

    public static void main2(String[] args) {
        Object br1 = 32332423;
        Object br2 = 32332423;
        //br2 = br1;
        if (br1.equals(br2)) {
            System.out.println(br1);
        }
        System.out.println(br2);
        br1 = 5;
        br2 = 5;
        System.out.println(br2);
//        if (br1.intValue() == br2) {
//            System.out.println(br1);
//        }
    }

    public static void main4(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>();
        Set<First> firstSet = new HashSet<>();


        hashMap.put(1, "jedan");
        hashMap.put(2, "dv");
        for (Map.Entry<Integer, String> integerStringEntry : hashMap.entrySet()) {
            System.out.println(integerStringEntry.getKey() + " = " + integerStringEntry.getValue());
        }

        System.out.println(hashMap.get(2));

        List<First> list = new ArrayList<>();
        First first = new Second2();
        first.br = 5;
        list.add(first);
        First second = new Second();
        second.br = 6;
        second = first;
        System.out.println(second.br);
        first.br = 7;
        System.out.println(second.br);
        list.add(second);

        list.add(new Second(3));
        list.add(new Second(1));

        list.sort(new Comparator<First>() {

            @Override
            public int compare(First o1, First o2) {
                return o1.br - o2.br;
            }
        });

        for (First first1 : list) {
            System.out.println(first1.br);
        }
//        for (First item : list) {
//            try {
//                item.pokreni("Ime1");
//
//                First f = null;
//                f.pokreni1();
//            } catch (ClassCastException | NullPointerException ce) {
//                ce.printStackTrace();
//            } catch (Throwable e) {
//                e.printStackTrace();
//            } finally {
//                System.out.println("fin");
//            }
//        }

    }

    static class MyComparator implements Comparator<First> {

        @Override
        public int compare(First o1, First o2) {
            return o1.br - o2.br;
        }
    }
}
