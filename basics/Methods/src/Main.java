public class Main {
    public static void main(String[] args) {
        HouseBlueprint.start();
    }

    private static class HouseBlueprint {
        private static House house;

        private static void start() {
            createHouse();
        }

        private static void createHouse() {
            if (house == null) {
                house = new House(5, 6, 2, "Mariuccia");
                System.out.println(house);
            }
        }

        private static class House {
            float width;
            float width2;
            float height;
            float volume;
            String ownerName;

            public House(float width, float width2, float height, String ownerName) {
                this.width = width;
                this.width2 = width2;
                this.height = height;
                this.ownerName = ownerName;
                this.volume = calculateVolume();  // Update the volume field
            }

            public float calculateVolume() {
                return this.width * this.width2 * this.height;
            }

            public void setVolume(float volume) {
                this.volume = volume;
            }

            public float getVolume() {
                return this.volume;
            }

            public String toString() {
                return "This building is: \n" + width + "\n" +
                        width2 + " \n" + height + "\nVolume of " + volume + ". \nThe house owner is " + ownerName;
            }
        }
    }
}
