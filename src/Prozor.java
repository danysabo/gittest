/**
 * Created by Boris on 21.6.17.
 */
public class Prozor {
    private int height;
    private int width;
    private boolean isOpen;

    public Prozor(int height, int width, boolean isOpen) {
        this.height = height;
        this.width = width;
        this.isOpen = isOpen;
    }

    public void openWindow(boolean open) {
        isOpen = open;
        if (open) {
            System.out.println("Prozor je otvoren.");
        } else {
            System.out.println("Prozor je zatvoren.");
        }
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public boolean isOpen() {
        return isOpen;
    }

}
