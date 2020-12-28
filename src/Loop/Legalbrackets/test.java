package Loop.Legalbrackets;

public class test {
    public static void main(String[] args){
        String brackets = "({)";
        legalBrackets change = new legalBrackets();
        boolean result = change.Solution(brackets);
        System.out.println(result);
    }
}
