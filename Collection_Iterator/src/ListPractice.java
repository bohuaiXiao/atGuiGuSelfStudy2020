import Bean.Person;

import java.util.*;
import java.util.Collection;

public class ListPractice {

    /**
     *  / Collection 接口   存储的都是对象
     *      *         List接口  存储有序，可以重复（动态数组）----->替代数组[]
     *      *         ArrayList ：作为List接口的主要实现类，Object[]
     *                LinkedList：对于频繁的插入，删除操作，使用LinkedList效率更高底层使用的双向链表存储
     *                Vector ： 作为List接口的古老实现类,Object[]
     *  面试题：ArrayList  linkedList Vector三者的异同
     *  同： 三个类都实现了List 接口，存储数据的特点相同：存储有序，可以重复
     *  异：
     *
     */


          //List 常用方法
    public void test1(){
        ArrayList list = new ArrayList ();
        list.add (123);
        list.add (456);
        list.add ("AAA");
        list.add (new Person ("Tom",23));
        list.add (789);
        System.out.println ("list = " + list);

        // 添加 add（index, e）
        list.add (1,"BB");
        System.out.println ("list = " + list);
        // addAll
        List list1 = Arrays.asList (1, 2, 3);
        list.addAll (list1);
        System.out.println ("list = " + list);
        //get   Object get(int index): 获取指定index位置的元素
        System.out.println (list.get (0));

    }
    public void test2(){
        ArrayList list = new ArrayList ();
        list.add (123);
        list.add (456);
        list.add ("AAA");
        list.add (new Person ("Tom",23));
        list.add (789);


        // indexOf():
        int i = list.indexOf (456);
        System.out.println ("i = " + i);
        //返回obj在集合中首次出现的位置，如果不存在，返回-1
        // lastIndexOf()
        int x = list.lastIndexOf (789);
        System.out.println ("x = " + x);
        // Object remove(int index): 移除指定位置的元素，并返回此元素；是Collection的重载
        Object object = list.remove (0);
        System.out.println ("object = " + object);
        // Object.set()
        list.set (0,"DSD");
        //List subList(int fromIndex, int toIndex):
        List list1 = list.subList (1, 4);
        System.out.println ("list1 = " + list1);
        System.out.println ("list = " + list);
    }

    /**
     *
     *
     * 常用方法：
     * 增 add
     * 删 remove (int index)/ remove(Object obj)
     * 改 set(int index, Object ele)
     * 查 get(int index)
     * 长度 size();
     * 遍历:①Iterator
     *     ② foreach
     */
    // 遍历
    public void test3(){
        ArrayList list = new ArrayList ();
        list.add (123);
        list.add (456);
        list.add ("AAA");
        list.add (new Person ("Tom",23));
        list.add (789);
        // 方式一：
        Iterator iter = list.iterator ();
        while(iter.hasNext ()){
            System.out.println ("iter.next () = " + iter.next ());
        }
        System.out.println ("-----------------------------------------------------");
        // 方式二：
        for (Object each :
                list) {
            System.out.println ("each = " + each);
        }
        System.out.println ("********************************************************");
        //方式三：
        for (int i = 0; i < list.size (); i++) {
            System.out.println ("list.get (i) = " + list.get (i));
        }
    }

    public void testListRemove(){
        List list = new ArrayList ();
        list.add (1);
        list.add (2);
        list.add (3);
        delete (list);
        System.out.println ("list = " + list);
        LinkedList linkedList = new LinkedList ();
        linkedList.add (1);
        linkedList.add (2);
        System.out.println ("linkedList = " + linkedList);
        linkedList.remove (new Integer (2)  );
        System.out.println ("linkedList = " + linkedList);
    }
    private  void delete(List list ){
       // list.remove (2);-------->删除index为2 的元素
        list.remove (new Integer (2));//----------->删除2 这个数字（封装类）


    }







    public static void main(String[] args) {
        ListPractice c = new ListPractice ();
        c.testListRemove ();
    }


}
