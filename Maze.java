
public class Maze {
	private int width;
	private int height;
	private char[][]maze;
	
	public Maze(int width, int height, char[][]maze) {
		this.width = width;
		this.height = height;
		this.maze = maze;
	}
	
	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}
	
	public void set(char character, int row, int column) {
		row = height;
		column = width;
		character = maze[4][7];
	}
	
	public String solve(int startRow, int startCol, int endRow, int endCol) {
		String result = " ";

		//Must use recursion
		//Must return a String of the form: r, c-r1, c1-r2, c2

		String breadCrumb = "*";

		//base cases

		if(maze[endRow][endCol] == ' ')
			return endRow + ", " + endCol + " - " + solve(startRow, startCol, endRow, endCol);

		
		
		int nextRow;
		int nextCol;
		
		if(maze[nextRow][nextCol] == ' ')
			return nextRow + ", " + nextCol + " - " + solve(nextRow, nextCol, endRow, endCol);
		

		//there are multiple ways to go
		int eastRow = startRow;
		int eastCol = startCol + 1;
		int southRow = startRow + 1;
		int southCol = startCol;
		int westRow = startRow;
		int westCol = startCol - 1;
		int northRow = startRow - 1;
		int northCol = startCol;
		
		if(maze[eastRow][eastCol] == ' ') {
				result = solve(eastRow, eastCol, endRow, endCol);

				if(result != null)
					return eastRow + " + " + eastCol + " - " + result;
		}		

		if(maze[southRow][southCol] == ' ') {
				result = solve(southRow, southCol, endRow, endCol);

				if(result != null)
					return southRow + " + " + southCol + " - " + result;
		}
		if(maze[westRow][westCol] == ' ') {
				result = solve(westRow, westCol, endRow, endCol);

				if(result != null)
					return westRow + " + " + westCol + " - " + result;
		}
		if(maze[northRow][northCol] == ' ') {
				result = solve(northRow, northCol, endRow, endCol);

				if(result != null)
					return northRow + " + " + northCol + " - " + result;
		}
		
		else
			return null;
	}
}
