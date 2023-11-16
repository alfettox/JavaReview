import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MiniZork miniZork = new MiniZork();
        miniZork.run(scanner);
    }

    public enum CharacterType {
        KNIGHT,
        WARLORD,
        GNOME
    }

    private static class Player {
        int life = 100;
        String name = "Unknown";
        CharacterType characterType;

        public Player(int life, String name, CharacterType characterType) {
            this.life = life;
            this.name = name;
            this.characterType = characterType;
        }

        public void loseLife(int i) {
            checkLife(i);
            this.life -= i;
        }

        public void checkLife(int i) {
            if ((this.life - i) <= 0) {
                System.out.println("YOU ARE DEAD");
                System.exit(0);
            }
        }
    }

    public static class MiniZork {
        public void run(Scanner scanner) {
            System.out.println("Please enter your name:");
            String name = scanner.nextLine();

            Player player = null;

            while (player == null) {
                System.out.println("Character type: ( KNIGHT / WARLORD / GNOME)");
                String characterTypeInput = scanner.nextLine();

                switch (characterTypeInput) {
                    case "KNIGHT":
                        player = new Player(100, name, CharacterType.KNIGHT);
                        break;
                    case "WARLORD":
                        player = new Player(100, name, CharacterType.WARLORD);
                        break;
                    case "GNOME":
                        player = new Player(100, name, CharacterType.GNOME);
                        break;
                    default:
                        System.out.println("Invalid choice, please retry");
                        break;
                }
            }

            System.out.println("You are standing in an open field west of a white house,");
            System.out.println("With a boarded front door.");
            System.out.println("There is a small mailbox here.");
            System.out.print("Go to the house, or open the mailbox? ");

            String action = scanner.nextLine();

            if (action.equals("open the mailbox")) {
                System.out.println("You open the mailbox.");
                System.out.println("It's really dark in there.");
                System.out.print("Look inside or stick your hand in? ");
                action = scanner.nextLine();

                if (action.equals("look inside")) {
                    System.out.println("You got attacked by a spider. You lose 30 life");
                    player.checkLife(30);
                    player.loseLife(30);
                    System.out.println("You peer inside the mailbox.");
                    System.out.println("It's really very dark. So ... so very dark.");
                    System.out.print("Run away or keep looking? ");
                    action = scanner.nextLine();

                    if (action.equals("keep looking")) {
                        System.out.println("Turns out, hanging out around dark places isn't a good idea.");
                        System.out.println("You've been eaten by a grue.");
                    } else if (action.equals("run away")) {
                        System.out.println("You run away screaming across the fields - looking very foolish.");
                        System.out.println("But you alive. Possibly a wise choice.");
                    }
                } else if (action.equals("stick your hand in")) {
                    System.out.println("You got killed by a monster");
                    player.loseLife(999);

                }
            } else if (action.equals("go to the house")) {
                System.out.println("You leaved safely!");
            }
            System.out.printf("You still have %d life%n", player.life);
        }
    }
}
