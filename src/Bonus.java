import java.util.HashSet;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Bonus {

    public static void main(String[] args) {

        HashSet<Integer> secretnumber = randomnumbergenerator();
        String stringnumber = setToStringConverter(secretnumber);
        System.out.println(stringnumber);
        feedback(/*vul hier het juiste argument in*/);

    }

    public static HashSet<Integer> randomnumbergenerator(){
        Random random = new Random();
        HashSet<Integer> hashSet = new HashSet<>();
        int i = 0;
        while(i < 4){
            hashSet.add(random.nextInt(10));
            i++;
        }return hashSet;
    }

    public static String setToStringConverter(HashSet<Integer> secretnumber){
        StringBuilder setBecameString = new StringBuilder();
        for (Integer number : secretnumber) {
            setBecameString.append(number);
        }
        return setBecameString.toString().trim();
        /*
        Stappenplan:
        - Maak als eerst een String variabele met als waarde een lege String. (of gebruik een StringBuilder)
        - Schrijf vervolgens een for-loop om de items in de hashset een voor een aan de String variabele toe te voegen.
        - Return de (gevulde) String variabele
         */
    }



    public static void/*moet dit "void" zijn of wat anders?*/ feedback(String stringnumber) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder feedback = new StringBuilder();
        System.out.println("+ = juiste nummer op de juiste plek, O = juiste nummer verkeerde plek, X = verkeerde nummer");
        System.out.println("Doe een gok, Let op vul 4 getallen in.");
        String guess = scanner.nextLine();
        if (Objects.equals(guess, stringnumber)) {
            System.out.println("gefeliciteerd je hebt het goed");
        } else {
            for (int i = 0; i < 4; i++) {
                if (guess.substring(i, i + 1).equals(stringnumber.substring(i, i + 1))) {
                    feedback.append("+");
                } else if (stringnumber.contains(guess.substring(i, i + 1))) {
                    feedback.append("0");
                } else {
                    feedback.append("X");
                }
            }
        }
        System.out.println(feedback.toString());
    }
}
