package com.gildedrose;

public class AgedBrieWrapper extends NormalItemWrapper {
    AgedBrieWrapper(Item item) {
        super(item);
    }

    @Override
    public void updateQuality() {
        if (item.quality < 50) {
            item.quality = item.quality + 1;
        }
        updateSellIn();
        if (item.sellIn < 0) {
            if (item.quality < 50) {
                item.quality = item.quality + 1;
            }
        }
    }
}
