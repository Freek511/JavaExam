package bilet29;

public class MyStackTester {
    public static void main(String[] args){
        MyStack<Integer> test1 = new MyStack<>();
        for(int i=0;i<5;i++){
            test1.push(i);
        }
        System.out.println(test1.pop());
        System.out.println(test1.pop());
        System.out.println(test1.pop());

        MyStack<Character> test2 = new MyStack<>();
        for(char i='a';i<'e';i++){
            test2.push(i);
        }
        System.out.println(test2.pop());
        System.out.println(test2.pop());
        System.out.println(test2.pop());
    }
}
