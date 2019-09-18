package SortAlgorithm;



import static SortAlgorithm.Example.exch;
import static SortAlgorithm.Example.less;//导入static方法

public class Selection {
    public static void sort(Comparable[] a){
        // 将a[]按照升序进行排列
        int N = a.length; //数组长度
        for (int i=0; i<N; i++){ //相当于range(N)
            int min = i; //通过一个中间变量来，保存索引右边最小值的索引
            for(int j=i+1; j<N;j++){ //对每个元素右边所有的元素逐个比较，确定出其中最小的值
                if (less(a[j], a[min])) min=j;
            exch(a,i,min);
            }

        }
    }

    public static void main(String[] args) {
        Integer[] a = {19,5,4,3,8,7,10};
        sort(a);
        for (int s : a){
            System.out.println(s);
        }


    }
}
