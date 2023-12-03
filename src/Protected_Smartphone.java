public class Protected_Smartphone extends Samsung {
    private String militaryStandard;
    private boolean radioProtection;

    public Protected_Smartphone(String brand, String model, String operationSystem, int yearReleased,
                                double screenSize, int buildInMemoryStorage, String paymentSystem,
                                boolean audioJackPresence, int simCardNumSupport, int maxSdCardSizeSupportGb,
                                String militaryStandard, boolean radioProtection) {
        super(brand, model, operationSystem, yearReleased, screenSize, buildInMemoryStorage, paymentSystem,
                audioJackPresence, simCardNumSupport, maxSdCardSizeSupportGb);
        this.militaryStandard = militaryStandard;
        this.radioProtection = radioProtection;
    }


    public String getMilitaryStandard() {
        return militaryStandard;
    }

    public void setMilitaryStandard(String militaryStandard) {
        this.militaryStandard = militaryStandard;
    }

    public boolean isRadioProtection() {
        return radioProtection;
    }

    public void setRadioProtection(boolean radioProtection) {
        this.radioProtection = radioProtection;
    }
}
