package javapoo06;

public class CoffeMaker {
    private int maxCapacity;
    private int currentQuantity;

    public CoffeMaker() {
    }

    public CoffeMaker(int maxCapacity, int currentQuantity) {
        this.maxCapacity = maxCapacity;
        this.currentQuantity = currentQuantity;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public int getCurrentQuantity() {
        return currentQuantity;
    }

    public void setCurrentQuantity(int currentQuantity) {
        this.currentQuantity = currentQuantity;
    }
}
