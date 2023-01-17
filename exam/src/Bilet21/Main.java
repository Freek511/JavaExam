package Bilet21;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<ISearch> massive = new ArrayList<ISearch>();
        massive.add(new Search1(3));
        massive.add(new Search1(15));
        massive.add(new Search1(10));
        massive.add(new Search1(42));
        System.out.println(SupportSearch.findElementLinear(15, massive));
        //Относительно отсортированного
        System.out.println(SupportSearch.findElementBinary(15, massive));

    }
}
