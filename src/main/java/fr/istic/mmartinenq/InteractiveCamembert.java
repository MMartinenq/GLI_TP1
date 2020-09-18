package fr.istic.mmartinenq;

import fr.istic.mmartinenq.controller.CamembertController;
import fr.istic.mmartinenq.model.CamembertModelAdapter;
import fr.istic.mmartinenq.model.ICamembertModel;
import fr.istic.mmartinenq.model.Item;
import fr.istic.mmartinenq.view.CamembertView;
import fr.istic.mmartinenq.view.ICamembertView;

import javax.swing.JFrame;
import java.awt.*;

public class InteractiveCamembert {

    public static void main(String[] a) {
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setMinimumSize(new Dimension(650, 600));
        window.setBounds(30, 30, 400, 400);
        window.setTitle("Interactive Camembert");

        // Create an instance of the model
        ICamembertModel model = new CamembertModelAdapter("Budget", "€");

        // Maybe put some data in the model
        model.addItem(new Item("Essence", "SP95 pour 206", 200));
        model.addItem(new Item("Courses", "Achats alimentaires", 160));
        model.addItem(new Item("Masques", "Masques pour présence en cours", 30));

        // Create the controller and the view and link all together
        ICamembertView view = new CamembertView(model);
        CamembertController controller = new CamembertController(model, view);
        view.setController(controller);

        // Display layout
        GridLayout layout = new GridLayout(1, 2);

        window.getContentPane().add((CamembertView)controller.getView());

        window.setLayout(layout);
        window.pack();
        window.setVisible(true);
    }

}
