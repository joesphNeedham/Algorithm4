package Chapter1;

public class EX_19_practice {
    public static long[] F(int N) {
        long[] fibolica = new long[N + 1];//初始化数组的长度,因为N可以从0开始，表示第一个数，那么此时数组的长度就应该为1
        if (N == 0) { return fibolica; }
        fibolica[1] = 1;
        if (N == 1) { return fibolica; }//return 返回的是长度为N的数组的所有结果。
        for (int i = 2; i <= N; i++) {
            fibolica[i] = fibolica[i - 1] + fibolica[i - 2];
        }
        return fibolica;
    }

    public static void main(String[] args) {
        long [] fibolica = F(99);
        for(int i =0;i<fibolica.length;i++){
            System.out.println(i + " " + fibolica[i]);
        }
    }


}
