package bilet29;

import java.util.ArrayList;

public class MyStack<E> {
    private ArrayList<E> mas= new ArrayList<>();

    public void push (E data){
        mas.add(data);
    }
    public E peek() {
        return mas.get(mas.size()-1);
    }
    public E pop(){
        E data = mas.get(mas.size()-1);
        mas.remove(mas.size()-1);
        return data;
    }
    public boolean isEmpty(){
        return mas.isEmpty();
    }
}
