package ssu.groupname.baseapplication;
import java.util.ArrayList;


public class GameBoard{

    ArrayList<Domino> board = new ArrayList<Domino>(28);
    GameBoard(){
        //Create Domino(-1,-1) as a dummy domino, and insert that in all 28 indicies
        Domino dummyDomino = new Domino(-1,-1);
        for(int i = 0; i < board.size(); i++)
        {
            board.set(i, dummyDomino);
        }
    }




    public void insertIntoBoard(int index, Domino playedDomino){
        //inserts the passed domino into the index given
        board.set(index, playedDomino);
    }



}