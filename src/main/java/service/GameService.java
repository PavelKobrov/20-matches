package service;

import entity.Game;

public interface GameService {
    /**
     * Методы делают ход
     */
    void playersTurn (Game game);
    void computersTurn (Game game);



}
