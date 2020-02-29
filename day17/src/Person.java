import java.awt.print.Pageable;

public class Person {
    private String name;
    int age;
    public Person(){

    }
    public Person(String  name, int age){
        this.age = age;
        this.name = name;

    }

    public void eat(){
        System.out.println("EAT!");
    }
    public void sleep(){
        System.out.println("SLEEP!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
