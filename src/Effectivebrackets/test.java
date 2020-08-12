package Effectivebrackets;

public class test {
    public static void main(String[] args){
        String brackets = "({)";
        effectiveBrackets change = new effectiveBrackets();
        boolean result = change.Solution(brackets);
        System.out.println(result);
    }
}
