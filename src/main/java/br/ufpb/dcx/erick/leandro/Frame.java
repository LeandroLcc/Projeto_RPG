package br.ufpb.dcx.erick.leandro;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame extends JFrame implements ActionListener{
    SistemaRPGDeErick sistema = new SistemaRPGDeErick();
    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;

    JPanel panel1;
    JPanel panel2;
    JLayeredPane layer;

    JTextField textField1;
    JTextField textField2;
    JTextField textField3;
    JLabel label;


    Frame() {
        label = new JLabel();

        button1 = new JButton();
        button1.setBounds(0, 603, 160, 80);
        button1.addActionListener(this);
        button1.setText("Criar Personagem");
        button1.setFocusable(false);

        button2 = new JButton();
        button2.setBounds(365, 525, 100, 80);
        button2.addActionListener(this);
        button2.setText("Criar");
        button2.setFocusable(false);

        button3 = new JButton();
        button3.setBounds(160, 603, 160, 80);
        button3.addActionListener(this);
        button3.setText("Personagens");
        button3.setFocusable(false);

        button4 = new JButton();
        button4.setBounds(320, 603, 160, 80);
        button4.addActionListener(this);
        button4.setText("Opções");
        button4.setFocusable(false);

        textField1 = new JTextField();
        textField1.setBounds(5, 20, 240, 30);
        textField1.setVisible(false);
        textField1.setText("Nome do Personagem");

        textField2 = new JTextField();
        textField2.setBounds(5, 60, 240, 30);
        textField2.setVisible(false);
        textField2.setText("Nome do Jogador");

        textField3 = new JTextField();
        textField3.setBounds(5, 100, 240, 30);
        textField3.setVisible(false);
        textField3.setText("Descrição");

        panel1 = new JPanel();
        panel1.setLayout(null);
        panel1.setBounds(0, 0, 480,720);
        panel1.setVisible(false);
        panel1.setBackground(Color.lightGray);

        panel2 = new JPanel();
        panel2.setLayout(null);
        panel2.setBounds(0, 0, 480,720);
        panel2.setVisible(false);
        panel2.setBackground(Color.lightGray);

        layer = new JLayeredPane();

        this.add(button1);
        this.add(button3);
        this.add(button4);
        this.add(panel1);
        this.add(panel2);
        panel1.add(textField1);
        panel1.add(textField2);
        panel1.add(textField3);
        panel1.add(button2);
        panel2.add(label);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(480, 720);
        this.setVisible(true);


    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button1){
            if(!panel1.isVisible()){

                panel1.setVisible(true);
                panel2.setVisible(false);

                textField1.setVisible(true);
                textField2.setVisible(true);
                textField3.setVisible(true);


                button1.setBackground(Color.gray);
                button3.setBackground(null);
                button2.setVisible(true);

            }else{

                panel1.setVisible(false);

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

            PersonagemRPG p = new PersonagemRPG(nomeDoPersonagem, nomeDoJogador, descricao);
            sistema.cadastrarPersonagem(p);

            panel1.setVisible(false);
            button1.setBackground(null);

            System.out.println(p.toString());

        }

        if(e.getSource() == button3){
            if(!panel2.isVisible()){

                panel1.setVisible(false);
                panel2.setVisible(true);

                button1.setBackground(null);
                button2.setVisible(false);
                button3.setBackground(Color.gray);

                textField1.setVisible(false);
                textField2.setVisible(false);
                textField3.setVisible(false);



            }else{

                panel2.setVisible(false);

                button2.setVisible(false);
                button3.setBackground(null);

            }
        }

        if(e.getSource() == button4) {


            panel1.setVisible(false);
            panel2.setVisible(false);

            button1.setBackground(null);
            button2.setVisible(false);
            button3.setBackground(null);

            textField1.setVisible(false);
            textField2.setVisible(false);
            textField3.setVisible(false);


        }
    }
}
