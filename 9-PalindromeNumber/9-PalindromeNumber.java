// Last updated: 10/24/2025, 9:22:54 PM
class Solution {
    public boolean isPalindrome(int x) {

       String num = x + "";
       int max = num.length() - 1;

       for(int i = 1; i <= num.length(); i++){
            String a = num.substring(i-1, i);
            
            String b = num.substring(max, max + 1);

            System.out.println(a + "a");
            System.out.println(b + "b");

            if(!(a.equals(b))){
                return false;
            }

            max--;
       } 

       return true;
    }
}