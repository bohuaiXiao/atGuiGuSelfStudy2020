import java.io.IOException;
/**开发中如何选择使用 try catch finally 还是使用 throws
 *      如果父类中被重新的方法没有throws方式处理异常，则子类重新的方法也不能使用throws，
 *      意味着如果子类重写的方法中有异常，必须使用 try catch finally方式处理
 *
 *
 *
 */

public class OverrideTest {
}

class SuperClass{
    public void method() throws IOException{

    }

}
