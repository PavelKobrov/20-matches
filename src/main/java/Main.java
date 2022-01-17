import entity.Game;
import service.GameService;
import service.PrintService;
import service.SimpleGameService;
import service.SimplePrintService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        GameService gameService = new SimpleGameService();
        PrintService printService = new SimplePrintService();
        Game game = new Game(1, 20, false);

        while (game.getCntMatchesRemains() > 1) {
            printService.print(game);
            gameService.computersTurn(game);
            printService.print(game);
            gameService.playersTurn(game);
        }
    }
}
