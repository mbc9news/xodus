/*
 * Copyright (c) 2015. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.LinkedList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class P2_1Test {

    List<Character> srcList = new LinkedList<Character>();

    @Before
    public void init(){
        srcList.add('a');
        srcList.add('b');
        srcList.add('c');
        srcList.add('a');
        srcList.add('d');
    }

    @Test
    public void 중복_문자_제거(){
        List<Character> result = P2_1.delDupData(srcList);

        assertThat(srcList.size()-1, is(result.size()));
    }

    @Test
    public void 버퍼사용하지_말고_중복_문자_제거(){
        List<Character> result = P2_1.delDupDataNoBuff(srcList);

        assertThat(srcList.size()-1, is(result.size()));
    }

    @Test
    public void java8_중복_문자_제거() {
        List<Character> result = P2_1.delDupDataStream(srcList);

        assertThat(srcList.size()-1, is(result.size()));
    }

}