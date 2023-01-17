package bilet15;

import java.util.ArrayDeque;
import java.util.Stack;


public class Main {

    public void splitStack(Stack<Integer> st)
    {
        ArrayDeque<Integer> temp = new ArrayDeque<Integer>();
        while(!st.isEmpty()) {
            if(st.peek() < 0) {
                temp.addLast(st.pop());
            }
            else {
                temp.addFirst(st.pop());
            }
        }
        while (!temp.isEmpty()) {
            st.push(temp.pollLast());
        }
    }


    public static void main(String [] args){
        Stack<Integer> test = new Stack<Integer>();
        test.push(-1);
        test.push( 2);
        test.push(-3);
        test.push( 4);
        test.push(-5);

       Main val = new Main();
       val.splitStack(test);
       System.out.println(test);
    }

}


