package dy05;

import java.util.ArrayList;
import java.util.LinkedList;

public class Time {

    public static void main(String[] args) {
        ArrayList al=new ArrayList();
        long start=System.currentTimeMillis();
        for(int i=0;i<1e6;i++)al.add(i);
        long end=System.currentTimeMillis();
        System.out.println("ArrayList插入1e5个数字的时间:"+(end-start)+"ms");


        LinkedList ll=new LinkedList();
        start=System.currentTimeMillis();
        for(int i=0;i<1e6;i++)ll.add(i);
        end=System.currentTimeMillis();
        System.out.println("LinkedList插入1e5个数字的时间:"+(end-start)+"ms");


    }
}
