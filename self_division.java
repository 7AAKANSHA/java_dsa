package java_dsa;
import java.util.ArrayList;
import java.util.List;
// Q https://leetcode.com/problems/self-dividing-numbers/

public class self_division {
    public static boolean remainder_division(int num)
        {
            int x=num;
            while(num!=0)
            {
                int rem=num%10;
                if(rem ==0 || x%rem !=0)   return false;
                num=num/10;

            }
            return true;
        }
        public static List<Integer> selfDividingNumbers(int left, int right) {
            List<Integer> list=new ArrayList<>();

            for(  int j=left;j<=right;j++)
            {     if (remainder_division(j))
                list.add(j);
            }
            return list;
        }


    public static void  main(String[] args) {
        List<Integer> integers = selfDividingNumbers(1, 22);
        System.out.println(integers);

    }
}


