package revarseHalf;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Test {
    public static void main(String[] args){
        Queue<Integer> test1 = new LinkedList<>();
        test1.offer(4);
        test1.offer(10);
        test1.offer(3);
        test1.offer(18);
        test1.offer(7);
        test1.offer(21);
        test1.offer(6);
        test1.offer(8);
        test1.offer(56);

        System.out.println(test1);
        Solution solve = new Solution();
        solve.reversHalf(test1);

        System.out.println(test1);
    }
}
