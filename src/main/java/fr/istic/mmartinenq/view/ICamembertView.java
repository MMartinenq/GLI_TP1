package fr.istic.mmartinenq.view;

import fr.istic.mmartinenq.controller.CamembertController;

public interface ICamembertView {

    void setController(CamembertController c);

    void selectPie(int i);

    void deSelect();

    void nextPie();

    void previousPie();

}
