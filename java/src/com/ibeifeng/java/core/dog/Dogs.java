package com.ibeifeng.java.core.dog;

public class Dogs {
    private String name;
    private String type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String gettype() {
        return type;
    }

    public void settype(String sex) {
        this.type = sex;
    }

    public Dogs() { }
    public Dogs(String name, String type) {
        this.name = name;
        this.type = type;
    }
}
