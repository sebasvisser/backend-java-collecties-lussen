import java.util.HashSet;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Bonus {

    public static void main(String[] args) {

        HashSet<Integer> secretnumber = randomnumbergenerator();
        String stringnumber = setToStringConverter(secretnumber);
        System.out.println(stringnumber);
        feedback(stringnumber);

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
            setBecameString.append(number).append(" ");
        }
        return setBecameString.toString().trim();
    }

    public static void feedback(String stringnumber) {
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

/*
Waarom is HashSet niet handig:

je kunt meteen 4 random getallen in een string zetten,
hele HashSet stap kun je overslaan.
*/