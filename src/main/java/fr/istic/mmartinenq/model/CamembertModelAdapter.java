package fr.istic.mmartinenq.model;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.List;

public class CamembertModelAdapter extends CamembertModel implements  ICamembertModel {

    private PropertyChangeSupport support;

    public CamembertModelAdapter(String title, String unit) {
        super(title, unit);
        this.support = new PropertyChangeSupport(this);
    }

    @Override
    public void setTitle(String title) {
        super.setTitle(title);
        support.firePropertyChange("setTitle", null, null);
    }

    @Override
    public void setUnit(String unit) {
        super.setUnit(unit);
        support.firePropertyChange("setUnit", null, null);
    }

    @Override
    public void setItemList(List<Item> itemList) {
        super.setItemList(itemList);
        support.firePropertyChange("setItemList", null, null);
    }

    @Override
    public void addItem(Item item) {
        super.addItem(item);
        support.firePropertyChange("addItem", null, null);
    }

    @Override
    public void removeItem(int i) {
        super.removeItem(i);
        support.firePropertyChange("removeItem", null, null);
    }

    @Override
    public void addPropertyChangeListener(PropertyChangeListener propertyChangeListener) {
        support.addPropertyChangeListener(propertyChangeListener);
    }

}
