package day06;

import java.io.*;

public class Copy {
    public static void main(String[] args) {

        PrintWriter pw = null;
        BufferedReader br = null;
        try {
            FileOutputStream fos = new FileOutputStream("b.txt");
            OutputStreamWriter osw = new OutputStreamWriter(fos);
            pw = new PrintWriter(osw, true);
            FileInputStream fis = new FileInputStream("a.txt");
            InputStreamReader isr = new InputStreamReader(fis);
            br = new BufferedReader(isr);
            String str;
            while ((str = br.readLine()) != null) pw.println(str);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) br.close();
                if (pw != null) pw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("复制成功");
        }
    }
}