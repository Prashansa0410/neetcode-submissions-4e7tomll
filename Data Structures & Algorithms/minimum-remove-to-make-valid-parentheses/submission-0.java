class Solution {
    public String minRemoveToMakeValid(String s) {
        StringBuilder str = new StringBuilder();
        StringBuilder sb = new StringBuilder(s);
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                stack.push(i);
            }
            else if(s.charAt(i)==')'){
                if(!stack.isEmpty()){
                    stack.pop();
                }
                else{
                    sb.setCharAt(i,'\0');
                }
            }
        }
        while(!stack.isEmpty()){
            sb.setCharAt(stack.pop(),'\0');
        }

        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)!='\0'){
                str.append(s.charAt(i));
            }

        }
        return str.toString();

    }
            
        }
    
