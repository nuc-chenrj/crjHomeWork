package dy06;

import java.io.*;

public class Copy2 {
    public static void main(String[] args) {

        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            br=new BufferedReader(new FileReader("a.txt"));
            bw = new BufferedWriter(new FileWriter("b.txt"));
            String str;
            while ((str = br.readLine()) != null) {
                bw.write(str);
                bw.newLine();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) br.close();
                if (bw != null) bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("复制成功");
        }
    }
}
