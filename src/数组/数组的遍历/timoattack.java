package 数组.数组的遍历;

/**
 * 计算提莫攻击对方的中毒时间
 * 要点：时间覆盖区间。假如有覆盖，则应该是time+覆盖时间为该段时间
 */
public class timoattack {
    public static void main(String[] args){
        int[] attacks = {1, 2};
        int time = 2;
        System.out.print(Soluttion(attacks, time));
    }

    static int Soluttion(int[] attacks, int time){
        int count = 0;
        int final_time = 0;
        while (count<attacks.length-1){
            if (attacks[count+1]-attacks[count]>time){
                final_time += time;
                count++;
            }else {
                final_time += (attacks[count+1]-attacks[count]);
                count++;
            }
        }
        final_time += time;//数组溢出
        return final_time;
    }
}
