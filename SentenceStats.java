/*/**
 * SentenceStats
 * @author Sai Avula
 * @since 7/5/2024
 */
import java.util.Scanner;
public class SentenceStats
{
    Scanner scan;
    int words;
    int[] lettercounter ;
    int biggest;
    String [] allwords;
    //constructor in order to initialize variables
    public SentenceStats()
    {
        lettercounter = new int[26];
        words = 0;
        biggest = 0;
    }
    //main where i run the whole program
    public static void main(String[]args)
    {
        SentenceStats ss = new SentenceStats();
        ss.run();
    }
    //method called my main so that I am not in a static environment
    public void run()
    {
        scan = new Scanner(System.in);
        System.out.println("Enter your sentence: ");
        String sentence = scan.nextLine();
        System.out.println();

        System.out.println("Length of sentence: " + sentence.length());
        for(int i = 0; i< sentence.length(); i++)
        {
            if(sentence.charAt(i) == ' ')
            {
                words++;
            }
        }
        System.out.println("Number of Words " + (words+1));
        for(int i = 0; i < sentence.length(); i++)
        {
            for(char n = 'a'; n <= 'z'; n++)
            {
                if(sentence.charAt(i) == n)
                {
                    int index = (int)(n)-97;
                    lettercounter[index]++;
                }
            }
            for(char n = 'A'; n <= 'Z'; n++)
            {
                if(sentence.charAt(i) == n)
                {
                    int index = (int)(n)-65;
                    lettercounter[index]++;
                }
            }
        }
        for(int i = 0; i < 26; i++)
        {
            if(lettercounter[i]>biggest)
            {
                biggest = lettercounter[i];
            }      
        }
        System.out.print("Most common letter: ");
        for(int i = 0; i < 26; i++)
        {
            if(lettercounter[i] == biggest)
            {
                System.out.print((char)(i+65) + " ");
            }      
        }
        System.out.println("~ " + biggest );
        allwords = new String[words+1];
        sentence = sentence + " ";
        seperateWords(sentence);
        
    }
    //method used to seperate words
    public void seperateWords(String sentence)
    {
        int index1 = 0;
        int length = sentence.length();
        for(int i = 0; i < length; i++)
        {
            if(sentence.length() > 1 &&sentence.charAt(i) == ' ' )
            {
                allwords[index1] = sentence.substring(0,i).trim();
                index1++;
                sentence = sentence.substring(i, sentence.length());
                i = 0;
                //System.out.println(sentence);
            }
        }
        for(int i = 0; i <= words; i++)
        {
            System.out.println(allwords[i]);
        }
        String wordsabove2 = "";
        for(int i = 0; i <= words; i++)
        {
            for(int n = 0; n <= words; n++)
            {
                if(i != n && allwords[i].equals(allwords[n]))
                {
                    wordsabove2 += allwords[n] + " ";
                }
            }
        }
        System.out.println("here: " + wordsabove2);
        big(allwords);
    }
    public void big(String[]allwords)
    {
        String temp;
        for(int i = 0; i < allwords.length; i++)
        {
            if() 
            {
                
            }
        }
    }
}