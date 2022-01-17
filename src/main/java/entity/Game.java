package entity;

public class Game {
    private int cntMatchesTurn;
    private int cntMatchesRemains;
    private boolean playersTurn; // 1 - ходит игрок, 0 - компьютер;

    public Game() {
    }

    public Game(int cntMatchesTurn, boolean playersTurn) {
        this.cntMatchesTurn = cntMatchesTurn;
        this.playersTurn = playersTurn;
    }

    public Game(int cntMatchesTurn, int cntMatchesRemains, boolean playersTurn) {
        this.cntMatchesTurn = cntMatchesTurn;
        this.cntMatchesRemains = cntMatchesRemains;
        this.playersTurn = playersTurn;
    }

    public Game(int cntMatchesRemains) {
        this.cntMatchesRemains = cntMatchesRemains;
    }

    public int getCntMatchesTurn() {
        return cntMatchesTurn;
    }

    public void setCntMatchesTurn(int cntMatchesTurn) {
        this.cntMatchesTurn = cntMatchesTurn;
    }

    public int getCntMatchesRemains() {
        return cntMatchesRemains;
    }

    public void setCntMatchesRemains(int cntMatchesRemains) {
        this.cntMatchesRemains = cntMatchesRemains;
    }

    public boolean isPlayersTurn() {
        return playersTurn;
    }

    public void setPlayersTurn(boolean playersTurn) {
        this.playersTurn = playersTurn;
    }


}
