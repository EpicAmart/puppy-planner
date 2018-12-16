/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codedayapp;

import java.util.Scanner;
import javax.swing.JFrame;

/**
 *
 * @author abhid
 */
public class ChildInterface extends javax.swing.JFrame {

    /**
     * Creates new form ChildInterface
     *
     * @throws java.io.IOException
     */
    public int count = 0;
    public int completeCount = 0;
    public int happiness = 0;
    public int hunger = 0;
    public int thirst = 0;
    public int hungerExtra;
    public int thirstExtra;
    public int happinessExtra;

    public ChildInterface(String input, String timeInput) {
        initComponents();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jLabel30.setText("");
        jLabel31.setText("");
        Scanner sc = new Scanner(input);
        Scanner time = new Scanner(timeInput);
        if (sc.hasNextLine()) {
            jLabel9.setText(sc.nextLine());
            jLabel16.setText(sc.nextLine());
            if (jLabel16.getText().equals("Done")) {
                completeCount++;
            }
            count++;
        }
        if (sc.hasNextLine()) {
            jLabel10.setText(sc.nextLine());
            jLabel17.setText(sc.nextLine());
            if (jLabel17.getText().equals("Done")) {
                completeCount++;
            }
            count++;
        }
        if (sc.hasNextLine()) {
            jLabel11.setText(sc.nextLine());
            jLabel18.setText(sc.nextLine());
            if (jLabel18.getText().equals("Done")) {
                completeCount++;
            }
            count++;
        }
        if (sc.hasNextLine()) {
            jLabel12.setText(sc.nextLine());
            jLabel19.setText(sc.nextLine());
            if (jLabel19.getText().equals("Done")) {
                completeCount++;
            }
            count++;
        }
        if (sc.hasNextLine()) {
            jLabel13.setText(sc.nextLine());
            jLabel20.setText(sc.nextLine());
            if (jLabel20.getText().equals("Done")) {
                completeCount++;
            }
            count++;
        }
        if (sc.hasNextLine()) {
            jLabel14.setText(sc.nextLine());
            jLabel21.setText(sc.nextLine());
            if (jLabel21.getText().equals("Done")) {
                completeCount++;
            }
            count++;
        }

        if (time.hasNextLine()) {
            jLabel23.setText(time.nextLine() + ":" + time.nextLine());
        }
        if (time.hasNextLine()) {
            jLabel24.setText(time.nextLine() + ":" + time.nextLine());
        }
        if (time.hasNextLine()) {
            jLabel25.setText(time.nextLine() + ":" + time.nextLine());
        }
        if (time.hasNextLine()) {
            jLabel26.setText(time.nextLine() + ":" + time.nextLine());
        }
        if (time.hasNextLine()) {
            jLabel27.setText(time.nextLine() + ":" + time.nextLine());
        }
        if (time.hasNextLine()) {
            jLabel28.setText(time.nextLine() + ":" + time.nextLine());
        }

        if (count == 0) {
            jLabel3.setText("");
            jLabel4.setText("");
            jLabel5.setText("");
            jLabel6.setText("");
            jLabel7.setText("");
            jLabel8.setText("");
            jLabel9.setText("");
            jLabel10.setText("");
            jLabel11.setText("");
            jLabel12.setText("");
            jLabel13.setText("");
            jLabel14.setText("");
            jLabel16.setText("");
            jLabel17.setText("");
            jLabel18.setText("");
            jLabel19.setText("");
            jLabel20.setText("");
            jLabel21.setText("");
            jLabel23.setText("");
            jLabel24.setText("");
            jLabel25.setText("");
            jLabel26.setText("");
            jLabel27.setText("");
            jLabel28.setText("");
        } else if (count == 1) {
            jLabel4.setText("");
            jLabel5.setText("");
            jLabel6.setText("");
            jLabel7.setText("");
            jLabel8.setText("");
            jLabel10.setText("");
            jLabel11.setText("");
            jLabel12.setText("");
            jLabel13.setText("");
            jLabel14.setText("");
            jLabel17.setText("");
            jLabel18.setText("");
            jLabel19.setText("");
            jLabel20.setText("");
            jLabel21.setText("");
            jLabel24.setText("");
            jLabel25.setText("");
            jLabel26.setText("");
            jLabel27.setText("");
            jLabel28.setText("");
        } else if (count == 2) {
            jLabel5.setText("");
            jLabel6.setText("");
            jLabel7.setText("");
            jLabel8.setText("");
            jLabel11.setText("");
            jLabel12.setText("");
            jLabel13.setText("");
            jLabel14.setText("");
            jLabel18.setText("");
            jLabel19.setText("");
            jLabel20.setText("");
            jLabel21.setText("");
            jLabel25.setText("");
            jLabel26.setText("");
            jLabel27.setText("");
            jLabel28.setText("");
        } else if (count == 3) {
            jLabel6.setText("");
            jLabel7.setText("");
            jLabel8.setText("");
            jLabel12.setText("");
            jLabel13.setText("");
            jLabel14.setText("");
            jLabel19.setText("");
            jLabel20.setText("");
            jLabel21.setText("");
            jLabel26.setText("");
            jLabel27.setText("");
            jLabel28.setText("");
        } else if (count == 4) {
            jLabel7.setText("");
            jLabel8.setText("");
            jLabel13.setText("");
            jLabel14.setText("");
            jLabel20.setText("");
            jLabel21.setText("");
            jLabel27.setText("");
            jLabel28.setText("");
        } else if (count == 5) {
            jLabel8.setText("");
            jLabel14.setText("");
            jLabel21.setText("");
            jLabel28.setText("");
        }
    }

