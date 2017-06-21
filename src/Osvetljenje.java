/**
 * Created by Boris on 21.6.17.
 */
public class Osvetljenje {
    NocnoSvetlo nocnoSvetlo;
    GlavnoSvetlo glavnoSvetlo;

    public Osvetljenje(NocnoSvetlo nocnoSvetlo, GlavnoSvetlo glavnoSvetlo) {
        this.nocnoSvetlo = nocnoSvetlo;
        this.glavnoSvetlo = glavnoSvetlo;
    }

    public void nocnoOnOff(boolean on) {
        if (nocnoSvetlo.isOn() == on) {
            if (on) {
                System.out.println("Noćno svetlo je već upaljeno.");
            } else {
                System.out.println("Noćno svetlo je već ugašeno.");
            }
        } else {
            nocnoSvetlo.setOn(on);
            if (on) {
                System.out.println("Noćno svetlo je upaljeno.");
            } else {
                System.out.println("Noćno svetlo je ugašeno.");
            }
        }
    }

    public void glavnoOnOff(boolean on) {
        if (glavnoSvetlo.isOn() == on) {
            if (on) {
                System.out.println("Noćno svetlo je već upaljeno.");
            } else {
                System.out.println("Noćno svetlo je već ugašeno.");
            }
        } else {
            glavnoSvetlo.setOn(on);
            if (on) {
                System.out.println("Glavno svetlo je upaljeno.");
            } else {
                System.out.println("Glavno svetlo je ugašeno.");
            }
        }
    }

}
