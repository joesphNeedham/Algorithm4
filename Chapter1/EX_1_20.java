package Chapter1;
import java.lang.Math;

//递归思想在于，每次计算都能得出部分解，同时将问题的规模按照原来的逻辑进行缩减。
//递归停止的条件在于，问题的规模缩减到一定程度后，有了一个确定的答案。
public class EX_1_20 {
    public static double ln(int N){
        if(N == 1){return 0; }
        return Math.log(N) + ln(N-1);
    }

    public static void main(String[] args) {
        System.out.println(ln(6));
    }
}
