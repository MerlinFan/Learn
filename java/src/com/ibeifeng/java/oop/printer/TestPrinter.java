package com.ibeifeng.java.oop.printer;

public class TestPrinter {
    public static void main(String[] args) {
        InkBox inkbox = null;
        Paper paper = null;
        Printer printer = new Printer();

        inkbox = new BWInkBox();
        paper = new PaperA4();
        printer.setInkBox(inkbox);
        printer.setPaper(paper);
        printer.print();

        inkbox = new ColorInkBox();
        printer.setInkBox(inkbox);
        paper = new PaperA5();
        printer.setPaper(paper);
        printer.print();
    }
}
