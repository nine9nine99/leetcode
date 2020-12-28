package 堆;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class findMinNum_topk {
    public int[] Solution(int[] arr, int k){
        if (k==0){
            return new int[0];
        }

        /**
         * 通过使用优先队列以及函数式完成大顶堆的排序
         * */
        Queue<Integer> heap = new PriorityQueue<>(k, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        /**
         * 栈的存储容量小于k，加入
         * 栈满，元素小于栈顶，则输出栈顶，放入新元素
         * */
        for (int num:arr){
            if (heap.size()<k){
                heap.offer(num);
            }else if (num<heap.peek()){
                heap.poll();
                heap.offer(num);
            }
        }

        int[] res = new int[heap.size()];
        int j = 0;
        for (int e:heap){
            res[j++] = e;
        }
        return res;
    }
}
