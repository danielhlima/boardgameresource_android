package br.com.boardgameresource.domain.entities;

public class Match {

    private Game game;

    public Match(Game game) {
        this.game = game;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }
}
