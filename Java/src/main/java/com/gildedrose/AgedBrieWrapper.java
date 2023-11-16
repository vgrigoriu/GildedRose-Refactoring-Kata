package com.gildedrose;

public class AgedBrieWrapper extends NormalItemWrapper {
    AgedBrieWrapper(Item item) {
        super(item);
    }

    @Override
    protected void updateQualityInternal() {
        if (item.quality < 50) {
            item.quality = item.quality + 1;
        }
    }

    @Override
    protected void updateQualityAfterSellIn() {
        if (item.quality < 50) {
            item.quality = item.quality + 1;
        }
    }
}
