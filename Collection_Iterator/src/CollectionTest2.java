import Bean.Person;
import jdk.jfr.StackTrace;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class CollectionTest2 {
    /**
     * @Test
     *向Collection接口实现类的对象中添加数据obj时， 要求obj所在类要求重新equals（） method
     *
     *
     */
    public static void main(String[] args) {
        CollectionTest2 collectionTest2 = new CollectionTest2();
        collectionTest2.test4();
    }

    public void test1(){
        Collection collection = new ArrayList();
        collection.add(123);
        collection.add(new Person("Jerry",20));
        collection.add(23);


        // 1 contains(Object e)   判断当前集合冲是否包含obj
        boolean contains = collection.contains(123);
        System.out.println("contains = " + contains);
        System.out.println(collection.contains(new Person("Jerry",20)));
// 在判断时 我们会调用obj对象所在类的equals（）；
        // 2 containsAll( Collection coll1  ):判断形参coll1中所有元素是否都在当前集合中
        Collection collection1 = Arrays.asList(123,23);
        System.out.println(collection.containsAll(collection1));

    }

 public void test2(){
        Collection collection = new ArrayList();
        collection.add(123);
        collection.addAll(Arrays.asList(false,123,567,new Person("Tom",23)));
        Collection collection2;
     collection2 = Arrays.asList(false,123,567);
     System.out.println("collection = " + collection);
     //collection.clear();
     collection.remove(new Person("Tom",23));// remove 也需要调用equals方法
     collection.removeAll(collection2);
     System.out.println(collection.isEmpty());
 }

 public void test3(){

     //collection.add(Arrays.asList(123,456,new Person("Jerry",20),false));
     //ArrayList<Collection> list = new ArrayList<>(collection);
     Collection collection = new ArrayList();
     collection.add(123);
     collection.add(456);
     collection.add(new Person("Jerry",20));
     collection.add(false);

     Collection collection2 = new ArrayList();
     collection2.add(123);
     collection2.add(456);
     collection2.add(new Person("Jerry",20));
     collection2.add(false);
     System.out.println(collection.equals(collection2));// 要想返回true 需要当前集合 和形参的type相同
//     Collection collection1 = Arrays.asList(123,456,789);
//     System.out.println("collection = " + collection);
//     System.out.println("collection1 = " + collection1);
//     System.out.println(collection.retainAll(collection1));
//     System.out.println(collection);

     //collection.retainAll(Collection collection1) 是否有交集:获取当前集合和collection1 集合的交集



 }
 public void test4(){
     Collection collection = new ArrayList();
     collection.add(123);
     collection.add(456);
     collection.add(new Person("Jerry",20));
     collection.add(false);
     //hasCode(): 返回当前对象的哈希值！
    // System.out.println(collection.hashCode());
     /**
      * 集合可以转回为数组！ toArray
      */
     Object[] objects = collection.toArray();
     for (Object each :objects
             ) {
         System.out.println(each);
     }
     /**
      * 数组转化为集合
      */

//调用Arrays类静态方法的asList（）
    List<String> list = Arrays.asList(new String[]{"AAA","BBB","CCC"});
     System.out.println("list = " + list);
//     List arr1 = Arrays.asList(new int[]{123,456});
//     System.out.println(arr1);错误的
     List arr1 = Arrays.asList(123,456);
     List arr2 = Arrays.asList(new Integer[]{123,456,88});

     System.out.println("arr1 = " + arr1);
     System.out.println("arr2 = " + arr2);

 }
 // iterator(): 返回Iterator 接口的实例，用于遍历集合的元素

















}
