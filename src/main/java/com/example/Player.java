package com.example;

import java.util.ArrayList;
import java.util.Collections;



public class Player {
    public String playerName;
    public ArrayList<Card> playerHand;
    public ArrayList<Card> kupaCards;
    public ArrayList<Card> macaCards;
    public ArrayList<Card> sinekCards;
    public ArrayList<Card> karoCards;
    public int KupaSize=0;
    public int MacaSize=0;
    public int SinekSize=0;
    public int KaroSize=0;
    public ArrayList<Card> otherCards;
    
    DeckofCards otherDeck;
    public Player(String playerName){
        this.playerName=playerName;
        playerHand= new ArrayList<Card>();
        otherDeck = new DeckofCards(); 
        otherDeck.shuffle();
    }
    public void addToPlayerHand(Card card){
        playerHand.add(card);
    }
    public void showPlayerHand(){
        System.out.print(playerName+" destesi :");
        for (int i = 0; i < playerHand.size(); i++) {
            System.out.print(playerHand.get(i)+"  ");
        }
        System.out.println();
    }
    public boolean getFromPlayerHand(String cardName){
        String names[]=cardName.split(" ");
        for (int i = 0; i < playerHand.size(); i++) { //short for suits
            if(playerHand.get(i).suit.equals(names[0]) && playerHand.get(i).face.equals(names[1]) ){
                playerHand.remove(i);
                return true;
            }
        }
        return false;
    }
    public void shortHand(){
        // init zeros
        KupaSize=0;
        MacaSize=0;
        KaroSize=0;
        SinekSize=0;
        macaCards = new ArrayList<>();
        kupaCards = new ArrayList<>();
        karoCards = new ArrayList<>();
        sinekCards= new ArrayList<>();
        for (int i = 0; i < playerHand.size(); i++) { // update all deck

            if(playerHand.get(i).suit.equals("Kupa")){
            KupaSize++;
            }
            if(playerHand.get(i).suit.equals("Maca")){
            
            MacaSize++;
            }  
            if(playerHand.get(i).suit.equals("Karo")){

            KaroSize++;
            }
            if(playerHand.get(i).suit.equals("Sinek")){

            SinekSize++;
}  
        }
        //System.out.println(KupaSize+ " "+MacaSize+ " "+KaroSize+ " "+SinekSize+ " ");
        //sort for Suits
        shortForSuits("Karo",0,KaroSize-1);
        shortForSuits("Maca",KaroSize,KaroSize+MacaSize-1);
        shortForSuits("Sinek",KaroSize+MacaSize,KaroSize+MacaSize+SinekSize-1);
        shortForSuits("Kupa",KaroSize+MacaSize+SinekSize,KaroSize+MacaSize+SinekSize+KupaSize-1);
        //sort for Faces
        shortForFaces("Karo",0,KaroSize-1);
        shortForFaces("Maca",KaroSize,KaroSize+MacaSize-1);
        shortForFaces("Sinek",KaroSize+MacaSize,KaroSize+MacaSize+SinekSize-1);
        shortForFaces("Kupa",KaroSize+MacaSize+SinekSize,KaroSize+MacaSize+SinekSize+KupaSize-1);
        
        for(Card e : playerHand){ //divide with list for suites
            if(e.suit.equals("Karo"))
                karoCards.add(e);
            if(e.suit.equals("Sinek"))
                kupaCards.add(e);
            if(e.suit.equals("Maca"))
                macaCards.add(e);
            if(e.suit.equals("Kupa"))
                kupaCards.add(e);

        }
        
    }
    public void shortForSuits(String mySuit,int begin,int end){
        for (int i = begin; i <= end; i++) {//short for suits
            for(int j=i ; j< playerHand.size();j++){
                if( playerHand.get(j).suit.equals(mySuit)){
                    if(!playerHand.get(i).suit.equals(mySuit) ){
                    Collections.swap(playerHand, i, j);
                    }
                    i++;
                }

            }
        }
    }
    public void calculateOtherCards(int elSayısı){
        for(int i = 0 ;i< 52 ; i++)
            otherCards.add(otherDeck.deck[i]);
        for (int i = 0; i < 52; i++) { // 52-elSayısı cards remain
            for(int j=0; j<playerHand.size();j++){
                if(otherCards.get(i).face.equals(playerHand.get(j).face) && otherCards.get(i).suit.equals(playerHand.get(j).suit))
                otherCards.remove(i);
            }
        }
    }
    public void updateOtherCards(Card e){
        for(int i = 0 ; i<otherCards.size();i++){
            if(e.face.equals( otherCards.get(i).face) && e.suit.equals( otherCards.get(i).suit))
                otherCards.remove(i);
        }
    }
    public double calculatePowerofCard(Card e){ //kalan kartlarda gelen karttan daha yükseği var ise 0 değil ise 1
        
        e.powerPercent=1.0f;
        for(int i = 0 ;i <otherCards.size();i++){
            if(e.suit.equals(otherCards.get(i).suit)){
                if(compareFace(e, otherCards.get(i)) != 1)
                    e.powerPercent=0.0f;
            }
        }
        return e.powerPercent;
    }
    public void shortForFaces(String mySuit,int begin,int end){
        for(int i=begin;i<=end;i++){
            for (int j = i+1; j <= end; j++) {
                if(compareFace(playerHand.get(i), playerHand.get(j))==-1)
                    Collections.swap(playerHand, i, j);
            }
        }
    }

    public int compareSuit(Card a,Card b){
        if(a.suit.equals(b.suit))
            return 1;
        else 
            return 0;
    }
    public int compareFace(Card a,Card b){ // if a is more powerfull than b, returns 1
        if(findFaceIndex(a)<findFaceIndex(b))
            return 1;
        else if (findFaceIndex(a)==findFaceIndex(b))
            return 0;
        else 
            return -1;
    }
    public int findFaceIndex(Card a){
        for(int i =0;i<DeckofCards.faces.length;i++){
            if(DeckofCards.faces[i].equals(a.face))
                return i;
        }
        return -1;
    }
    public boolean myHandContainsThisSuit(Card a ){
        for(int i=0;i<playerHand.size();i++){
            if(playerHand.get(i).suit.equals(a.suit))
                return true;
        }
        return false;
    }
    public boolean myHandContainsThisFace(Card a ){
        for(int i=0;i<playerHand.size();i++){
            if(playerHand.get(i).face.equals(a.face))
                return true;
        }
        return false;
    }
    public boolean myHandContainsThisCard(Card a){
        for(int i=0;i<playerHand.size();i++){
            if(playerHand.get(i).face.equals(a.face) && playerHand.get(i).suit.equals(a.suit))
                return true;
        }
        
        return false;
    }

}
    

