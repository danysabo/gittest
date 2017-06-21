/**
 * Created by Boris on 21.6.17.
 */
public class RadniSto {
    private int width;
    private int height;
    private int depth;

    public RadniSto(int width, int height, int depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public void learning(String name, int hours) {
        System.out.println(name + " već " + hours + " sedi za radnim stolom i uči programiranje.");
    }
}
