package com.gildedrose;

public class BackstagePassesWrapper extends NormalItemWrapper {
    BackstagePassesWrapper(Item item) {
        super(item);
    }

    @Override
    public void updateQuality() {
        if (!item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
            if (item.quality > 0) {
                item.quality = item.quality - 1;
            }
        } else {
            if (item.quality < 50) {
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
        }

        updateSellIn();

        if (item.sellIn < 0) {
            if (!item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                if (item.quality > 0) {
                    item.quality = item.quality - 1;
                }
            } else {
                item.quality = 0;
            }
        }
    }
}
