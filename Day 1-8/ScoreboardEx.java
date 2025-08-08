package wiprodemo;
import java.util.*;
class Player
{
	String name;
	Integer score;
	Player(String name, Integer score)
	{
		this.name=name;
		this.score=score;
	}
}
public class ScoreboardEx {
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	HashMap<String, Player> scoreboard = new HashMap<>();
	int choice;
	do
	{
		System.out.println("\nScoreboard Menu");
        System.out.println("1. Add Player");
        System.out.println("2. View Scoreboard");
        System.out.println("3. Update Score");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
		choice = sc.nextInt();
		sc.nextLine();
		switch(choice)
		{
		case 1:
            System.out.print("Enter player name: ");
            String name = sc.nextLine();

            if (scoreboard.containsKey(name)) {
                System.out.println("Player already exists.");
                break;
            }

            System.out.print("Enter score: ");
            Integer score = Integer.parseInt(sc.nextLine());
            Player player = new Player(name, score);
            scoreboard.put(name, player);
            System.out.println("Player added.");
            break;

        case 2:
            System.out.println("\n Scoreboard ");
            if (scoreboard.isEmpty()) {
                System.out.println("No players yet.");
            } else {
                for (String key : scoreboard.keySet()) {
                    Player p = scoreboard.get(key);
                    System.out.println("Player: " + p.name + " Score: " + p.score);
                }
            }
            break;

        case 3:
            System.out.print("Enter player name to update score: ");
            String updateName = sc.nextLine();

            if (scoreboard.containsKey(updateName)) {
                System.out.print("Enter new score: ");
                Integer newScore = Integer.parseInt(sc.nextLine());
                scoreboard.get(updateName).score = newScore;
                System.out.println("Score updated.");
            } else {
                System.out.println("Player not found.");
            }
            break;

        case 4:
            break;

        default:
            System.out.println("Invalid choice! Please try again.");
    }
} while (choice != 4);
System.out.println("out of the scoreboard menu");
sc.close();
}
}
