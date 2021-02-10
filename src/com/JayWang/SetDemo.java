package com.JayWang;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * HashSet不保证元素顺序
 * HashSet不允许相同元素出现
 * LinkedHashSet保证元素顺序
 * TreeSet无参构造根据自然顺序排序，有参构造根据指定的比较器
 */
public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet();
        set.add(10);
        set.add(40);
        set.add(30);
        for(int i : set){
            System.out.println(i);
        }
    }
}
