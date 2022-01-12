package exercises;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayExercise {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> randomNumbers = new ArrayList<>(
                Arrays.asList(
                        1,
                        2,
                        3,
                        4,
                        5,
                        6,
                        7,
                        8,
                        9,
                        10
                )
        );
        System.out.println(sumEven(randomNumbers));

        ArrayList<String> usualSuspect = new ArrayList<>(
                Arrays.asList("Spider-ham",
                "golf",
                "batman",
                "Loki",
                "Joker",
                "Hulk",
                "Thor")
        );
        System.out.println("What is the length of word you desire? ");
        int wordLength = input.nextInt();
        designatedWord(usualSuspect,wordLength);
    }

   public static int sumEven(ArrayList<Integer>){
      int total = 0;
        for(int i : arr){
            if( i % 2 == 0){
                total += i;
            }

        }
        return total;
    }
    public static void designatedWord(ArrayList<String> wordCollection, int length){
        for(String word: wordCollection){
            if(word.length() == length){
                System.out.println(word);
            }
        }
    }
}

