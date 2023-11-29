public class Samsung extends Smartphones {
    //    String model;
//    String operationSystem;
//    double screenSize;
//    String screenResolution;
//    int screenRefreshRate;
//    int simCardsSupportNumber;
//    int ramMemorySize;
//    int buildInMemoryCapacity;
//    boolean sdCardSupport;
//    int batteryCapacity;
//    int mainCameraMPixels;
//    boolean nfcSupport;
//    boolean audioJackPresents;
    public Samsung(String brand, String model, String operationSystem, int buildInMemoryCapacity, double screenSize) {
        setBrand(brand);
        setOperationSystem(operationSystem);
        setModel(model);
        setBuildInMemoryCapacity(buildInMemoryCapacity);
        setScreenSize(screenSize);
    }
}
