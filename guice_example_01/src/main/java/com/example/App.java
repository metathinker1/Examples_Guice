package com.example;


import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * Hello world!
 *
 */
public class App 
{


    public static void main( String[] args )
    {
        System.out.println( "Starting App" );
        Injector injector = Guice.createInjector(new TradingModule());

        TradingService tradingService = injector.getInstance(TradingService.class);

        Trade trade;
        trade = new Trade("APPL", 10, 800.0, Trade.TradeType.Buy);
        tradingService.processTrade(trade);
        System.out.println(tradingService.getStatus());

        trade = new Trade("APPL", 5, 810.0, Trade.TradeType.Sell);
        tradingService.processTrade(trade);
        System.out.println(tradingService.getStatus());
    }
}
