package Java1;

public class Student extends Person {

    String major;

    public Student() {

    }

    public Student(String major) {
        this.major = major;
    }

    public Student(String name, int age, String major) {
        super(name, age);
        this.major = major;
    }

    public void  study(){
        System.out.println("学习的专业是"+this.major);
    }

    public void eat(){// 对父类的eat method 进行重写！
        System.out.println("学生应该多吃有营养的食物！！！");
    }
    public void walk(int distance){
        System.out.println("Walk "+ distance+ "KM");
    }
   public void show(){// 父类是一个私有的方法， 所以不能override；
        System.out.println("我是一个学生");
    }

    public Integer info(){
        return null;
    }


}
