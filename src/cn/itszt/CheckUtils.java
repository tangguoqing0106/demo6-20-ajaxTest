package cn.itszt;

import java.util.Scanner;

/**
 * Created by Administrator on 2018\6\22 0022.
 */
public class CheckUtils {
    public static Scanner sc=new Scanner(System.in);
    public static boolean isRightNum(String str){
        if(str==null||str.equals("")){
            return false;
        }
        char[] ch = str.toCharArray();
        for(char c:ch){
            if(!(c>='0'&&c<='9')){
                return false;
            }
        }
        return true;
    }
    static String str;
    public static int getRightNum(){
        str=sc.nextLine();
        if(!isRightNum(str)){
            System.err.println("看看输入的都是什么玩意儿?重来!!!");
            getRightNum();
        }
        int num=Integer.parseInt(str);
        return num;
    }
}
