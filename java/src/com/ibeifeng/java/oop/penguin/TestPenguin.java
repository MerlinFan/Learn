package com.ibeifeng.java.oop.penguin;

public class TestPenguin {
    public static void main(String[] args) {
        Dog dog = new Dog("贝贝",  "雌性", 66, 77, "二狗子");
        dog.setAge(9);
        dog.show();
        Penguin penguin = new Penguin("嘿嘿", "雄性", 34, 20);
        penguin.show();

        Comm peng = new Penguin();
        if(peng instanceof Penguin) {
            System.out.println("是同一个实例");
        }else{
            System.out.println("不是同一个实例");
        }
    }


/*    public static void main(String[] args) {
        Penguin peng = new Penguin();
        System.out.println("欢迎来到宠物店！！！");
        System.out.print("请输入你要领养的宠物名字：");
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
            peng.setName(name);
        System.out.print("请选择你要领养的宠物类型：（1、狗狗  2、企鹅）");
        int aType = scan.nextInt();
        switch (aType){
        case 1:
            //
            break;
        case 2:
            System.out.print("请选择企鹅的性别：（1、Q仔  2、Q妹）");
            int sex = scan.nextInt();
            if (sex == 1)
                peng.setGender("Q仔");
            else
                peng.setGender("Q妹");
            System.out.print("请输入企鹅的健康值：（0~100之间）");
            int health = scan.nextInt();
                peng.setHealthValue(health);
            System.out.print("请输入与主人的请密度");
            int love = scan.nextInt();
                peng.setLoveValue(love);
            peng.show();
            break;
        }
    }
*/
}
