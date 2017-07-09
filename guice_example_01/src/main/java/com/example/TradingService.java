package com.example;

import javax.inject.Inject;

/**
 * Created by robertwood on 7/8/17.
 */
public class TradingService {
    private final SingleAssetPositionManager positionManager;

    // Annotation causes Guide to invoke constructor
    @Inject
    TradingService(SingleAssetPositionManager positionManager) {
        this.positionManager = positionManager;
    }

    public void processTrade(Trade trade) {
        positionManager.processTrade(trade);
    }

    public Integer getCumQuantity() {
        return positionManager.getCumQuantity();
    }

    public Double getProfitLoss() {
        return positionManager.getProfitLoss();
    }

    public String getStatus() {
        return positionManager.getStatus();
    }

}
