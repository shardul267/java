public class Palindrome{
    static int reverse (int X){
        int y=0;
        while(X>0){
            int digit =X%10;
            y=y*10 +digit;
            X=X/10;
        }
        return y;
    }
    public static void main(String[] args){
        int X=121;
        int dummy = X;
        int y=reverse(X);
        if (dummy == y) {
            System.out.println("palindrome");
        }
            else{
                System.out.println("Not Palindrome");
            }
        }
    }

