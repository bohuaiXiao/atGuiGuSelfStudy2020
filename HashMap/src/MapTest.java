import jdk.jfr.StackTrace;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    @Test
    public void MapTest(){
        Map map = new HashMap ();
        map.put (43,99);
        System.out.println (map);
    }


}
