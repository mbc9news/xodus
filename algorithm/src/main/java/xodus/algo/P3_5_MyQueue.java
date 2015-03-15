package xodus.algo;

/**
 * Created by mbc9news on 15. 3. 13..
 */

import java.util.Stack;

public class P3_5_MyQueue {

    Stack<Integer> in = new Stack<Integer>();
    Stack<Integer> out = new Stack<Integer>();

    public void push(Integer item) {
        in.add(item);
    }

    public Integer pop() {
        if (out.isEmpty()) {
            while (!in.isEmpty()) {
                out.push(in.pop());
            }
        }
        return out.pop();
    }

}
