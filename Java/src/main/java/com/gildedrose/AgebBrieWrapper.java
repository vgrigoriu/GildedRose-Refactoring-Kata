package com.gildedrose;

public class AgebBrieWrapper extends NormalItemWrapper {
    AgebBrieWrapper(Item item) {
        super(item);
    }

    @Override
    public void updateQuality() {
        if (item.quality < 50) {
            item.quality = item.quality + 1;
        }
    }
}
