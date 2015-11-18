package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * Created by Mike on 10/26/2015.
 */
public class PetSurvey extends JFrame{
    private JPanel rootPanel;
    private JCheckBox dogCheckBox;
    private JCheckBox catCheckBox;
    private JCheckBox fishCheckBox;
    private JButton submitButton;
    private JLabel SurveyResults;
    private JButton quitButton;

    private boolean hasDogs;
    private boolean hasCats;
    private boolean hasFish;

    protected PetSurvey(){
        super("Pet Survey");
        setContentPane(rootPanel);
        setPreferredSize(new Dimension(300,300));
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        fishCheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent itemEvent) {
                hasFish = fishCheckBox.isSelected();

            }
        });
        catCheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent itemEvent) {
                hasCats = catCheckBox.isSelected();
            }
        });
        dogCheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent itemEvent) {
                hasDogs = dogCheckBox.isSelected();
            }
        });
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String dog = (hasDogs) ? "a dog" : "no dogs";
                String cat = (hasCats) ? "a cat" : "no cats";
                String fish = (hasFish) ? "a fish" : "no fish";

                String surveyResult = "User has " + dog + " and " + cat + " and " + fish;
                SurveyResults.setText(surveyResult);
            }
        });
        quitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.exit(0);

            }
        });
    }
}
