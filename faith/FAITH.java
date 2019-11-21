/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package faith;

import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import java.util.*;
import java.util.Collection;
import javax.swing.Timer;
import java.util.TreeSet;
import javax.swing.border.LineBorder;

/**
 *
 * @author ATU FAITH
 */
public class FAITH extends JFrame implements ActionListener, MouseListener {

    JFrame jf = new JFrame("Quick Spark");

    String PlayerName;

    private String cardone, cardtwo;
    boolean com;
    JLabel cardn1;
    JLabel cardn2;
    JLabel playerName;

    int cardni1 = 13;
    int cardni2 = 13;

    JLabel score1;
    JLabel score2;

    int scores1 = 0;
    int scores2 = 0;
    boolean play = true;
    boolean red;

    boolean a, b, c, d;

    Random c1r1 = new Random();
    int c1ra1 = c1r1.nextInt(12);
    Random c1r2 = new Random();
    int c1ra2 = c1r2.nextInt(12);
    Random c2r1 = new Random();
    int c2ra1 = c2r1.nextInt(12);
    Random c2r2 = new Random();   //shufflerandom
    int c2ra2 = c2r2.nextInt(12);

    Random p2r1 = new Random();
    int p2ra1 = p2r1.nextInt(13);
    Random p2r2 = new Random();
    int p2ra2 = p2r2.nextInt(13);
    Random p2r3 = new Random();
    int p2ra3 = p2r3.nextInt(13);
    Random p2r4 = new Random();    //humanrandom
    int p2ra4 = p2r4.nextInt(13);

    JButton deck1 = new JButton();
    JButton p1slot1 = new JButton();
    JButton p1slot2 = new JButton();
    JButton p1slot3 = new JButton();
    JButton p1slot4 = new JButton();//player1

    JButton flip = new JButton();
    JButton slot1 = new JButton();
    JButton slot2 = new JButton();
    JButton slot3 = new JButton(); //robot
    JButton slot4 = new JButton();

    JButton deck2 = new JButton();
    JButton p2slot1 = new JButton();//humncard
    JButton p2slot2 = new JButton();
    JButton p2slot3 = new JButton();
    JButton p2slot4 = new JButton();

    ImageIcon arrow[] = new ImageIcon[4];
    ImageIcon c1img[] = new ImageIcon[13];
    ImageIcon c2img[] = new ImageIcon[13];

    ImageIcon deck1i = new ImageIcon(this.getClass().getResource("d.jpg"));
    ImageIcon deck2i = new ImageIcon(this.getClass().getResource("e.jpg"));

    ImageIcon shuffle = new ImageIcon(this.getClass().getResource("shuffle.jpg"));

    ImageIcon p1card1 = new ImageIcon(this.getClass().getResource("p1card1.png"));
    ImageIcon p1card2 = new ImageIcon(this.getClass().getResource("p1card2.png"));
    ImageIcon p1card3 = new ImageIcon(this.getClass().getResource("p1card3.png"));
    ImageIcon p1card4 = new ImageIcon(this.getClass().getResource("p1card4.png"));
    ImageIcon p1card5 = new ImageIcon(this.getClass().getResource("p1card5.png"));
    ImageIcon p1card6 = new ImageIcon(this.getClass().getResource("p1card6.png"));
    ImageIcon p1card7 = new ImageIcon(this.getClass().getResource("p1card7.png"));
    ImageIcon p1card8 = new ImageIcon(this.getClass().getResource("p1card8.png"));
    ImageIcon p1card9 = new ImageIcon(this.getClass().getResource("p1card9.png"));
    ImageIcon p1card10 = new ImageIcon(this.getClass().getResource("p1card10.png"));
    ImageIcon p1card11 = new ImageIcon(this.getClass().getResource("p1card11.png"));
    ImageIcon p2card1 = new ImageIcon(this.getClass().getResource("p2card1.png"));
    ImageIcon p2card2 = new ImageIcon(this.getClass().getResource("p2card2.png"));
    ImageIcon p2card3 = new ImageIcon(this.getClass().getResource("p2card3.png"));
    ImageIcon p2card4 = new ImageIcon(this.getClass().getResource("p2card4.png"));
    ImageIcon p2card5 = new ImageIcon(this.getClass().getResource("p2card5.png"));
    ImageIcon p2card6 = new ImageIcon(this.getClass().getResource("p2card6.png"));
    ImageIcon p2card7 = new ImageIcon(this.getClass().getResource("p2card7.png"));
    ImageIcon p2card8 = new ImageIcon(this.getClass().getResource("p2card8.png"));
    ImageIcon p2card9 = new ImageIcon(this.getClass().getResource("p2card9.png"));
    ImageIcon p2card10 = new ImageIcon(this.getClass().getResource("p2card10.png"));
    ImageIcon p2card11 = new ImageIcon(this.getClass().getResource("p2card11.png"));
    ImageIcon arrow1 = new ImageIcon(this.getClass().getResource("arrowDown.png"));
    ImageIcon arrow3 = new ImageIcon(this.getClass().getResource("arrowDowns.png"));
    ImageIcon arrow2 = new ImageIcon(this.getClass().getResource("arrowUp.png"));
    ImageIcon arrow4 = new ImageIcon(this.getClass().getResource("arrowUp2.png"));

    JLabel larrow1 = new JLabel();
    JLabel larrow2 = new JLabel();
    JLabel larrow3 = new JLabel();
    JLabel larrow4 = new JLabel();

    StringBuffer nameBuffer = new StringBuffer();

    public void nameCheck() {
        nameBuffer.append(PlayerName);

    }

