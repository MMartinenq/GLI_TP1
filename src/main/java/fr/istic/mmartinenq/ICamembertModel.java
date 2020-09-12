package fr.istic.mmartinenq;

public interface ICamembertModel {

    String getTitle();

    String getUnit();

    int size();

    double total();

    double getValues(int i);

    String getTitle(int i);

    String getDescription(int i);

    void addObserver(CamembertView camembertView);

}
