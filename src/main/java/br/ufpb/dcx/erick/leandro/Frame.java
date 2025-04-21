package br.ufpb.dcx.erick.leandro;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Frame extends JFrame implements ActionListener{
    SistemaRPGDeErick sistema = new SistemaRPGDeErick();
    JButton criarPersBtt;
    JButton criarBtt;
    JButton persBtt;
    JButton sesBtt;
    JButton altBtt;

    JPanel panel1;
    JPanel panel2;
    JPanel panel2a;
    JPanel testPanel;

    JTextField tf1;
    JTextField tf2;
    JTextField tf3;
    JTextField tf4;
    JTextField tf5;;
    JTextField tf6;
    JTextField tf7;
    JTextField tf8;
    JTextField tf9;
    JTextField tf10;
    JTextField tf11;

    JTextField textField1;
    JTextField textField2;
    JTextField textField3;
    JTextField textField4;
    JTextField textField5;
    JTextField textField6;
    JTextField textField7;
    JTextField textField8;
    JTextField textField9;
    JTextField textField10;
    JTextField textField11;
    JLabel label;



    Frame() {

        ImageIcon icon = new ImageIcon("C:\\Users\\edilb\\Downloads\\Projeto_RPG\\src\\Image\\Dungeons-And-Dragons-Logo-PNG(1).png");

        label = new JLabel();
        label.setIcon(icon);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setOpaque(true);

        JLabel l1 = new JLabel("Nome do Personagem:");
        l1.setBounds(10, 25, 200, 15);
        JLabel l2 = new JLabel("Nome do Jogador:");
        l2.setBounds(10, 65, 200, 15);
        JLabel l3 = new JLabel("Descrição:");
        l3.setBounds(10, 105, 200, 15);
        JLabel l4 = new JLabel("Nível:");
        l4.setBounds(10, 145, 200, 15);
        JLabel l5 = new JLabel("Pontos de Vida:");
        l5.setBounds(10, 185, 200, 15);
        JLabel l6 = new JLabel("Força:");
        l6.setBounds(10, 225, 200, 15);
        JLabel l7 = new JLabel("Destreza:");
        l7.setBounds(10, 265, 200, 15);
        JLabel l8 = new JLabel("Constituição:");
        l8.setBounds(10, 305, 200, 15);
        JLabel l9 = new JLabel("Inteligência:");
        l9.setBounds(10, 345, 200, 15);
        JLabel l10 = new JLabel("Sabedoria:");
        l10.setBounds(10, 385, 200, 15);
        JLabel l11 = new JLabel("Carisma:");
        l11.setBounds(10, 425, 200, 15);




        textField1 = new JTextField();
        textField1.setBounds(140, 20, 440, 30);
        textField1.setVisible(false);

        textField2 = new JTextField();
        textField2.setBounds(140, 60, 440, 30);
        textField2.setVisible(false);

        textField3 = new JTextField();
        textField3.setBounds(140, 100, 440, 30);
        textField3.setVisible(false);

        textField4 = new JTextField();
        textField4.setBounds(100, 140, 30, 30);
        textField4.setVisible(false);

        textField5 = new JTextField();
        textField5.setBounds(100, 180, 30, 30);
        textField5.setVisible(false);

        textField6 = new JTextField();
        textField6.setBounds(100, 220, 30, 30);
        textField6.setVisible(false);

        textField7 = new JTextField();
        textField7.setBounds(100, 260, 30, 30);
        textField7.setVisible(false);

        textField8 = new JTextField();
        textField8.setBounds(100, 300, 30, 30);
        textField8.setVisible(false);

        textField9 = new JTextField();
        textField9.setBounds(100, 340, 30, 30);
        textField9.setVisible(false);

        textField10 = new JTextField();
        textField10.setBounds(100, 380, 30, 30);
        textField10.setVisible(false);

        textField11 = new JTextField();
        textField11.setBounds(100, 420, 30, 30);
        textField11.setVisible(false);


        //Painel do botão Criar Personagens
        panel1 = new JPanel();
        panel1.setLayout(null);
        panel1.setBounds(0, 0, 1620, 1080);
        panel1.setVisible(false);
        panel1.setBackground(Color.lightGray);

        //Painel do botão Personagens
        panel2 = new JPanel();
        panel2.setLayout(null);
        panel2.setBounds(0, 0, 280, 1080);
        panel2.setVisible(false);
        panel2.setBackground(Color.green);

        panel2a = new JPanel();
        panel2a.setLayout(null);
        panel2a.setBounds(280, 0, 800, 700);
        panel2a.setBackground(Color.red);
        panel2a.setVisible(false);

        testPanel = new JPanel();
        testPanel.setLayout(new GridLayout(1, 3));
        testPanel.setBackground(null);
        testPanel.setPreferredSize(new Dimension(100, 80));

        criarPersBtt = new JButton();
        criarPersBtt.setPreferredSize(new Dimension(150, 100));
        criarPersBtt.addActionListener(this);
        criarPersBtt.setText("Criar Personagem");
        criarPersBtt.setFocusable(false);

        criarBtt = new JButton();
        criarBtt.setLayout(null);
        criarBtt.setBounds(963, 600, 100,60);
        criarBtt.addActionListener(this);
        criarBtt.setText("Criar");
        criarBtt.setFocusable(false);

        persBtt = new JButton();
        persBtt.setPreferredSize(new Dimension(230, 80));
        persBtt.addActionListener(this);
        persBtt.setText("Personagens");
        persBtt.setFocusable(false);

        sesBtt = new JButton();
        sesBtt.setPreferredSize(new Dimension(230, 80));
        sesBtt.addActionListener(this);
        sesBtt.setText("Sessão");
        sesBtt.setFocusable(false);

        panel1.add(l1);
        panel1.add(textField1);
        panel1.add(l2);
        panel1.add(textField2);
        panel1.add(l3);
        panel1.add(textField3);
        panel1.add(l4);
        panel1.add(textField4);
        panel1.add(l5);
        panel1.add(textField5);
        panel1.add(l6);
        panel1.add(textField6);
        panel1.add(l7);
        panel1.add(textField7);
        panel1.add(l8);
        panel1.add(textField8);
        panel1.add(l9);
        panel1.add(textField9);
        panel1.add(l10);
        panel1.add(textField10);
        panel1.add(l11);
        panel1.add(textField11);
        panel1.add(criarBtt);

        testPanel.add(criarPersBtt);
        testPanel.add(persBtt);
        testPanel.add(sesBtt);

        this.add(testPanel, BorderLayout.SOUTH);//conflito na ordem, um aparece mas o outro não
        this.add(panel2);
        this.add(panel2a);
        this.add(panel1);
        this.add(label);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(1080, 780);
        this.setVisible(true);

        System.out.println(sistema.exibirTodosOsNomesDosPersonagens().size());


    }
    public void alterarFichaDoPersonagemPeloIndice(int i){
        PersonagemRPG p = this.sistema.pesquisarPersonagemPeloIndice(i);
        if(!tf1.getText().isEmpty()){
            p.setNome(tf1.getText());
        }

        if(!tf2.getText().isEmpty()){
            p.setNomeDoJogador(tf2.getText());
        }

        if(!tf3.getText().isEmpty()){
            p.setDescricao(tf3.getText());
        }

        if(!tf4.getText().isEmpty()){
            p.setNivel(Integer.parseInt(tf4.getText()));
        }

        if(!tf5.getText().isEmpty()){
            p.setPontosDeVida(Integer.parseInt(tf5.getText()));
        }

        if(!tf6.getText().isEmpty()){
            p.setForca(Integer.parseInt(tf6.getText()));
        }

        if(!tf7.getText().isEmpty()){
            p.setDestreza(Integer.parseInt(tf7.getText()));
        }

        if(!tf8.getText().isEmpty()){
            p.setConstituicao(Integer.parseInt(tf8.getText()));
        }

        if(!tf9.getText().isEmpty()){
            p.setInteligencia(Integer.parseInt(tf9.getText()));
        }

        if(!tf10.getText().isEmpty()){
            p.setSabedoria(Integer.parseInt(tf10.getText()));
        }

        if(!tf11.getText().isEmpty()){
            p.setCarisma(Integer.parseInt(tf11.getText()));
        }

    }

    public void NewWindow(int i){
        JFrame frame = new JFrame();
        PersonagemRPG p = this.sistema.pesquisarPersonagemPeloIndice(i);

        altBtt = new JButton();
        altBtt.setLayout(null);
        altBtt.setBounds(963, 600, 100,60);
        altBtt.addActionListener(_ -> alterarFichaDoPersonagemPeloIndice(i));
        altBtt.setText("Alterar");
        altBtt.setFocusable(false);

        JLabel l1 = new JLabel("Nome do Personagem:");
        l1.setBounds(10, 25, 200, 15);
        JLabel l2 = new JLabel("Nome do Jogador:");
        l2.setBounds(10, 65, 200, 15);
        JLabel l3 = new JLabel("Descrição:");
        l3.setBounds(10, 105, 200, 15);
        JLabel l4 = new JLabel("Nível:");
        l4.setBounds(10, 145, 200, 15);
        JLabel l5 = new JLabel("Pontos de Vida:");
        l5.setBounds(10, 185, 200, 15);
        JLabel l6 = new JLabel("Força:");
        l6.setBounds(10, 225, 200, 15);
        JLabel l7 = new JLabel("Destreza:");
        l7.setBounds(10, 265, 200, 15);
        JLabel l8 = new JLabel("Constituição:");
        l8.setBounds(10, 305, 200, 15);
        JLabel l9 = new JLabel("Inteligência:");
        l9.setBounds(10, 345, 200, 15);
        JLabel l10 = new JLabel("Sabedoria:");
        l10.setBounds(10, 385, 200, 15);
        JLabel l11 = new JLabel("Carisma:");
        l11.setBounds(10, 425, 200, 15);

        tf1 = new JTextField();
        tf1.setText(p.getNome());
        tf1.setBounds(140, 20, 440, 30);


        tf2 = new JTextField();
        tf2.setText(p.getNomeDoJogador());
        tf2.setBounds(140, 60, 440, 30);

        tf3 = new JTextField();
        tf3.setText(p.getDescricao());
        tf3.setBounds(140, 100, 440, 30);

        tf4 = new JTextField();
        tf4.setText(String.valueOf(p.getNivel()));
        tf4.setBounds(100, 140, 30, 30);

        tf5 = new JTextField();
        tf5.setText(String.valueOf(p.getPontosDeVida()));
        tf5.setBounds(100, 180, 30, 30);

        tf6 = new JTextField();
        tf6.setText(String.valueOf(p.getForca()));
        tf6.setBounds(100, 220, 30, 30);

        tf7 = new JTextField();
        tf7.setText(String.valueOf(p.getDestreza()));
        tf7.setBounds(100, 260, 30, 30);

        tf8 = new JTextField();
        tf8.setText(String.valueOf(p.getConstituicao()));
        tf8.setBounds(100, 300, 30, 30);

        tf9 = new JTextField();
        tf9.setText(String.valueOf(p.getInteligencia()));
        tf9.setBounds(100, 340, 30, 30);

        tf10 = new JTextField();
        tf10.setText(String.valueOf(p.getSabedoria()));
        tf10.setBounds(100, 380, 30, 30);

        tf11 = new JTextField();
        tf11.setText(String.valueOf(p.getCarisma()));
        tf11.setBounds(100, 420, 30, 30);

        frame.add(l1);
        frame.add(tf1);
        frame.add(l2);
        frame.add(tf2);
        frame.add(l3);
        frame.add(tf3);
        frame.add(l4);
        frame.add(tf4);
        frame.add(l5);
        frame.add(tf5);
        frame.add(l6);
        frame.add(tf6);
        frame.add(l7);
        frame.add(tf7);
        frame.add(l8);
        frame.add(tf8);
        frame.add(l9);
        frame.add(tf9);
        frame.add(l10);
        frame.add(tf10);
        frame.add(l11);
        frame.add(tf11);
        frame.add(altBtt);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setSize(1080, 780);
        frame.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == criarPersBtt){
            if(!panel1.isVisible()){

                panel1.setVisible(true);
                panel2.setVisible(false);
                panel2a.setVisible(false);

                textField1.setVisible(true);
                textField2.setVisible(true);
                textField3.setVisible(true);
                textField4.setVisible(true);
                textField5.setVisible(true);
                textField6.setVisible(true);
                textField7.setVisible(true);
                textField8.setVisible(true);
                textField9.setVisible(true);
                textField10.setVisible(true);
                textField11.setVisible(true);

                criarPersBtt.setBackground(Color.gray);
                persBtt.setBackground(null);
                criarBtt.setVisible(true);

            }else{

                panel1.setVisible(false);

                criarPersBtt.setBackground(null);
                criarBtt.setVisible(false);

                textField1.setVisible(false);
                textField2.setVisible(false);
                textField3.setVisible(false);
                textField4.setVisible(false);
                textField5.setVisible(false);
                textField6.setVisible(false);
                textField7.setVisible(false);
                textField8.setVisible(false);
                textField9.setVisible(false);
                textField10.setVisible(false);
                textField11.setVisible(false);

            }
        }
        if(e.getSource() == criarBtt){

            String nomeDoPersonagem = textField1.getText();
            String nomeDoJogador = textField2.getText();
            String descricao = textField3.getText();


            PersonagemRPG p = new PersonagemRPG(nomeDoPersonagem, nomeDoJogador, descricao);
            sistema.cadastrarPersonagem(p);

            if(!textField4.getText().isEmpty()){
                p.setNivel(Integer.parseInt(textField4.getText()));
            }

            if(!textField5.getText().isEmpty()){
                p.setPontosDeVida(Integer.parseInt(textField5.getText()));
            }

            if(!textField6.getText().isEmpty()){
                p.setForca(Integer.parseInt(textField6.getText()));
            }

            if(!textField7.getText().isEmpty()){
                p.setDestreza(Integer.parseInt(textField7.getText()));
            }

            if(!textField8.getText().isEmpty()){
                p.setConstituicao(Integer.parseInt(textField8.getText()));
            }

            if(!textField9.getText().isEmpty()){
                p.setInteligencia(Integer.parseInt(textField9.getText()));
            }

            if(!textField10.getText().isEmpty()){
                p.setSabedoria(Integer.parseInt(textField10.getText()));
            }

            if(!textField11.getText().isEmpty()){
                p.setCarisma(Integer.parseInt(textField11.getText()));
            }

            panel1.setVisible(false);
            criarPersBtt.setBackground(null);

            System.out.println(p);

        }

        if(e.getSource() == persBtt){
            if(!panel2.isVisible()){

                panel1.setVisible(false);
                panel2.setVisible(true);
                panel2a.setVisible(true);

                criarPersBtt.setBackground(null);
                criarBtt.setVisible(false);
                persBtt.setBackground(Color.gray);

                textField1.setVisible(false);
                textField2.setVisible(false);
                textField3.setVisible(false);
                textField4.setVisible(false);
                textField5.setVisible(false);
                textField6.setVisible(false);
                textField7.setVisible(false);
                textField8.setVisible(false);
                textField9.setVisible(false);
                textField10.setVisible(false);
                textField11.setVisible(false);

                if(!sistema.exibirTodosOsNomesDosPersonagens().isEmpty()){
                    int esp = 05;
                    ArrayList<String> listaDePersonagens = sistema.exibirTodosOsNomesDosPersonagens();
                    for(int i = 0; i < sistema.exibirTodosOsNomesDosPersonagens().size(); i++){
                        String text = sistema.pesquisarPersonagemPeloIndice(i).getNome();
                        System.out.println("nome do personagem: " + text);
                        JLabel lbl = new JLabel(text, JLabel.CENTER);
                        JButton bttn = new JButton();
                        bttn.setBounds(5, 5 + esp,270, 20);
                        bttn.setBackground(null);
                        System.out.println("Indice do for: " + i);
                        System.out.println(sistema.pesquisarPersonagemPeloIndice(i));
                        int finalI = i;
                        bttn.addActionListener(_ -> NewWindow(finalI));
                        bttn.add(lbl);
                        esp += 22;

                        panel2.add(bttn, JLayeredPane.DRAG_LAYER);
                    }
                }


            }else{

                panel2.setVisible(false);
                panel2a.setVisible(false);

                criarBtt.setVisible(false);
                persBtt.setBackground(null);

            }
        }

        if(e.getSource() == sesBtt) {


            panel1.setVisible(false);
            panel2.setVisible(false);
            panel2a.setVisible(false);

            criarPersBtt.setBackground(null);
            criarBtt.setVisible(false);
            persBtt.setBackground(null);
            sesBtt.setBackground(Color.lightGray);

            textField1.setVisible(false);
            textField2.setVisible(false);
            textField3.setVisible(false);
            textField4.setVisible(false);
            textField5.setVisible(false);
            textField6.setVisible(false);
            textField7.setVisible(false);
            textField8.setVisible(false);
            textField9.setVisible(false);
            textField10.setVisible(false);
            textField11.setVisible(false);


        }else{
            sesBtt.setBackground(null);

        }
    }
}