    public void FAITH() {
        jf.setSize(1500, 700);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
        jf.setLocationRelativeTo(null);
        //jf.setForeground(Color.red);

        cardn1 = new JLabel("Card Left: " + cardni1);
        cardn2 = new JLabel("Card Left: " + cardni2);

        score1 = new JLabel("score: " + scores1);
        score2 = new JLabel("score: " + scores2);

        c1img[0] = new ImageIcon(this.getClass().getResource("p1card1.png"));
        c1img[1] = new ImageIcon(this.getClass().getResource("p1card2.png"));
        c1img[2] = new ImageIcon(this.getClass().getResource("p1card3.png"));
        c1img[3] = new ImageIcon(this.getClass().getResource("p1card4.png"));
        c1img[4] = new ImageIcon(this.getClass().getResource("p1card5.png"));
        c1img[5] = new ImageIcon(this.getClass().getResource("p1card6.png"));
        c1img[6] = new ImageIcon(this.getClass().getResource("p1card7.png"));
        c1img[7] = new ImageIcon(this.getClass().getResource("p1card8.png"));
        c1img[8] = new ImageIcon(this.getClass().getResource("p1card9.png"));
        c1img[9] = new ImageIcon(this.getClass().getResource("p1card10.png"));
        c1img[10] = new ImageIcon(this.getClass().getResource("p1card11.png"));  ///robotcard

        c2img[0] = new ImageIcon(this.getClass().getResource("p2card1.png"));
        c2img[1] = new ImageIcon(this.getClass().getResource("p2card2.png"));
        c2img[2] = new ImageIcon(this.getClass().getResource("p2card3.png"));
        c2img[3] = new ImageIcon(this.getClass().getResource("p2card4.png"));
        c2img[4] = new ImageIcon(this.getClass().getResource("p2card5.png"));
        c2img[5] = new ImageIcon(this.getClass().getResource("p2card6.png"));
        c2img[6] = new ImageIcon(this.getClass().getResource("p2card7.png"));
        c2img[7] = new ImageIcon(this.getClass().getResource("p2card8.png"));
        c2img[8] = new ImageIcon(this.getClass().getResource("p2card9.png"));
        c2img[9] = new ImageIcon(this.getClass().getResource("p2card10.png"));
        c2img[10] = new ImageIcon(this.getClass().getResource("p2card11.png"));  //humancard

//arrows-----------------------------------------------------------------------
        arrow[0] = new ImageIcon(this.getClass().getResource("arrowUp.png"));
        arrow[1] = new ImageIcon(this.getClass().getResource("arrowDown.png"));
        arrow[2] = new ImageIcon(this.getClass().getResource("arrowUp2.png"));
        arrow[3] = new ImageIcon(this.getClass().getResource("arrowDowns.png"));

        //time = new Timer(2000, (ActionListener) this);//
        //adding listeners
        p1slot1.addMouseListener(this);
        p1slot2.addMouseListener(this);
        p1slot3.addMouseListener(this);
        p1slot4.addMouseListener(this);

        p1slot1.addActionListener(this);
        p1slot2.addActionListener(this);
        p1slot3.addActionListener(this);
        p1slot4.addActionListener(this);

        p2slot1.addMouseListener(this);
        p2slot2.addMouseListener(this);
        p2slot3.addMouseListener(this);
        p2slot4.addMouseListener(this);

        p2slot1.addActionListener(this);
        p2slot2.addActionListener(this);
        p2slot3.addActionListener(this);
        p2slot4.addActionListener(this);

        flip.addActionListener(this);
        flip.addMouseListener(this);

        slot1.addMouseListener(this);
        slot2.addMouseListener(this);
        slot3.addMouseListener(this);
        slot4.addMouseListener(this);

        slot1.addActionListener(this);
        slot2.addActionListener(this);
        slot3.addActionListener(this);
        slot4.addActionListener(this);

        jf.validate();

        addComponent();

    }

    public void addComponent() {
        jf.setLayout(null);
        //robot 
        deck1.setBounds(60, 30, 100, 150);
        deck1.setIcon(deck1i);
        jf.add(deck1);

        p1slot1.setBounds(210, 30, 100, 150);
        p1slot1.setIcon(p1card1);
        jf.add(p1slot1);

        p1slot2.setBounds(360, 30, 100, 150);
        p1slot2.setIcon(p1card2);
        jf.add(p1slot2);

        p1slot3.setBounds(510, 30, 100, 150);
        p1slot3.setIcon(p1card3);
        jf.add(p1slot3);

        p1slot4.setBounds(660, 30, 100, 150);
        p1slot4.setIcon(p1card4);
        jf.add(p1slot4);

        cardn1.setBounds(60, 4, 150, 30);
        cardn1.setForeground(Color.darkGray);
        cardn1.setFont(new Font("serif", Font.ITALIC, 17));
        jf.add(cardn1);

        score1.setBounds(800, 30, 150, 30);
        score1.setForeground(Color.black);
        score1.setFont(new Font("serif", Font.ITALIC, 17));
        jf.add(score1);

        cardn2.setBounds(60, 466, 150, 30);
        cardn2.setForeground(Color.black);
        cardn2.setFont(new Font("serif", Font.ITALIC, 17));
        jf.add(cardn2);

        score2.setBounds(800, 466, 150, 30);
        score2.setForeground(Color.black);
        score2.setFont(new Font("serif", Font.ITALIC, 17));
        jf.add(score2);
        //humancards
        deck2.setBounds(60, 500, 100, 150);
        deck2.setIcon(deck2i);
        jf.add(deck2);

        p2slot1.setBounds(210, 500, 100, 150);
        p2slot1.setIcon(p2card1);
        jf.add(p2slot1);

        p2slot2.setBounds(360, 500, 100, 150);
        p2slot2.setIcon(p2card2);
        jf.add(p2slot2);

        p2slot3.setBounds(510, 500, 100, 150);
        p2slot3.setIcon(p2card3);
        jf.add(p2slot3);

        p2slot4.setBounds(660, 500, 100, 150);
        p2slot4.setIcon(p2card4);
        jf.add(p2slot4);
        //arrows
        larrow1.setBounds(240, 400, 60, 50);
        larrow1.setIcon(arrow1);
        jf.add(larrow1);

        larrow2.setBounds(390, 400, 60, 50);
        larrow2.setIcon(arrow2);
        jf.add(larrow2);

        larrow3.setBounds(540, 400, 60, 50);
        larrow3.setIcon(arrow3);
        jf.add(larrow3);

        larrow4.setBounds(690, 400, 60, 50);
        larrow4.setIcon(arrow4);
        jf.add(larrow4);
        // upturned cards
        flip.setBounds(60, 240, 100, 150);
        flip.setIcon(shuffle);
        jf.add(flip);

        slot1.setBounds(210, 240, 100, 150);
        slot1.setIcon(c2img[c1ra1]);
        jf.add(slot1);

        slot2.setBounds(360, 240, 100, 150);
        slot2.setIcon(c1img[c2ra2]);
        jf.add(slot2);

        slot3.setBounds(510, 240, 100, 150);
        slot3.setIcon(c1img[c2ra1]);
        jf.add(slot3);

        slot4.setBounds(660, 240, 100, 150);
        slot4.setIcon(c2img[c2ra1]);
        jf.add(slot4);

    }

