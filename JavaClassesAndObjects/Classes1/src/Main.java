import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Dog max = new Dog();
        max.setName("Max");
        max.setWeight(15);

        max.setRankingResults(6, 7, 9, 7, 5);

        System.out.println(max);
    }
}

class Dog {
    private String name;
    private double weight;
    private double[] rankingsArr = new double[10];

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return this.weight;
    }

    public void bark() {
        System.out.println("BAU BAU BAU");
    }

    public void sit() {
        System.out.println("SITTING...");
    }

    public double getAverageRanking() {
        double totalPoints = 0;
        int numResults = 0;
        for (int i = 0; i < rankingsArr.length; i++) {
            if (rankingsArr[i] > 0) {
                numResults++;
                totalPoints += rankingsArr[i];
            }
        }
        return numResults > 0 ? totalPoints / numResults : 0;
    }

    public double[] getResultsArr() {
        return this.rankingsArr;
    }

    public void setRankingResults(int... rankings) {
        for (int i = 0; i < rankings.length && i < rankingsArr.length; i++) {
            rankingsArr[i] = rankings[i];
        }
    }

    public String toString() {
        return "The dog name is: " + getName() + ". The dog weight is: " + getWeight() +
                ".\nThe results are " + Arrays.toString(getResultsArr()) + "\nThe average ranking is: " +
                getAverageRanking();
    }
}
