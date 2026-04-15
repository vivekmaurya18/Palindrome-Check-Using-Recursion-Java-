public class PalindromeCheckUsingRecusion {
    static boolean ispalindrome(String str, int start, int end){
        if(start>=end){
            return true;
        }
        return (str.charAt(start) == str.charAt(start) && ispalindrome(str,start+1,end-1));
    }
    public static void main(String[] args) {
        String str="ABBBA";
        boolean result= ispalindrome(str,0,1);
        System.out.println(result);
    }
}
