package fr.istic.mmartinenq.model;

import fr.istic.mmartinenq.view.CamembertView;

public interface ICamembertModel {

    String getTitle();

    String getUnit();

    int size();

    double total();

    double getValues(int i);

    String getTitle(int i);

    String getDescription(int i);

    void addObserver(CamembertView camembertView);

    void addItem(String name, String description, double value);

    void removeItem(String title);

}
