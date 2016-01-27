package WindowEnum;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MainWindow implements ActionListener {
    JTextField textField;
    JTextField textField2;
    JButton enter;
    JLabel input, contents,inputPeople;

    MainWindow() {
        JFrame mainwindow = new JFrame("Выбор автомобиля");
        mainwindow.setLayout(new FlowLayout());
        mainwindow.setSize(250, 200);
        mainwindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainwindow.setVisible(true);

        textField = new JTextField(10);
        textField2 = new JTextField(10);

        JButton enter = new JButton("Ввод даных");

        textField2.addActionListener(this);
        textField.addActionListener(this);
        enter.addActionListener(this);

        input = new JLabel("Введите желаемую скорость(до 300)");
        contents = new JLabel("");
        inputPeople = new JLabel("Введите кол-во людей (до 7 человек)");

        mainwindow.add(input);
        mainwindow.add(textField);
        mainwindow.add(inputPeople);
        mainwindow.add(textField2);
        mainwindow.add(enter);
        mainwindow.add(contents);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String newText;
        AnalyzeMethod analyze = new AnalyzeMethod();
        boolean goon = false;
        String people = "";
        String speed = "";

        do {
            if (e.getActionCommand().equals("Ввод даных")) {
                 speed = textField.getText();
                people = textField2.getText();

                goon = true;
            }
        } while (goon != true);


        newText = analyze.analyzeSpeed(speed,people);
        contents.setText(newText);
    }

}


