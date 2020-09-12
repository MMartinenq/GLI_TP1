package fr.istic.mmartinenq;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class CamembertModel extends Observable implements ICamembertModel {

    private String title;
    private String unit;
    private List<Item> itemList;

    public CamembertModel(String title, String unit) {
        this.title = title;
        this.unit = unit;
        this.itemList = new ArrayList<>();
    }

    @Override
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
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

    @Override
    public int size() {
        return itemList.size();
    }

    @Override
    public double total() {
        float total = 0;
        for (Item item : itemList)
            total += item.getValue();
        return total;
    }

    @Override
    public double getValues(int i) {
        return itemList.get(i).getValue();
    }

    @Override
    public String getTitle(int i) {
        return itemList.get(i).getTitle();
    }

    @Override
    public String getDescription(int i) {
        return itemList.get(i).getDescription();
    }

    @Override
    public void addObserver(CamembertView camembertView) {
        this.addObserver(camembertView);
    }

//    public void addItem(String name, String description, double value) {
//        this.itemList.add(new Item(name, description, value));
//    }
//
//    public void removeItem(String name) {
//        for (Item item : itemList) {
//            if (item.getName().equals(name)) {
//                itemList.remove(item);
//                break;
//            }
//        }
//    }

}
