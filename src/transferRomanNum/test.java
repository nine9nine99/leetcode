package transferRomanNum;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class test {
    public static void main(String[] args){
        String chars = "LVIII";
        transferNums transferNums = new transferNums();
        int result = transferNums.Solution(chars);
        System.out.print(result);
    }
}
