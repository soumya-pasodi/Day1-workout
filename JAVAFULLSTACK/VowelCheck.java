 public class VowelCheck {
    public static void main(String[] args) {

        char ch = 'A';   // Directly assigning character

        if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||
            ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') {

            System.out.println(ch + " is a Vowel");
        } 
        else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {

            System.out.println(ch + " is a Consonant");
        } 
        else {
            System.out.println("Invalid input");
        }
    }
}