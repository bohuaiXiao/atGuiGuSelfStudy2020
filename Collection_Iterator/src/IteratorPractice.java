import Bean.Person;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorPractice {
    public static void main(String[] args) {
        IteratorPractice i1 = new IteratorPractice();
        i1.test3 ();
    }

    /**
     * 集合元素的遍历， 使用Iterator接口
     *1 内部的方法： hasNext（）和 next（） 配合使用来遍历Collection
     *2 集合对象 每次调用Iterator（）方法都得到一个全新的iterator object
     *
     *
     */
    public void test1(){
        Collection collection = new ArrayList();
        collection.add(123);
        collection.add(456);
        collection.add(new Person("Jerry",20));
        collection.add(false);

        Iterator iterator = collection.iterator ();
       // System.out.println ("iterator = " + iterator);
        //迭代器接
        //方式 一  不推荐
//          System.out.println (iterator.next ());
////        System.out.println (iterator.next ());
////        System.out.println (iterator.next ());
////        System.out.println (iterator.next ());
       // System.out.println (iterator.next ());  <NoSuchElementException>
        //方式二   不推荐
//        for (int i = 0; i < collection.size ()  ; i++) {
//            System.out.println (iterator.next ());
//        }
       //  方式三 推荐
        while(iterator.hasNext ()){
            System.out.println (iterator.next ());
        }


    }
    public void test2(){
        Collection collection = new ArrayList();
        collection.add(123);
        collection.add(456);
        collection.add(new Person("Jerry",20));
        collection.add(false);
//错误方式！！一
//        Iterator iterator = collection.iterator ();
//     while(iterator.next ()!=null){
//         System.out.println (iterator.next ());  ！
//     }
        // 错误方式二（死循环： 匿名对象在while loop中每次都是新的一个对象）
        // 集合对象 每次调用Iterator（）方法都得到一个全新的iterator object
        while(collection.iterator ().hasNext ()){
            System.out.println (collection.iterator ().next ());
        }



    }
    // 测试Iterator remove method
    public void test3(){
        Collection collection = new ArrayList();
        collection.add(123);
        collection.add(456);
        collection.add(new Person("Jerry",20));
        collection.add(false);

        //删除集合中 Jerry的这个数据
        Iterator iterator = collection.iterator ();
        System.out.println ("collection = " + collection);

        while (iterator.hasNext ()){
            Object object = iterator.next ();
            if (object.equals (123)){
                iterator.remove ();
            }
            //System.out.println (iterator.next ());
        }
        iterator = collection.iterator ();
        while (iterator.hasNext ()){
            System.out.println (iterator.next ());
        }
        //System.out.println ("collection = " + collection);
    }
    public void test4(){
        String[] arr = new String[]{"MM","NN","BB"};
        for (String each :
                arr) {
            each = "GG";
        }
        //输出还是"MM","NN","BB"  --->因为 arr 给each赋值， each = “GG”，不会被改变



    }



}
