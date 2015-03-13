/*
 * Copyright (c) 2015. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

/**
 * Created by mbc9news on 15. 3. 13..
 */

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class P2_1 {
    public static List<Character> delDupData(List<Character> srcList) {
        List<Character> result = new LinkedList<Character>();
        Set<Character> tempPocket = new HashSet<Character>();
        for (char c : srcList) {
            if(!tempPocket.contains(c)){
                result.add(c);
                tempPocket.add(c);
            }
        }
        return result;
    }


    public static List<Character> delDupDataNoBuff(List<Character> srcList) {
        List<Character> result = new LinkedList<Character>();
        for (char c : srcList) {
            if(!result.contains(c)){
                result.add(c);
            }
        }
        return result;
    }


    public static List<Character> delDupDataStream(List<Character> srcList) {
        return srcList.stream().distinct().collect(Collectors.toList());
    }
}
