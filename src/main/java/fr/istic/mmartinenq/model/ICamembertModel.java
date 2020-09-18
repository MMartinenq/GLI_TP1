package fr.istic.mmartinenq.model;

import java.beans.PropertyChangeListener;

public interface ICamembertModel {

    String getTitle();

    String getUnit();

    int size();

    double total();

    double getValues(int i);

    String getTitle(int i);

    String getDescription(int i);

    void addItem(Item item);

    void removeItem(int i);

    void addPropertyChangeListener(PropertyChangeListener propertyChangeListener);

}
