import java.util.Scanner;

/**
 * Created by 丁云刚 on 2018/8/4.
 */
public class Exam2 {
    public static void main(String[] args) {
        System.out.print("请输入日期： ");
        Scanner in = new Scanner(System.in);
        String date = in.nextLine();
        String[] ary = date.split("-");
        int year = Integer.parseInt(ary[0]);
        int month = Integer.parseInt(ary[1]);
        int day = Integer.parseInt(ary[2]);
        int[] mon;
        mon = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if(year < 1 || month < 1 || month > 12) { //判断日期是否合理
            System.out.print("您输入的日期不存在");
            return;
        }
        boolean flag =false;
        int i=0;
        if((year%4==0&&year%100!=0) || year%400==0) {  //判断日期是否为闰年
            flag = true;
            i=1;
        }
        if( ((day < 1 || day > mon[month]) && (month != 2) ) ||  (day < 1||(month == 2) && (day > 28 + i)) ) {
            System.out.print("您输入的日期不存在");     //判断日期是否合理
            return;
        }

        //下面是计算下一天的日期

        if(month==2)
        {
            if((day==28&&!flag)||(day==29&&flag)) {
                day = 1;
                month++;
            }
            else day++;
        }
        else if(month==12)
        {
            if(day==31)
            {
                day=1;
                month=1;
                year++;
            }
            else day++;
        }
        else	if(month==1||month==3||month==5||month==7||month==8||month==10)
        {
            if(day==31)
            {
                day=1;
                month++;
            }
            else day++;
        }
        else
        {
            if(day==30)
            {
                day=1;
                month++;
            }
            else day++;
        }
        System.out.print("下一天为： "+year+"-"+month+"-"+day);
    }

}
