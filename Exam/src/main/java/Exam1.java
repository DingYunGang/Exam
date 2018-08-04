/**
 * Created by 丁云刚 on 2018/8/4.
 */
import java.util.Scanner;
public class Exam1 {
    public static void main(String[] args) {
        System.out.print("请输入工资： ");
        Scanner in = new Scanner(System.in);
        double sum =in.nextInt();
        double tex=0;
        double salary = sum -3500;
        if (salary>=0 && salary<1500){
            tex = salary *0.03;
        }else if (salary>=1500 && salary<4500){
            tex = salary * 0.1 - 105;
        } else if(salary>=4500 && salary<9000){
            tex = salary * 0.2 - 555;
        }else if(salary>=9000 && salary<35000){
            tex = salary*0.25 - 1005;
        }else if(salary>=35000 && salary<55000){
            tex = salary*0.3 -2755;
        }else if(salary>=55000 && salary<80000){
            tex = salary*0.35 - 5505;
        }else if(salary>=80000){
            tex = salary*0.45 - 13505;
        }
        System.out.print("应缴纳税款为："+tex);
    }
}
