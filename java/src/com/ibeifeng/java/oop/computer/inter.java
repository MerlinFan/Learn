package com.ibeifeng.java.oop.computer;

public class inter implements Cpu {
    @Override
    public String getBoard() {
        return "Inter";
    }

    @Override
    public float getHz() {
        return 3.8f;
    }
}
