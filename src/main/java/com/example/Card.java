package com.example;

public class Card {
    public String face;
    public String suit;
    public Float powerPercent;
    public Card(String cardFace,String cardSuit){
        face = cardFace;
        suit = cardSuit;
        powerPercent=0.0f;
    }
    public String toString(){
        return suit +" " +face;
    }
    
}
