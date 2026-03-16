

@FunctionalInterface
interface Palindrome{
    boolean isPalindrome(String s1);

}
public class Exersice2 {
    public static void main(String[] args) {
        Palindrome p=(word)->{
            // int start=0;
            // int end=word.length()-1;

            // while(start<=end){
            //     if(word.charAt(start)!=word.charAt(end)){
            //         return false;
            //     }
            //     start++;
            //     end--;
            // }
            // return true;

           return new StringBuilder(word).reverse().toString().equals(word);
           };
        if(p.isPalindrome("Aca")){
        System.out.println("Is a palindrome");
        }else{
        System.out.println("Is a palindrome");
        }
    }
}