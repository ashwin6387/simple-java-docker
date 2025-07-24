import java.util.*;
class Dsca{
    public void insertAtBottom(Stack st, int no){
        if(st.empty()){
            st.push(no);
            return;
        }
        if((int)st.peek() <= no){
            st.push(no);
            return;
        }
        int top = (int)st.peek();
        st.pop();
        insertAtBottom(st,no);
        st.push(top);


    
    }
    public void doReverse(Stack st){
        if(st.empty()){
            return;
        };
        int top = (int)st.peek();
        st.pop();
        doReverse(st);
        insertAtBottom(st, top);
    }
    public void reverse(){
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(67);
        st.push(45);
        st.push(49);
        System.out.println(st);
        doReverse(st);
        System.out.println("sfter reverse");
        System.out.println(st);
    }
}
public class dsca_stack {
    public static void main(String[] args) {
        Dsca p = new Dsca();
        p.reverse();
    }
}
