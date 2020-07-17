package CircleLInk;

import LinkList.List;

public class CircleTest {
    public static void main(String[] args){
        CircleLink circle = new CircleLink();
        List list = circle.CreatCircleLink();
        boolean result = circle.Solution(list);
        System.out.print(result);
    }
}
