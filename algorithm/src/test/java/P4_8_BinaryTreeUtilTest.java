/*
 * Copyright (c) 2015. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

/**
 * Created by mbc9news on 15. 3. 15..
 */

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;

import java.util.Random;

import org.junit.Before;
import org.junit.Test;

public class P4_8_BinaryTreeUtilTest {
    private xodus.algo.P4_8_BinaryTree t1;
    private xodus.algo.P4_8_BinaryTree t2;

    @Test
    public void t2는_t1에_포함되어_있다(){
        t1.insert(20);
        t1.insert(21);
        t1.insert(22);
        t1.insert(23);
        t1.insert(24);

        assertThat(xodus.algo.P4_8_BinaryTreeUtil.isContain(t1, t2), is(true));
    }

    @Test
    public void t2는_t1에_중간에_포함되어_있다(){
        t1.insert(20);
        t1.insert(21);
        t1.insert(22);
        t1.insert(23);
        t1.insert(24);
        t1.insert(25);
        t1.insert(26);

        assertThat(xodus.algo.P4_8_BinaryTreeUtil.isContain(t1, t2), is(true));
    }

    @Test
    public void t2는_t1에_포함되어_있지않다(){
        assertThat(xodus.algo.P4_8_BinaryTreeUtil.isContain(t1, t2), is(false));
    }


    @Before
    public void init(){
        t1 = new xodus.algo.P4_8_BinaryTree();
        for (int i=0;i<10000;i++){
            t1.insert(new Random().nextInt(10));
        }

        t2 = new xodus.algo.P4_8_BinaryTree();
        t2.insert(20);
        t2.insert(21);
        t2.insert(22);
        t2.insert(23);
        t2.insert(24);
    }
}
