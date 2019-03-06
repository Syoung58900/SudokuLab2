package pkgGame;

import java.util.Arrays;

import pkgHelper.LatinSquare;

public class Sudoku extends LatinSquare {
	public Sudoku() {
		super();
	}
	public Sudoku(int [][] LatinSquare) {
		super(LatinSquare);
	}
	public int[][] getPuzzle(){
		return super.getLatinSquare();
	}
}
