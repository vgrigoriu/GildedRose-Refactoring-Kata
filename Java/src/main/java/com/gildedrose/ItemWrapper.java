package com.gildedrose;

public interface ItemWrapper {
    void updateQuality();

    static ItemWrapper of(Item item) {
        if (item.name.equals("Sulfuras, Hand of Ragnaros")) {
            return new LegendaryItemWrapper(item);
        }
        return new NormalItemWrapper(item);
    }
}
