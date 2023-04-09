package com.topicwise.array.difficult;

import java.util.ArrayList;

class Trade{
    int buy,sell,buyPrice,sellPrice;
}
public class StockBuySell {

    public void stock(int [] price)
    {
        int n = price.length;
        if(n < 1)
            return;
        int i = 0, count =0;
        ArrayList<Trade> trades = new ArrayList<>();
        while(i < n-1) {
            while(i<n-1 && price[i+1]<=price[i])
                i++;
            if(i == n-1)
                return;
            Trade trade = new Trade();
            trade.buy = i++;
            trade.buyPrice = price[trade.buy];

            while (i<n && price[i] >= price[i - 1])
                i++;
            trade.sell = i - 1;
            trade.sellPrice = price[trade.sell];

            trades.add(trade);
            count++;
        }
        if(count > 0)
        {
            int totalProfit =0;
            for(Trade t : trades)
            {
                totalProfit += t.sellPrice - t.buyPrice;
                System.out.println( " buy on day : " + t.buy + " , sell on day : " + t.sell + " with profit : "+ (t.sellPrice - t.buyPrice));
            }
            System.out.println("Total profit  : " + totalProfit);
        }
    }
}
