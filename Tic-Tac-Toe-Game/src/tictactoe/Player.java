package tictactoe;

import tictactoe.Strategies.PlayerStrategy;

public class Player {
    String name;
    Symbol symbol;
    PlayerStrategy strategy;

    public Player(String name, Symbol symbol, PlayerStrategy strategy) {
        this.name = name;
        this.symbol = symbol;
        this.strategy = strategy;
    }

    public String getName() {
        return name;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public PlayerStrategy getStrategy() {
        return strategy;
    }
}
