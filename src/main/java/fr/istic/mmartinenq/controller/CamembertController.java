package fr.istic.mmartinenq.controller;

import fr.istic.mmartinenq.model.ICamembertModel;
import fr.istic.mmartinenq.view.ICamembertView;

public class CamembertController {

    private ICamembertModel model;
    private ICamembertView view;

    private int selectedPie;
    private boolean selected;

    public CamembertController(ICamembertModel model, ICamembertView view) {
        this.model = model;
        this.view = view;
        this.selectedPie = 0;
        this.selected = false;
    }

    public ICamembertModel getModel() {
        return model;
    }

    public void setModel(ICamembertModel model) {
        this.model = model;
    }

    public ICamembertView getView() {
        return view;
    }

    public void setView(ICamembertView view) {
        this.view = view;
    }

    public int getSelectedPie() {
        return selectedPie;
    }

    public void setSelectedPie(int selectedPie) {
        this.selectedPie = selectedPie;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    public void selectPie(int i) {
        view.selectPie(i);
    }

    public void deSelect() {
        view.deSelect();
    }

    public void nextPie() {
        view.nextPie();
    }

    public void previousPie() {
        view.previousPie();
    }

    public void removePie(int i) {
        model.removeItem(i);
        deSelect();
    }

}
