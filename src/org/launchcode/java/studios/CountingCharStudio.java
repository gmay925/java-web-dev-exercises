package org.launchcode.java.studios;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingCharStudio {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str =sc.nextLine();
        String hiddenFigures = "If the product of two terms is zero then common sense says at least one of the two terms has" +
                " to be zero to start with. So if you move all the terms over to one side, you can put the quadratics " +
                "into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done " +
                "that, it’s pretty straightforward from there.";
        Map<Character, Integer> charCount = new HashMap<>();
        for(int i = 0; i < hiddenFigures.length(); i++) {
            Character ch = hiddenFigures.charAt(i);
            if(charCount.containsKey(ch)) {
                charCount.put(ch, charCount.get(ch) + 1);
            } else {
                charCount.put(ch, 1);

            }
        }

        System.out.println(charCount);

    }
}

