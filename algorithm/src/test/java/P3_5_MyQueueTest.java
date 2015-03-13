/*
 * Copyright (c) 2015. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class P3_5_MyQueueTest {

    @Test
    public void push순서와_pop순서는_같다(){
        P3_5_MyQueue q = new P3_5_MyQueue();
        q.push(1);
        q.push(2);
        q.push(3);

        assertThat(q.pop(), is(1));
        assertThat(q.pop(), is(2));
        assertThat(q.pop(), is(3));
    }
}