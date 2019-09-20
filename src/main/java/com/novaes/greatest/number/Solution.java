/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novaes.greatest.number;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

/**
 *
 * @author kbos
 */
public class Solution {
    
    public int solution(int[] A) {
        Set<Integer> list = Arrays.stream(A).boxed().distinct().sorted().collect(Collectors.toSet());
        int current = Integer.MIN_VALUE;
        for (Integer integer : list) {
            if(current == Integer.MIN_VALUE) {
                current = integer;
            } else {
                if(current != integer - 1) {
                    return current+1 == 0 ? 1 : current+1;
                }
                current = integer;
            }
        }
        return current+1 == 0 ? 1 : current+1;
    }
}
