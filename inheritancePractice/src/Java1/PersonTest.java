package Java1;

public class PersonTest {
    public static void main(String[] args) {

        Student student  = new Student("计算机科学与技术!");
        student.eat();
        student.walk(10);
        student.study();
        student.show();
        System.out.println("******************************");

        Person person = new Person();
        person.eat();
        person.walk(20);
    }
    /**
     * override/ overwrite
     * 就是子类对父类继承的同名方法进行重写！
     * 1 应用： 重写以后，当创建子类对象以后，通过子类对象调用子父类中的同名同参数方法时，实际执行的是
     * 2 子类重写的父类方法
     *
     * 区分 方法的重载与重写
     * 3 重写的规定：
     *     方法的声明： 权限修饰符 返回值类型 方法名（形参列表  ）throws 异常的类型{
     *         //方法体
     *     }
     *     约定俗称： 子类的叫重写的方法！
     *    1 子类重写的方法的方法名 与 父类被重写的方法的方法名和形参列表相同
     *    2 子类重写的方法的权限修饰符不小于父类被重写的权限修饰符！（特殊情况： 子类不能重写父类中声明private的方法）
     *    3 返回值类型：
     *    >父类被重写的方法的返回值类型 是void 则子类重写方法的返回值类型只能是void
     *    >父类被重写的方法返回值类型 是A类型， 则子类重写的方法的返回值类型是A类或者A类的子类类型！
     *    >父类被重写的方法返回值类型是基本数据类型（double），则子类重写的方法的返回值必须是相同的基本数据类型(double)！
     *    4 子类重写的方法抛出的异常类型不大于父类被重写的方法抛出的异常类型
     *
     *    **************************************************************************************
     *    子类和父类中的同名同参数的方法 要么都声明为非static（考虑重写），要么声明为static的（Static 不能 也不是 重写）
     *
     *
     *
     *
     */
}
