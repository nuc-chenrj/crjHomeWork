package day07;

import java.text.SimpleDateFormat;
import java.util.Date;

public class PrintDate {
    public static void main(String[] args) {
        new Thread(){
            public void run(){
                while(true){
                    Date date=new Date();
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                    String now=sdf.format(date);
                    System.out.println(now);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.run();

    }
}
