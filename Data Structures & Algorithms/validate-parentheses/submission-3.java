class Solution {
    public boolean isValid(String s) {
     
       Map<Character, Character> bracketMap = new HashMap<>();
       bracketMap.put(')','(');
       bracketMap.put(']','[');
       bracketMap.put('}','{');

       Stack<Character> bracketList = new Stack<>();
       boolean flag = false;

       for (int i=0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                bracketList.push(s.charAt(i));
            } else if ((s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']') &&
            (!bracketList.isEmpty() && (bracketList.peek() == bracketMap.get(s.charAt(i))))) {
                bracketList.pop();
            } else {
                return false;
            }
       }

       if (bracketList.isEmpty()) {
            flag = true;
       }

       return flag;
    }
}