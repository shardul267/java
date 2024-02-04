public class Anagrams {
    public static void main(String[]args){
        String a= "cat";
        String b="act";

        boolean Isanagram=false;
        for(int i=0;i<a.length();i++){
            char c=a.charAt(i);
            for(int j=0;j<b.length();j++){
                if(b.charAt(j)==c){
                    Isanagram=true;
                    break;
                }

            }
            if(!Isanagram){
                break;
            }

        }
        if(Isanagram){
            System.out.println("It is anagram");
        }
        else{
            System.out.println("Not anagram");
        }
    }
}
