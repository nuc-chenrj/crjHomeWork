package day04;

import java.util.Arrays;
import java.util.Scanner;

public class Arr {

    public static void main(String[] args) {
        int n=8;
        int[] arr=new int [8];
        Scanner sc=new Scanner(System.in);
        int a=0,b=0;
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
            if(arr[i]%2==0)a++;
            else b++;
        }
        int[] arrEven=new int[a];
        int[] arrOdd=new int[b];
        int indexEven=0,indexOdd=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0)arrEven[indexEven++]=arr[i];
            else arrOdd[indexOdd++]=arr[i];
        }
        Arrays.sort(arrEven);
        Arrays.sort(arrOdd);
//        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(arrEven));
//        System.out.println(Arrays.toString(arrOdd));
        int[] ans=f(arrEven,arrOdd);
        System.out.println(Arrays.toString(ans));

    }
    public static int[] f(int[] a, int[] b){
        int an=a.length,bn=b.length;
        int[] ans=new int[an+bn];
        int i=0,j=0,index=0;
        while(i<an && j<bn){
            ans[index++]=a[i++];
            ans[index++]=b[j++];
        }
        while(i<an)ans[index++]=a[i++];
        while(j<bn)ans[index++]=b[j++];
        return ans;
    }
}
