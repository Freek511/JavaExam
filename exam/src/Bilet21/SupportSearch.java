package Bilet21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;

public class SupportSearch {
    public static int findElementLinear(int value, Collection<ISearch> massive) {
        int i = 0;
        for (ISearch elem: massive) {
            if (elem.getValue() == value) {
                return i;
            }
            i ++;

        }
        return -1;
    }
    public static int findElementBinary(int value, ArrayList<ISearch> massive) {
        massive.sort(new Comparator<ISearch>() {
            @Override
            public int compare(ISearch o1, ISearch o2) {
                return o1.getValue() - o2.getValue();
            }
        });

        int start = 0, finish = massive.size()-1, mid = (massive.size()-1)/2;

        while (start <= finish) {
            if (massive.get(mid).getValue() == value) return mid;
            else if (massive.get(mid).getValue() > value) {
                finish = mid -1;
            }
            else {
                start = mid + 1;
            }
            mid = (start + finish) / 2;
        }
        return - 1;
    }
}
