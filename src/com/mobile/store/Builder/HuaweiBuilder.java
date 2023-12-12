package com.mobile.store.Builder;

import com.mobile.store.Brand.Huawei;

public class HuaweiBuilder {
    private String brand;
    private String model;
    private String operationSystem;
    private int yearReleased;
    private double screenSize;
    private int buildInMemoryStorage;
    private String paymentSystem;
    private boolean audioJackPresence;
    private int simCardNumSupport;
    private int maxSdCardSizeSupportGb;

    public HuaweiBuilder setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public HuaweiBuilder setModel(String model) {
        this.model = model;
        return this;
    }

    public HuaweiBuilder setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
        return this;
    }

    public HuaweiBuilder setYearReleased(int yearReleased) {
        this.yearReleased = yearReleased;
        return this;
    }

    public HuaweiBuilder setScreenSize(double screenSize) {
        this.screenSize = screenSize;
        return this;
    }

    public HuaweiBuilder setBuildInMemoryStorage(int buildInMemoryStorage) {
        this.buildInMemoryStorage = buildInMemoryStorage;
        return this;
    }

    public HuaweiBuilder setPaymentSystem(String paymentSystem) {
        this.paymentSystem = paymentSystem;
        return this;
    }

    public HuaweiBuilder setAudioJackPresence(boolean audioJackPresence) {
        this.audioJackPresence = audioJackPresence;
        return this;
    }

    public HuaweiBuilder setSimCardNumSupport(int simCardNumSupport) {
        this.simCardNumSupport = simCardNumSupport;
        return this;
    }

    public HuaweiBuilder setMaxSdCardSizeSupportGb(int maxSdCardSizeSupportGb) {
        this.maxSdCardSizeSupportGb = maxSdCardSizeSupportGb;
        return this;
    }

    public Huawei createHuawei() {
        return new Huawei(brand, model, operationSystem, yearReleased, screenSize, buildInMemoryStorage, paymentSystem, audioJackPresence, simCardNumSupport, maxSdCardSizeSupportGb);
    }
}