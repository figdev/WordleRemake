import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
//        initialize list
        ArrayList<String> wordleList = new ArrayList<>();
        wordleList.add("audio");
        wordleList.add("tyler");
        wordleList.add("words");
        wordleList.add("panda");
        wordleList.add("great");
        wordleList.add("chaos");

//        get random list
        int size = wordleList.size();
        double rndSize = Math.random() * size;
        int value = (int)rndSize;

//        print list
//                        wordleList.get(value) --> the word!
        initializerPrompt();
        System.out.println(wordleList.get(value));

        Scanner input = new Scanner(System.in);
        int counter = 0;    
        while (6 > counter) {
            String number = input.next();
                if (!number.equals(wordleList.get(value))) {
                    System.out.println("false!");
                } else {
                    System.out.println("true!");
                    break;
                }
                counter++;
            }
        System.out.println("loop ended!");

    }

    private static void initializerPrompt() {
            System.out.println("Hello, welcome to jordle (java wordle)!");
    }

}
