import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JFileChooser;

public class MazeController {
	public static void main(String[] args) {
		MazeController controller = new MazeController();
		controller.go();

	}
	
	private List <Integer>coordinates = new ArrayList<Integer>();
	
	public void go() {
		JFileChooser chooser = new JFileChooser();
		
		int returnVal = chooser.showOpenDialog(null);
		
		if(returnVal == JFileChooser.APPROVE_OPTION) {
			File file = chooser.getSelectedFile();
			
			Scanner input = null;
			try {
				Scanner input2 = new Scanner(file);
			}catch(FileNotFoundException e) {
				
				System.out.println("Could not find the file " + file.getName());
				return;
			}
			Maze maze1 = new Maze();
			
			readMazeFromFile(maze1);
			for([startRow][startCol] && [endRow][endCol]) {
				result = maze.solve(startRow, startCol, endRow, endCol);
				return startRow + ", " + startCol + " - " + result;
			}
		}
		
		public Maze readMazeFromFile(Maze maze1) {
			File file = getMazeFileFromUser();
			Scanner mazeFile = new Scanner(System.in);
			
			int width;
			int height;
			Maze maze2 = new Maze(width, height);
			
			for(int row = 0; row < height; row++)
				for(int column = 0; column < width; column++)
					char[][]maze;
					char caracter = maze[4][7];
					maze2.set(character, row, column);
			
			while([startRow][startCol] && [endRow][endCol]) {
				result = maze.solve(startRow, startCol, endRow, endCol);
			}
			
			Scanner.close;
			
			return maze2;
			
		}
		
		public File getMazeFileFromUser() {
			return null;
		}
	}

}
