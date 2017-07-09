package com.example;

/**
 * Created by robertwood on 7/8/17.
 */
public class Trade {

    public enum TradeType {
        Buy, Sell
    }

    private final String assetId;
    private final Integer quantity;
    private final Double price;
    private final TradeType tradeType;

    public Trade(String assetId, Integer quantity, Double price, TradeType tradeType) {
        this.assetId = assetId;
        this.quantity = quantity;
        this.price = price;
        this.tradeType = tradeType;
    }

    public String getAssetId() {
        return assetId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Double getPrice() {
        return price;
    }

    public TradeType getTradeType() {
        return tradeType;
    }
}
