package com.example;

/**
 * Created by robertwood on 7/8/17.
 */
public interface SingleAssetPositionManager {

    // ASSUME: Client code only sends Trades with same assetId
    void processTrade(Trade trade);
    Integer getCumQuantity();
    Double getProfitLoss();
    String getStatus();
}