    int arrowa;

    public void actionPerformed(ActionEvent e) {
        Random a1 = new Random();
        int aa1 = a1.nextInt(2);
        Random a2 = new Random();
        int aa2 = a2.nextInt(2);
        Random a3 = new Random();
        int aa3 = a3.nextInt(2);
        Random a4 = new Random();
        int aa4 = a4.nextInt(2);

        Random deck2 = new Random();
        int d1 = deck2.nextInt(12);
        Random deck3 = new Random();
        int d2 = deck3.nextInt(12);
        Random deck4 = new Random();
        int d3 = deck4.nextInt(12);
        Random deck5 = new Random();
        int d4 = deck5.nextInt(12);

        Random r1 = new Random();
        int p1a1 = r1.nextInt(12);
        Random r2 = new Random();
        int p1a2 = r2.nextInt(12);
        Random r3 = new Random();
        int p1a3 = r3.nextInt(12);
        Random r4 = new Random();
        int p1a4 = r4.nextInt(12);

        if (e.getSource() == flip) {
            slot1.setIcon(c2img[d1]);
            slot2.setIcon(c2img[d2]);
            slot3.setIcon(c2img[d3]);
            slot4.setIcon(c2img[d4]);

            larrow1.setIcon(arrow[aa1]);
            larrow2.setIcon(arrow[aa2]);
            larrow3.setIcon(arrow[aa3]);
            larrow4.setIcon(arrow[aa4]);

        }

        if (e.getSource() == p2slot1) {
            a = true;
            p2slot1.setBorder(new LineBorder(Color.red, 3));

        }
        if (e.getSource() == slot1) {
            if (a = true) {
                human1();

            }
        }

        if (e.getSource() == slot2) {
            if (a = true) {
                human2();
            }
        }
        if (e.getSource() == slot3) {
            if (a = true) {
                human3();
            }
        }
        if (e.getSource() == slot4) {
            if (a = true) {
                human4();
            }
        }
        if (e.getSource() == p2slot2) {
            b = true;
            p2slot2.setBorder(new LineBorder(Color.red, 3));

        }
        if (e.getSource() == slot1) {
            if (b = true) {
                humantwo1();

            }
        }
        if (e.getSource() == slot2) {
            if (b = true) {
                humantwo2();
            }
        }
        if (e.getSource() == slot3) {
            if (b = true) {
                humantwo3();
            }
        }
        if (e.getSource() == slot4) {
            if (b = true) {
                humantwo4();
            }
        }
        if (e.getSource() == p2slot3) {
            c = true;
            p2slot3.setBorder(new LineBorder(Color.red, 3));

        }
        if (e.getSource() == slot1) {
            if (c = true) {
                humanthree1();
            }
        }
        if (e.getSource() == slot2) {
            if (c = true) {
                humanthree2();
            }
        }
        if (e.getSource() == slot3) {
            if (c = true) {
                humanthree3();
            }
        }
        if (e.getSource() == slot4) {
            if (c = true) {
                humanthree4();
            }
        }
        if (e.getSource() == p2slot4) {
            d = true;
            p2slot4.setBorder(new LineBorder(Color.red, 3));
        }
        if (e.getSource() == slot1) {
            if (d = true) {
                humanfour1();
            }
        }
        if (e.getSource() == slot2) {
            if (d = true) {
                humanfour2();
            }
        }
        if (e.getSource() == slot3) {
            if (d = true) {
                humanfour3();
            }
        }
        if (e.getSource() == slot4) {
            if (d = true) {
                humanfour4();
            }
        }
        if (cardni2 == 0) {
            Human();
        }
        if (cardni2 == 17) {
            Robot();
        }

    }

    public void Human() {

        Human h = new Human();
        jf.setVisible(false);
    }

    public void Robot() {
        Robot r = new Robot();
        jf.setVisible(false);
    }

    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    Random a1 = new Random();
    int aa1 = a1.nextInt(2);
    Random a2 = new Random();
    int aa2 = a2.nextInt(2);
    Random a3 = new Random();
    int aa3 = a3.nextInt(2);
    Random a4 = new Random();
    int aa4 = a4.nextInt(2);

    Random r1 = new Random();
    int p1a1 = r1.nextInt(12);
    Random r2 = new Random();
    int p1a2 = r2.nextInt(12);
    Random r3 = new Random();
    int p1a3 = r3.nextInt(12);
    Random r4 = new Random();
    int p1a4 = r4.nextInt(12);

    public void human1() {

        int a1 = aa1;
        int p2slot1 = p2ra2;
        int deck1 = c1ra1;

        deck1--;
        int main1 = deck1;
        deck1++;
        deck1++;

        int main2 = deck1;
        deck1 = c1ra1;

        if (a1 == 0) {
            if (p2slot1 == main2) {
                slot1.setIcon(c2img[p2slot1]);

                cardni2--;
                scores2++;
                scores2++;
                scores2++;
                scores2 = scores2;
                score2.setText("score: " + scores2);
                if (cardni2 >= 0) {
                    cardn2.setText("Card Left: " + cardni2);
                }

                for (int i = 0; i < 1; i++) {
                    p2ra2 = p2r2.nextInt(13);
                    aa1 = this.a1.nextInt(2);

                    c1ra1 = c1r1.nextInt(13);

                    slot1.setIcon(c2img[c1ra1]);
                    larrow2.setIcon(arrow[aa1]);
                    this.p2slot2.setIcon(c2img[p2ra2]);
                }
            }
        }
        if (a1 == 1) {
            if (p2slot1 == main1) {
                slot1.setIcon(c2img[p2slot1]);

                cardni2--;
                scores2++;
                scores2++;
                scores2++;
                scores2 = scores2;
                score2.setText("score: " + scores2);
                if (cardni2 >= 0) {
                    cardn2.setText("Card Left: " + cardni2);
                }

                for (int i = 0; i < 1; i++) {
                    p2ra2 = p2r2.nextInt(13);
                    aa1 = this.a1.nextInt(2);

                    c1ra1 = c1r1.nextInt(13);

                    slot1.setIcon(c2img[c1ra1]);
                    larrow2.setIcon(arrow[aa1]);
                    this.p2slot2.setIcon(c2img[p2ra2]);
                }
            }
        }
        this.p2slot2.setBorder(null);
    }

