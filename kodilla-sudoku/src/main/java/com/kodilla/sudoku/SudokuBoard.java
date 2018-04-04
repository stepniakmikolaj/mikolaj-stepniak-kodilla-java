package com.kodilla.sudoku;

import java.util.List;

/**
 * klase SudokuBoard, ktora z kolei bedzie przechowywac (List<SudokuRow></SudokuRow>;).
 */
public class SudokuBoard {
    List<SudokuRow> sudokuRows;

    public SudokuBoard(final List<SudokuRow> sudokuRows) {
        this.sudokuRows = sudokuRows;
    }

//    public List<SudokuRow> getSudokuRows() {
//        return sudokuRows;
//    }
}
