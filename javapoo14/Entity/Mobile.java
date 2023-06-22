package javapoo14.Entity;

import java.util.Arrays;

public class Mobile {
    private String brand;
    private double price;
    private String model;
    private short memRam;
    private short storage;
    private int[] code;
    private static final int codeLenght = 7;

    public Mobile(String brand, double price, String model, short memRam, short storage, int[] code) {
        this.brand = brand;
        this.price = price;
        this.model = model;
        this.memRam = memRam;
        this.storage = storage;
        this.code = Arrays.copyOf(code, codeLenght);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public short getMemRam() {
        return memRam;
    }

    public void setMemRam(short memRam) {
        this.memRam = memRam;
    }

    public short getStorage() {
        return storage;
    }

    public void setStorage(short storage) {
        this.storage = storage;
    }

    public int[] getCode() {
        return code;
    }

    public void setCode(int[] code) {
        this.code = code;
    }

    public static int getCodeLenght() {
        return codeLenght;
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", model='" + model + '\'' +
                ", memRam=" + memRam +
                ", storage='" + storage + '\'' +
                ", code=" + Arrays.toString(code) +
                '}';
    }
}
