package fr.istic.mmartinenq.model;

import java.util.ArrayList;
import java.util.List;

public class CamembertModel {

    protected String title;
    protected String unit;
    protected List<Item> itemList;

    public CamembertModel(String title, String unit) {
        this.title = title;
        this.unit = unit;
        this.itemList = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public List<Item> getItemList() {
        return itemList;
    }

    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }

    public int size() {
        return itemList.size();
    }

    public double total() {
        float total = 0;
        for (Item item : itemList)
            total += item.getValue();
        return total;
    }

    public double getValues(int i) {
        return itemList.get(i).getValue();
    }

    public String getTitle(int i) {
        return itemList.get(i).getTitle();
    }

    public String getDescription(int i) {
        return itemList.get(i).getDescription();
    }

    public void addItem(Item item) {
        itemList.add(item);
    }

    public void removeItem(int i) {
        itemList.remove(i);
    }

}
