package com.gildedrose;

public class LegendaryItemWrapper implements ItemWrapper {
    private final Item item;

    LegendaryItemWrapper(Item item) {
        this.item = item;
    }

    @Override
    public void updateQuality() {
        // do nothing, legendary items never decrease in quality
    }
}
