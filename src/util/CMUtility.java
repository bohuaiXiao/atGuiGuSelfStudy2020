package util;

import java.util.Scanner;

public class CMUtility {
    /**
     * 用于界面菜单的选择，该方法读取键盘，如果用户输出1-5中的任意字符，则方法返回
     */
    private static Scanner scanner = new Scanner(System.in);

    public static char readMenuSelection(){
        char c;
        for (; ;){
            String str = readKeyBoard(1,false);
            c = str.charAt(0);
            if (c!='1'&&c!='2'&&c!='3' &&c!='4'&&c!='5'
                 ){
                System.out.println("Invalid Input, please try again!");
            }else
                System.out.println("EXIT");
                break   ;
        }
        return c;
    }
    /**
     * 从键盘读取一个字符，并将其作为方法的返回值
     * 如果用户不输入字符而直接回车，方法将以defaultValue作为返回值
     */
    public static char readChar(char defaultValue){
        String str = readKeyBoard(1,true);
        return (str.length()==0? defaultValue: str.charAt(0));


    }
    public static char readChar(){
        String str = readKeyBoard(1,false);
        return str.charAt(0);
    }

    /**
     * 从键盘读取一个长度不超过2位的整数，并将其作为返回值
     */
    public static int readInt(){
        int n;
        for (; ;){
            String str = readKeyBoard(2,false);
            try{
                n = Integer.valueOf(str);
                break;
            }catch (NumberFormatException e){
                System.out.println("Invalid Number, please enter again!");
            }
        }
        return n;
    }
    public static int readInt(int defaultValue){
        int n;
        for (; ;){
            String str = readKeyBoard(2,true);
            if (str.equals("")){
                return defaultValue;
            }
            try {
                n = Integer.valueOf(str);
                break;
            }catch (NumberFormatException e){
                System.out.println("Invalid Number, please try again!");
            }
        }
        return n;
    }

    /**
     * 从键盘读取一个长度不超过limit的字符串，并将其作为返回值
     */
    public static String readString(int limit){
        return readKeyBoard(limit,false);
    }
    public static String readString(int limit, String defaultValue  ){
        String str = readKeyBoard(limit,true );
        return str.equals("")? defaultValue : str;
    }

    /**用于确认选择的输入， 该方法从键盘读取Y 或N 将其作为返回值
     */
    public static char readConfirmSelection(){
        char c;
        for (; ;){
            String str = readKeyBoard(1,false).toUpperCase();
            c= str.charAt(0);
            if (c=='Y'||c=='N'){
                break;
            }else {
                System.out.println("Invalid Input, try again!");
            }
        }
        return c;
    }

    private static String readKeyBoard(int limit, boolean blankReturn){
        String line = "";

        while(scanner.hasNextLine()){
            line = scanner.nextLine();
            if (line.length()==0){
                if (blankReturn) return line;
                else continue;
            }
            if (line.length()<1||line.length()>limit){
                System.out.println("Invalid length, reEnter again!");
                continue;
            }
            break;
        }
        return line;
    }




}