    public void human2() {
        int a2 = aa2;
        int p2slot1 = p2ra1;
        int deck2 = c2ra2;

        deck2--;
        int main1 = deck2;
        deck2++;
        deck2++;

        int main2 = deck2;
        deck2 = c1ra1;

        if (a2 == 0) {
            if (p2slot1 == main2) {
                slot1.setIcon(c2img[p2slot1]);

                cardni2--;
                scores2++;
                scores2++;
                scores2++;
                scores2 = scores2;
                score2.setText("score: " + scores2);
                if (cardni2 >= 0) {
                    cardn2.setText("Card Left: " + cardni2);
                }

                for (int i = 0; i < 1; i++) {
                    p2ra2 = p2r2.nextInt(13);
                    aa2 = this.a2.nextInt(2);

                    c2ra2 = c2r2.nextInt(13);

                    slot1.setIcon(c2img[c1ra1]);
                    larrow2.setIcon(arrow[aa1]);
                    this.p2slot2.setIcon(c2img[p2ra1]);
                }
            }
        }
        if (a2 == 1) {
            if (p2slot1 == main1) {
                slot1.setIcon(c2img[p2slot1]);

                cardni2--;
                scores2++;
                scores2++;
                scores2++;
                scores2 = scores2;
                score2.setText("score: " + scores2);
                if (cardni2 >= 0) {
                    cardn2.setText("Card Left: " + cardni2);
                }

                for (int i = 0; i < 1; i++) {
                    p2ra2 = p2r2.nextInt(13);
                    aa2 = this.a2.nextInt(2);

                    c2ra2 = c2r2.nextInt(13);

                    slot1.setIcon(c2img[c1ra1]);
                    larrow2.setIcon(arrow[aa1]);
                    this.p2slot2.setIcon(c2img[p2ra1]);
                }
            }
        }

    }

    public void human3() {
        int a3 = aa3;
        int p2slot1 = p2ra1;
        int deck3 = c2ra1;

        deck3--;
        int main1 = deck3;
        deck3++;
        deck3++;

        int main2 = deck3;
        deck3 = c2ra1;

        if (a3 == 0) {
            if (p2slot1 == main2) {
                slot1.setIcon(c2img[p2slot1]);

                cardni2--;
                scores2++;
                scores2++;
                scores2++;
                scores2 = scores2;
                score2.setText("score: " + scores2);
                if (cardni2 >= 0) {
                    cardn2.setText("Card Left: " + cardni2);
                }

                for (int i = 0; i < 1; i++) {
                    p2ra2 = p2r1.nextInt(13);
                    aa3 = this.a3.nextInt(2);

                    c1ra1 = c1r1.nextInt(13);

                    slot1.setIcon(c2img[c1ra1]);
                    larrow2.setIcon(arrow[aa3]);
                    this.p2slot2.setIcon(c2img[p2ra1]);
                }
            }
        }
        if (a3 == 1) {
            if (p2slot1 == main1) {
                slot1.setIcon(c2img[p2slot1]);

                cardni2--;
                scores2++;
                scores2++;
                scores2++;
                scores2 = scores2;
                score2.setText("score: " + scores2);
                if (cardni2 >= 0) {
                    cardn2.setText("Card Left: " + cardni2);
                }

                for (int i = 0; i < 1; i++) {
                    p2ra1 = p2r1.nextInt(13);
                    aa1 = this.a1.nextInt(2);
                    c1ra1 = c1r1.nextInt(13);

                    slot1.setIcon(c2img[c1ra1]);
                    larrow2.setIcon(arrow[aa3]);
                    this.p2slot2.setIcon(c2img[p2ra1]);
                }
            }
        }

    }

    public void human4() {

        int a4 = aa4;
        int p2slot1 = p2ra1;
        int deck4 = c1ra2;

        deck4--;
        int main1 = deck4;
        deck4++;
        deck4++;
        int main2 = deck4;
        deck4 = c1ra2;

        if (a4 == 0) {
            if (p2slot1 == main2) {
                slot4.setIcon(c2img[p2slot1]);

                cardni2--;
                cardni2 = cardni2;
                scores2++;
                scores2++;
                scores2++;
                scores2 = scores2;

                score2.setText("score:" + scores2);
                if (cardni2 >= 0) {
                    cardn2.setText("Card Left:" + cardni2);
                }
                if (cardni2 <= 0) {
                    this.p2slot1.setVisible(false);
                }

                for (int i = 0; i < 1; i++) {
                    p2ra1 = p2r1.nextInt(13);
                    aa4 = this.a4.nextInt(2);
                    c1ra2 = c1r2.nextInt(13);

                    slot4.setIcon(c2img[c1ra2]);
                    larrow4.setIcon(arrow[aa4]);
                    this.p2slot1.setIcon(c2img[p2ra1]);
                }

            }
        }
        if (a4 == 1) {
            if (p2slot1 == main1) {
                slot4.setIcon(c2img[p2slot1]);

                cardni2--;
                cardni2 = cardni2;
                cardni2--;
                cardni2 = cardni2;
                scores2++;
                scores2++;
                scores2++;
                scores2 = scores2;

                score2.setText("score:" + scores2);
                if (cardni2 >= 0) {
                    cardn2.setText("Card Left:" + cardni2);
                }
                if (cardni2 <= 0) {
                    this.p2slot1.setVisible(false);
                }

                for (int i = 0; i < 1; i++) {
                    p2ra1 = p2r1.nextInt(13);
                    aa4 = this.a4.nextInt(2);
                    c1ra2 = c1r2.nextInt(13);

                    slot4.setIcon(c2img[c1ra2]);
                    larrow4.setIcon(arrow[aa4]);
                    this.p2slot1.setIcon(c2img[p2ra1]);
                }

            }
        }

    }

