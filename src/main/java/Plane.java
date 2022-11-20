public enum Plane {
    BOEING_777(100, 500),
    BOEING_727(120, 750),
    AIRBUS_A320(200, 1000),
    CESSNA_172(4, 100)
    ;

    private int capacity;
    private int totalWeight;

    Plane(int capacity, int totalWeight){
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getTotalWeight() {
        return totalWeight;
    }
}