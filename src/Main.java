public class Main {
    public static void main(String[] args) {

        Apple iPhone = new Apple("Iphone", "15 Pro Max", "iOs", 512, 5.77);
        Samsung Galaxy = new Samsung("Samsung", "S23 Ultra", "Android", 512, 6.8);
        Xiaomi Ultra = new Xiaomi("Xiaomi", "13 Ultra", "Android", 1024, 6.73);
        Nokia XR = new Nokia("Nokia", "XR", "Android", 64, 6.49);
        Huawei Mate = new Huawei("Huawei", "Mate X3", "HarmonyOS", 512, 7.6);

        System.out.println(iPhone.getBrand() + " " + iPhone.getModel() + " / " + iPhone.getOperationSystem() + " / " + iPhone.getScreenSize() + " / " + iPhone.getBuildInMemoryCapacity() + "Gb");
        System.out.println(Galaxy.getBrand() + " " + Galaxy.getModel() + " / " + Galaxy.getOperationSystem() + " / " + Galaxy.getScreenSize() + " / " + Galaxy.getBuildInMemoryCapacity() + "Gb");
        System.out.println(Ultra.getBrand() + " " + Ultra.getModel() + " / " + Ultra.getOperationSystem() + " / " + Ultra.getScreenSize() + " / " + Ultra.getBuildInMemoryCapacity() + "Gb");
        System.out.println(XR.getBrand() + " " + XR.getModel() + " / " + XR.getOperationSystem() + " / " + XR.getScreenSize() + " / " + XR.getBuildInMemoryCapacity() + "Gb");
        System.out.println(Mate.getBrand() + " " + Mate.getModel() + " / " + Mate.getOperationSystem() + " / " + Mate.getScreenSize() + " / " + Mate.getBuildInMemoryCapacity() + "Gb");

    }
}