    public void humantwo1() {
        int a1 = aa1;
        int p2slot2 = p2ra2;
        int deck1 = c1ra1;

        deck1--;
        int main1 = deck1;
        deck1++;
        deck1++;
        int main2 = deck1;
        deck1 = c1ra1;

        if (a1 == 0) {
            if (p2slot2 == main2) {
                slot1.setIcon(c2img[p2slot2]);

                cardni2--;
                cardni2 = cardni2;
                cardni2--;
                cardni2 = cardni2;
                scores2++;
                scores2++;
                scores2++;
                scores2 = scores2;

                score2.setText("score:" + scores2);
                if (cardni2 >= 0) {
                    cardn2.setText("Card Left:" + cardni2);
                }
                if (cardni2 <= 0) {
                    this.p2slot2.setVisible(false);
                }

                for (int i = 0; i < 1; i++) {
                    p2ra2 = p2r2.nextInt(13);

                    aa1 = this.a1.nextInt(2);

                    c1ra1 = c1r1.nextInt(13);

                    slot1.setIcon(c2img[c1ra1]);
                    larrow2.setIcon(arrow[aa1]);
                    this.p2slot2.setIcon(c2img[p2ra2]);
                }

            }
        }
        if (a1 == 1) {
            if (p2slot2 == main1) {
                slot1.setIcon(c2img[p2slot2]);

                cardni2--;
                cardni2 = cardni2;
                cardni2--;
                cardni2 = cardni2;
                scores2++;
                scores2++;
                scores2++;
                scores2 = scores2;

                score2.setText("score:" + scores2);
                if (cardni2 >= 0) {
                    cardn2.setText("Card Left:" + cardni2);
                }
                if (cardni2 <= 0) {
                    this.p2slot2.setVisible(false);
                }

                for (int i = 0; i < 1; i++) {
                    p2ra2 = p2r2.nextInt(13);
                    aa1 = this.a1.nextInt(2);

                    c1ra1 = c1r1.nextInt(13);

                    aa1 = this.a1.nextInt(2);

                    c1ra1 = c1r1.nextInt(13);

                    slot1.setIcon(c2img[c1ra1]);
                    larrow2.setIcon(arrow[aa1]);
                    this.p2slot2.setIcon(c2img[p2ra2]);
                }

            }
        }
        this.p2slot2.setBorder(null);
    }

    public void humantwo2() {

        int a2 = aa2;
        int p2slot2 = p2ra2;
        int deck2 = c2ra2;

        deck2--;
        int main1 = deck2;
        deck2++;
        deck2++;
        int main2 = deck2;
        deck2 = c2ra2;

        if (a2 == 0) {
            if (p2slot2 == main2) {
                slot2.setIcon(c2img[p2slot2]);

                cardni2--;
                cardni2 = cardni2;
                cardni2--;
                cardni2 = cardni2;
                scores2++;
                scores2++;
                scores2++;

                score2.setText("score:" + scores2);
                if (cardni2 >= 0) {
                    cardn2.setText("Card Left:" + cardni2);
                }
                if (cardni2 <= 0) {
                    this.p2slot2.setVisible(false);
                }
                for (int i = 0; i < 1; i++) {
                    p2ra2 = p2r2.nextInt(13);
                    aa2 = this.a2.nextInt(2);

                    c2ra2 = c2r2.nextInt(13);

                    slot2.setIcon(c1img[c1ra2]);
                    larrow2.setIcon(arrow[aa2]);
                    this.p2slot2.setIcon(c2img[p2ra2]);
                }

            }
        }
        if (a2 == 1) {
            if (p2slot2 == main1) {
                slot2.setIcon(c2img[p2slot2]);

                cardni2--;
                cardni2 = cardni2;
                scores2++;
                scores2++;
                scores2++;
                scores2 = scores2;

                score2.setText("score:" + scores2);
                if (cardni2 >= 0) {
                    cardn2.setText("Card Left:" + cardni2);
                }
                if (cardni2 <= 0) {
                    this.p2slot2.setVisible(false);
                }
                for (int i = 0; i < 1; i++) {
                    p2ra2 = p2r2.nextInt(13);
                    aa2 = this.a2.nextInt(2);

                    c2ra2 = c2r2.nextInt(13);

                    slot2.setIcon(c1img[c1ra2]);
                    larrow2.setIcon(arrow[aa2]);
                    this.p2slot2.setIcon(c2img[p2ra2]);
                }
            }
        }
        this.p2slot2.setBorder(null);
    }

    public void humantwo3() {

        int a3 = aa3;
        int p2slot2 = p2ra2;
        int deck3 = c2ra1;

        deck3--;
        int main1 = deck3;
        deck3++;
        deck3++;
        int main2 = deck3;
        deck3 = c2ra1;

        if (a3 == 0) {
            if (p2slot2 == main2) {
                slot3.setIcon(c2img[p2slot2]);

                cardni2--;
                cardni2 = cardni2;
                scores2++;
                scores2++;
                scores2++;
                scores2 = scores2;

                score2.setText("score:" + scores2);
                if (cardni2 >= 0) {
                    cardn2.setText("Card Left:" + cardni2);
                }
                if (cardni2 <= 0) {
                    this.p2slot2.setVisible(false);
                }
                for (int i = 0; i < 1; i++) {
                    p2ra2 = p2r2.nextInt(13);
                    aa3 = this.a3.nextInt(2);
                    c2ra1 = c2r1.nextInt(13);

                    slot3.setIcon(c1img[c2ra1]);
                    larrow3.setIcon(arrow[aa3]);

                    this.p2slot2.setIcon(c2img[p2ra2]);
                }
            }
        }
        if (a3 == 1) {
            if (p2slot2 == main1) {
                slot3.setIcon(c2img[p2slot2]);
            }

            cardni2--;
            cardni2 = cardni2;
            scores2++;
            scores2++;
            scores2++;
            scores2 = scores2;

            score2.setText("score:" + scores2);
            if (cardni2 >= 0) {
                cardn2.setText("Card Left :" + cardni2);
            }
            if (cardni2 <= 0) {
                this.p2slot2.setVisible(false);
            }
            for (int i = 0; i < 1; i++) {
                p2ra2 = p2r2.nextInt(13);
                aa3 = this.a3.nextInt(2);
                c2ra1 = c2r1.nextInt(13);

                slot3.setIcon(c1img[c2ra1]);
                larrow3.setIcon(arrow[aa3]);
                this.p2slot2.setIcon(c2img[p2ra2]);
            }

        }
        this.p2slot2.setBorder(null);
    }

