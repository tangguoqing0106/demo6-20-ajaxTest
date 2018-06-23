package cn.itszt;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * Created by Administrator on 2018\6\22 0022.
 */
public class Student_main {
    public Student_main(){
        luRu();
    }

    public void luRu(){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入需要录入的学生的数量:");
        int num=CheckUtils.getRightNum();
        Student[] stus=new Student[num];
        for(int i=0;i<num;i++){
            stus[i]=new Student();
            System.out.println("请输入学生的姓名:");
            String name=sc.nextLine();
            stus[i].setName(name);
            System.out.println("请输入数学成绩:");
            int math=CheckUtils.getRightNum();
            stus[i].setMath(math);
            System.out.println("请输入英语成绩:");
            int english=CheckUtils.getRightNum();
            stus[i].setEnglish(english);
            System.out.println("请输入计算机成绩:");
            int computer=CheckUtils.getRightNum();
            stus[i].setComputer(computer);
            System.out.println("请问是否继续录入?Y/N");
            String str=sc.nextLine();
            if(!"Y".equalsIgnoreCase(str)){
                break;
            }
        }
        for(Student s:stus){
            if(s!=null){
                System.out.println(s.toString());
            }
        }
    }




    public static void main(String[] args) {
        new Student_main();
    }
}
