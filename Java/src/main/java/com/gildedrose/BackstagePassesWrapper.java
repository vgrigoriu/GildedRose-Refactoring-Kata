package com.gildedrose;

public class BackstagePassesWrapper extends NormalItemWrapper {
    BackstagePassesWrapper(Item item) {
        super(item);
    }

    @Override
    protected void updateQualityInternal() {
        item.quality = item.quality + 1;

        if (item.sellIn < 11) {
            if (item.quality < 50) {
                item.quality = item.quality + 1;
            }
        }

        if (item.sellIn < 6) {
            if (item.quality < 50) {
                item.quality = item.quality + 1;
            }
        }
    }

    @Override
    protected void updateQualityAfterSellIn() {
        item.quality = 0;
    }
}
