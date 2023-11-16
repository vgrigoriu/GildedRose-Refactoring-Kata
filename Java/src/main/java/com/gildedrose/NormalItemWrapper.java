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

        normalizeQuality();
    }

    private void normalizeQuality() {
        if (item.quality > 50) {
            item.quality = 50;
        }
        if (item.quality < 0) {
            item.quality = 0;
        }
    }

    protected void updateQualityInternal() {
        item.quality = item.quality - 1;
    }

    protected void updateQualityAfterSellIn() {
        item.quality = item.quality - 1;
    }

    protected void updateSellIn() {
        item.sellIn = item.sellIn - 1;
    }
}
