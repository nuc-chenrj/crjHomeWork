package day04;

import java.util.Arrays;

public class Game {
    public static void main(String[] args) {
        char[] input={'L','B','W','N','P'};
        char[] chars=generate();
        System.out.println(Arrays.toString(chars));
        int[] ans=check(chars,input);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] check(char[] chars,char[] input){
        int n=input.length;
        int[] ans=new int[2];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(chars[i]==input[j]){
                    ans[0]++;
                    if(i==j) ans[1]++;
                    break;
                }
            }
        }
        return ans;
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
