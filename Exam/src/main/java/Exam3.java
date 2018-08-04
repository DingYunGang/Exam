
import java.util.*;

/**
 * Created by 丁云刚 on 2018/8/4.
 */
public class Exam3 {
    public static void main(String[] args) {
        int  x [] = new int [50];

        Map map = new HashMap();
        Map map2 = new HashMap();
        System.out.print("随机生成50个小于100的数,分别为:");
        for(int i=0;i<50;i++) {
            x[i] = (int) (Math.random() * 100);
            System.out.print(x[i]+" ");
        }
        System.out.println();
        System.out.println("Map中的数据为:");
        for(int i=0;i<10;i++){
            List list = new ArrayList();
            for(int j=0;j<50;j++){
                if(x[j]/10==i){
                    list.add(x[j]);
                }
            }
            map.put(i,list);
        }

        for(int i=0;i<10;i++){
            System.out.println(map.get(i)+" ");
        }

        System.out.println("排序后的Map为:");

        for(int i=0;i<10;i++){
            List list2 = new ArrayList();
            for(int j=0;j<50;j++){
                if(x[j]/10==i){
                    list2.add(x[j]);
                }
            }
            Collections.sort(list2);
            map2.put(i,list2);
        }

        for(int i=0;i<10;i++){
            System.out.println(map2.get(i)+" ");
        }

        Comparator c = new Comparator<Integer>() { //重写comparator类对arraylist进行排序

            public int compare(Integer o1, Integer o2) {

                if((int)o1<(int)o2)
                    return 1;
                else return -1;
            }
        };
    }
}
