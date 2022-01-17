package service;

import entity.Game;

public class SimplePrintService implements PrintService {

    @Override
    public void print(Game game) {
        if (game.getCntMatchesRemains()==1) {
            System.out.println("Для игрока осталась последняя спичка. Игрок проиграл!");
            game.setPlayersTurn(false);
                    }

        else if (game.isPlayersTurn()) {
            System.out.println("На столе осталось " + game.getCntMatchesRemains()+ " спичек.\n" +
                    "- Ход игрока. Введите количество спичек:" );
        }
        else {
            game.setCntMatchesTurn(4-game.getCntMatchesTurn());
            System.out.println("На столе осталось " + game.getCntMatchesRemains()+ " спичек.\n" +
                    "- Количество выбранных компьютером спичек = "  +game.getCntMatchesTurn());
        }
    }
}
