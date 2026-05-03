package Linked_List;
import java.util.Arrays;
import java.util.Comparator;

class Item {
    int weight, value;
    float ratio;
    Item(int weight, int value) {
        this.weight = weight;
        this.value = value;
        this.ratio = (float) value / weight;
    }
}

public class FractionalKnapsack {
    static void sortByRatio(Item[] it) {
        Arrays.sort(it, new Comparator<Item>() {
            @Override
            public int compare(Item a, Item b) {
                return Float.compare(b.ratio, a.ratio);
            }
        });
    }

    public static void main(String[] args) {
        Item[] it = {
            new Item(10, 60),
            new Item(20, 100),
            new Item(30, 120)
        };

        int capacity = 50;
        sortByRatio(it);
        float total = 0;
        for (Item item : it) {
            if (capacity >= item.weight) {
                capacity -= item.weight;
                total += item.value;
            } else {
                total += item.ratio * capacity;
                break;
            }
        }
        System.out.printf("Maximum Value = %.2f", total);
    }
}