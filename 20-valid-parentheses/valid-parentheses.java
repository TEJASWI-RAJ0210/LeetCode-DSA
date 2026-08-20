class Solution {
    public boolean isValid(String s) {
        Stack<Character>st=new Stack<>();
        int n=s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['){
                st.push(s.charAt(i));
            }else{
                if(st.isEmpty()) return false;
             char top=st.pop();
             char curr=s.charAt(i);
            if(top!='(' && curr==')' || top!='{' && curr=='}' || top!='[' && curr==']'){
             return false;
            }
          }
        }
        return st.isEmpty();

    }
}