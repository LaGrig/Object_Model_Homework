package com.mobile.store.brand;

import com.mobile.store.Smartphone;

public class Xiaomi extends Smartphone {

    private String model;
    private String paymentSystem;
    private boolean audioJackPresence;
    private int SimCardNumSupport;
    private int maxSdCardSizeSupportGb;

    public Xiaomi(String brand, String model, String operationSystem, int yearReleased, double screenSize,
                  int buildInMemoryStorage, String paymentSystem,
                  boolean audioJackPresence, int simCardNumSupport, int maxSdCardSizeSupportGb) {
        super(brand, operationSystem, yearReleased, screenSize, buildInMemoryStorage);
        this.model = model;
        this.paymentSystem = paymentSystem;
        this.audioJackPresence = audioJackPresence;
        SimCardNumSupport = simCardNumSupport;
        this.maxSdCardSizeSupportGb = maxSdCardSizeSupportGb;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPaymentSystem() {
        return paymentSystem;
    }

    public void setPaymentSystem(String paymentSystem) {
        this.paymentSystem = paymentSystem;
    }

    public boolean isAudioJackPresence() {
        return audioJackPresence;
    }

    public void setAudioJackPresence(boolean audioJackPresence) {
        this.audioJackPresence = audioJackPresence;
    }

    public int getSimCardNumSupport() {
        return SimCardNumSupport;
    }

    public void setSimCardNumSupport(int simCardNumSupport) {
        SimCardNumSupport = simCardNumSupport;
    }

    public int getMaxSdCardSizeSupportGb() {
        return maxSdCardSizeSupportGb;
    }

    public void setMaxSdCardSizeSupportGb(int maxSdCardSizeSupportGb) {
        this.maxSdCardSizeSupportGb = maxSdCardSizeSupportGb;
    }

    @Override
    public String toString() {
        return "Xiaomi{" +
                "model='" + model + '\'' +
                ", paymentSystem='" + paymentSystem + '\'' +
                ", audioJackPresence=" + audioJackPresence +
                ", SimCardNumSupport=" + SimCardNumSupport +
                ", maxSdCardSizeSupportGb=" + maxSdCardSizeSupportGb +
                '}';
    }
}

