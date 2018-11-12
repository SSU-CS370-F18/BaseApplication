package ssu.groupname.baseapplication;

import java.util.ArrayList;

public class GameDominoes {

    ArrayList<Domino> AllDominoes = new ArrayList<Domino>(28);
    GameDominoes(){
        int j = 0;
        for(int i = 0; i < 7; i++)
        {

            for(; j < 7; j++)
            {
                Domino tempDom = new Domino(i,j);
                AllDominoes.add(tempDom);
            }
            j++;
        }

    }

}
