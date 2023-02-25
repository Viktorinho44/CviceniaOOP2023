package org.example.MinesweeperGame;

public class OneSpot {
    boolean hasMine;
    private final char spotView;
    boolean visible = false;
    OneSpot(boolean setMine){
        this.hasMine = setMine;
        if(setMine){
            this.spotView = '*';
        }
        else{
            this.spotView = '@';
        }
    }

    public int stepOnSpot(Player player){
        if(hasMine == true){
            System.out.println("GAME OVER");
            return 0;
        }
        return 1;
        }
    public boolean getMineValue(){
        return this.hasMine;
    }

    public void switchVisibility(boolean value){
        this.visible = value;
    }

    public char getSpotView(){
        return this.spotView;
    }

    public boolean getVisibility(){
        return this.visible;
    }


}

