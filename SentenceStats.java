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
    int[] lettercounter;
    int biggest;
    public SentenceStats()
    {
        lettercounter = new int[26];
        words = 0;
        biggest = 0;
    }
    public static void main(String[]args)
    {
        SentenceStats ss = new SentenceStats();
        ss.run();
    }
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
        
    }
}