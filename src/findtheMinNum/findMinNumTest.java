package findtheMinNum;

import Stack.Stack;

public class findMinNumTest {

    public static void main(String[] args){
        Stack stack = new Stack();
        stack.push(5);
        stack.push(2);
        stack.push(39);
        stack.push(22);
        int result = stack.findMinNum(stack);
        System.out.println(result);
    }

}
