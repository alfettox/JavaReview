import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String, String> stateCapitals = new HashMap<>();

        stateCapitals.put("Alabama", "Montgomery");
        stateCapitals.put("Alaska", "Juneau");
        stateCapitals.put("Arizona", "Phoenix");
        stateCapitals.put("Arkansas", "Little Rock");
        stateCapitals.put("California", "Sacramento");
        stateCapitals.put("Colorado", "Denver");
        stateCapitals.put("Connecticut", "Hartford");
        stateCapitals.put("Delaware", "Dover");
        stateCapitals.put("Florida", "Tallahassee");
        stateCapitals.put("Georgia", "Atlanta");


        System.out.println("All states: \n============");

        for(String s : stateCapitals.keySet()){
            System.out.println(s);
        }
        System.out.println();

        System.out.println("All capitals names: \n==================");
        for(String s : stateCapitals.keySet()){
            System.out.println(stateCapitals.get(s));
        }

        System.out.println();

        System.out.println("All state/capitals names: \n========================");
        for(String s :stateCapitals.keySet()){
            System.out.println(s + " - " + stateCapitals.get(s));
        }
    }
}