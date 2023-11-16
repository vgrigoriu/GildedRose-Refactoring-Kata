package com.gildedrose;

public class LegendaryItemWrapper extends NormalItemWrapper {
    LegendaryItemWrapper(Item item) {
        super(item);
    }

    @Override
    public void updateQuality() {
        // do nothing, legendary items never decrease in quality
    }

    @Override
    protected void updateSellIn() {
        // do nothing, legendary items never have to be sold
    }
}
