package com.codecentric.sample.store.model;

import java.util.UUID;

package com.codecentric.sample.store.model;

import com.codecentric.sample.store.model.BlackJack;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/* Online Java Compiler and Editor */

@Service
public class BlackJack{
    @Autowired
    public static void main(String []args){
        int[] deck = new int[4];
        display(deck,Integer.parseInt(args[1]));
    }

    public static int display(int[] cards, int count)
    {
         char another_card;
         int max=0;
         int player=0;
         if(count==0){
            return 0;
        }
         System.out.println("Starting game with "+ count +" players.");
         System.out.println("Shuffling.");
         for(int i=0;i<count;i++){
             int num=player(cards,i);
                         if(max<=num){
                                 max=num;
                                 player=i;
                         }
         }
        int dealers=playerdealers(cards);
         if(max>dealers){
            System.out.println("Winner Player"+player);
         }
         else{
            System.out.println("Winner Player dealers");
         }
         return 1;

    }
    public static int player(int[] cards, int num){

        cards[0] = (int) (Math.random() * 10) + 1;
        cards[1] = (int) (Math.random() * 10) + 1;
        System.out.println("Dealing to player "+ num +", card: "+ cards[0]+","+cards[0]);
        cards[3] = cards[0] + cards[1];
        if ((cards[0] == 10 && cards[1] == 1) || (cards[0] == 1 && cards[1] == 10))
            {
                System.out.println("\n!!! Blackjack !!! You win!");
                return(21);
            }
        System.out.println("\nTotal: " + cards[3] + "\n");
        cards[2] = (int) (Math.random() * 10) + 1;
        cards[3] += cards[2];
        if (cards[3] > 21){
            System.out.print("\nTotal: " + cards[3] + "\n");
           System.out.println("\n *** Bust ***");
           return(0);
        }
        if (cards[3] == 21)
        {
           System.out.println("\n!!! Blackjack !!! You win!");
           return(21);
        }
        return(cards[3]);
    }
        public static int playerdealers(int[] cards){
        cards[0] = (int) (Math.random() * 10) + 1;
        cards[1] = (int) (Math.random() * 10) + 1;
        System.out.println("Dealing to player Computer, card: "+ cards[0]+","+cards[0]);
        cards[3] = cards[0] + cards[1];
        if ((cards[0] == 10 && cards[1] == 1) || (cards[0] == 1 && cards[1] == 10))
            {
                System.out.println("\n!!! Blackjack !!! You win!");
                return(21);
            }
        System.out.println("\nTotal: " + cards[3] + "\n");
        cards[2] = (int) (Math.random() * 10) + 1;
        cards[3] += cards[2];
        if (cards[3] > 21){
            System.out.print("\nTotal: " + cards[3] + "\n");
           System.out.println("\n *** Bust ***");
           return(0);
        }
        if (cards[3] == 21)
        {
           System.out.println("\n!!! Blackjack !!! You win!");
           return(21);
        }
                return(0);
        }

}
