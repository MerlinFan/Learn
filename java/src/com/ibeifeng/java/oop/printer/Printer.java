package com.ibeifeng.java.oop.printer;

public class Printer {
    InkBox inkBox;
    Paper paper;

    public void setInkBox(InkBox inkBox) {
        this.inkBox = inkBox;
    }

    public void setPaper(Paper paper) {
        this.paper = paper;
    }

    public void print(){
        System.out.println("正在使用" + inkBox.getColor() + "的油墨在" + paper.getSize() + "纸上打印");
    }
}
