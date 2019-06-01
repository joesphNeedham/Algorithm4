/**
 * @program: Algorithm4
 * @description: 关于堆的实现与运用
 * @author: TanBo
 * @create: 2019-06-01 15:38
 **/
import java.lang.Comparable;
import java.lang.String;
import java.util.ArrayList;

public class OwnHeap<E extends Comparable<E>> {
    /**
     * 数组列表用来存放类型为E的元素对象
     */

    private ArrayList<E> list = new ArrayList<>();

    public OwnHeap(){

    }

    public OwnHeap(E[] objects){
        for(int i =0; i<objects.length;i++)
            add(objects[i]);

    }

    public void add(E newObject){
        /**
         *  从下层的堆往上遍历
         */
        list.add(newObject);
        int currentIndex = list.size() - 1;

        while (currentIndex > 0){
            int parentIndex = (currentIndex -1)/2;
            //如果当前索引位置的值比父节点的值要大，那么就交换对应位置上的值
            if(list.get(currentIndex).compareTo(list.get(parentIndex)) >0){
                E temp = list.get(currentIndex);
                list.set(currentIndex,list.get(parentIndex));
                list.set(parentIndex,temp);
            }
            else
                break;
            //跟新当前索引
            currentIndex = parentIndex;
        }
    }

    public E remove(){
        /**
         *  从上层的堆往下遍历
         */
        if (list.size() == 0) return null;
        //先备份，在操作！
        E removedObject = list.get(0);
        list.set(0,list.get(list.size() - 1));
        list.remove(list.size() - 1);

        int currentIndex = 0;
        while (currentIndex < list.size()){
            int leftChildrenIndex = 2*currentIndex +1;
            int rightChildrenIndex = 2*currentIndex +2;
            if (leftChildrenIndex>= list.size()) break;
            int maxIndex = leftChildrenIndex;
            if (rightChildrenIndex<list.size()){ //判定右节点索引有效
                if(list.get(maxIndex).compareTo(list.get(rightChildrenIndex)) < 0){
                    maxIndex = rightChildrenIndex;
                }
            }

            if(list.get(currentIndex).compareTo(list.get(maxIndex))< 0 ){
                E temp = list.get(maxIndex);
                list.set(maxIndex,list.get(currentIndex));
                list.set(currentIndex,temp);
                currentIndex = maxIndex;
            }
            else
                break;
        }

        return removedObject;
    }


    public int getSize(){
        return list.size();
    }
}
