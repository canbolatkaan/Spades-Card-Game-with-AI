package com.example;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


//forFX
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.chart.BarChart;
import javafx.stage.Stage;
public final class App extends Application {
    static int[][] dataArr=null;

    Player[] players= new Player[4];
    CardGarbage myGarbage ;
    @Override public void start(Stage stage) {
        int player1wins=0;
        int player2wins=0;
        int player3wins=0;
        int player4wins=0;
        int player1Score=0;
        int player2Score=0;
        int player3Score=0;
        int player4Score=0;
        for (int i = 0; i < dataArr.length; i++) {
            
                    player1Score =dataArr[i][0];
                    
                    player2Score = dataArr[i][1];
                
                    player3Score = dataArr[i][2];
                
                    player4Score= dataArr[i] [3];
    
                if(player1Score>player2Score && player1Score>player3Score && player1Score >player4Score)
                    player1wins++;
                if(player2Score>player1Score && player2Score>player3Score && player2Score >player4Score)
                    player2wins++;
                if(player3Score>player2Score && player3Score>player1Score && player3Score >player4Score)
                    player3wins++;
                if(player4Score>player1Score && player4Score>player2Score && player4Score >player3Score)
                    player4wins++;
                
        }
        /*
        for (int i = 0; i < dataArr.length; i++) {
            System.out.println("Game "+(i+1)+"Player1 Score :"+ arr[i][0] + "  Player2 Score: "+ arr[i][1]+ "  Player3 Score: "+ arr[i][2]+ "  RandomAgent Score: "+ arr[i][3]);
        }
        */
        //System.out.println("Player1 Wins :"+ player1wins + "  Player2 Wins: "+ player2wins+ "  Player3 Wins: "+ player3wins+ "  RandomAgent Wins: "+ player4wins);
        stage.setTitle("Bar Chart ");
        final CategoryAxis xAxis = new CategoryAxis();
        final NumberAxis yAxis = new NumberAxis();
        final BarChart<String,Number> bc = 
            new BarChart<String,Number>(xAxis,yAxis);
        bc.setTitle("Number of Game Winners");
        xAxis.setLabel("Number of Wins");       
        yAxis.setLabel("Players");
 
        XYChart.Series series1 = new XYChart.Series();
        series1.setName("Player1");       
        series1.getData().add(new XYChart.Data("Player 1", player1wins));
        
        XYChart.Series series2 = new XYChart.Series();
        series2.setName("Player2");       
        series2.getData().add(new XYChart.Data("Player 2", player2wins));
        
        XYChart.Series series3 = new XYChart.Series();
        series3.setName("Player3");       
        series3.getData().add(new XYChart.Data("Player 3", player3wins));
        
        XYChart.Series series4 = new XYChart.Series();
        series4.setName("Bot Player");       
        series4.getData().add(new XYChart.Data("Bot Player", player4wins));
        Scene scene  = new Scene(bc,800,600);
        bc.getData().addAll(series1,series2,series3,series4);
        stage.setScene(scene);
        stage.show();
        /* Line Chart
        stage.setTitle("Line Chart");
        final NumberAxis xAxis = new NumberAxis();
        final NumberAxis yAxis = new NumberAxis();
         xAxis.setLabel("Oyun Sayısı");
         yAxis.setLabel("Kazınılan el(oyun içerisinde)");
        final LineChart<Number,Number> lineChart = 
                new LineChart<Number,Number>(xAxis,yAxis);
        xAxis.autosize();
        lineChart.setTitle("Elde Edilen Oyun Sayısı");
                          
        XYChart.Series series1 = new XYChart.Series();
        series1.setName("Player 1");
        int toplamel=0;
        int toplamoyun=0;
        if(dataArr!=null)
        for (int i = 0; i < dataArr.length; i++) {
            
            toplamel+=dataArr[i][0];
            series1.getData().add(new XYChart.Data((i+1), toplamel));
        
        }
        toplamel=0;
     
        XYChart.Series series2 = new XYChart.Series();
        series2.setName("Player 2");
        if(dataArr!=null)
        for (int i = 0; i < dataArr.length; i++) {
            
            toplamel+=dataArr[i][1];
            series2.getData().add(new XYChart.Data((i+1), toplamel));
        
        }
        
        toplamel=0;
        XYChart.Series series3 = new XYChart.Series();
        series3.setName("Player 3");
        if(dataArr!=null)
        for (int i = 0; i < dataArr.length; i++) {
            
            toplamel+=dataArr[i][2];
            series3.getData().add(new XYChart.Data((i+1), toplamel));
            
        }
        toplamel=0;
        XYChart.Series series4 = new XYChart.Series();
        series4.setName("Bot Player");
        if(dataArr!=null)
        for (int i = 0; i < dataArr.length; i++) {
            toplamel+=dataArr[i][3];
            series4.getData().add(new XYChart.Data((i+1), toplamel));
        
        }
        


        Scene scene  = new Scene(lineChart,800,600);       
        lineChart.getData().addAll(series1, series2, series3,series4);
       
        stage.setScene(scene);
        stage.show();
        */
    }
    public static void main(String[] args) {
        

        App game = new App();
        int[][] arr= new int[1000][4];
        ArrayList<Integer> temp=new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            temp=game.myMain(temp);
            arr[i][0]=temp.get(0);
            arr[i][1]=temp.get(1);
            arr[i][2]=temp.get(2);
            arr[i][3]=temp.get(3);
        
        }
        int player1wins=0;
        int player2wins=0;
        int player3wins=0;
        int player4wins=0;
        int player1Score=0;
        int player2Score=0;
        int player3Score=0;
        int player4Score=0;
        for (int i = 0; i < arr.length; i++) {
            
                    player1Score =arr[i][0];
                    
                    player2Score = arr[i][1];
                
                    player3Score = arr[i][2];
                
                    player4Score= arr[i] [3];
    
                if(player1Score>player2Score && player1Score>player3Score && player1Score >player4Score)
                    player1wins++;
                if(player2Score>player1Score && player2Score>player3Score && player2Score >player4Score)
                    player2wins++;
                if(player3Score>player2Score && player3Score>player1Score && player3Score >player4Score)
                    player3wins++;
                if(player4Score>player1Score && player4Score>player2Score && player4Score >player3Score)
                    player4wins++;
                
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Game "+(i+1)+"Player1 Score :"+ arr[i][0] + "  Player2 Score: "+ arr[i][1]+ "  Player3 Score: "+ arr[i][2]+ "  RandomAgent Score: "+ arr[i][3]);
        }
        System.out.println("Player1 Wins :"+ player1wins + "  Player2 Wins: "+ player2wins+ "  Player3 Wins: "+ player3wins+ "  RandomAgent Wins: "+ player4wins);
        App.dataArr=arr;
        //launch( args); for chart graphs
        
        
    }
    public ArrayList<Integer> myMain(ArrayList<Integer> score){
        score.clear();
        int player1Score=0;
        int player2Score=0;
        int player3Score=0;
        int player4Score=0;
        int elSayısı=0;
        DeckofCards myDeck = new DeckofCards(); 
        myDeck.shuffle();
        players[0]  = new Player("Player1");
        players[1] = new Player("Player2");
        players[2] = new Player("Player3");
        players[3] = new Player("Player4");
        
        
        for (int i = 0; i <13 ; i++) {
            players[0].addToPlayerHand(myDeck.dealCard());
            players[1].addToPlayerHand(myDeck.dealCard());
            players[2].addToPlayerHand(myDeck.dealCard());
            players[3].addToPlayerHand(myDeck.dealCard());
        }
        
        players[0].showPlayerHand();
        try (Scanner sc = new Scanner(System.in)) {
            boolean bool = true;
            int sira=0;
            int firstIndex=0;
            int otherIndex=0;
            String[] normalPlayerCard=null;
            myGarbage= new CardGarbage();
            for (int numOfRounds = 0; numOfRounds < 13; numOfRounds++) {
                Board board = new Board();
                
                currentHands(players[0], players[1], players[2], players[3]);
                String leadSuit="";
                
                    for (int i = 0; i < 4; i++) {
                        Card playerCard=null;

                        
                    System.out.print("Player"+((i+otherIndex)%4+1)+" dan cikarilcak kart ? ");    
                    switch ((i+otherIndex)%4) {
                        case 0:
                        String[] normalPlayer=null;
                        String cardName=sc.nextLine();
                        if(i==0) //first card
                        {  
                            firstIndex=0;
                                    
                                    if(players[0].getFromPlayerHand( cardName ))
                                        System.out.println("kartı dustu");
                                    normalPlayerCard=cardName.split(" ");
                                    playerCard= new Card(normalPlayerCard[1], normalPlayerCard[0]);

                        }
                        if(i==1) //second card
                        {
                            if(players[0].getFromPlayerHand( cardName ))
                                        System.out.println("kartı dustu");
                                        normalPlayerCard=cardName.split(" ");
                                    playerCard= new Card(normalPlayerCard[1], normalPlayerCard[0]);
                        }
                        if(i==2) //third card
                        {
                            if(players[0].getFromPlayerHand( cardName ))
                                        System.out.println("kartı dustu");
                                        normalPlayerCard=cardName.split(" ");
                                    playerCard= new Card(normalPlayerCard[1], normalPlayerCard[0]);                              
                        }

                        if(i==3) //fourth card
                        {
                            if(players[0].getFromPlayerHand( cardName ))
                                        System.out.println("kartı dustu");
                                        normalPlayerCard=cardName.split(" ");
                                    playerCard= new Card(normalPlayerCard[1], normalPlayerCard[0]);            
                        }

                                
                            
                            break;
                        case 1:
                            
                                System.out.println("Player2 karti dustu");
                                if(i==0) //first card
                                {
                                    firstIndex=1;
                                    playerCard=firstCard(players[1], players[2], players[3], players[0]);
                                    if(players[1].getFromPlayerHand( playerCard.suit+" "+playerCard.face ))
                                         System.out.println("Player2 karti dustu1");
                                    leadSuit=playerCard.suit;


                                }
                                if(i==1) //second card
                                {
                                    playerCard=secondCard(board.getCard(0),players[1], players[2], players[3]);
                                    if(players[1].getFromPlayerHand( playerCard.suit+" "+playerCard.face ))
                                         System.out.println("Player2 karti dustu1");

                                }
                                if(i==2) //third card
                                {
                                    playerCard=thirdCard(board.getCard(0),board.getCard(1),players[1], players[2]);
                                    if(players[1].getFromPlayerHand( playerCard.suit+" "+playerCard.face ))
                                         System.out.println("Player2 karti dustu1");
                                   
                                }

                                if(i==3) //fourth card
                                {
                                    playerCard=fourthCard(board.getCard(0),board.getCard(1),board.getCard(2),players[1]);
                                    if(players[1].getFromPlayerHand( playerCard.suit+" "+playerCard.face ))
                                         System.out.println("Player2 karti dustu1");
   
                                }

                            
                            break;
                        case 2:/*

                            if(players[2].getFromPlayerHand(str)){
                                System.out.println("Player3 karti dustu");
                                bool=true;
                                
                            }
                            else
                                bool=false;
                                */
                                if(i==0) //first card
                                {
                                    firstIndex=2;

                                    playerCard=firstCard(players[2], players[3], players[0], players[1]);
                                    if(players[2].getFromPlayerHand( playerCard.suit+" "+playerCard.face ))
                                         System.out.println("Player3 karti dustu1");
                                }
                                if(i==1) //second card
                                {
                                    playerCard=secondCard(board.getCard(0),players[2], players[3], players[0]);
                                    if(players[2].getFromPlayerHand( playerCard.suit+" "+playerCard.face ))
                                         System.out.println("Player3 karti dustu1");
                                }
                                if(i==2) //third card
                                {
                                    playerCard=thirdCard(board.getCard(0),board.getCard(1),players[2], players[3]);
                                    if(players[2].getFromPlayerHand( playerCard.suit+" "+playerCard.face ))
                                         System.out.println("Player3 karti dustu1");                              
                                }

                                if(i==3) //fourth card
                                {
                                    playerCard=fourthCard(board.getCard(0),board.getCard(1),board.getCard(2),players[2]);
                                    if(players[2].getFromPlayerHand( playerCard.suit+" "+playerCard.face ))
                                    System.out.println("Player3 karti dustu1");
                                }
                            break;
                        case 3:
                                
                                /*
                                System.out.println("RandomPlayer karti dustu");
                                bool=true;
                                if(i==0) //first card
                                {
                                    firstIndex=3;
                                    playerCard=firstRandom(players[3]);
                                    if(players[3].getFromPlayerHand( playerCard.suit+" "+playerCard.face ))
                                        System.out.println("dustu");
                                    leadSuit=playerCard.suit;
                                    
                                }
                                */
                                /*
                                if(i==1) //second card
                                {
                                    playerCard=otherCard(board.getCard(0),players[3]);
                                    if(players[3].getFromPlayerHand( playerCard.suit+" "+playerCard.face ))
                                        System.out.println("dustu");
                                    leadSuit=playerCard.suit;
                                    /*
                                    playerCard=secondCard(board.getCard(0),players[0], players[1], players[2]);
                                    if(players[0].getFromPlayerHand( playerCard.suit+" "+playerCard.face ))
                                    System.out.println("dustu");                                
                                    */
                                    /*
                                }
                                    if(i==2) //third card
                                {
                                    playerCard=otherCard(board.getCard(0),players[3]);
                                    if(players[3].getFromPlayerHand( playerCard.suit+" "+playerCard.face ))
                                        System.out.println("dustu");
                                    leadSuit=playerCard.suit;
                                    /*
                                                              
                                    */
                                    /*
                                }

                                if(i==3) //fourth card
                                {   playerCard=otherCard(board.getCard(0),players[3]);
                                    if(players[3].getFromPlayerHand( playerCard.suit+" "+playerCard.face ))
                                        System.out.println("dustu");
                                    leadSuit=playerCard.suit;
                                    /*
                                                            
                                    */
                                    /*
                                }
                                */
                                if(i==0) //first card
                                    {
                                        firstIndex=3;
                                                playerCard=firstCard(players[3], players[0], players[1], players[2]);
                                                if(players[0].getFromPlayerHand( playerCard.suit+" "+playerCard.face ))
                                                System.out.println("Player4 karti dustu1");                              
                                                leadSuit=playerCard.suit;

                                    }
                                    if(i==1) //second card
                                    {
                                        playerCard=secondCard(board.getCard(0),players[3], players[0], players[1]);
                                                if(players[0].getFromPlayerHand( playerCard.suit+" "+playerCard.face ))
                                                System.out.println("Player4 karti dustu1");                              
                                            }
                                    if(i==2) //third card
                                    {
                                        playerCard=thirdCard(board.getCard(0),board.getCard(1),players[3], players[0]);
                                                if(players[0].getFromPlayerHand( playerCard.suit+" "+playerCard.face ))
                                                System.out.println("Player4 karti dustu1");                              
                                            }

                                    if(i==3) //fourth card
                                    {
                                        
                                        playerCard=fourthCard(board.getCard(0),board.getCard(1),board.getCard(2),players[3]);
                                                if(players[0].getFromPlayerHand( playerCard.suit+" "+playerCard.face ))
                                                System.out.println("Player4 karti dustu1");                              
                                            }

                            break;
                        default:
                            break;
                    }
                    //Atılan karttan tekrar olusturuyoruyoruz ve Board nesnemize ekliyoruz.
                    
                        
                        
                        board.addBoard(playerCard);
                        
                        board.showBoard();

                        // Kullanicilar dogru hamleleri oynadığında buraya girer

                        currentHands(players[0], players[1], players[2], players[3]);
                        
                        
                }
                for (int i = 0; i < board.myboard.size(); i++) {
                    myGarbage.garbage.add(board.myboard.get(i));

                }
                System.out.println("Eli kimin aldığının Hesaplama yapılmalı... ");
                 
                
                if(firstIndex==0){
                    otherIndex=calculateWinner(board, leadSuit);
                }
                else if(firstIndex==1){
                    if(calculateWinner(board, leadSuit)<3)
                    otherIndex=(calculateWinner(board, leadSuit)+1);
                    else

                    otherIndex=0;
                }
                else if(firstIndex==2){
                    if(calculateWinner(board, leadSuit)<2)
                    otherIndex=(calculateWinner(board, leadSuit)+2);
                    else

                    otherIndex=(calculateWinner(board, leadSuit)-2);
                }
                else if(firstIndex==3){
                    if(calculateWinner(board, leadSuit)<1)
                    otherIndex=(calculateWinner(board, leadSuit)+3);
                    else
                    otherIndex=(calculateWinner(board, leadSuit)-1);
                }
                if(otherIndex%4==0){
                    System.out.println("player1");
                    player1Score++;
                }
                if(otherIndex%4==1){
                    System.out.println("player2");

                    player2Score++;
                }
                if(otherIndex%4==2){
                    System.out.println("player3");

                    player3Score++;
                }
                if(otherIndex%4==3){
                    System.out.println("bot");

                    player4Score++;
                }
                               
                }
                
            
        }
        System.out.println("scores :" +player1Score);
        System.out.println("scores :"+player2Score);
        System.out.println("scores :"+player3Score);
        System.out.println("scores :"+player4Score);
        score.add(player1Score);
        score.add(player2Score);
        score.add(player3Score);
        score.add(player4Score);
        /*
        if(player1Score>player2Score && player1Score>player3Score && player1Score >player4Score)
            return 1;
        if(player2Score>player1Score && player2Score>player3Score && player2Score >player4Score)
            return 2;
        if(player3Score>player2Score && player3Score>player1Score && player3Score >player4Score)
            return 3;
        if(player4Score>player1Score && player4Score>player2Score && player4Score >player3Score)
            return 4;
        */
            return score;

    }
    
    public int calculateWinner(Board board,String leadSuit){
        return myCardComparator(board.myboard, leadSuit);
        
    }
    public int myCardComparator(ArrayList<Card> mList,String suit){
        Player empPlayer= new Player("empPlayer");
        Card compCard= new Card("2", suit);
        int i,index=0;
        int lastMacaIndex=-1;
        boolean macaContains = false;

        for(i=0; i<mList.size();i++){
            if(mList.get(i).suit.equals("Maca")){
                macaContains=true;
                if(lastMacaIndex==-1){
                    lastMacaIndex=i;
                    compCard=mList.get(i);

                }
                else{
                    if(empPlayer.compareFace(mList.get(i), mList.get(lastMacaIndex))>=0){
                        lastMacaIndex=i;
                        compCard=mList.get(i);
                    }
                    else
                    {
                        compCard=mList.get(lastMacaIndex);
                    }

                }

            }
            if(!macaContains && mList.get(i).suit.equals(suit) && empPlayer.compareFace(mList.get(i), compCard)!=-1){
                compCard=mList.get(i);
                index=i;
            }

        }
        return macaContains ? lastMacaIndex:index;
    }
    public  void currentHands(Player one,Player two,Player three,Player four){
        one.shortHand();
        two.shortHand();
        three.shortHand();
        four.shortHand();
        one.showPlayerHand();
        two.showPlayerHand();
        three.showPlayerHand();
        four.showPlayerHand();
    }
    
    public Card firstCard(Player me,Player other1,Player other2,Player other3){
        //check other players have not any suit
        

        if( !other1.myHandContainsThisSuit(new Card("A", "Karo")) && !other2.myHandContainsThisSuit(new Card("A", "Karo")) && !other3.myHandContainsThisSuit(new Card("A", "Karo")) && me.myHandContainsThisSuit(new Card("A", "Karo"))){
            for(int i=DeckofCards.faces.length-1 ; i>=0;i--)
                if(me.myHandContainsThisCard(new Card(DeckofCards.faces[i], "Karo")))
                    return new Card(DeckofCards.faces[i], "Karo");
        }
        if( !other1.myHandContainsThisSuit(new Card("A", "Sinek")) && !other2.myHandContainsThisSuit(new Card("A", "Sinek")) && !other3.myHandContainsThisSuit(new Card("A", "Sinek")) && me.myHandContainsThisSuit(new Card("A", "Sinek"))){
            for(int i=DeckofCards.faces.length-1 ; i>=0;i--)
                if(me.myHandContainsThisCard(new Card(DeckofCards.faces[i], "Sinek")))
                    return new Card(DeckofCards.faces[i], "Sinek");
        }
        if( !other1.myHandContainsThisSuit(new Card("A", "Kupa")) && !other2.myHandContainsThisSuit(new Card("A", "Kupa")) && !other3.myHandContainsThisSuit(new Card("A", "Kupa")) && me.myHandContainsThisSuit(new Card("A", "Kupa"))){
            for(int i=DeckofCards.faces.length-1 ; i>=0;i--)
                if(me.myHandContainsThisCard(new Card(DeckofCards.faces[i], "Kupa")))
                    return new Card(DeckofCards.faces[i], "Kupa");
        }

        //use ace
        for(int i =0;i<me.playerHand.size();i++)
            if(me.playerHand.get(i).face.equals("A") && !me.playerHand.get(i).suit.equals("Maca"))
                return new Card(me.playerHand.get(i).face, me.playerHand.get(i).suit);
        //use King
        if(me.myHandContainsThisCard(new Card("K", "Kupa")) && !other1.myHandContainsThisCard(new Card("A", "Kupa"))
            && !other2.myHandContainsThisCard(new Card("A", "Kupa")) && !other3.myHandContainsThisCard(new Card("A", "Kupa")))
            return new Card("K", "Kupa");
        if(me.myHandContainsThisCard(new Card("K", "Sinek")) && !other1.myHandContainsThisCard(new Card("A", "Sinek"))
            && !other2.myHandContainsThisCard(new Card("A", "Sinek")) && !other3.myHandContainsThisCard(new Card("A", "Sinek")))
            return new Card("K", "Sinek");
        if(me.myHandContainsThisCard(new Card("K", "Karo")) && !other1.myHandContainsThisCard(new Card("A", "Karo"))
            && !other2.myHandContainsThisCard(new Card("A", "Karo")) && !other3.myHandContainsThisCard(new Card("A", "Karo")))
            return new Card("K", "Karo");
        

        //use Queen
        if(me.myHandContainsThisCard(new Card("Q", "Kupa"))&& !other2.myHandContainsThisCard(new Card("A", "Kupa")) 
            && !other3.myHandContainsThisCard(new Card("A", "Kupa")) && !other1.myHandContainsThisCard(new Card("A", "Kupa"))
            && !other1.myHandContainsThisCard(new Card("K", "Kupa")) && !other2.myHandContainsThisCard(new Card("K", "Kupa"))
            && !other3.myHandContainsThisCard(new Card("K", "Kupa")))
            return new Card("Q", "Kupa");
        if(me.myHandContainsThisCard(new Card("Q", "Sinek"))&& !other2.myHandContainsThisCard(new Card("A", "Sinek")) 
            && !other3.myHandContainsThisCard(new Card("A", "Sinek")) && !other1.myHandContainsThisCard(new Card("A", "Sinek"))
            && !other1.myHandContainsThisCard(new Card("K", "Sinek")) && !other2.myHandContainsThisCard(new Card("K", "Sinek"))
            && !other3.myHandContainsThisCard(new Card("K", "Sinek")))
            return new Card("Q", "Sinek");
    
        if(me.myHandContainsThisCard(new Card("Q", "Karo"))&& !other2.myHandContainsThisCard(new Card("A", "Karo")) 
            && !other3.myHandContainsThisCard(new Card("A", "Karo")) && !other1.myHandContainsThisCard(new Card("A", "Karo"))
            && !other1.myHandContainsThisCard(new Card("K", "Karo")) && !other2.myHandContainsThisCard(new Card("K", "Karo"))
            && !other3.myHandContainsThisCard(new Card("K", "Karo")))
            return new Card("Q", "Karo");
        // play lowest card
        for(int i=12 ; 0<=i;i--){
            if(me.myHandContainsThisCard(new Card(DeckofCards.faces[i], "Kupa")))
                return new Card(DeckofCards.faces[i], "Kupa");
            if(me.myHandContainsThisCard(new Card(DeckofCards.faces[i], "Sinek")))
                return new Card(DeckofCards.faces[i], "Sinek");
            if(me.myHandContainsThisCard(new Card(DeckofCards.faces[i], "Karo")))
                return new Card(DeckofCards.faces[i], "Karo");
        }

        //play lowest spade
        for(int i=12 ; 0<=i;i--){
            if(me.myHandContainsThisCard(new Card(DeckofCards.faces[i], "Maca")))
                return new Card(DeckofCards.faces[i], "Maca");
        }
        return me.playerHand.get(0);
    }
    public Card secondCard(Card firstCard ,Player me,Player other2,Player other3){
        //use Ace with firstCard's suit
        if (me.myHandContainsThisCard(new Card("A",firstCard.suit ))) {
            me.showPlayerHand();
			return new Card("A",firstCard.suit );
		}
        //play biggerCard than firstCard (biggest)
        for(int i =0;i>=12;i++){
            if(me.myHandContainsThisCard(new Card(DeckofCards.faces[i], firstCard.suit)) && me.compareFace(new Card(DeckofCards.faces[i], firstCard.suit), firstCard)==1 )
                return new Card(DeckofCards.faces[i], firstCard.suit);
        }

        //lowest card with firstCard's suit
        for(int i =12;i>=0;i--){
            if(me.myHandContainsThisCard(new Card(DeckofCards.faces[i], firstCard.suit)))
                return new Card(DeckofCards.faces[i], firstCard.suit);
        }

        //play a low spade
        for(int i =12;i>=0;i--){
            if(me.myHandContainsThisCard(new Card(DeckofCards.faces[i], "Maca")))
                return new Card(DeckofCards.faces[i], "Maca");
        }

        return me.playerHand.get(0);
    }
    public Card thirdCard(Card firstCard ,Card secondCard,Player me,Player other3){

        if(!firstCard.suit.equals(secondCard.suit) && secondCard.suit.equals("Maca") && !me.myHandContainsThisSuit(firstCard))
            for(int i =12;i>=0;i-- )
                if(me.myHandContainsThisCard(new Card(DeckofCards.faces[i], "Maca")))
                    return new Card(DeckofCards.faces[i], "Maca");
                    
        //finde highest card
        Card highestCard=null;

        if(firstCard.suit.equals("Maca") && !secondCard.suit.equals("Maca"))
            highestCard= new Card(firstCard.face, "Maca");
        if(!firstCard.suit.equals("Maca") && secondCard.suit.equals("Maca"))
            highestCard= new Card(secondCard.face, "Maca");

        if(firstCard.suit.equals(secondCard.suit))
            if(me.compareFace(firstCard, secondCard)==1)
                highestCard = new Card(firstCard.face, firstCard.suit);
            else
                highestCard = new Card(secondCard.face, secondCard.suit);
        
        if(!firstCard.suit.equals(secondCard.suit) && !secondCard.suit.equals("Maca"))
            highestCard = new Card(firstCard.face, firstCard.suit);

        //try get with higher card  same suit, do we have higher card
        if(firstCard.suit.equals(secondCard.suit)){ 
            if(highestCard != null){
                
                if(me.myHandContainsThisCard(new Card("A", firstCard.suit)))
                    return new Card("A", firstCard.suit);
                if(myGarbage.contains(new Card("A", firstCard.suit))){
                    if(me.myHandContainsThisCard(new Card("K", firstCard.suit))){
                        return new Card("K", firstCard.suit);
                    }
                    if(myGarbage.contains(new Card("Q", firstCard.suit))){
                        if(me.myHandContainsThisCard(new Card("J", firstCard.suit)))
                            return new Card("J", firstCard.suit);
                        if(myGarbage.contains(new Card("J", firstCard.suit))){
                            if(me.myHandContainsThisCard(new Card("10", firstCard.suit)))
                                return new Card("10", firstCard.suit);
                            if(myGarbage.contains(new Card("10", firstCard.suit))){
                                if(me.myHandContainsThisCard(new Card("9", firstCard.suit)))
                                    return new Card("9", firstCard.suit);
                                if(myGarbage.contains(new Card("9", firstCard.suit))){
                                    if(me.myHandContainsThisCard(new Card("8", firstCard.suit)))
                                        return new Card("8", firstCard.suit);
                                    if(myGarbage.contains(new Card("8", firstCard.suit))){
                                        if(me.myHandContainsThisCard(new Card("7", firstCard.suit)))
                                            return new Card("7", firstCard.suit);
                                        if(myGarbage.contains(new Card("7", firstCard.suit))){
                                            if(me.myHandContainsThisCard(new Card("6", firstCard.suit)))
                                                return new Card("6", firstCard.suit);
                                                if(myGarbage.contains(new Card("6", firstCard.suit))){
                                                    if(me.myHandContainsThisCard(new Card("5", firstCard.suit)))
                                                        return new Card("5", firstCard.suit);
                                                    if(myGarbage.contains(new Card("5", firstCard.suit))){
                                                        if(me.myHandContainsThisCard(new Card("4", firstCard.suit)))
                                                            return new Card("4", firstCard.suit);
                                                        if(myGarbage.contains(new Card("4", firstCard.suit))){
                                                            if(me.myHandContainsThisCard(new Card("3", firstCard.suit)))
                                                                return new Card("3", firstCard.suit);
                                                            if(myGarbage.contains(new Card("3", firstCard.suit))){
                                                                if(me.myHandContainsThisCard(new Card("2", firstCard.suit)))
                                                                    return new Card("2", firstCard.suit);
                                                            
                                                            }
                                                        }
                                                    }
                                                }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        
        //try win card highest card
        if(highestCard !=null){

            if((highestCard.suit.equals(firstCard.suit)) && highestCard.face.equals(firstCard.face) && !highestCard.face.equals("A")){
                for(int i=DeckofCards.faces.length-1; i>=0;i--){
                    if(me.compareFace(new Card(DeckofCards.faces[i], highestCard.suit ), highestCard)==1 && me.myHandContainsThisCard(new Card(DeckofCards.faces[i], highestCard.suit )))
                        return new Card(DeckofCards.faces[i], highestCard.suit );
                }

            }
        }
        
        // play a low card of the first suit
        for(int i=DeckofCards.faces.length-1; i>=0;i--){
            if(me.myHandContainsThisCard(new Card(DeckofCards.faces[i], firstCard.suit)))
                return new Card(DeckofCards.faces[i], firstCard.suit);
        }
        
        //if the second card is a spade thats higher, try to beat it if not play  low card
        if(secondCard.suit.equals("Maca") && !firstCard.suit.equals("Maca"))
            for(int i =DeckofCards.faces.length-1; i>=0;i--){
                if(me.myHandContainsThisCard(new Card(DeckofCards.faces[i], secondCard.suit)) && me.compareFace(new Card(DeckofCards.faces[i], secondCard.suit), secondCard)==1)
                return new Card(DeckofCards.faces[i], firstCard.suit);
        }
        for(int i=DeckofCards.faces.length-1; i>=0;i--){
            if(me.myHandContainsThisCard(new Card(DeckofCards.faces[i], "Maca")))
                return new Card(DeckofCards.faces[i], "Maca");
        }
        
        // low card from kupa, sinek, karo
        for(int i=DeckofCards.faces.length-1; i>=0;i--){
            if(me.myHandContainsThisCard(new Card(DeckofCards.faces[i], "Karo")))
                return new Card(DeckofCards.faces[i], "Karo");
            if(me.myHandContainsThisCard(new Card(DeckofCards.faces[i], "Sinek")))
                return new Card(DeckofCards.faces[i], "Sinek");
            if(me.myHandContainsThisCard(new Card(DeckofCards.faces[i], "Kupa")))
                return new Card(DeckofCards.faces[i], "Kupa");
        }
     
        return me.playerHand.get(0);
 
    }
    public Card fourthCard(Card firstCard ,Card secondCard,Card thirdCard,Player me){
        Card highestCard=null;
        //notMaca,notMaca,notMaca,Maca
        //suit, notMaca,notMaca, low notMaca and low notSuit
        if(!firstCard.suit.equals("Maca") && !secondCard.suit.equals("Maca") && !thirdCard.suit.equals("Maca") && !me.myHandContainsThisSuit(firstCard) ){

            if(me.myHandContainsThisSuit(new Card("A", "Maca")))
                for(int i=DeckofCards.faces.length-1; i>=0;i--){
                    if(me.myHandContainsThisCard(new Card(DeckofCards.faces[i], "Maca")))
                        return new Card(DeckofCards.faces[i], "Maca");
                }
            else
                for(int i=DeckofCards.faces.length-1; i>=0;i--){
                    if(firstCard.suit.equals("Sinek")){

                        if(me.myHandContainsThisCard(new Card(DeckofCards.faces[i], "Kupa")))
                            return new Card(DeckofCards.faces[i], "Kupa");;
                        if(me.myHandContainsThisCard(new Card(DeckofCards.faces[i], "Karo")))
                            return new Card(DeckofCards.faces[i], "Karo");
                    }
                    if(firstCard.suit.equals("Kupa")){
                        if(me.myHandContainsThisCard(new Card(DeckofCards.faces[i], "Sinek")))
                            return new Card(DeckofCards.faces[i], "Sinek");
                        if(me.myHandContainsThisCard(new Card(DeckofCards.faces[i], "Karo")))
                            return new Card(DeckofCards.faces[i], "Karo");

                    }
                    if(firstCard.suit.equals("Karo")){

                        if(me.myHandContainsThisCard(new Card(DeckofCards.faces[i], "Kupa")))
                            return new Card(DeckofCards.faces[i], "Kupa");
                        if(me.myHandContainsThisCard(new Card(DeckofCards.faces[i], "Sinek")))
                            return new Card(DeckofCards.faces[i], "Sinek");
                    }
                }

        }
        
            //elimde maca var ise ve ilk kartın suitinden yok ise
        //eğer ilk kart maca değilse ve ikinci ya da ucuncu kart maca ise ve benim elimde ilk kartın suitinden var ise en düşük kartı oyna

        //card,maca,maca,!card or card,Notmaca,maca,!card or 
        me.shortHand();
        if(!firstCard.suit.equals("Maca") && secondCard.suit.equals("Maca")|| thirdCard.suit.equals("Maca") && !me.myHandContainsThisSuit(firstCard) ){
            if(secondCard.suit.equals("Maca") & thirdCard.suit.equals("Maca") ){
                if(me.compareFace(secondCard, thirdCard)==1){
                    highestCard=new Card(secondCard.face, secondCard.suit);
                }
                else
                    highestCard=new Card(thirdCard.face, secondCard.suit);
            }
            if(secondCard.suit.equals("Maca") & !thirdCard.suit.equals("Maca") )
                highestCard= new Card(secondCard.face, secondCard.suit);
            if(!secondCard.suit.equals("Maca") && thirdCard.suit.equals("Maca") )
                highestCard= new Card(thirdCard.face, thirdCard.suit);


            if(highestCard != null){
                if(me.myHandContainsThisSuit(new Card("A", "Maca"))){ //play higher maca
                    for(int i=DeckofCards.faces.length-1; i>=0;i--){
                        if(me.compareFace(highestCard, new Card(DeckofCards.faces[i], "Maca"))==1 && me.myHandContainsThisCard(new Card(DeckofCards.faces[i], "Maca")))
                            return new Card(DeckofCards.faces[i], "Maca");
                    }
                    for(int i=DeckofCards.faces.length-1; i>=0;i--){ //play lowest maca
                        if(me.myHandContainsThisCard(new Card(DeckofCards.faces[i], "Maca")))
                            return new Card(DeckofCards.faces[i], "Maca");
                    }
                }
                
                else
                    for(int i=DeckofCards.faces.length-1; i>=0;i--){ //play lowest card
                        
                        if(me.myHandContainsThisCard(new Card(DeckofCards.faces[i], "Kupa")))
                            return new Card(DeckofCards.faces[i], "Kupa");
                        if(me.myHandContainsThisCard(new Card(DeckofCards.faces[i], "Sinek")))
                            return new Card(DeckofCards.faces[i], "Sinek");
                        if(me.myHandContainsThisCard(new Card(DeckofCards.faces[i], "Karo")))
                            return new Card(DeckofCards.faces[i], "Karo");
                    }
                    
            }
        
        }       
        if(me.myHandContainsThisSuit(new Card("A",firstCard.suit))){ //my hand contains firstCard's suit's card Same,Same,Same,Same
            if(secondCard.suit.equals(firstCard.suit) && thirdCard.suit.equals(firstCard.suit)){ // first second and third card has same suit 
                if(me.compareFace(firstCard, secondCard)==1 && me.compareFace(firstCard, thirdCard)==1)
                    highestCard= new Card(firstCard.face, firstCard.suit);
                if(me.compareFace(secondCard, firstCard)==1 && me.compareFace(secondCard, thirdCard)==1)
                    highestCard= new Card(secondCard.face, secondCard.suit);
                if(me.compareFace(thirdCard, firstCard)==1 && me.compareFace(thirdCard, secondCard)==1)
                    highestCard= new Card(secondCard.face, secondCard.suit);
                if(highestCard!=null){
                    for(int i=DeckofCards.faces.length-1; i>=0;i--){ // return higher card from deck
                        if(me.myHandContainsThisCard(new Card (DeckofCards.faces[i],highestCard.suit)) && me.compareFace(new Card (DeckofCards.faces[i],highestCard.suit), highestCard)==1)
                            return new Card (DeckofCards.faces[i],highestCard.suit);
                    }
                    for(int i=DeckofCards.faces.length-1; i>=0;i--){ // we cannot win,try lowest Card
                        if(me.myHandContainsThisCard(new Card (DeckofCards.faces[i],highestCard.suit)))
                            return new Card (DeckofCards.faces[i],highestCard.suit);
                    }
                }
                    
            }
            if(firstCard.face.equals("Maca")){ //Maca,notMaca,Maca,Maca or Maca,Maca,notMaca,Maca or Maca,notMaca,notMaca,Maca or Maca Maca Maca Maca
                if(secondCard.suit.equals(firstCard.suit)){
                    if(me.compareFace(firstCard, secondCard)==1)
                        highestCard=new Card(firstCard.face, firstCard.suit);
                    else
                        highestCard=new Card(secondCard.face, secondCard.suit);

                }
                else if(thirdCard.suit.equals(firstCard.suit) && secondCard.suit.equals(firstCard.suit)){
                    if(me.compareFace(firstCard, secondCard)==1 && me.compareFace(firstCard, thirdCard)==1)
                        highestCard= new Card(firstCard.face, firstCard.suit);
                    if(me.compareFace(secondCard, firstCard)==1 && me.compareFace(secondCard, thirdCard)==1)
                        highestCard= new Card(secondCard.face, secondCard.suit);
                    if(me.compareFace(thirdCard, firstCard)==1 && me.compareFace(thirdCard, secondCard)==1)
                        highestCard= new Card(secondCard.face, secondCard.suit);
                }
                else if(thirdCard.suit.equals(firstCard.suit)){
                    if(me.compareFace(firstCard, secondCard)==1)
                        highestCard=new Card(firstCard.face, firstCard.suit);
                    else
                        highestCard=new Card(secondCard.face, secondCard.suit);
                }
                else
                    highestCard=new Card(firstCard.face, firstCard.suit);

                if(highestCard!=null){
                    for(int i=DeckofCards.faces.length-1; i>=0;i--){ // return higher card from deck
                        if(me.myHandContainsThisCard(new Card (DeckofCards.faces[i],highestCard.suit)) && me.compareFace(new Card (DeckofCards.faces[i],highestCard.suit), highestCard)==1)
                            return new Card (DeckofCards.faces[i],highestCard.suit);
                    }
                    for(int i=DeckofCards.faces.length-1; i>=0;i--){ // we cannot win,try lowest Card
                        if(me.myHandContainsThisCard(new Card (DeckofCards.faces[i],highestCard.suit)))
                            return new Card (DeckofCards.faces[i],highestCard.suit);
                    }
                }
                

            }

            

        }
        if(me.myHandContainsThisSuit(firstCard) && secondCard.suit.equals("Maca") && thirdCard.suit.equals(firstCard.suit)){
            
                if(thirdCard.face.equals(firstCard.suit)){
                    if(me.compareFace(firstCard, thirdCard)==1){

                        for (int i=DeckofCards.faces.length-1; i>=0;i--) {
                        if(me.myHandContainsThisCard(new Card(DeckofCards.faces[i], firstCard.suit)) && me.compareFace(new Card(DeckofCards.faces[i], firstCard.suit), firstCard)==1)
                        return new Card(DeckofCards.faces[i], firstCard.suit);
                        }
                    }
                    else{

                        for (int i=DeckofCards.faces.length-1; i>=0;i--) {

                        if(me.myHandContainsThisCard(new Card(DeckofCards.faces[i], thirdCard.suit)) && me.compareFace(new Card(DeckofCards.faces[i], thirdCard.suit), thirdCard)==1)
                        return new Card(DeckofCards.faces[i], firstCard.suit);
                        }
                    }
                }
                else {

                    for (int i=DeckofCards.faces.length-1; i>=0;i--) {

                    if(me.myHandContainsThisCard(new Card(DeckofCards.faces[i], firstCard.suit)) && me.compareFace(new Card(DeckofCards.faces[i], firstCard.suit), firstCard)==1)
                        return new Card(DeckofCards.faces[i], firstCard.suit);
                    }
                }
            

        }
        if(me.myHandContainsThisSuit(firstCard) && !secondCard.suit.equals("Maca") && thirdCard.suit.equals("Maca")){
            
                if(secondCard.face.equals(firstCard.suit)){
                    if(me.compareFace(firstCard, secondCard)==1){

                        for (int i=DeckofCards.faces.length-1; i>=0;i--) {
                        if(me.myHandContainsThisCard(new Card(DeckofCards.faces[i], firstCard.suit)) && me.compareFace(new Card(DeckofCards.faces[i], firstCard.suit), firstCard)==1)
                        return new Card(DeckofCards.faces[i], firstCard.suit);
                        }
                    }
                    else{

                        for (int i=DeckofCards.faces.length-1; i>=0;i--) {
                        if(me.myHandContainsThisCard(new Card(DeckofCards.faces[i], secondCard.suit)) && me.compareFace(new Card(DeckofCards.faces[i], secondCard.suit), secondCard)==1)
                        return new Card(DeckofCards.faces[i], firstCard.suit);
                        }
                    }
                }
                else {

                    for (int i=DeckofCards.faces.length-1; i>=0;i--) {
                    if(me.myHandContainsThisCard(new Card(DeckofCards.faces[i], firstCard.suit)) && me.compareFace(new Card(DeckofCards.faces[i], firstCard.suit), firstCard)==1)
                        return new Card(DeckofCards.faces[i], firstCard.suit);
                    }
                }
            

        }
        for(int i=DeckofCards.faces.length-1; i>=0;i--){ //play lowest card
                        
            if(me.myHandContainsThisCard(new Card(DeckofCards.faces[i], "Kupa")))
                return new Card(DeckofCards.faces[i], "Kupa");
            if(me.myHandContainsThisCard(new Card(DeckofCards.faces[i], "Sinek")))
                return new Card(DeckofCards.faces[i], "Sinek");
            if(me.myHandContainsThisCard(new Card(DeckofCards.faces[i], "Karo")))
                return new Card(DeckofCards.faces[i], "Karo");
        }

        //ikinci ve ücüncü kart,ilk kartın suitindense ve ortadaki kartıların en yükseğinden yükseği var ise oyna
        //
        return me.playerHand.get(0);
    }   
    public Card firstRandom(Player me){
        Random ran = new Random();
        int x = ran.nextInt(me.playerHand.size());
        return me.playerHand.get(x);
    }
    public Card otherCard (Card firstCard,Player me){
        Random ran = new Random();
        if(me.playerHand.size()==1)
            return me.playerHand.get(0);
        if(me.myHandContainsThisSuit(firstCard)){
            int count =0;
            while(true){
                count++;
                int x = ran.nextInt(me.playerHand.size());
                if(count<50)
                //System.out.println(me.playerHand.get(x).suit.equals(firstCard.suit) +"    " + x +" "+me.myHandContainsThisCard(new Card(me.playerHand.get(x).face, me.playerHand.get(x).suit)));
                if(me.playerHand.get(x).suit.equals(firstCard.suit) && me.myHandContainsThisCard(new Card(me.playerHand.get(x).face, me.playerHand.get(x).suit)))
                    return new Card(me.playerHand.get(x).face, me.playerHand.get(x).suit);
            }
        }
        else
        {
            if(me.myHandContainsThisSuit(new Card("A", "Maca")))
            {
                
                
                while(true){
                    
                    int x = ran.nextInt(me.playerHand.size());
                    if(me.playerHand.get(x).suit.equals("Maca") && me.myHandContainsThisCard(new Card(me.playerHand.get(x).face, me.playerHand.get(x).suit)))
                        return new Card(me.playerHand.get(x).face, me.playerHand.get(x).suit);
                }
            }
            else{
                System.out.println("23");

                while(true){
                    
                    int x = ran.nextInt(me.playerHand.size());
                    if( me.myHandContainsThisCard(new Card(me.playerHand.get(x).face, me.playerHand.get(x).suit)))
                        return new Card(me.playerHand.get(x).face, me.playerHand.get(x).suit);
                }
            }
        }
        
    }
}
