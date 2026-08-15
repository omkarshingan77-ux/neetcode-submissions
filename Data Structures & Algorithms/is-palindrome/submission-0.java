class Solution {
    public boolean isPalindrome(String s) {
      s=s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
      int a = s.length();
      int b = a-1;
      for (int i=0; i<a/2; i++ ){ 
        if(s.charAt(i)!= s.charAt(b)){
      return false;
        }
        b--;
      }
        return true;
    }
}
