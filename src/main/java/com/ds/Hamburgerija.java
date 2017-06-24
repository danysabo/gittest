package com.ds;

class Hamburger {
    private Hamburgerija.Dodatak[] dodaci;
    private int cena;
    public Hamburger(int cena, Hamburgerija.Dodatak... dodaci) {
        this.cena = cena;
        this.dodaci = dodaci;

    }
    public int getCena() {
        int res = 0;
        for (Hamburgerija.Dodatak dodatak : dodaci) {
            res += dodatak.getCena();
        }
        return res + cena;
    }
}
public class Hamburgerija {

    enum Dodatak {
        Urnebes(20),
        Tartar(20),
        Pavlaka(10);

        private final int cena;

        Dodatak(int cena) {
            this.cena = cena;
        }
        public int getCena() {
            return cena;
        }
    }

    public static void main(String[] args) {


        Hamburger ham = new Hamburger(150, Dodatak.Urnebes, Dodatak.Pavlaka, Dodatak.Tartar);
        System.out.println(ham.getCena());

        for (Dodatak dodatak : Dodatak.values()) {
            System.out.println(dodatak.name());
            System.out.println(dodatak.ordinal());
        }
        Dodatak d = Dodatak.valueOf("Urnebes");
        System.out.println(d);
    }
}
