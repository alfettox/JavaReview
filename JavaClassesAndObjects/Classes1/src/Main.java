public class Main {
    public static void main(String[] args) {
    }
}

class Dog{
    private String name;
    private double weight;

    public String getName(){
        return this.name;
    }

    public void setName(){
        this.name = name;
    }

    public void setWeight(){
        this.weight = weight;
    }

    public double getWeight(){
        return this.weight;
    }

    public void bark(){
        System.out.println("BAU BAU BAU");
    }

    public void sit(){
        System.out.println("SITTING...");
    }
}