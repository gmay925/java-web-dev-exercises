package exercises;
import java.util.Arrays;

public class PracticeArray {
    public static void main(String[] args) {
//        int[] randomNumbers = new int[]{1, 1, 2, 3, 5, 8};
//        for (int i : randomNumbers){
//            if(i % 2 == 1){
//                System.out.println(i);
//        }
//    }
    String greenEggs = "I would not, could not, in a box. I would not, could not with a fox. " +
        "I will not eat them in a house. I will not eat them with a mouse.";
    String[] splitText = greenEggs.split(" ");
    System.out.println(Arrays.toString(splitText));

        String[] splitTextSentences = greenEggs.split("\\. ");
        System.out.println(Arrays.toString(splitTextSentences));
    }
}