    public void humantwo4() {

        int a4 = aa4;
        int p2slot2 = p2ra2;
        int deck4 = c1ra2;
        deck4--;
        int main1 = deck4;
        deck4++;
        deck4++;
        int main2 = deck4;
        deck4 = c1ra2;

        if (a4 == 0) {
            if (p2slot2 == main2) {
                slot4.setIcon(c2img[p2slot2]);

                cardni2--;
                cardni2 = cardni2;
                scores2++;
                scores2++;
                scores2++;
                scores2 = scores2;

                score2.setText("score:" + scores2);
                if (cardni2 >= 0) {
                    cardn2.setText("Card Left:" + cardni2);
                }
                if (cardni2 <= 0) {
                    this.p2slot2.setVisible(false);
                }
                for (int i = 0; i < 1; i++) {

                    aa4 = this.a4.nextInt(2);
                    c1ra2 = c1r2.nextInt(13);

                    slot4.setIcon(c2img[c1ra2]);
                    larrow4.setIcon(arrow[aa4]);

                    p2ra2 = p2r2.nextInt(13);
                    this.p2slot2.setIcon(c2img[p2ra2]);
                }
            }
        }
        if (a4 == 1) {
            if (p2slot2 == main1) {
                slot4.setIcon(c2img[p2slot2]);

                cardni2--;
                cardni2 = cardni2;
                scores2++;
                scores2++;
                scores2++;
                scores2 = scores2;

                score2.setText("score:" + scores2);
                if (cardni2 >= 0) {
                    cardn2.setText("Card Left:" + cardni2);
                }
                if (cardni2 <= 0) {
                    this.p2slot2.setVisible(false);
                }

                for (int i = 0; i < 1; i++) {
                    p2ra2 = p2r2.nextInt(13);
                    aa4 = this.a4.nextInt(2);
                    c1ra2 = c1r2.nextInt(13);

                    slot4.setIcon(c2img[c1ra2]);
                    larrow4.setIcon(arrow[aa4]);

                    this.p2slot2.setIcon(c2img[p2ra2]);
                }
            }
        }
        this.p2slot2.setBorder(null);
    }

    public void humanthree1() {

        int a1 = aa1;
        int p2slot3 = p2ra3;
        int deck1 = c1ra1;

        deck1--;
        int main1 = deck1;
        deck1++;
        deck1++;
        int main2 = deck1;
        deck1 = c1ra1;

        if (a1 == 0) {
            if (p2slot3 == main2) {
                slot1.setIcon(c2img[p2slot3]);

                cardni2--;
                cardni2 = cardni2;
                cardni2--;
                cardni2 = cardni2;
                scores2++;
                scores2++;
                scores2++;
                scores2 = scores2;
                score2.setText("score:" + scores2);
                if (cardni2 >= 0) {
                    cardn2.setText("Card Left:" + cardni2);
                }
                if (cardni2 <= 0) {
                    this.p2slot3.setVisible(false);
                }
                for (int i = 0; i < 1; i++) {

                    aa1 = this.a1.nextInt(2);
                    c1ra1 = c1r1.nextInt(13);
                    slot1.setIcon(c2img[c1ra1]);
                    larrow2.setIcon(arrow[aa1]);

                    p2ra3 = p2r3.nextInt(13);
                    this.p2slot3.setIcon(c2img[p2ra3]);
                }
            }
        }
        if (a1 == 1) {
            if (p2slot3 == main1) {
                slot1.setIcon(c2img[p2slot3]);

                cardni2--;
                cardni2 = cardni2;
                cardni2--;
                cardni2 = cardni2;
                scores2++;
                scores2++;
                scores2++;
                scores2 = scores2;
                score2.setText("score:" + scores2);
                if (cardni2 >= 0) {
                    cardn2.setText("Card Left:" + cardni2);
                }
                if (cardni2 <= 0) {
                    this.p2slot3.setVisible(false);
                }
                for (int i = 0; i < 1; i++) {
                    aa1 = this.a1.nextInt(2);
                    c1ra1 = c1r1.nextInt(13);
                    slot1.setIcon(c2img[c1ra1]);
                    larrow2.setIcon(arrow[aa1]);

                    p2ra3 = p2r3.nextInt(13);
                    this.p2slot3.setIcon(c2img[p2ra3]);
                }
            }
        }
        this.p2slot3.setBorder(null);
    }

    public void humanthree2() {
        int a2 = aa2;
        int p2slot3 = p2ra3;
        int deck2 = c2ra2;
        deck2--;
        int main1 = deck2;
        deck2++;
        deck2++;
        int main2 = deck2;
        deck2 = c2ra2;
        if (a2 == 0) {
            if (p2slot3 == main2) {
                slot2.setIcon(c2img[p2slot3]);
                cardni2--;
                cardni2 = cardni2;
                cardni2--;
                cardni2 = cardni2;
                scores2++;
                scores2++;
                scores2++;
                scores2 = scores2;

                score2.setText("score:" + scores2);
                if (cardni2 >= 0) {
                    cardn2.setText("Card Left:" + cardni2);
                }
                if (cardni2 <= 0) {
                    this.p2slot3.setVisible(false);
                }
                for (int i = 0; i < 1; i++) {

                    aa2 = this.a2.nextInt(2);
                    c2ra2 = c2r2.nextInt(13);
                    slot2.setIcon(c1img[c2ra2]);
                    larrow2.setIcon(arrow[aa2]);

                    p2ra3 = p2r3.nextInt(13);
                    this.p2slot3.setIcon(c2img[p2ra3]);
                }
            }
        }
        if (a2 == 1) {
            if (p2slot3 == main1) {
                slot2.setIcon(c2img[p2slot3]);

                cardni2--;
                cardni2 = cardni2;
                cardni2--;
                cardni2 = cardni2;
                scores2++;
                scores2++;
                scores2++;
                scores2 = scores2;

                score2.setText("score:" + scores2);
                if (cardni2 >= 0) {
                    cardn2.setText("Card Left:" + cardni2);
                }
                if (cardni2 <= 0) {
                    this.p2slot3.setVisible(false);
                }
                for (int i = 0; i < 1; i++) {
                    aa2 = this.a2.nextInt(2);
                    c2ra2 = c2r2.nextInt(13);
                    slot2.setIcon(c1img[c2ra2]);
                    larrow2.setIcon(arrow[aa2]);

                    p2ra3 = p2r3.nextInt(13);
                    this.p2slot3.setIcon(c2img[p2ra3]);
                }
            }
        }
        this.p2slot3.setBorder(null);
    }

