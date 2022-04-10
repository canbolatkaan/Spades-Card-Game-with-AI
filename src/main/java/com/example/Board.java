package com.example;

import java.util.ArrayList;

public class Board {
    ArrayList<Card> myboard;
    int counter;
    public Board(){
        myboard= new ArrayList<>();
        counter =0;
    }
    public boolean addBoard(Card card){
        myboard.add(new Card(card.face, card.suit));
        return true;

    }
    public Card getCard(int index){
        return myboard.get(index);
    }
    public boolean isItDone(){
        if(myboard.size()==4)
            return true;
        else
            return false;
    }
    public void showBoard(){
        System.out.println("-----------BOARD-----------");
        for(int i =0;i<myboard.size();i++){
            System.out.print(myboard.get(i).toString()+" ");
        }
        System.out.println();
        System.out.println("---------------------------");
    }
    public boolean myBoardContainsThisCard(Card a){
        for(int i=0;i<myboard.size();i++){
            if(myboard.get(i).face.equals(a.face) && myboard.get(i).suit.equals(a.suit))
                return true;
        }
        
        return false;
    }
}
