package com.liuwei.designpattern.adapter;

public class OperationAdapter implements ScoreOperation {

    private QuickSort quickSort;
    private BinarySearch binarySearch;

    public OperationAdapter() {
        quickSort = new QuickSort();
        binarySearch = new BinarySearch();
    }

    @Override
    public int[] sort(int[] array) {
        return quickSort.quickSort(array);
    }

    @Override
    public int binarySearch(int[] array, int key) {
        return binarySearch.binarySearch(array, key);
    }
}
