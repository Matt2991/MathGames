import java.security.SecureRandom;
import java.util.List;
import java.util.Scanner;

class Game {

    List<Player> players;

    public Game(List<Player> players) {
        this.players = players;
    }

    public void playGame(){
        for(Player p : players){

        }
        int[] n1n2 = generateRandomNumbers();
        generateQuestion(n1n2[0], n1n2[1]);

    }
    public int[] generateRandomNumbers() {
        SecureRandom rand = new SecureRandom();
        int [] n1n2 = new int[2];
        n1n2[0] = rand.nextInt(9) + 1;
        n1n2[1] = rand.nextInt(9) + 1;

        return n1n2;
    }

    public void generateQuestion(int n1, int n2) {

        Scanner sc = new Scanner(System.in);

        System.out.print("What is " + n1 + " x " + n2 + "? ");

        int typedAnswer = sc.nextInt();

        if (typedAnswer == (n1 * n2)) {
            System.out.println("Correct Answer");
            //players.get()
        } else {
            System.out.println("Wrong Answer");
            generateQuestion(n1, n2);
        }

    }
}