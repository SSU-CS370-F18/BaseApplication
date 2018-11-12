package ssu.groupname.baseapplication;
import java.util.ArrayList;

public class DominoHand {

    ArrayList<Domino> playerHand = new ArrayList();

    public void insertIntoHand(int index, Domino playedDomino){
        //inserts the passed domino into the index given
        playerHand.set(index, playedDomino);
    }

}
