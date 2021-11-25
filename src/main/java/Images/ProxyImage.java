package Images;

public class ProxyImage implements Image{
    private RealImage img;
    private String fileName;

    public ProxyImage(RealImage inmg) {
        this.img = inmg;
        this.fileName = inmg.getFileName();
    }

    @Override
    public void display() {
        System.out.println("Display proxy " + this.fileName);
    }
}
