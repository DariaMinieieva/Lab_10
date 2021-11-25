package Images;

public class ProxyPatternDemo {
    public static void main(String[] args) {
        RealImage r_img = new RealImage("real.png");
        ProxyImage p_img = new ProxyImage(r_img);

        r_img.display();
        p_img.display();

    }

}
