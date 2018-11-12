package com.ibeifeng.java.oop.penguin;

import javax.naming.Name;

public class Preson {
    public static class Peple{
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Peple() {
        }

        public Peple(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "这个人叫：" + name;
        }
    }
    public static class Dog{
        private String name;
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Dog(String name) {
            this.name = name;
        }

        public Dog() {
        }

        /**
         * 重写equals方法
         * @param obj
         * @return
         */
        @Override
        public boolean equals(Object obj) {
            Dog dog = (Dog)obj;
            if(this.getName() == dog.getName()){
                return true;
            }else{
                return false;
            }
        }

        @Override
        public int hashCode() {
            Dog dogd = (Dog)this;
            System.out.println("hash:" + dogd.name);
            return name.hashCode();
        }

        @Override
        public String toString() {
            return "这只狗叫：" + name;
        }
    }

    public static void main(String[] args) {
        // 调用string方法
        Peple zhang = new Peple("zhang");
        System.out.println(zhang);  // com.ibeifeng.java.oop.penguin.Preson$Peple@4554617c
        System.out.println(zhang.toString());   // com.ibeifeng.java.oop.penguin.Preson$Peple@4554617c
        System.out.println(zhang.toString().hashCode());    // 1399394568


        // 重写String方法
        Peple li = new Peple("li");
        System.out.println(zhang);
        System.out.println(zhang.toString());
        Dog dog1 = new Dog("dog1");
        System.out.println(dog1);
        System.out.println(dog1.toString());

        //string重写了toString，所以不会输出地址
        String a = new String("asd");   // asd
        System.out.println(a.toString());

        // 重写equals方法
        Dog dog2 = new Dog("dog1");
        System.out.println(dog1.hashCode());
        System.out.println("这是同一条狗：" + dog1.equals(dog2));

        // instanceof 判断是否属于同一个实例,
        Dog dog = new Dog("dog3");
        if(dog instanceof Dog){
            System.out.println("dog1 属于Dog实例");
        }
    }
}
