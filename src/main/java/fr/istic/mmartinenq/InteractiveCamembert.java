package fr.istic.mmartinenq;

import fr.istic.mmartinenq.controller.CamembertController;
import fr.istic.mmartinenq.model.CamembertModel;
import fr.istic.mmartinenq.model.ICamembertModel;
import fr.istic.mmartinenq.view.CamembertView;
import fr.istic.mmartinenq.view.ICamembertView;

import javax.swing.JFrame;
import java.awt.GridLayout;

public class InteractiveCamembert {

    public static void main(String[] a) {
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setBounds(30, 30, 400, 400);
        window.setTitle("Interactive Camembert");

        // Create an instance of the model
        ICamembertModel model = new CamembertModel("Budget", "€");

        // Maybe put some data in the model
        int oldFirst = 0;
        int oldLast = 0;
        model.addItem("Essence", "SP95 pour 206", 200);
        model.addItem("Courses", "Achats alimentaires", 160);
        model.addItem("Masques", "Masques pour présence en cours", 30);

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
//        window.pack();
    }

}
