import java.nio.channels.ScatteringByteChannel;

/**
 *  一，异常的处理：抓抛模型
 * 过程一： 抛 ： 程序在正常的执行的过程中，一旦出现异常，就会在异常代码处生成一个对应异常class的对象并将此对象抛出
 *                  一旦抛出对象以后，其后的代码就不再执行
 * 过程二： 抓：  可以理解为异常的处理方式 ：① try - catch - finally
 *                                        ② throws
 *  二，try - catch - finally的使用
 *   try{
 *       //可能出现异常的代码
 *   }catch(异常类型1 变量名1){
 *       处理异常的方式一
 *   }catch(异常类型2 变量名1){
 *  *       处理异常的方式二
 *  *}catch(异常类型3 变量名1){
 *  *       处理异常的方式三
 *  *}catch(异常类型4 变量名1){
 *  *       处理异常的方式四
 *  *}
 *  ........
 *  finally{
 *      //一定会执行的代码！
 *  }
 *  说明：
 *  1. finally 是可选的
 *  2. 使用try将可能出现异常代码包装起来，在执行过程中，一旦出现异常，就会生成一个对应异常类的对象，根据
 *  此对象的类型，去catch中进行匹配
 *  3 一旦try中的异常匹配到某一个catch时，就进入catch中进行异常处理。 一旦处理完成，就跳出当前的 try- catch结构
 *  （在没写finally的前提下。 ）继续执行其后的代码
 *  4 catch中异常类如果没有父子类关系，则声明谁在上 谁在下无所谓
 *      如果有父子类关系， 子类必须在上面
 *  5 常用异常对象的处理方式： String getMessage()
 *                          //常用 printStackTrace()
 *
 *
 *体会 使用 try catch 处理编译时异常，使得程序在编译时就不会报错，但是运行时 扔可能报错
 *      相当于我们使用 try-catch-finally 将一个编译时可能出现的异常，延迟到运行时出现
 */


public class ExceptionTest1 {
    public void test() {
        String str = "123";
        str = "abc";
        int num =0;
        try {
            num = Integer.parseInt(str);
        } catch (NumberFormatException e){
//            System.out.println("出现数组转换异常了");
            // e. getMessage();
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println(num);
        System.out.println("继续执行");



    }

    public static void main(String[] args) {
        ExceptionTest1 t1 = new ExceptionTest1()    ;
        t1.test();
    }

























}
