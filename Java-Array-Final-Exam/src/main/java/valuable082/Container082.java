package valuable082;
import util082.Tool082;

import java.util.Arrays;

public class Container082 {
    private final Item082[] items = new Item082[999];
    private int currentIndex = 0;


    public int getSize() {
        return items.length;
    }
    public int getElementSize() {
        return currentIndex;
    }

    @Override
    public String toString() {
        return "Container082{" +
                "items=" + Arrays.toString(items) +
                '}';
    }

    public Item082[] getArrObject() {
        return this.items;
    }

    public Boolean add(Item082 item) {
        if (item == null) return false;
        for (int i = 0; i < this.items.length;i++){
            if (items[i] != null && items[i].isMatched(item)) {
                items[i].addAmount(item);
                return false;
            };
        }
        items[currentIndex++] = item;
        return true;
    }

    public Boolean remove(Item082 item){
        if (item == null) return false;
        for (int i = 0; i < this.items.length;i++){
            if (items[i] == item){
                items[i] = null;
                return true;
            };
        }
        return false;
    }
}
