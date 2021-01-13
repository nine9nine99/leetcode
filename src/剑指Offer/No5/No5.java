package 剑指Offer.No5;

public class No5 {
    private String test_string = "Hello World!";

    private String Solution(String test_string){
        int array_length = test_string.length();
        char[] array = new char[array_length*3];//因为要将空格替换为%20，所以要将长度扩大为3倍，并且用于存储遍历过的字符串
        System.out.println(array.length);
        int size = 0;

        for (int i = 0; i < array_length; i++){
            char array_char = test_string.charAt(i);
            if (array_char == ' '){
                array[size++] = '%';
                array[size++] = '2';
                array[size++] = '0';
            }else {
                array[size++] = array_char;
            }
        }

        return new String(array, 0, size);
    }

    public static void main(String[] args){
        No5 no5 = new No5();

        String result = no5.Solution(no5.test_string);
        System.out.println(result);
    }
}
