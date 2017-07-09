package com.example;

import com.google.inject.AbstractModule;

/**
 * Created by robertwood on 7/8/17.
 */
public class TradingModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(SingleAssetPositionManager.class).to(SimpleSingleAssetPositionManager.class);
    }
}
