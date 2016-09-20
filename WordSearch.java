import java.util.*;
import java.io.*;


public class WordSearch {

	private static char[][] grid;
	public static boolean up(int r,int c,int pos,String word)
	{
		if(r>=0 && r<grid.length && c>=0 && c<grid.length && pos<=word.length()-1 && grid[r][c]==word.charAt(pos))
		{
			if(pos==word.length()-1)
			{
				return true;
			}
			return up(r-1,c,pos+1,word);
		}
		return false;
	}
	public static boolean down(int r,int c,int pos,String word)
	{
		if(r>=0 && r<grid.length && c>=0 && c<grid.length && pos<=word.length()-1 && grid[r][c]==word.charAt(pos))
		{
			if(pos==word.length()-1)
			{
				return true;
			}
			return down(r+1,c,pos+1,word);
		}
		return false;
	}
	public static boolean right(int r,int c,int pos,String word)
	{
		if(r>=0 && r<grid.length && c>=0 && c<grid.length && pos<=word.length()-1 && grid[r][c]==word.charAt(pos))
		{
			if(pos==word.length()-1)
			{
				return true;
			}
			return right(r,c+1,pos+1,word);
		}
		return false;
	}
	public static boolean left(int r,int c,int pos,String word)
	{
		if(r>=0 && r<grid.length && c>=0 && c<grid.length && pos<=word.length()-1 && grid[r][c]==word.charAt(pos))
		{
			if(pos==word.length()-1)
			{
				return true;
			}
			return left(r,c-1,pos+1,word);
		}
		return false;
	}
	public static boolean upRight(int r,int c,int pos,String word)
	{
		if(r>=0 && r<grid.length && c>=0 && c<grid.length && pos<=word.length()-1 && grid[r][c]==word.charAt(pos))
		{
			if(pos==word.length()-1)
			{
				return true;
			}
			return upRight(r-1,c+1,pos+1,word);
		}
		return false;
	}
	public static boolean upLeft(int r,int c,int pos,String word)
	{
		if(r>=0 && r<grid.length && c>=0 && c<grid.length && pos<=word.length()-1 && grid[r][c]==word.charAt(pos))
		{
			if(pos==word.length()-1)
			{
				return true;
			}
			return upLeft(r-1,c-1,pos+1,word);
		}
		return false;
	}
	public static boolean downRight(int r,int c,int pos,String word)
	{
		if(r>=0 && r<grid.length && c>=0 && c<grid.length && pos<=word.length()-1 && grid[r][c]==word.charAt(pos))
		{
			if(pos==word.length()-1)
			{
				return true;
			}
			return downRight(r+1,c+1,pos+1,word);
		}
		return false;
	}
	public static boolean downLeft(int r,int c,int pos,String word)
	{
		if(r>=0 && r<grid.length && c>=0 && c<grid.length && pos<=word.length()-1 && grid[r][c]==word.charAt(pos))
		{
			if(pos==word.length()-1)
			{
				return true;
			}
			return downLeft(r+1,c-1,pos+1,word);
		}
		return false;
	}
	public static boolean isPossible(int r,int c,String word)
	{
		return up(r,c,0,word) || down(r,c,0,word) || right(r,c,0,word) || left(r,c,0,word) || upRight(r,c,0,word) || upLeft(r,c,0,word) ||
			downRight(r,c,0,word) || downLeft(r,c,0,word);
	}

    public static void main(String[] args) throws IOException
    {
    	Scanner scanny = new Scanner(new File("wordsearch.dat"));
    	int size = scanny.nextInt();
    	grid = new char[size][size];
    	scanny.nextLine();
    	for (int r = 0;r<size;r++)
    	{
    		String[] input = scanny.nextLine().split(" ");
    		for (int c = 0;c<size;c++)
    		{
    				grid[r][c]=input[c].charAt(0);
    		}
    	}
    	int num = scanny.nextInt();
    	scanny.nextLine();
    	for(int d = 0;d<num;d++)
    	{
    		String word=scanny.nextLine().trim();
    		int rVal = 0;
    		int cVal = 0;
    		for (int r = 0;r<size;r++)
    		{
    			for (int c =0;c<size;c++)
    			{
    				if(isPossible(r,c,word))
    				{
						rVal = r+1;
						cVal = c+1;
    				}
    			}
    		}
    		System.out.println(word+" "+rVal+" "+cVal);
    	}



    }
}