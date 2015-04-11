package nyc.c4q;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Unit0Tests {

    /*
     * Name of the method implies what the method should do.
     * Some of these methods require that the method return signature change.
     * For example, `returnPrimitiveBooleanTrue()` should return `boolean`, not `Object`.
     */
    public static void main (String args[]) {
      // Use main to test your methods
      printHelloWorld();
    }

    public static void printHelloWorld() {
      System.out.println("Hello World");
    }

    public static boolean returnPrimitiveBooleanTrue() {
        boolean booleanName = true;
        return booleanName;
    }

    public static int returnPrimitiveInt1729() {
        int i = 1729;
        return i;
    }

    public static double returnPrimitiveDoubleThreePointOneFour() {
        double ThreePointOneFour = 3.14;
        return ThreePointOneFour;
    }

    public static char returnPrimitiveCharZ() {
        char characterZ = 'Z';
        return characterZ;
    }

    public static void printSumOf1Upto10UsingForLoop() {
        int sum=0;
        for (int i = 1; i<10;i++){
             sum+=i;
        }
        System.out.println(sum);
    }

    public static void printSumOf1Upto10000UsingForLoop() {
        int sum=0;
        for (int i = 1; i<10000;i++){
            sum+=i;
        }
        System.out.println(sum);
    }

    public static boolean isOdd(int n) {
        if (n%2==0){
            return false;
        }else{
            return true;
        }
    }

    public static boolean isMultipleOfThree(int n) {
        if (n%3==0){
            return true;
        }else{
            return false;
        }
    }

    public static boolean isOddAndIsMultipleOfThree(int n) {
        if(n%3==0 && n%2!=0){
            return true;
        }else{
            return false;
        }
    }

    public static String repeatStringXTimes(String input, int times) {
        // Given string "input" and a positive integer "times",
        // return a string that is equal to the input string repeated X times.
        // If "times" is 0 negative, return a blank string.
        // For example, repeatStringXTimes("potato", 5) should return "potatopotatopotatopotatopotato".
        String repeat = "";
        for (int i=0;i<times;i++){
            repeat = repeat+input;
        }
        return repeat;
    }

    public static String returnStringUntilQ(String input) {
        // Given string "input", return a string that stops at the first occurrence of the character 'q'.
        // For example, given the string "ubiquitous", return "ubi".
        // If the string does not contain a q, then return the empty string "".

        if(input.contains("q")){
            int positionOfQ = input.indexOf('q');

            return input.substring(0,positionOfQ);
        }else{
            return "";
        }
    }

        public static Person declareAndReturnPersonNamedAda() {
            Person ada = new Person("Ada");
            return ada;
        }

    public static Person declareAndReturnPersonNamedAlanTuringFromLondon() {
        Person alanTuring = new Person();
        alanTuring.setName("Alan Turing");
        alanTuring.setCity("London");
        return alanTuring;

    }

    public static boolean isFromLondon(Person person) {
        return person.getCity() == "London";
    }

    public static ArrayList<Place> declareAndReturnArrayListOfThreePlaces() {
        Place cityOne = new Place();
        cityOne.setName("New York");
        Place cityTwo = new Place();
        cityTwo.setName("London");
        Place cityThree = new Place();
        cityThree.setName("Tokyo");

        ArrayList<Place> cities = new ArrayList<Place>();
        cities.add(cityOne);
        cities.add(cityTwo);
        cities.add(cityThree);

        return cities;
    }

    public static HashMap<String, Person> declareAndReturnHashmapOfAlanTuringAndGraceHopper() {
      // The HashMap should have key-value pairs of:
      // - key: `Alan Turing`, value: instance of Person with name `Alan Turing`
      // - key: `Grace Hopper`, value: instance of Person with name `Grace Hopper`

        HashMap <String, Person> twoPeople = new HashMap<String, Person>();
        twoPeople.put("Alan Turing", new Person("Alan Turing", "London"));
        twoPeople.put("Grace Hopper", new Person("Grace Hopper", "Arlington"));

      return twoPeople;
    }

    public static void changeTuringsCityToPrinceton(HashMap<String, Person> people) {
        people = declareAndReturnHashmapOfAlanTuringAndGraceHopper();
        Person alanTuring = people.get("Alan Turing");
        alanTuring.setCity("Princeton");
        people.put("Alan Turing", alanTuring);
    }

    // Bonus Problems
    public static void bonusPrintOutSumOfFirstTenFibonacciNumbers() {

    }

    public static void bonusPrintOutSumOfFirstFortyFibonacciNumbers() {

    }
}
