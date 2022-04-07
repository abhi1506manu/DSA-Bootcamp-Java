package com.company.Recursion.Backtracking;

public class N_Queen {
    public static void main(String[] args) {
        int n=4;
        boolean[][]bord = new boolean[n][n];
      NQueen(bord,0);

    }

    static int NQueen(boolean[][]bord,int row)
    {
        if(row == bord.length)
        {
            show(bord);
            System.out.println();
            return 1;
        }
        int count=0;
        //placing the queen and chacking  for every row and col
        for (int col = 0; col < bord.length; col++) {
            if (isSafe(bord, row, col)) {
                bord[row][col] = true;
                count = count + NQueen(bord,row+1);
                bord[row][col] = false;
            }
        }
        return count;
    }

    static boolean isSafe(boolean[][]bord,int row, int col)
    {
        //check vertical
        for (int i = 0; i < row; i++) {
            if(bord[i][col])
            {
                return false;
            }

        }
        //check diagonal
        int maxLeft=Math.min(row,col);
        for (int i = 1; i <=maxLeft; i++) {
            if(bord[row-i][col-i])
            {
                return false;
            }
        }

        //check diagonal right
        int maxRight=Math.min(row,bord.length-col-1);
        for (int i = 1; i <= maxRight; i++) {
            if(bord[row-i][col+i])
            {
                return false;
            }
        }
        return true;
    }

    static void show(boolean[][]bord)
    {
        for(boolean[]row:bord)
        {
            for(boolean element:row)
            {
                if(element)
                {
                    System.out.print("Q");
                }
                else{
                    System.out.print("X");
                }
            }
            System.out.println();
        }
    }
}
