import java.util.Scanner;

import java.util.Random;

class SumofK{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long k = sc.nextLong();
        long sum=0;
        if(a>0&&b>0){
            for(long i=a;i<b;i++){
                if (i % k == 0){             
                    sum += i;
                    //System.out.println(i);
                }
            }
            System.out.println(sum);

        }
        if(a>0&&b<0){
            b=-b;
            System.out.println(cheak(a, b, k));

        }
        if(a<0&&b>0){
            a=-a;
            System.out.println(cheak(a, b, k));

        }
        if(a<0&&b<0){
            a=-a;
            b=-b;
            System.out.println(cheak(a, b, k));

        }
        
    }
    public static long cheak(long a,long b,long k){
        long sum=0;
        for(int i=1;i<=a;i++){
            if (i % k == 0){             
                sum += i;
                //System.out.println(i);
            }
        }
        for(int i=1;i<b;i++){
            if (i % k == 0){             
                sum += i;
                //System.out.println(i);
            }
        }
        return sum;
    }
}