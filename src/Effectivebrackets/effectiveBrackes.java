package Effectivebrackets;

class effectiveBrackets {
    public boolean Solution(String brackets){
        int sum=0;
        for (int i=0; i<brackets.length(); i++){
            sum += getValue(brackets.charAt(i));
        }
        if (sum==0)
            return true;
        else
            return false;
    }

    public int getValue(char bracket){
        switch (bracket){
            case '(':return 1;
            case ')':return -1;
            case '[':return 2;
            case ']':return -2;
            case '{':return 3;
            case '}':return -3;
            default:return 0;
        }
    }
}
