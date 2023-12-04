public class Main {
    public static void main(String[] args) {
        var iPhone = new Apple("Apple", "15 Pro Max", "iOs", 2023, 5.77, 512, "ApplePay", false, 1, 0);
        var Samsung = new Samsung("Samsung", "S23 Ultra", "Android", 2023, 6.8, 512, "GooglePay", false, 2, 1024);
        var SamsungProtected = new Protected_Smartphone("Samsung", "XCover 6 Pro", "Android", 2022, 6.6, 128, "GooglePay", true, 2, 1024, "MIL-STD-810H", true);
        var Huawei = new HuaweiBuilder().setBrand("Huawei").setModel("Mate X3").setOperationSystem("HarmonyOS").setYearReleased(2023).setScreenSize(7.6).setBuildInMemoryStorage(512).setPaymentSystem("GooglePay").setAudioJackPresence(true).setSimCardNumSupport(2).setMaxSdCardSizeSupportGb(2024).createHuawei();
        var Xiaomi = new Xiaomi("Xiaomi", "13 Ultra", "Android", 2023, 6.73, 512, "GooglePay", true, 2, 2024);
        var HuaweiBuilder = new HuaweiBuilder();

        System.out.println("Smartphones list:");
        System.out.println("****************************");
        System.out.println("Brand: " + iPhone.getBrand());
        System.out.println("Model: " + iPhone.getModel());
        System.out.println("OS:" + iPhone.getOperationSystem());
        System.out.println("Screen size:" + iPhone.getScreenSize() + "\"");
        System.out.println("Release year:" + iPhone.getYearReleased());
        System.out.println("Build in memory:" + iPhone.getBuildInMemoryStorage());
        System.out.println("Payment system support:" + iPhone.getPaymentSystem());
        System.out.println("Audio jack presence:" + iPhone.isAudioJackPresence());
        System.out.println("Max SimCards support:" + iPhone.getSimCardNumSupport());
        System.out.println("Max microSD card size:" + iPhone.getMaxSdCardSizeSupportGb());
        System.out.println("Services:");
        System.out.println("Voice call: " + iPhone.voiceCall(true));
        System.out.println("Pin access protection: " + iPhone.pinProtection(true));
        System.out.println("Emergency call: " + iPhone.emergencyCall(true));
        System.out.println("Facetime call: " + iPhone.faceTimeCall(true));
        System.out.println("****************************");

        System.out.println("Brand: " + Samsung.getBrand());
        System.out.println("Model: " + Samsung.getModel());
        System.out.println("OS:" + Samsung.getOperationSystem());
        System.out.println("Screen size:" + Samsung.getScreenSize() + "\"");
        System.out.println("Release year:" + Samsung.getYearReleased());
        System.out.println("Build in memory:" + Samsung.getBuildInMemoryStorage() + " Gb");
        System.out.println("Payment system support:" + Samsung.getPaymentSystem());
        System.out.println("Audio jack presence:" + Samsung.isAudioJackPresence());
        System.out.println("Max SimCards support:" + Samsung.getSimCardNumSupport());
        System.out.println("Max microSD card size:" + Samsung.getMaxSdCardSizeSupportGb() + " Gb");
        System.out.println("Services:");
        System.out.println("Voice call: " + Samsung.voiceCall(true));
        System.out.println("Pin access protection: " + Samsung.pinProtection(true));
        System.out.println("Emergency call: " + Samsung.emergencyCall(true));
        System.out.println("Facetime call: " + Samsung.faceTimeCall(false));
        System.out.println("****************************");

        System.out.println("Brand: " + SamsungProtected.getBrand());
        System.out.println("Model: " + SamsungProtected.getModel());
        System.out.println("OS:" + SamsungProtected.getOperationSystem());
        System.out.println("Screen size:" + SamsungProtected.getScreenSize() + "\"");
        System.out.println("Release year:" + SamsungProtected.getYearReleased());
        System.out.println("Build in memory:" + SamsungProtected.getBuildInMemoryStorage() + " Gb");
        System.out.println("Payment system support:" + SamsungProtected.getPaymentSystem());
        System.out.println("Audio jack presence:" + SamsungProtected.isAudioJackPresence());
        System.out.println("Max SimCards support:" + SamsungProtected.getSimCardNumSupport());
        System.out.println("Max microSD card size:" + SamsungProtected.getMaxSdCardSizeSupportGb() + " Gb");
        System.out.println("****************************");

        System.out.println("Brand: " + Xiaomi.getBrand());
        System.out.println("Model: " + Xiaomi.getModel());
        System.out.println("OS:" + Xiaomi.getOperationSystem());
        System.out.println("Screen size:" + Xiaomi.getScreenSize() + "\"");
        System.out.println("Release year:" + Xiaomi.getYearReleased());
        System.out.println("Build in memory:" + Xiaomi.getBuildInMemoryStorage() + " Gb");
        System.out.println("Payment system support:" + Xiaomi.getPaymentSystem());
        System.out.println("Audio jack presence:" + Xiaomi.isAudioJackPresence());
        System.out.println("Max SimCards support:" + Xiaomi.getSimCardNumSupport());
        System.out.println("Max microSD card size:" + Xiaomi.getMaxSdCardSizeSupportGb() + " Gb");
        System.out.println("****************************");

        System.out.println("Brand: " + Huawei.getBrand());
        System.out.println("Model: " + Huawei.getModel());
        System.out.println("OS:" + Huawei.getOperationSystem());
        System.out.println("Screen size:" + Huawei.getScreenSize() + "\"");
        System.out.println("Release year:" + Huawei.getYearReleased());
        System.out.println("Build in memory:" + Huawei.getBuildInMemoryStorage() + " Gb");
        System.out.println("Payment system support:" + Huawei.getPaymentSystem());
        System.out.println("Audio jack presence:" + Huawei.isAudioJackPresence());
        System.out.println("Max SimCards support:" + Huawei.getSimCardNumSupport());
        System.out.println("Max microSD card size:" + Huawei.getMaxSdCardSizeSupportGb() + " Gb");
        System.out.println("****************************");
    }
}