package com.ibeifeng.java.oop.IncomeTax;

public class Employee {
    private String name;
    private float salary;       // 员工工资
    private float subsidy;      // 加班补贴

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public float getSubsidy() {
        return subsidy;
    }

    public void setSubsidy(float subsidy) {
        this.subsidy = subsidy;
    }

    public Employee() {
    }

    public Employee(String name, float salary, float subsidy) {
        this.name = name;
        this.salary = salary;
        this.subsidy = subsidy;
    }

    public float taxBefore() {
        return getSalary()+getSubsidy();
    }

    public float taxIncome() {
        float tax;
        tax = taxBefore() - 2000;
        if (tax < 500) {
            return (float) (tax * 0.05);
        } else if (tax < 2000 && tax >= 500) {
            return (float) (tax * 0.1);
        } else if (tax < 5000 && tax >= 2000) {
            return (float) (tax * 0.15);
        } else if (tax < 20000 && tax >= 5000) {
            return (float) (tax * 0.2);
        } else {
            return (float) (tax * 0.3);
        }
    }

    public float taxAfter() {
        return taxBefore()-taxIncome();
    }




}
