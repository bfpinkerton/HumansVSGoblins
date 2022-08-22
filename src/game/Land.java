package game;

import java.util.Arrays;

public class Land {

    void startGame(){
        int x = 0;
        int[][] grid = createGrid();
        while(x == 0){
            printGrid(grid);
            x = 1;
        }
    }
    public int[][] createGrid(){
        int[][] grid = new int[5][5];
        return grid;
    }

    void printGrid(int[][] grid) {
        for(int[] x: grid){
            for(int y: x){
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }
}
