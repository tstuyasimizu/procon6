import java.util.Scanner;

class GCP{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String gc ="GC";
        String cp ="CP";
        String pg ="PG";
        while(str.contains(gc)||str.contains(cp)||str.contains(pg)){
            if(str.contains(gc)){
                int match =str.indexOf(gc);
                String Before = str.substring(0,match);
                String after = str.substring((match+2));
                StringBuilder buff = new StringBuilder();
                buff.append(Before);
                buff.append(after);
                str = buff.toString();
            }
            if(str.contains(cp)){
                int match =str.indexOf(cp);
                String Before = str.substring(0,match);
                String after = str.substring((match+2));
                StringBuilder buff = new StringBuilder();
                buff.append(Before);
                buff.append(after);
                str = buff.toString();
            }
            if(str.contains(pg)){
                int match =str.indexOf(pg);
                String Before = str.substring(0,match);
                String after = str.substring((match+2));
                StringBuilder buff = new StringBuilder();
                buff.append(Before);
                buff.append(after);
                str = buff.toString();
            }
        }
        
        System.out.println(str.length());
    }
}