package SortAlgorithm;


import static SortAlgorithm.Selection.exch;
import static SortAlgorithm.Selection.less;


public class InsertSelection {
    public static void sort(Comparable[] a){
        int N = a.length;
        for (int i=1; i<N; i++){ //排序的起始位置是索引为1，最后的数组元素对应的索引为N-1
            for(int j = i;j>0 && less(a[j], a[j-1]); j--){
                exch(a, j, j-1);//将a[i]插入到a[i-1],a[i-2],a[i-3] ...之中，每次插入的时候，其前面的数组都是已经排好序的
            }
        }
    }
}
