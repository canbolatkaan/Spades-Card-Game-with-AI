package com.example;

import java.util.ArrayList;

public class CardGarbage {
    public ArrayList<Card> garbage;
    public CardGarbage(){
        garbage = new ArrayList<>();
    }
    public void add(Card card){
        garbage.add(card);
    }
    public boolean contains(Card c){
        for(Card Garbage : garbage){
            if(Garbage.face.equals(c.face) && Garbage.suit.equals(c.suit))
                return true;
        }
        return false;
    }
    
}
