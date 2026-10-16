import java.util.*;
public class ARemoveDuplicates {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] nums = new int[n];
        for(int i = 0 ; i < n ; ++i){
            nums[i] = sc.nextInt();
        }
        List<Integer> ans = new ArrayList<>();
        for(int i = n-1 ; i >= 0 ; --i){
            if(map.getOrDefault(nums[i],-1) == -1){
                ans.add(nums[i]);
            }
            map.put(nums[i],i);
        }
        System.out.println(ans.size());
        for(int i = ans.size() - 1 ; i >= 0 ; --i){
            System.out.print(ans.get(i) + " ");
        }
        sc.close();
    }
}