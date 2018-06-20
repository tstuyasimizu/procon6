import java.util.Scanner;

class ConvertGengo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String gengo =str.substring(0,1);
        String wareki = str.substring(1);
        
        if(gengo.equals("M")){
            int meiji=1868;
            int suu = Integer.parseInt(wareki);
            suu=meiji+suu-1;
            System.out.println(suu);


        }
        if(gengo.equals("T")){
            int taisho=1912;
            int suu = Integer.parseInt(wareki);
            suu=taisho+suu-1;
            System.out.println(suu);

        }
        if(gengo.equals("S")){
            int showa=1926;
            int suu = Integer.parseInt(wareki);
            suu=suu+showa-1;
            System.out.println(suu);

        }
        if(gengo.equals("H")){
            int heisei=1989;
            int suu = Integer.parseInt(wareki);
            suu=suu+heisei-1;
            System.out.println(suu);
        }
        if(gengo.equals("X")){
            int nazo=2019;
            int suu = Integer.parseInt(wareki);
            suu=suu+nazo-1;
            System.out.println(suu);
        }
    }
}