    public void humanthree3() {
        int a3 = aa3;
        int p2slot3 = p2ra3;
        int deck3 = c2ra1;

        deck3--;
        int main1 = deck3;
        deck3++;
        deck3++;
        int main2 = deck3;
        deck3 = c2ra1;

        if (a3 == 0) {
            if (p2slot3 == main2) {
                slot3.setIcon(c2img[p2slot3]);

                cardni2--;
                cardni2 = cardni2;
                cardni2--;
                cardni2 = cardni2;
                scores2++;
                scores2++;
                scores2++;
                scores2 = scores2;

                score2.setText("score:" + scores2);
                if (cardni2 >= 0) {
                    cardn2.setText("Card Left:" + cardni2);
                }
                if (cardni2 <= 0) {
                    this.p2slot3.setVisible(false);
                }
                for (int i = 0; i < 1; i++) {

                    aa3 = this.a3.nextInt(2);
                    c2ra1 = c2r1.nextInt(13);
                    slot3.setIcon(c1img[c2ra1]);
                    larrow3.setIcon(arrow[aa3]);

                    p2ra3 = p2r3.nextInt(13);
                    this.p2slot3.setIcon(c2img[p2ra3]);
                }
            }
        }
        if (a3 == 1) {
            if (p2slot3 == main1) {
                slot3.setIcon(c2img[p2slot3]);

                cardni2--;
                cardni2 = cardni2;
                cardni2--;
                cardni2 = cardni2;
                scores2++;
                scores2++;
                scores2++;
                scores2 = scores2;

                score2.setText("score:" + scores2);
                if (cardni2 >= 0) {
                    cardn2.setText("Card Left:" + cardni2);
                }
                if (cardni2 <= 0) {
                    this.p2slot3.setVisible(false);
                }
                for (int i = 0; i < 1; i++) {

                    aa3 = this.a3.nextInt(2);
                    c2ra1 = c2r1.nextInt(13);
                    slot3.setIcon(c1img[c2ra1]);
                    larrow3.setIcon(arrow[aa3]);

                    p2ra3 = p2r3.nextInt(13);
                    this.p2slot3.setIcon(c2img[p2ra3]);
                }
            }
        }
        this.p2slot3.setBorder(null);
    }

    public void humanthree4() {

        int a4 = aa4;
        int p2slot3 = p2ra3;
        int p2slot4 = p2ra4;
        int deck4 = c1ra2;

        deck4--;
        int main1 = deck4;
        deck4++;
        deck4++;
        int main2 = deck4;
        deck4 = c1ra2;

        if (a4 == 0) {
            if (p2slot3 == main2) {
                slot4.setIcon(c2img[p2slot3]);

                cardni2--;
                cardni2 = cardni2;
                cardni2--;
                cardni2 = cardni2;
                scores2++;
                scores2++;
                scores2++;
                scores2 = scores2;

                score2.setText("score:" + scores2);
                if (cardni2 >= 0) {
                    cardn2.setText("Card Left:" + cardni2);
                }
                if (cardni2 <= 0) {
                    this.p2slot3.setVisible(false);
                }
                for (int i = 0; i < 1; i++) {

                    aa4 = this.a4.nextInt(2);
                    c1ra2 = c1r2.nextInt(13);
                    slot4.setIcon(c2img[c1ra2]);
                    larrow4.setIcon(arrow[aa4]);

                    p2ra3 = p2r3.nextInt(13);
                    this.p2slot3.setIcon(c2img[p2ra3]);
                }
            }
        }
        if (a4 == 1) {
            if (p2slot3 == main1) {
                slot4.setIcon(c2img[p2slot3]);

                cardni2--;
                cardni2 = cardni2;
                cardni2--;
                cardni2 = cardni2;
                scores2++;
                scores2++;
                scores2++;
                scores2 = scores2;

                score2.setText("score:" + scores2);
                if (cardni2 >= 0) {
                    cardn2.setText("Card Left:" + cardni2);
                }
                if (cardni2 <= 0) {
                    this.p2slot3.setVisible(false);
                }
                for (int i = 0; i < 1; i++) {

                    aa4 = this.a4.nextInt(2);
                    c1ra2 = c1r2.nextInt(13);
                    slot4.setIcon(c2img[c1ra2]);
                    larrow4.setIcon(arrow[aa4]);

                    p2ra3 = p2r3.nextInt(13);
                    this.p2slot3.setIcon(c2img[p2ra3]);
                }
            }
        }
        this.p2slot3.setBorder(null);
    }

    public void humanfour1() {
        int a1 = aa1;
        int p2slot4 = p2ra4;
        int deck1 = c1ra1;
        deck1--;
        int main1 = deck1;
        deck1++;
        deck1++;
        int main2 = deck1;
        deck1 = c1ra1;

        if (a1 == 0) {
            if (p2slot4 == main2) {
                slot1.setIcon(c2img[p2slot4]);

                cardni2--;
                cardni2--;
                cardni2 = cardni2;
                scores2++;
                scores2++;
                scores2++;
                scores2 = scores2;

                score2.setText("score:" + scores2);
                if (cardni2 >= 0) {
                    cardn2.setText("Card Left:" + cardni2);
                }
                if (cardni2 <= 0) {
                    this.p2slot4.setVisible(false);
                }

                for (int i = 0; i < 1; i++) {

                    aa1 = this.a1.nextInt(2);

                    c1ra1 = c1r1.nextInt(13);

                    slot1.setIcon(c2img[c1ra1]);
                    larrow1.setIcon(arrow[aa1]);

                    p2ra4 = p2r4.nextInt(13);
                    this.p2slot4.setIcon(c2img[p2ra4]);
                }
            }
        }
        if (a1 == 1) {
            if (p2slot4 == main1) {

                cardni2--;
                cardni2--;
                cardni2 = cardni2;
                scores2++;
                scores2++;
                scores2++;

                scores2 = scores2;

                score2.setText("score:" + scores2);
                if (cardni2 >= 0) {
                    cardn2.setText("Card Left:" + cardni2);
                }
                if (cardni2 <= 0) {
                    this.p2slot4.setVisible(false);
                }
                for (int i = 0; i < 1; i++) {
                    aa1 = this.a1.nextInt(2);
                    c1ra1 = c1r1.nextInt(13);
                    slot1.setIcon(c2img[c1ra1]);
                    larrow1.setIcon(arrow[aa1]);

                    p2ra4 = p2r4.nextInt(13);
                    this.p2slot4.setIcon(c2img[p2ra4]);
                }
            }
        }
        this.p2slot4.setBorder(null);
    }

