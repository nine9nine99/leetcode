package 贪心算法.PartitionLabels;

import java.util.ArrayList;
import java.util.List;

/**
 * 763 !
 */
public class PartitionLabels {
    private List<Integer> partitionlabels(){
        String S = "ababcbacadefegdehijhklij";
        int length = S.length();
        int[] last = new int[26];
        //确认所有字母最后的位置
        for (int i = 0; i < length; i++){
            last[S.charAt(i) - 'a'] = i;
        }

        List<Integer> partition = new ArrayList<Integer>();
        int start = 0;
        int end = 0;
        //选择结尾最远的一传
        for (int i = 0; i<length; i++){
            end = Math.max(end, last[S.charAt(i) - 'a']);
            if (end == i){
                partition.add(end - start + 1);
                start = end + 1;
            }
        }
        return partition;
    }

    public static void main(String[] args){
        PartitionLabels partitionLabels = new PartitionLabels();
        List<Integer> result = partitionLabels.partitionlabels();
        for (int i : result){
            System.out.println(i);
        }
    }
}
