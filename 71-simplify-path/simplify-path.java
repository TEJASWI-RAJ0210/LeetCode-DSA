class Solution {
    public String simplifyPath(String path) {
        Deque<String> stack = new ArrayDeque<>();
        String[] parts = path.split("/");

        for(String part: parts){
            if(part.isEmpty() || part.equals(".")){
                continue;
            }
            else if(part.equals("..")){
                if(!stack.isEmpty()) stack.pop();
            }
            else{
                stack.push(part);
            }
        }

        List<String> dirs = new ArrayList<>(stack);
        Collections.reverse(dirs);
        return "/" + String.join("/", dirs);
    }
}