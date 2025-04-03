package br.ufpb.dcx.erick.leandro;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame extends JFrame implements ActionListener{
    SistemaRPGDeErick sistema = new SistemaRPGDeErick();
    JButton button1;
    JButton button2;
    JPanel panel;
    JLayeredPane layer;
    JTextField textField1;
    JTextField textField2;
    JTextField textField3;


    Frame() {
        textField1 = new JTextField();
        textField1.setBounds(0, 0, 240,60);
        textField1.setVisible(false);

        textField2 = new JTextField();
        textField2.setBounds(0, 80, 240, 60);
        textField2.setVisible(false);

        textField3 = new JTextField();
        textField3.setBounds(0, 160, 240, 60);
        textField3.setVisible(false);

        panel = new JPanel();

        button1 = new JButton();
        button1.setBounds(0, 590, 190, 80);
        button1.addActionListener(this);
        button1.setText("Criar Personagem");
        button1.setFocusable(false);

        button2 = new JButton();
        button2.setBounds(500, 600, 100, 80);
        button2.addActionListener(this);
        button2.setText("Criar");
        button2.setFocusable(false);
        button2.setVisible(false);

        layer = new JLayeredPane();
        layer.add(textField1, JLayeredPane.DRAG_LAYER);
        layer.add(textField3, JLayeredPane.DRAG_LAYER);
        layer.add(textField2, JLayeredPane.DRAG_LAYER);
        layer.add(button1, JLayeredPane.DRAG_LAYER);
        layer.add(button2, JLayeredPane.DRAG_LAYER);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(720, 720);
        this.add(layer);
        this.setVisible(true);


    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button1){
            layer.setBounds(0, 0, 720,720);
            //panel.setBackground(Color.red);
            if(!layer.isVisible()){

                layer.setVisible(true);


                textField1.setVisible(true);
                textField2.setVisible(true);
                textField3.setVisible(true);


                button1.setBackground(Color.gray);
                button2.setBackground(null);
                button2.setVisible(true);
            }else{

                layer.setVisible(false);


                button1.setBackground(null);
                button2.setVisible(false);


                textField1.setVisible(false);
                textField2.setVisible(false);
                textField3.setVisible(false);

            }
        }
        if(e.getSource() == button2){
            String nomeDoPersonagem = textField1.getText();
            String nomeDoJogador = textField2.getText();
            String descricao = textField3.getText();
            sistema.cadastrarPersonagem(new PersonagemRPG(nomeDoPersonagem, nomeDoJogador, descricao));
            layer.setVisible(false);


            button2.setBackground(Color.gray);
        }

    }
}
