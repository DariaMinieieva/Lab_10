package Images;

import lombok.Getter;

@Getter
public class RealImage implements Image{
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        System.out.println("Display real " + this.fileName);
    }

    public void loadFromDisc() {
        System.out.println("Loaded from disk");
    }
}
