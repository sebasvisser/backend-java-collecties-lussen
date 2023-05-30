import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Integer[] numeric = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        String[] alphabetic = {"nul", "een", "twee", "drie", "vier", "vijf", "zes", "zeven", "acht", "negen"};
        boolean play = true;
        Scanner scanner = new Scanner(System.in);
        Translator translator = new Translator(alphabetic, numeric);

        while(play){
            System.out.println("Type 'x' om te stoppen \n Type 'v' om te vertalen");
            String input = scanner.nextLine();
            if(input.equals("x") ){
                play = false;
                System.out.println("Bedankt en tot ziens.");
                break;
            }else if(){

            }
        }


//        Maak in de body van de while-loop een if/else if/else statement.
//        1. __if__: Als de `input` "x" is, dan zet je `play` naar false.
//        2. __else if__: Als de `input` "v" is, dan print je eerst "Type een cijfer in van 0 t/m 9",
//                vervolgens sla je het resultaat van `scanner.nextInt()` op in een variabele `int number`,
//        voeg nog een `scanner.nextLine();` toe op de volgende regel (scanner.nextInt doet dit namelijk niet
//                van zichzelf)
//        en als laatste check je met een if-statement of
//        1. __if__: `number` kleiner is dan 10, dan sla je de waarde van `translator.translate(number)` op in `String result` en print je
//           `"De vertaling van " + number + " is " + result`.
//        2. __else__: anders dan print je `ongeldig`
//        4. __else__: Als de `input` dus iets anders dan "x" of "v" is, dan print je `ongeldig`

    }
}

class Translator {
// Maak in de Translator class een `HashMap<Integer,String>` variabele met de naam `numericAlpha`.
    private HashMap<String, Integer> numericAlpha = new HashMap<>();
    public Translator(String[] alphabetic, Integer[] numeric) {
        numericAlpha = new HashMap<>();
        for (int i = 0; i < numeric.length; i++) {
            numericAlpha.put(alphabetic[i], numeric[i]);
        }
    }
    public String translate(Integer number) {
        for (String key : numericAlpha.keySet()) {
            if (numericAlpha.get(key).equals(number)) {
                return key;
            }
        }
        return "Number not found";
    }

}