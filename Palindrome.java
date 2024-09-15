public class Palindrome {
    public static void main(String[] args) {
        for (int i=0; i< args.length; i++) {
            String s = args[i];
            boolean res = isPalindrome(s);
            if (res==true){
                System.out.println("This is a palindrome: "+ s);
            }
            else {
                System.out.println("This isn't a palindrome: "+ s);
            }
        }
    }
    public static String reverseString(String s) {
        int l = s.length();
        String nS = "";
        for (int i=l-1; i>= 0; i--) {
            nS += s.charAt(i);
        }
        return nS;
    }
    public static boolean isPalindrome(String s){
        String nS = reverseString(s);
        if (s.equals(nS)) {
            return true;
        }
        else {
            return false;
        }
    }
}

