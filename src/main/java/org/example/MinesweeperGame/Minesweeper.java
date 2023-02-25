package org.example.MinesweeperGame;

public class Minesweeper {

    private final Grid grid = new Grid();
    public Minesweeper(){
        this.play();
    }

    public void play(){
        while(!grid.getGameState()){
            grid.showGrid();
            grid.move();
        }
        grid.showGrid();
    }
}
