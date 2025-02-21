import java.util.Scanner;
public class Encryption {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch;

            System.out.println("enter a word to encrypt:");
            String word = sc.nextLine();
            String result = Encrypt(word);
            System.out.println(result);

    }

    public static String Encrypt(String wordToEncrypt){
        String result="";
        for (int i = 0; i < wordToEncrypt.length(); i++) {
            char ch=wordToEncrypt.charAt(i);
            if(Character.isLetter(ch)){
                char shifted=(char)(ch+3);
                if (Character.isUpperCase(ch)&&shifted>'Z'||Character.isLowerCase(ch)&&shifted>'z'){
                    shifted-=26;
                }
                result+=shifted;
            }else{
                result+=ch;
            }
        }
        return result;
    }
}
