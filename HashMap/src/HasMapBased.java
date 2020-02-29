import org.junit.Test;

import java.util.*;

public class HasMapBased {
    /**
     * HsdMap的底层原理
     * HashMap map = new HashMap();
     * 在实例化之后，底层创建了长度是16的一维数组Entry[] table
     * ....可能已经执行过多次put
     *
     * map.put(key1,value1):
     * 首先 调用key1所在class的hashCode（）计算key1的hash code，此hashcode得到在Entry数组中存放的位置
     * 如果此位置上的数据为null ，此时key1-v1 添加成功
     * 如果此位置上的数据不是null，(意味着此位置上存放一个或者多个数据（以链表形式存在）)，比较key1 和已经存在的一个
     * 或者多个数据的hashCode； 如果key1 的HashCode与已经存在的hascode都不相同，此时 key1-v1 添加成功（情况一）
     *                         如果key1的hashiCode 和已经存在的某一个数据相同，继续比较：
     *                         调用key1所在类的equals（）方法，进行比较：
     *                         如果equals（）返回false：此时key1-v1 添加成功
     *                         如果equals（）返回true：使用v1 替换相同key的value值
     */
    public void test1(){
        Map map = new HashMap<> ();
        map.put ("AA",123);
        map.put (45,123);
        map.put ("BB",56);
        // Object get()
        System.out.println (map.get ("BB"));
        Object value = map.get ("BB");

        // containsKey()
        boolean isExist = map.containsKey ("CC");
        System.out.println ("isExist = " + isExist);

        /**
         *
         */


    }
    @Test
    public void test2(){
        Map map = new HashMap<> ();
        map.put ("AA",123);
        map.put (45,1234);
        map.put ("BB",56);
        // 遍历所有key的集合： keySet（）
        Set set  = map.keySet ();
        Iterator iterator = set.iterator ();
        while(iterator.hasNext ()){
            System.out.println (iterator.next ());
        }
        System.out.println ("+++++++++++++++++++++++++++++++++++++++++++");
        // 遍历所有value
        Collection collection = map.values ();
        Iterator iterator1 = collection.iterator ();
        while(iterator1.hasNext ()){
            System.out.println (iterator1.next ());
        }
        //遍历所有的key-value  entrySet()
//        Set entrySet = map.entrySet ();
//        Iterator i = entrySet.iterator ();
//        while(i.hasNext ()){
//            Object obj = i.next ();
//            Map.Entry entry = (Map.Entry)obj ;
//
//            System.out.println (entry.getKey ()+"------>"+entry.getValue ());
// 方式2：
        Set keySet = map.keySet ();
        Iterator iterator2 = keySet.iterator ();
        while(iterator2.hasNext ()){
            Object key = iterator2.next ();
            Object value = map.get (key);
            System.out.println (key + "------>" + value);
            System.out.println ();
        }


    }


    }