    private ChildInterface() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    ChildInterface(String output) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 0, 159));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CHILD VIEW");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("STUFF TO DO:");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Job 1:");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Job 2:");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Job 3:");

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Job 4:");

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Job 5:");

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Job 6:");

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("-");

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("-");

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("-");

        jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("-");

        jLabel13.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("-");

        jLabel14.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("-");

        jLabel15.setFont(new java.awt.Font("Century Gothic", 1, 30)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("ARE YOU DONE?");

        jLabel16.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("-");

        jLabel17.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("-");

        jLabel18.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("-");

        jLabel19.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("-");

        jLabel20.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("-");

        jLabel21.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("-");

        jLabel22.setFont(new java.awt.Font("Century Gothic", 1, 30)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("HOW LONG?");

        jLabel23.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("-");

        jLabel24.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("-");

        jLabel25.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("-");

        jLabel26.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("-");

        jLabel27.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("-");

        jLabel28.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("-");

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/codedayapp/5.JPG"))); // NOI18N

        jButton1.setBackground(new java.awt.Color(255, 0, 159));
        jButton1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Feed");

        jButton2.setBackground(new java.awt.Color(255, 0, 159));
        jButton2.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Water");

        jButton3.setBackground(new java.awt.Color(255, 0, 159));
        jButton3.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Play");

        jLabel30.setBackground(new java.awt.Color(255, 0, 159));
        jLabel30.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("-");

        jLabel31.setBackground(new java.awt.Color(255, 0, 159));
        jLabel31.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("-");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(441, 441, 441)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addGap(42, 42, 42)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(104, 104, 104)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(142, 142, 142)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(73, 73, 73)
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 466, Short.MAX_VALUE)
                        .addComponent(jLabel22)
                        .addGap(60, 60, 60)
                        .addComponent(jLabel15)))
                .addGap(41, 41, 41))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel15)
                    .addComponent(jLabel22))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel9)
                    .addComponent(jLabel16)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel10)
                    .addComponent(jLabel17)
                    .addComponent(jLabel24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel11)
                    .addComponent(jLabel18)
                    .addComponent(jLabel25))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel12)
                    .addComponent(jLabel19)
                    .addComponent(jLabel26))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel13)
                    .addComponent(jLabel20)
                    .addComponent(jLabel27))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel14)
                        .addComponent(jLabel21)
                        .addComponent(jLabel28)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel31)
                        .addGap(93, 93, 93)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2)
                            .addComponent(jButton3))
                        .addGap(221, 221, 221))))
        );

        jButton1.addActionListener (new java.awt.event.ActionListener() {
            public void actionPerformed (java.awt.event.ActionEvent evt) {
                dogIsFed (evt);
            }
        });
        jButton2.addActionListener (new java.awt.event.ActionListener() {
            public void actionPerformed (java.awt.event.ActionEvent evt) {
                dogIsQuenched (evt);
            }
        });
        jButton3.addActionListener (new java.awt.event.ActionListener() {
            public void actionPerformed (java.awt.event.ActionEvent evt) {
                dogIsPlayedWith (evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public int pointsAvailable;
    public int pointValue;

    public void dogIsFed(java.awt.event.ActionEvent evt) {
        if (completeCount >= 0 && count > 2) {
            pointsAvailable = 300 / count * completeCount;
            pointValue = 300 / count;
            if (pointsAvailable == 0) {
                pointValue = 0;
            }
            hunger += pointValue;
            if (hunger >= 100) {
                jButton1.setVisible(false);
                hungerExtra = hunger % 100;
                hunger -= hungerExtra;
                if (thirst < 100) {
                    thirst += hungerExtra;
                } else if (happiness < 100) {
                    happiness += hungerExtra;
                }
            }
            completeCount--;
        }
        if (completeCount == 2 && count == 2) {
            hunger += 150;
            jButton1.setVisible(false);
            if (thirst < 100) {
                thirst += hunger - 100;
            } else if (happiness < 100) {
                happiness += hunger - 100;
            }
        }
        if (completeCount == 1 && count == 2) {
            if (thirst == 0 && happiness == 0) {
                hunger += 99;
                jButton1.setVisible(false);
            }
        }
        if (completeCount == 1 && count == 1) {
            if (thirst == 0 && happiness == 0) {
                hunger += 100;
                thirst += 100;
                happiness += 100;
                jButton1.setVisible(false);
                jButton2.setVisible(false);
                jButton3.setVisible(false);
            }
        }

        if (thirst < 100) {
            if (hunger < 100) {
                if (happiness < 100) {
                    jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/codedayapp/5.JPG")));
                } else {
                    jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/codedayapp/7.JPG")));
                }
            } else if (hunger >= 100) {
                hunger = 100;
                if (happiness < 100) {
                    jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/codedayapp/6.JPG")));
                } else {
                    jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/codedayapp/4.JPG")));
                }
            }
        } else {
            if (hunger < 100) {
                if (happiness < 100) {
                    jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/codedayapp/8.JPG")));
                } else {
                    jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/codedayapp/2.JPG")));
                }
            } else {
                if (happiness < 100) {
                    jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/codedayapp/3.JPG")));
                } else {
                    jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/codedayapp/Happy Puppy.JPG")));
                    jLabel30.setText("You finished all of your work!");
                    jLabel31.setText("PAWesome job!!!");
                }
            }
        }
    }

    public void dogIsQuenched(java.awt.event.ActionEvent evt) {
        if (completeCount >= 0 && count > 2) {
            pointsAvailable = 300 / count * completeCount;
            pointValue = 300 / count;
            if (pointsAvailable == 0) {
                pointValue = 0;
            }
            thirst += pointValue;
            if (thirst >= 100) {
                jButton2.setVisible(false);
                thirstExtra = thirst % 100;
                thirst -= thirstExtra;
                if (happiness < 100) {
                    happiness += thirstExtra;
                } else if (hunger < 100) {
                    hunger += thirstExtra;
                }
            }
            completeCount--;
        }
        if (count == 2 && completeCount == 2) {
            thirst += 150;
            jButton2.setVisible(false);
            if (happiness < 100) {
                happiness += thirst - 100;
            } else if (hunger < 100) {
                hunger += thirst - 100;
            }
        }
        if (completeCount == 1 && count == 2) {
            if (hunger == 0 && happiness == 0) {
                thirst += 99;
                jButton2.setVisible(false);
            }
        }
        if (completeCount == 1 && count == 1) {
            if (hunger == 0 && happiness == 0) {
                hunger += 100;
                thirst += 100;
                happiness += 100;
                jButton1.setVisible(false);
                jButton2.setVisible(false);
                jButton3.setVisible(false);
            }
        }
        if (thirst < 100) {
            if (hunger < 100) {
                if (happiness < 100) {
                    jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/codedayapp/5.JPG")));
                } else {
                    jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/codedayapp/7.JPG")));
                }
            } else if (hunger >= 100) {
                hunger = 100;
                if (happiness < 100) {
                    jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/codedayapp/6.JPG")));
                } else {
                    jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/codedayapp/4.JPG")));
                }
            }
        } else {
            if (hunger < 100) {
                if (happiness < 100) {
                    jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/codedayapp/8.JPG")));
                } else {
                    jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/codedayapp/2.JPG")));
                }
            } else {
                if (happiness < 100) {
                    jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/codedayapp/3.JPG")));
                } else {
                    jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/codedayapp/Happy Puppy.JPG")));
                    jLabel30.setText("You finished all of your work!");
                    jLabel31.setText("PAWesome job!!!");
                }
            }
        }
    }

    public void dogIsPlayedWith(java.awt.event.ActionEvent evt) {
        if (completeCount >= 0 && count > 2) {
            pointsAvailable = 300 / count * completeCount;
            pointValue = 300 / count;
            if (pointsAvailable == 0) {
                pointValue = 0;
            }
            happiness += pointValue;
            if (happiness >= 100) {
                jButton3.setVisible(false);
                happinessExtra = happiness % 100;
                happiness -= happinessExtra;
                if (hunger < 100) {
                    hunger += happinessExtra;
                } else if (thirst < 100) {
                    thirst += happinessExtra;
                }
            }
            completeCount--;
        }
        if (count == 2 && completeCount == 2) {
            happiness += 150;
            jButton3.setVisible(false);
            if (hunger < 100) {
                hunger += happiness - 100;
            } else if (thirst < 100) {
                thirst += happiness - 100;
            }
        }
        if (completeCount == 1 && count == 2) {
            if (thirst == 0 && hunger == 0) {
                happiness += 99;
                jButton1.setVisible(false);
            }
        }
        if (completeCount == 1 && count == 1) {
            if (thirst == 0 && hunger == 0) {
                hunger += 100;
                thirst += 100;
                happiness += 100;
                jButton1.setVisible(false);
                jButton2.setVisible(false);
                jButton3.setVisible(false);
            }
        }
        if (thirst < 100) {
            if (hunger < 100) {
                if (happiness < 100) {
                    jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/codedayapp/5.JPG")));
                } else {
                    jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/codedayapp/7.JPG")));
                }
            } else if (hunger >= 100) {
                hunger = 100;
                if (happiness < 100) {
                    jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/codedayapp/6.JPG")));
                } else {
                    jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/codedayapp/4.JPG")));
                }
            }
        } else {
            if (hunger < 100) {
                if (happiness < 100) {
                    jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/codedayapp/8.JPG")));
                } else {
                    jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/codedayapp/2.JPG")));
                }
            } else {
                if (happiness < 100) {
                    jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/codedayapp/3.JPG")));
                } else {
                    jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/codedayapp/Happy Puppy.JPG")));
                    jLabel30.setText("You finished all of your work!");
                    jLabel31.setText("PAWesome job!!!");
                }
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ChildInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChildInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChildInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChildInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ChildInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
