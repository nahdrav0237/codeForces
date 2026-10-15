import java.util.*;
public class BTwoGram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();sc.nextLine();
        String s = sc.nextLine();
        HashMap<String,Integer> freq = new HashMap<>();
        for(int i = 0 ; i < n-1 ; ++i){
            String sub = s.substring(i,i+2);
            freq.put(sub,freq.getOrDefault(sub,0)+1);
        }
        int max = 0;
        String ans = "";
        for(Map.Entry<String,Integer> x : freq.entrySet()){
            if(x.getValue() > max){
                max = x.getValue();
                ans = x.getKey();
            }
        }
        System.out.println(ans);
        sc.close();
    }
}