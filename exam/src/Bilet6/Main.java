package Bilet6;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multimap;
import com.google.common.collect.Multiset;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        guavaSort(new String[]{"Apple", "Bee","Apple", "Cat", "Dog", "Bee", "Apple", "Bee",});
    }
    public static void guavaSort(String[] massive) {
        Multiset<String> multiSet = HashMultiset.create();
        multiSet.addAll(Arrays.asList(massive));
        List<String>[] buckets = new List[multiSet.size() / 3];
        for(int i =0; i < multiSet.size() / 3;i++) {
            buckets[i] = new LinkedList<>();
        }

        for (String entry: multiSet.elementSet()) {
            buckets[entry.hashCode() % (multiSet.size() / 3)].add(entry);
        }

        int i = 0;
        for(List<String> bucket : buckets) {
            Collections.sort(bucket);
            for(String str: bucket) {
                for(int j = 0; j < multiSet.count(str);j++) {
                    massive[i] = str;
                    System.out.println(str);
                    i++;
                }
            }
        }

    }

}
