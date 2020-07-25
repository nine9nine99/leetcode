package transferRomanNum;
/**
 * 转换罗马数字
 * */
public class transferNums {
    public int Solution(String chars){
        int sum = 0; //总数
        int num = getValue(chars.charAt(0));
        for (int i=1; i<chars.length(); i++){
            int nextnum = getValue(chars.charAt(i));
            if (num<nextnum){
                sum -= num;
            }else {
                sum += num;
            }
            num = nextnum;
        }
        sum += num;
        return sum;
    }

    public int getValue(char ch){
        switch (ch){
            case 'I':return 1;
            case 'V':return 5;
            case 'X':return 10;
            case 'L':return 50;
            case 'C':return 100;
            case 'D':return 500;
            case 'M':return 1000;
            default:return 0;
        }
    }
}
