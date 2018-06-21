import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;


//高田からアドバイスをいただきました。


class GCP2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Deque<Character> q =new ArrayDeque<>();
        int i=0;
        while(i<str.length()){
            if(q.size()==0){
                q.push(str.charAt(i));
            }else{
                if(q.getFirst()=='G'&&str.charAt(i)=='C'){
                    q.pop();
                }else if(q.getFirst()=='C'&&str.charAt(i)=='P'){ 
                    q.pop();
                }else if(q.getFirst()=='P'&&str.charAt(i)=='G'){
                    q.pop();
                }else{
                    q.push(str.charAt(i));
                }
            }
            i++;
        }   
        
        System.out.println(q.size());
    }
}