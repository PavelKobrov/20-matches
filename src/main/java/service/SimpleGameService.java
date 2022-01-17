package service;

import entity.Game;

import java.util.Scanner;

public class SimpleGameService implements GameService {

    @Override
    public void playersTurn(Game game) {
        if (game.isPlayersTurn()) {
            PrintService printService = new SimplePrintService();
            Scanner scn = new Scanner(System.in);
            int cntMatchesTurn = scn.nextInt();
            if ((cntMatchesTurn < 1) || (cntMatchesTurn > 3)) {
                System.out.println("Некорректное количество спичек!");
                printService.print(game);
                playersTurn(game);
            } else {
                game.setCntMatchesTurn(cntMatchesTurn);
                game.setCntMatchesRemains(game.getCntMatchesRemains() - cntMatchesTurn);
                game.setPlayersTurn(false);
            }
        }
    }

    @Override
    public void computersTurn(Game game) {

        if (game.getCntMatchesRemains() == 20) {
            game.setCntMatchesTurn(3);
        }
        game.setCntMatchesRemains(game.getCntMatchesRemains() - game.getCntMatchesTurn());
        game.setPlayersTurn(true);
    }


}
