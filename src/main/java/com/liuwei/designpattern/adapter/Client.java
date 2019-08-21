package com.liuwei.designpattern.adapter;

import com.liuwei.designpattern.util.XMLUtil;

import java.util.Arrays;

public class Client {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        ScoreOperation scoreOperation = (ScoreOperation) Class.forName(XMLUtil.getChartType("adapter")).newInstance();
        int[] a = {1,3,5,7,9,8,6,4,2};
        int[] a1 = scoreOperation.sort(a);
        System.out.println(Arrays.toString(a1));
        System.out.println(scoreOperation.binarySearch(a,9));
    }
}
