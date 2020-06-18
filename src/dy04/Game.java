package dy04;

import java.util.Arrays;

public class Game {
    public static void main(String[] args) {
        char[] chars=generate();
        System.out.println(Arrays.toString(chars));
    }

    public static char[] generate(){
        char[] chs=new char[5];
        char[] letters = {'A','B','C','D','E','F','G','H','I','J','K','L','M'
                ,'N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        boolean[] vis=new boolean[26];
        int index;
        for(int i=0;i<chs.length;i++){
            do{
                index=(int)(Math.random()*letters.length);
                chs[i]=letters[index];
            }while(vis[index]);
            vis[index]=true;
        }
        return chs;
    }
}
