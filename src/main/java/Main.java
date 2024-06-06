import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Player> players = new ArrayList<>();

        while(true){
            System.out.print("Want to play a cool game?! ");
            String prompt = sc.next();

            //get all players
            if(prompt.equals("yes") || prompt.equals("Y") || prompt.equals("Yes")){
                String morePlayers = "yes";
                int i = 0;

                while(morePlayers.equals("yes") || morePlayers.equals("Y") || morePlayers.equals("Yes")){
                    System.out.print("\n Player " + (i + 1) + "'s name: ");
                    Player player = new Player(sc.next());
                    players.add(player);
                    i++;
                    System.out.print("\n Another player? ");
                    morePlayers = sc.next();
                }
            }


            String gameAgain = "yes";
            while(gameAgain.equals("yes") || gameAgain.equals("Y") || gameAgain.equals("Yes")){
                Game game = new Game(players);
                game.playGame();
                System.out.print("\n Another game? ");
                gameAgain = sc.next();
            }

        }

    }

}