import jdk.jfr.StackTrace;
import org.w3c.dom.CDATASection;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class CollectionTest {
    public static void main(String[] args) {
        test1();
    }


    public static void test1(){
        Collection coll  = new ArrayList();
        // 1 add (Object e)
        coll.add("AA");
        coll.add("BB");
        coll.add(123);
        coll.add(new Date());
        // 2 size 获取添加元素的个数
        System.out.println(coll.size());

        // 3 addAll // 将coll1集合中的元素添加到当前的集合
        Collection coll1  = new ArrayList();
        coll1.add(456);
        coll1.add("CCC");
        coll.addAll(coll1);
        System.out.println(coll);
        // 4 isEmpty
        System.out.println(coll.isEmpty());
        // 5 clear
        coll.clear();
        System.out.println(coll.isEmpty());


    }
}