    public void humanfour2() {
        int a2 = aa2;
        int p2slot4 = p2ra4;
        int deck2 = c2ra2;

        deck2--;
        int main1 = deck2;
        deck2++;
        deck2++;
        int main2 = deck2;
        deck2 = c2ra2;

        if (a2 == 0) {
            if (p2slot4 == main2) {
                slot2.setIcon(c2img[p2slot4]);

                cardni2--;
                cardni2--;
                cardni2 = cardni2;
                scores2++;
                scores2++;
                scores2++;
                scores2 = scores2;

                score2.setText("score:" + scores2);
                if (cardni2 >= 0) {
                    cardn2.setText("Card Left:" + cardni2);
                }
                if (cardni2 <= 0) {
                    this.p2slot4.setVisible(false);
                }
                for (int i = 0; i < 1; i++) {
                    aa2 = this.a2.nextInt(2);
                    c2ra2 = c2r2.nextInt(12);
                    slot2.setIcon(c1img[c2ra2]);
                    larrow2.setIcon(arrow[aa2]);

                    p2ra4 = p2r4.nextInt(13);
                    this.p2slot4.setIcon(c2img[p2ra4]);
                }
            }
        }
        if (a2 == 1) {
            if (p2slot4 == main1) {
                slot2.setIcon(c2img[p2slot4]);

                cardni2--;
                cardni2--;
                cardni2 = cardni2;
                scores2++;
                scores2++;
                scores2++;
                scores2 = scores2;

                score2.setText("score:" + scores2);
                if (cardni2 >= 0) {
                    cardn2.setText("Card Left:" + cardni2);
                }
                if (cardni2 <= 0) {
                    this.p2slot4.setVisible(false);
                }
                for (int i = 0; i < 1; i++) {

                    aa2 = this.a2.nextInt(2);
                    c2ra2 = c2r2.nextInt(13);
                    slot2.setIcon(c1img[c2ra2]);
                    larrow2.setIcon(arrow[aa2]);

                    p2ra4 = p2r4.nextInt(13);
                    this.p2slot4.setIcon(c2img[p2ra4]);
                }
            }
        }
        this.p2slot4.setBorder(null);
    }

    public void humanfour3() {
        int a3 = aa3;
        int p2slot4 = p2ra4;
        int deck3 = c2ra1;
        deck3--;
        int main1 = deck3;
        deck3++;
        deck3++;
        int main2 = deck3;
        deck3 = c2ra1;

        if (a3 == 0) {
            if (p2slot4 == main2) {
                slot3.setIcon(c2img[p2slot4]);

                cardni2--;
                cardni2--;
                cardni2 = cardni2;
                scores2++;
                scores2++;
                scores2++;
                scores2 = scores2;

                score2.setText("score:" + scores2);
                if (cardni2 >= 0) {
                    cardn2.setText("Card Left:" + cardni2);
                }
                if (cardni2 <= 0) {
                    this.p2slot4.setVisible(false);
                }

                for (int i = 0; i < 1; i++) {

                    aa3 = this.a3.nextInt(2);
                    c2ra1 = c2r1.nextInt(12);
                    slot3.setIcon(c1img[c2ra1]);
                    larrow3.setIcon(arrow[aa3]);

                    p2ra4 = p2r4.nextInt(13);
                    this.p2slot4.setIcon(c2img[p2ra4]);
                }
            }
        }
        if (a3 == 1) {
            if (p2slot4 == main1) {
                slot3.setIcon(c2img[p2slot4]);

                cardni2--;
                cardni2--;
                cardni2 = cardni2;
                scores2++;
                scores2++;
                scores2++;
                scores2 = scores2;

                score2.setText("score:" + scores2);
                if (cardni2 >= 0) {
                    cardn2.setText("Card Left:" + cardni2);
                }
                if (cardni2 <= 0) {
                    this.p2slot4.setVisible(false);
                }

                for (int i = 0; i < 1; i++) {
                    aa3 = this.a3.nextInt(2);
                    c2ra1 = c2r1.nextInt(12);
                    slot3.setIcon(c1img[c2ra1]);
                    larrow3.setIcon(arrow[aa3]);

                    p2ra4 = p2r4.nextInt(13);
                    this.p2slot4.setIcon(c2img[p2ra4]);
                }

            }
        }

        this.p2slot4.setBorder(null);
    }

    public void humanfour4() {
        int a4 = aa4;
        int p2slot4 = p2ra4;
        int deck4 = c1ra2;
        deck4--;
        int main1 = deck4;
        deck4++;
        deck4++;
        int main2 = deck4;
        deck4 = c1ra2;

        if (a4 == 0) {
            if (p2slot4 == main2) {
                slot4.setIcon(c2img[p2slot4]);

                cardni2--;
                cardni2--;
                cardni2 = cardni2;
                scores2++;
                scores2++;
                scores2++;
                scores2 = scores2;

                score2.setText("score:" + scores2);
                if (cardni2 >= 0) {
                    cardn2.setText("Card Left:" + cardni2);
                }
                if (cardni2 <= 0) {
                    this.p2slot4.setVisible(false);
                }
                for (int i = 0; i < 1; i++) {

                    aa4 = this.a4.nextInt(2);
                    c1ra2 = c1r2.nextInt(12);
                    slot3.setIcon(c1img[c1ra2]);
                    larrow4.setIcon(arrow[aa4]);
                    p2ra4 = p2r4.nextInt(13);

                    this.p2slot4.setIcon(c2img[p2ra4]);
                }
            }
        }

        if (a4 == 1) {
            if (p2slot4 == main1) {
                slot4.setIcon(c2img[p2slot4]);
                cardni2--;
                cardni2--;
                cardni2 = cardni2;
                scores2++;
                scores2++;
                scores2++;
                scores2 = scores2;

                score2.setText("score:" + scores2);
                if (cardni2 >= 0) {
                    cardn2.setText("Card Left:" + cardni2);
                }
                if (cardni2 <= 0) {
                    this.p2slot4.setVisible(false);
                }
                for (int i = 0; i < 1; i++) {
                    aa4 = this.a4.nextInt(2);
                    c1ra2 = c1r2.nextInt(12);
                    slot3.setIcon(c1img[c1ra2]);
                    larrow4.setIcon(arrow[aa4]);
                    p2ra4 = p2r4.nextInt(13);
                    this.p2slot4.setIcon(c2img[p2ra4]);

                }
            }
        }
        this.p2slot4.setBorder(null);
    }

}
