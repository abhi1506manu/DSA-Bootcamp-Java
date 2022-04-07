package com.company.Recursion.Backtracking;

public class Nknights {
    public static void main(String[] args) {
        int n = 4;
        boolean[][]bord = new boolean[n][n];
        Knight(bord,0,0,4);

    }
    static void Knight(boolean[][]bord,int row, int col, int knights)
    {
        if(knights == 0)
        {
           display(bord);
            System.out.println();
            return;
        }

        if(row==bord.length-1 && col== bord.length)
        {
            return;
        }

        if(col == bord.length)
        {
            Knight(bord,row+1,0,knights);
            return;
        }

        if(isSafe(bord,row,col)){
            bord[row][col]=true;
            Knight(bord,row,col+1,knights-1);
            bord[row][col]=false;
        }
        Knight(bord,row,col+1,knights);
    }

    static boolean isSafe(boolean[][] bord, int row,int col)
    {
        if(isValid(bord,row-2,col-1))
        {
            if(bord[row-2][col-1])
            {
                return false;
            }
        }
        if(isValid(bord,row-1,col-2))
        {
            if(bord[row-1][col-2])
            {
                return false;
            }
        }
        if(isValid(bord,row-2,col+1))
        {
            if(bord[row-2][col+1])
            {
                return false;
            }
        }
        if(isValid(bord,row-1,col+2))
        {
            if(bord[row-1][col+2])
            {
                return false;
            }
        }
        return  true;

    }

    static boolean isValid(boolean[][] bord, int row,int col)
    {
        if(row>=0 && row<= bord.length && col>=0 && col< bord.length)
        {
            return true;
        }
        return false;
    }

    static void display(boolean[][]bord)
    {
        for(boolean[]row:bord)
        {
            for(boolean element:row)
            {
                if(element)
                {
                    System.out.print("K ");
                }
                else{
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}
