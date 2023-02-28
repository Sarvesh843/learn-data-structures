package core.stack;

import java.util.Stack;

public class StackImplementation {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.push(2);
        st.pop();
        st.peek();
        st.size();
        st.isEmpty();
    }
}
