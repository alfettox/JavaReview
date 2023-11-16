public class TestingUserIO {
    public static void main(String[] args) {
        UserIO userIO = new UserIOImpl();
        userIO.print("Hello");
        userIO.print("Entered string: " + userIO.readString("Enter a string"));
        userIO.print("Entered int: " + userIO.readInt("Enter an int"));
        userIO.print("Entered int between 2 and 10: " + userIO.readInt("Enter an int between 2 and 10", 2, 10));
        userIO.print("Entered double: " + userIO.readDouble("Enter a double"));
        userIO.print("Entered double between 12.15 and 561: " + userIO.readDouble("Enter a double between 12.15 and 561", 12.15, 561));
        userIO.print("Entered float: " + userIO.readFloat("Enter a float"));
        userIO.print("Entered float between -12.2 and 15: " + userIO.readFloat("Enter a float between -12.2 and 15", -12.2f, 15));
        userIO.print("Entered long: " + userIO.readLong("Enter a long"));
        userIO.print("Entered long between 15 and 122: " + userIO.readLong("Enter a long between 15 and 122", 15, 122));
    }
}