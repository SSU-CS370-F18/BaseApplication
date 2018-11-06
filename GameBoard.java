package ssu.groupname.baseapplication;


public class GameBoard{


    GameBoard(){
        ArrayList<Domino> board = new ArrayList<Domino>(28);
        //Create Domino(-1,-1) as a dummy domino, and insert that in all 28 indicies
    }

    public int getGreatestOdd {
        //This function returns the index of the next available odd index in the ArrayList
        //With this function, we know where to insert the next domino that goes to the left of
        //the board
        for(int x = 1; x < 28; x+2)
        {
            Domino = new Domino
            if(ArrayList.get(x) == Domino(-1,-1))
                return x;
        }

    }

    public int getGreatestEven {
        for(int x = 0; x < 28; x+2)
        {
            Domino = new Domino
            if(ArrayList.get(x) == Domino(-1,-1))
                return x;
        }

    }

    public int insertIntoBoard(int index, Domino playedDomino){
        //inserts the passed domino into the index given
    }



}