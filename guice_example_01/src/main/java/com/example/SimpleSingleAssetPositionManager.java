package com.example;

/**
 * Created by robertwood on 7/8/17.
 */
public class SimpleSingleAssetPositionManager implements SingleAssetPositionManager {

    private Integer cumQuantity;
    private Double  profitLoss;
    private Double  cumBuyValue = 0.0;
    private Integer cumBuyQuantity = 0;
    private Double  cumSellValue = 0.0;
    private Integer cumSellQuantity = 0;

    public SimpleSingleAssetPositionManager() {
        this.cumQuantity = 0;
        this.profitLoss = 0.0;
    }

    // {DataLink:URL:https://stackoverflow.com/questions/9915653/how-to-calculate-iteratively-the-running-weighted-average-so-that-last-values-to}
    public void processTrade(Trade trade) {
        cumQuantity += trade.getQuantity();

        if (trade.getTradeType() == Trade.TradeType.Buy) {
            cumBuyValue += trade.getQuantity() * trade.getPrice();
            cumBuyQuantity += trade.getQuantity();
        }
        else {
            cumSellValue += trade.getQuantity() * trade.getPrice();
            cumSellQuantity += trade.getQuantity();
        }

        if (cumBuyQuantity > 0 && cumSellQuantity > 0) {
            profitLoss += cumSellValue - cumBuyValue;
        }

    }

    public Integer getCumQuantity() {
        return cumQuantity;
    }

    public Double getProfitLoss() {
        return profitLoss;
    }

    public Double getCumBuyValue() {
        return cumBuyValue;
    }

    public Integer getCumBuyQuantity() {
        return cumBuyQuantity;
    }

    public Double getCumSellValue() {
        return cumSellValue;
    }

    public Integer getCumSellQuantity() {
        return cumSellQuantity;
    }

    public String getStatus() {
        StringBuilder strBldr = new StringBuilder();
        strBldr.append("ProfitLoss: " + profitLoss + ", ");
        strBldr.append("CumBuyQuantity: " + cumBuyQuantity + ", ");
        strBldr.append("CumSellQuantity: " + cumSellQuantity);
        return strBldr.toString();
    }
}
