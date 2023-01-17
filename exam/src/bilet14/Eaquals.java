package bilet14;

import java.util.Stack;

public class Eaquals {
    boolean equals(Stack<Integer> stack1, Stack<Integer> stack2) {
        Stack<Integer> temp = new Stack<Integer>();
        System.out.println(stack1);
        System.out.println(stack2);
        while(!stack1.empty() && !stack2.empty()) {
            if (stack1.peek() == stack2.peek()){
                temp.push(stack1.pop());
                temp.push(stack2.pop());
            }
            else {
                while(!temp.empty()) {
                    stack2.push(temp.pop());
                    stack1.push(temp.pop());
                }
                System.out.println(stack1);
                System.out.println(stack2);
                return false;
            }
        }
        if (stack1.empty() && stack2.empty()) {
            while(!temp.empty()) {
                stack2.push(temp.pop());
                stack1.push(temp.pop());
            }
            System.out.println(stack1);
            System.out.println(stack2);
            return true;
        }
        while(!temp.empty()) {
            stack2.push(temp.pop());
            stack1.push(temp.pop());
        }
        System.out.println(stack1);
        System.out.println(stack2);
        return false;
    }

    void testing() {
        Stack<Integer> stack1 = new Stack<>(), stack2 = new Stack<>();
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
//        stack2.push(1);
        stack2.push(2);
        stack2.push(3);
        System.out.println(equals(stack1, stack2));
    }
}

