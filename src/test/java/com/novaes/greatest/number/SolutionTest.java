/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novaes.greatest.number;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author kbos
 */
public class SolutionTest {
    
    
    @Test
    public void test1() {
        int[] n = new int[]{1, 3, 6, 4, 1, 2};
        Assert.assertEquals(new Solution().solution(n), 5);
    }
    
    @Test
    public void test2() {
        int[] n = new int[]{1,2,3};
        Assert.assertEquals(new Solution().solution(n), 4);
    }
    
    @Test
    public void test3() {
        int[] n = new int[]{-1,-3};
        Assert.assertEquals(new Solution().solution(n), 1);
    }
    
}
