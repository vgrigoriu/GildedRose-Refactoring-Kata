package com.gildedrose;

public class AgedBrieWrapper extends NormalItemWrapper {
    AgedBrieWrapper(Item item) {
        super(item);
    }

    @Override
    protected void updateQualityInternal() {
        item.quality = item.quality + 1;
    }
}
