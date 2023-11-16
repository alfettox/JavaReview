import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String, Integer> populations = new HashMap<>();

        populations.put("Montréal", 5161456);
        populations.put("Laval", 54562);
        populations.put("Trois-Rivières", 1564);

        System.out.println(populations);

        System.out.println("UPDATING");
        populations.put("Montréal", 123213);
        populations.put("Trois-Rivières", 123);
        System.out.println(populations);

        Integer montréalPopulation = populations.get("Montréal");

        System.out.println("Montreal population is: " + montréalPopulation);

        for (String k : populations.keySet()) {
            Integer val = populations.get(k);
            if (val != null && val.equals(123213)) {
                System.out.println("FOUND! key: " + k + ", Value: " + val);
            }
        }

        populations.remove("Montréal");
        System.out.println(populations);

        for (String k : populations.keySet()) {
            System.out.print(k);
            System.out.print(" - ");
        }
        System.out.println();

        for (Integer y : populations.values()) {
            System.out.print(y);
            System.out.print(" - ");
        }
        System.out.println();
    }
}
