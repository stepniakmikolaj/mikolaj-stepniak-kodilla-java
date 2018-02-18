package com.kodilla.patterns.builder.checkers;

import org.junit.Test;

import static org.junit.Assert.*;

public class CheckersTestSuite {
    @Test
    public void testCheckersBuilder() {
        //G
        Checkers checkers = new Checkers.CheckersBuilder()
                .PlayerOne("John")
                .PlayerTwo("Theresa")
                .Figure(FigureFactory.PAWN, Figure.WHITE, 0, 3)
                .Figure(FigureFactory.PAWN, Figure.BLACK, 9, 7)
                .Figure(FigureFactory.QUEEN, Figure.WHITE, 0, 2)
                .build();
        System.out.println(checkers.getBoard());

        //W
        Figure figureOne = checkers.getBoard().getFigure(0, 3);
        Figure figureTwo = checkers.getBoard().getFigure(9 ,7);
        Figure figureThree = checkers.getBoard().getFigure(0, 2);
        Figure figureFour = checkers.getBoard().getFigure(1, 1);

        //T
        assertEquals(Figure.WHITE, figureOne.getColor());
        assertEquals(Pawn.class, figureTwo.getClass());
        assertEquals(Queen.class, figureThree.getClass());
        assertNull(figureFour);
    }
}