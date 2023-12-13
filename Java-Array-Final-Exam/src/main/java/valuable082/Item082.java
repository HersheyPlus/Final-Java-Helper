package valuable082;
import java.util.Objects;

import static util082.Tool082.*;
public class Item082 {
    private final String name;
    private final int amount;

    public Item082(String name, int amount){
        this.name = name;
        this.amount = amount;
    }
    public static Object create(String name, int amount){
        if (!isUseable082(name) || amount < 0) return null;
        Object newItem082 = new Item082(name,amount);
        return newItem082;
    }

    public String getName() {
        return this.name;
    }

    public int getAmount() {
        return this.amount;
    }


    @Override
    public String toString() {
        return "(" + name + "," + amount +")";
    }

    public int addAmount(Item082 item){
        int sum = this.amount + item.getAmount();
        return sum;
    }
    public Boolean isMatched(Item082 item){
        return this.name.equals(item.getName());
//        return this.name == item.getName();
    }


}
