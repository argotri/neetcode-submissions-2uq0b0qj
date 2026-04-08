class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s = s.toLowerCase();
        for(int i = 0 ; i < s.length() ; i++){
            char c = s.charAt(s.length() - i - 1);
            System.out.println(s.charAt(i) + " " + c);
            if(s.charAt(i)!= c){
                return false;
            }
        }
        return true;
    }
}
