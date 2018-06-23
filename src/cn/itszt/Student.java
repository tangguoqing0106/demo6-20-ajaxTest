package cn.itszt;

/**
 * Created by Administrator on 2018\6\22 0022.
 */
public class Student {
    private String name;
    private int math;
    private int english;
    private int computer;

    public Student(String name, int math, int english, int computer) {
        this.name = name;
        this.math = math;
        this.english = english;
        this.computer = computer;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        while(true){
            if(math>=0&&math<=100){
                break;
            }else{
                System.err.println("输入的成绩超出范围!重来!");
                math = CheckUtils.getRightNum();
            }
        }
        this.math = math;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public int getComputer() {
        return computer;
    }

    public void setComputer(int computer) {
        this.computer = computer;
    }
    public int getSum(){
        return math+english+computer;
    }
    public float getAvg(){
        return (getSum()+0.0F)/3;
    }
    public int getMax(){
        int max=math;
        if(english>max){
            max=english;
        }
        if(computer>max){
            max=computer;
        }
        return max;
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", math=" + math +
                ", english=" + english +
                ", computer=" + computer +
                '}';
    }
}
