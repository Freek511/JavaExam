package revarseHalf;

import java.util.Queue;
import java.util.Stack;

public class Solution {
    public void reversHalf(Queue<Integer> q){
        Stack<Integer> st = new Stack<>();

        int cnt = 0;
        int SIZE = q.size();
        while(cnt < SIZE){

            if(cnt % 2 ==0){
                st.push(q.poll());
                q.offer(st.pop());
            }
            else {
                st.push(q.poll());
            }
            cnt++;
        }
        while (!st.isEmpty()){
            st.push(q.poll());
            q.offer(st.pop());
            q.offer(st.pop());
        }
        if(SIZE % 2 != 0){
            st.push(q.poll());
            q.offer(st.pop());
        }

    }
}
