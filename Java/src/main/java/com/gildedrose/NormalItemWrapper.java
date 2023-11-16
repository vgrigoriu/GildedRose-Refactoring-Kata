package com.gildedrose;

public class NormalItemWrapper implements ItemWrapper {
    protected final Item item;

    NormalItemWrapper(Item item) {
        this.item = item;
    }

    public void updateQuality() {
        if (item.quality > 0) {
            item.quality = item.quality - 1;
        }

        updateSellIn();

        if (item.sellIn < 0) {
            if (item.quality > 0) {
                item.quality = item.quality - 1;
            }
        }
    }

    protected void updateSellIn() {
        item.sellIn = item.sellIn - 1;
    }
}
