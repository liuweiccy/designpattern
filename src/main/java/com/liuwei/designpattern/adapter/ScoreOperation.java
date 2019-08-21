package com.liuwei.designpattern.adapter;

public interface ScoreOperation {
    int[] sort(int[] array);
    int binarySearch(int[] array, int key);
}
