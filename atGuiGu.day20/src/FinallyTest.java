import jdk.jfr.StackTrace;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *  try - catch - finally 中finally的使用
 *
 * 1 finally 是可选的（用 or 不用）
 * 2 finally声明的是一定会被执行的代码， 即使catch中又出现异常了或者 try中有return；
 *      finally中的代码也会执行
 *
 * 3 像数据库连接，输入输出流，网络编程Socket等资源，JVM的不能自动的回收，我们需要自己手动的进行资源的
 * 释放，此时的资源释放，就需要声明在finally中
 *
   体会一： 使用try - catch- finally 处理编译时异常，使得程序在编译时不再报错，但是运行时扔可能报错
 相当于我们使用 try - catch- finally 将一个编译时异常，延迟到运行时出现
   体会二： 开发中，由于运行时异常比较常见，所以我们通常不针对运行时异常编写try - catch- finally 了
 针对于编译时异常，我们一定要考虑异常的处理。

 */



public class FinallyTest {
    public static void main(String[] args) {
        test2();
    }
public static void test2() {
        FileInputStream fis = null;
        try   { File file = new File("hello.txt");
        fis = new FileInputStream(file);

        int data = fis.read();
        while (data!=-1){
        System.out.println((char) data  );
        data = fis.read();

        }

        } catch (FileNotFoundException e){
        e.printStackTrace();
        } catch (IOException   e){
        e.printStackTrace();
        }finally {
            try {
                if (fis!=null)
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }



        }






public void test1(){
        try{
        int a = 10;
        int b =0;
        System.out.println(a/b);
        }catch (ArithmeticException e){
        //e.printStackTrace();
        int[] arr = new int[10];
        System.out.println(arr[10]);
        }catch (Exception e){
        e.printStackTrace();
        }finally {
        //一定会执行的代码
        System.out.println("我好帅啊！！！");
        }



        }

public int method(){
        try{  int[] arr = new int[10];

        System.out.println(arr[10]);
        // return 1;
        }catch (ArrayIndexOutOfBoundsException e    ){
        e.printStackTrace();
        return 2;
        }finally{
        System.out.println("我一定会被执行！");
        return 3;
        }

        }













        }
