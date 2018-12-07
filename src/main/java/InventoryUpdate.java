import java.util.ArrayList;
import java.util.List;

public class InventoryUpdate {

    //Compare and update the inventory  against a second inventory of a fresh delivery. Update the current existing
    // inventory item quantities (in arr1). If an item cannot be found, add the new item and quantity into the inventory array. The
    // returned inventory array should be in alphabetical order by item.


    public static void main(String[] args) {
        InventoryItem[] currentlyInStore = new InventoryItem[3];
        InventoryItem[] addingToStore = new InventoryItem[3];
        currentlyInStore[0] = new InventoryItem(21, "Bowling Ball");
        currentlyInStore[1] = new InventoryItem(2, "Dirty Sock");
        currentlyInStore[2] = new InventoryItem(1, "Hair Pin");
        addingToStore[0] = new InventoryItem(2, "Hair Pin");
        addingToStore[1] = new InventoryItem(3, "Apple");
        addingToStore[2] = new InventoryItem(67, "Bowling Ball");
        List<InventoryItem> listToAdd = new ArrayList<>();

        for (InventoryItem anAddingToStore : addingToStore) {
            for (InventoryItem aCurrentlyInStore : currentlyInStore) {
                if (aCurrentlyInStore.getName().equals(anAddingToStore.getName())) {
                    aCurrentlyInStore.setNumber(aCurrentlyInStore.getNumber() + anAddingToStore.getNumber());
                    System.out.println(aCurrentlyInStore);
                } else {
                    if (!listToAdd.contains(anAddingToStore)) {
                        listToAdd.add(anAddingToStore);
                        System.out.println(anAddingToStore);
                    }


                }
            }

        }

    }
}

class InventoryItem {
    private int number;
    private String name;

    public InventoryItem(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "InventoryItem{" +
                "number=" + number +
                ", name='" + name + '\'' +
                '}';
    }
}
