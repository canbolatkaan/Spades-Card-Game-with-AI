package com.example;
import java.util.Random;
public class DeckofCards {
    public Card deck[];
    private int currentCard;
    private final int deckSize=52;
    private Random randomNumbers;
    public static String faces[]={"A","K","Q","J","10","9","8"
                            ,"7","6", "5", "4", "3", "2"};
    public static String suits[]={"Kupa", "Maca", "Sinek","Karo"};
    public DeckofCards(){
        
        deck = new Card[deckSize];
        currentCard=0;
        randomNumbers = new Random();
        for (int i = 0; i < deck.length; i++) {
            deck[i] = new Card(faces[i %13], suits[i/13]);
        }
    }
    public void shuffle(){
        currentCard=0;
        for (int i = 0; i < deck.length; i++) {
            int j = randomNumbers.nextInt(deckSize);
            Card temp = deck[i];
            deck[i]= deck[j];
            deck[j]= temp;
        }
    }
    public Card dealCard(){
        if(currentCard < deck.length)
            return deck[currentCard++];
        else
            return null;
    }
    public void printDeck(){
        for (int i = 0; i < deck.length; i++) {
            System.out.println(deck[i]);
        }
    }
}
