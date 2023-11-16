package com.gildedrose;

public class NormalItemWrapper implements ItemWrapper {
    protected final Item item;

    NormalItemWrapper(Item item) {
        this.item = item;
    }

    public void updateQuality() {
        updateQualityInternal();

        updateSellIn();

        if (item.sellIn < 0) {
            updateQualityAfterSellIn();
        }
    }

    protected void updateQualityInternal() {
        if (item.quality > 0) {
            item.quality = item.quality - 1;
        }
    }

    protected void updateQualityAfterSellIn() {
        if (item.quality > 0) {
            item.quality = item.quality - 1;
        }
    }

    protected void updateSellIn() {
        item.sellIn = item.sellIn - 1;
    }
}
