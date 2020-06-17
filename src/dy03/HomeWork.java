package dy03;

public class HomeWork {
  //测试

    public static void main(String[] args) {
        multiplicationTable();
        isoscelesTriangle();

        int ans=0;
        for(int i=1;i<=100;i++){
            if(isPri(i)){
//                System.out.println(i);
                ans+=i;
            }
        }
        System.out.println(ans);
    }
    public static void isoscelesTriangle(){
        int n=6;
        for(int i=1;i<=6;i++){
            for(int j=1;j<=6-i;j++)
                System.out.print(" ");
            for(int j=1;j<=2*i-1;j++)
                System.out.print("*");
            System.out.println();
        }
    }

    public static void multiplicationTable(){
        for(int i=1;i<=9;i++){
            for(int j=1;j<=i;j++)
                System.out.print(j+"*"+i+"="+i*j+" ");
                System.out.println();
        }
    }

    public static boolean isPri(int n){
        if(n==1)return false;
        for(int i=2;i*i<=n;i++)
            if(n%i==0)return false;
        return true;
    }

}
