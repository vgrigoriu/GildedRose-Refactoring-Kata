package com.gildedrose;

public interface ItemWrapper {
    void updateQuality();

    static ItemWrapper of(Item item) {
        return new NormalItemWrapper(item);
    }
}
