package com.epam.rd.autotasks;

class Spiral {
    static int[][] spiral(int rows, int columns) {
        int [][]spir = new int[rows][columns];
        int value = 1;
        int minCol = 0;
        int maxCol = columns-1;
        int minRow = 0;
        int maxRow = rows-1;
        outer:while (value <= rows*columns)
        {
            for (int i = minCol; i <= maxCol; i++)
            {
                if (value > rows*columns){
                    break outer;
                }
                spir[minRow][i] = value;
                value++;
            }

            for (int i = minRow+1; i <= maxRow; i++)
            {
                if (value > rows*columns){
                    break outer;
                }
                spir[i][maxCol] = value;
                value++;
            }

            for (int i = maxCol-1; i >= minCol; i--)
            {
                if (value > rows*columns){
                    break outer;
                }
                spir[maxRow][i] = value;
                value++;
            }

            for (int i = maxRow-1; i >= minRow+1; i--)
            {
                if (value > rows*columns){
                    break outer;
                }
                spir[i][minCol] = value;
                value++;
            }
            minCol++;
            minRow++;
            maxCol--;
            maxRow--;
        }
        return spir;
    }
}
