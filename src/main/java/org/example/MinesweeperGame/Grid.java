package org.example.MinesweeperGame;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Grid {
    private boolean gameOver = false;
    private final ArrayList<OneSpot> grid = new ArrayList<>();
    private final int size = 10;
    Scanner scanner = new Scanner(System.in);

    Grid(){
        for(int i = 0; i<(100); i++){
            Random random = new Random();
            boolean randomBoolean = random.nextBoolean();
            grid.add(new OneSpot(randomBoolean));
        }


    }


    public void showGrid(){
        System.out.print("  ");
        for(int i = 1; i <=  size ; i++) {
            System.out.print(i + " ");
        }
        for(int i = 0; i < 100 ; i++) {
            if(i % size == 0){
                System.out.println();
                System.out.print( (i/size) + 1);

            }
            if(grid.get(i).getVisibility()){
                System.out.print("\u001B[41m"+" " + grid.get(i).getSpotView() + "\u001B[0m");
            }
            else{
                System.out.print(" O");
            }
            }

    }

    public void move(){
        System.out.print("Set the x value: ");
        int numberX = scanner.nextInt() - 1;
        System.out.print(" Set the y value: ");
        int numberY = (scanner.nextInt()) - 1;
        if(numberY > 1) {
            numberY = numberY * 10;
        }
        int positionInArray = numberY + numberX;

       // setPartsGridVisible(numberX,numberY);
        if(this.checkGrid(numberX, numberY)){
            this.gameOver = true;
            this.setEverythingVisible();
        }
            this.grid.get(positionInArray).switchVisibility(true);


    }

    public boolean checkGrid(int x, int y){
        int positionInArray = y + x;
        return grid.get(positionInArray).getMineValue();
    }

    public void setEverythingVisible(){
        for(int i = 0; i<100 ; i++){
            grid.get(i).switchVisibility(true);
        }
    }

    public boolean getGameState(){
        return this.gameOver;
    }
}
