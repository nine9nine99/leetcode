package String;

public class strStr {
    //BF法
    public int Solution(String haystack, String needle){
        int sum = 0;
        if (needle == ""){
            return sum;
        }

        char[] haystack_char = haystack.toCharArray();
        char[] needle_char = needle.toCharArray();
        int i = 0, j = 0;

        while ((i<haystack_char.length)&&(j<needle_char.length)){
            if (haystack.charAt(i)==needle.charAt(j)){ //两个字符串值相等，相加
                i++;
                j++;
                sum++; //相同字数
            }else { //字符串不等，主串调整至i-j+1的位置，模式穿调整为0
                i = i-j+1;
                j=0;
            }
        }
        if (j>=needle_char.length)
            return sum;
        else
            return -1;
    }

    //字串逐一比较
    public int Solution_2(String haystack, String needle){
        int L = needle.length(), n = haystack.length();

        for (int start = 0; start<n-L; ++start){
            haystack.substring(start, start+L).equals(needle);
            return start;
        }
        return -1;
    }
}
