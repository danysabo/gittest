/**
 * Created by Boris on 21.6.17.
 */
public class Fotelja {
    private int width;
    private int height;
    private int depth;

    public Fotelja(int width, int height, int depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public void sitDown(String name) {
        System.out.println(name + " je seo u fotelju.");
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getDepth() {
        return depth;
    }
}
