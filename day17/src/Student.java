public class Student extends Person{
//    String name;
//    int age;
    //继承的好处/**
    /**
     * 减少代码的冗余， 提高了代码的复用性
     * 便于功能的扩展
     * 为之后的多态性提供了前提
     * 一旦子类B 继承了父类A之后， B就获取了A类中声明的所有结构： 属性和方法！！
     * 特别的，父类中声明的private的属性或者方法，子类继承父类以后，仍然认为获取了父类中私有的结构。
     * 只是因为封装性的影响，使得子类不能直接调用父类的结构而已！
     *
     *除此之外， 子类继承父类之后， 子类可以声明自己特有的属性和方法！实现功能的拓展！子类功能更加强大！
     * 一  1 一个类可以被多个子类继承
     *     2 Java中类的 单继承性！！！    一个类只能有一个父类
     *     3 子父类的相对的概念
     *
     * 二  1 如果我们没有显示声明一个类的父类的话， 则类继承于 java.lang.object 类
     *     2 所有的java类（除了Object） 都直接或者间接继承于 java.lang.object 类
     *     3 意味着 所有的java.lang.object 类具有java.lang.object 类声明的功能！
     */
    String major;

    public Student() {
    }

    public Student(String name, int age, String major) {
       super(name,age);
        this.major = major;
    }




    public void eat(){
        System.out.println("EAT!");
    }
    public void sleep(){
        System.out.println("SLEEP!");
    }
    public void study(){
        System.out.println("STUDY!");
    }
    public void show(){
        System.out.println("name: "+getName()+" age: "+age);
    }




}
