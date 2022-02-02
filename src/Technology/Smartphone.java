package Technology;

public class Smartphone extends Computer {
    private boolean holographic;

    public Smartphone(int ram, int storage, boolean holographic){
        super(100, 100);
        this.holographic = true;
    }
}
