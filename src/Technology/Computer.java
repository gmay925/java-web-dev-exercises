package Technology;

public class Computer extends AbstractEntity {
    private int ram;
    private int storage;
    private String manufacturer = "PineApple";

    public Computer(int ram, int storage) {
        super();
        this.ram = ram;
        this.storage = storage;
        this.manufacturer = manufacturer;
    }

    public int getRam() {
        return ram;
    }

    public void addRam(int ramToAdd) {
        this.ram = ram + ramToAdd;
    }

    public int getStorage() {
        return storage;
    }

    public void addStorage(int storage) {
        this.storage = storage + storage;
    }

    public String getManufacturer() {
        return manufacturer;
    }

}

