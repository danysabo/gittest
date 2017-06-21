/**
 * Created by Boris on 21.6.17.
 */
public class NocnoSvetlo {
    private int power;
    private boolean isOn;

    public NocnoSvetlo(int power, boolean isOn) {
        this.power = power;
        this.isOn = isOn;
    }

    public int getPower() {
        return power;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }
}
