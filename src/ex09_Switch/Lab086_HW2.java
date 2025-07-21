package ex09_Switch;

public class Lab086_HW2 {
    public static void main(String[] args) {

        //        //✅ Count vowels and consonants in a String.
        //        -pramod, → vowels - 2, consonants - 4

        String s="SUPERCALIFRAGILISTICESPIALIDOCOIUS";
        int vowelCount=0;
        int consonantCount=0;

        for(int c=0;c<s.length();c++)
        {
            char ch=s.charAt(c);

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
        }
        System.out.println("Number of Vowels is " +vowelCount);
        System.out.println("Number of Consonants is " +consonantCount);



    }
}