package ex12_DoWhile;

public class Lab116_HW1 {
    public static void main(String[] args) {

        //Count vowels and consonants in a String.
        // -pramod, → vowels - 2, consonants - 4

        String name="PRAMOD1";
        int vowelCount=0;
        int consonantCount=0;
        int index=0;


        while(index<name.length())
        {
            char ch=name.charAt(index);
            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
            {
                vowelCount++;
                System.out.println(ch+ " is a vowel");
            }
            else if (ch>='A'&& ch<='Z')
            {
                consonantCount++;
                System.out.println(ch+ " is a consonant");

            }
            else
            {
                System.out.println(ch+ " is not a vowel or consonant");
            }
            index++;

        }



    }

}
