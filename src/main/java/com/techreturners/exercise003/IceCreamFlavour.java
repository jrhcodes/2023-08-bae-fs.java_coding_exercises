package com.techreturners.exercise003;

public class IceCreamFlavour {
    private final String name;
    private final int code;

    public IceCreamFlavour ( String name, int code) {
        this.name = name;
        this.code = code;

    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }
}
