package leetcode;

import java.util.*;
public class ValidParenthesis {
    // https://leetcode.com/problems/valid-parentheses/description/
    public boolean isValid(String s) {

        Stack<Character> st = new Stack<>();

        for(int i=0; i < s.length() ; i++){
            char c = s.charAt(i);

            if(c=='('){
                st.push(')');
            }
            else if( c== '{'){
                st.push('}');
            }
            else if(c == '['){
                st.push(']');
            }
            else{
                if(st.isEmpty() || st.peek() != c){
                    return false;
                }

                st.pop();
            }
        }

        return st.isEmpty();
    }
}
