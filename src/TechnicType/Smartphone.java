package TechnicType;

public abstract class Smartphone {
    private String brand;
    private String operationSystem;
    private int yearReleased;
    private double screenSize;
    private int buildInMemoryStorage;

    public Smartphone(String brand, String operationSystem, int yearReleased, double screenSize, int buildInMemoryStorage) {
        this.brand = brand;
        this.operationSystem = operationSystem;
        this.yearReleased = yearReleased;
        this.screenSize = screenSize;
        this.buildInMemoryStorage = buildInMemoryStorage;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getOperationSystem() {
        return operationSystem;
    }

    public void setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
    }

    public int getYearReleased() {
        return yearReleased;
    }

    public void setYearReleased(int yearReleased) {
        this.yearReleased = yearReleased;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public int getBuildInMemoryStorage() {
        return buildInMemoryStorage;
    }

    public void setBuildInMemoryStorage(int buildInMemoryStorage) {
        this.buildInMemoryStorage = buildInMemoryStorage;
    }
}