import java.util.Stack;

class validParenthesis {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        int countera = 0;
        int counterb = 0;
        int counterc = 0;
        boolean helperFlag = true;

        for (int i = 0; i<s.length(); i++){
            if ((s.charAt(i) == '(')) {
                countera += 1;
                stack.push(s.charAt(i));
            }
            if ((s.charAt(i) == ')') && countera == 0) {
                helperFlag = false;}
            else{
                if (s.charAt(i) == ')'){
                    {countera -= 1;
                        if (!stack.empty()){
                            char validate = stack.peek();
                            if (validate == '(')
                                stack.pop();
                        }}}}
            if (s.charAt(i) == '[') {
                counterb += 1;
                stack.push(s.charAt(i));
            }
            if ((s.charAt(i) == ']') && counterb == 0) {
                helperFlag = false;}

            else{
                if (s.charAt(i) == ']'){
                    {counterb -= 1;
                        if (!stack.empty()){
                            char validate = stack.peek();
                            if (validate == '[')
                                stack.pop();
                        }}}}
            if (s.charAt(i) == '{') {
                counterc += 1;
                stack.push(s.charAt(i));
            }
            if ((s.charAt(i) == '}') && counterc == 0) {
                helperFlag = false;}
            else {
                if (s.charAt(i) == '}'){
                    {counterc -= 1;
                        if (!stack.empty()){
                            char validate = stack.peek();
                            if (validate == '{')
                                stack.pop();}
                    }}}}

        if (helperFlag && (stack.empty() && ((countera % 2 == 0) && (counterb % 2 == 0)&&(counterc % 2 == 0)))) {
            return true;
        } else
            return false;

    }
}
                