public class InventoryItem {

    protected final Item item;

    public InventoryItem(Item item) {
        this.item = item;
    }

    public static InventoryItem create(Item item) {
        if (item.name.equals(AgedBrie.NAME)) {
            return new AgedBrie(item);
        } else if (item.name.equals(BackStage.NAME)) {
            return new BackStage(item);
        } else if (item.name.equals(Sulfuras.NAME)) {
            return new Sulfuras(item);
        }
        return new InventoryItem(item);
    }

    public void dailyUpdate() {
        updateQuality();

        updateExpiration();

        if (isExpired()) {
            processExpired();
        }
    }

    protected void updateQuality() {
        decreaseQuality();
    }

    protected void updateExpiration() {
        item.sellIn--;
    }

    protected boolean isExpired() {
        return item.sellIn < 0;
    }

    protected void processExpired() {
        decreaseQuality();
    }

    protected void increaseQuality() {
        if (item.quality < 50) {
            item.quality++;
        }
    }

    protected void decreaseQuality() {
        if (item.quality > 0) {
            item.quality--;
        }
    }
}
