package com.gildedrose;

public class ItemWrapper {
    private Item item;

    private ItemWrapper(Item item) {
        this.item = item;
    }

    public static ItemWrapper of(Item item) {
        return new ItemWrapper(item);
    }
}
