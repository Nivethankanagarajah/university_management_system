package uni_system;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class instructors extends javax.swing.JFrame {

    /**
     * Creates new form instructors
     */
    public instructors() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        logo = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        menu = new javax.swing.JPanel();
        homein = new javax.swing.JButton();
        addin = new javax.swing.JButton();
        viewin = new javax.swing.JButton();
        removein = new javax.swing.JButton();
        startmun = new javax.swing.JButton();
        cardin = new javax.swing.JPanel();
        home = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        add = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        und_gra = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        post_gra = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        insertins = new javax.swing.JButton();
        resetin = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        faculty = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        instru_id = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        fullname = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        date_of_birth = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        contact_no = new javax.swing.JTextField();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        subject = new javax.swing.JTextField();
        subject_id = new javax.swing.JTextField();
        qualification = new javax.swing.JTextField();
        view = new javax.swing.JPanel();
        viewbutt = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        view_t_index = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        remove = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        RemoveIndexNo = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        logo.setBackground(new java.awt.Color(255, 255, 255));

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uni_system/nsbm-team-logo new.jpg"))); // NOI18N

        javax.swing.GroupLayout logoLayout = new javax.swing.GroupLayout(logo);
        logo.setLayout(logoLayout);
        logoLayout.setHorizontalGroup(
            logoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 925, Short.MAX_VALUE)
        );
        logoLayout.setVerticalGroup(
            logoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logoLayout.createSequentialGroup()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(logo, java.awt.BorderLayout.PAGE_START);

        menu.setBackground(new java.awt.Color(255, 255, 255));

        homein.setText("Home");
        homein.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeinActionPerformed(evt);
            }
        });

        addin.setText("Add");
        addin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addinActionPerformed(evt);
            }
        });

        viewin.setText("View");
        viewin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewinActionPerformed(evt);
            }
        });

        removein.setText("Remove");
        removein.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeinActionPerformed(evt);
            }
        });

        startmun.setText("start menu");
        startmun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startmunActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addComponent(startmun)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(menuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(homein, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(viewin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(removein, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE))
                .addContainerGap())
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(startmun)
                .addGap(98, 98, 98)
                .addComponent(homein, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(addin, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(viewin, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(removein, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(232, Short.MAX_VALUE))
        );

        getContentPane().add(menu, java.awt.BorderLayout.LINE_START);

        cardin.setLayout(new java.awt.CardLayout());

        jLabel17.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Desktop\\instructors.jpg")); // NOI18N

        javax.swing.GroupLayout homeLayout = new javax.swing.GroupLayout(home);
        home.setLayout(homeLayout);
        homeLayout.setHorizontalGroup(
            homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel17)
        );
        homeLayout.setVerticalGroup(
            homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeLayout.createSequentialGroup()
                .addComponent(jLabel17)
                .addGap(0, 217, Short.MAX_VALUE))
        );

        cardin.add(home, "card2");

        add.setBackground(new java.awt.Color(0, 102, 255));

        jLabel1.setText("Faculty");

        jLabel2.setText("Full Name");

        und_gra.setText("under graduate");
        und_gra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                und_graActionPerformed(evt);
            }
        });

        jLabel3.setText(" Instuctors Id");

        post_gra.setText("post graduate");

        jLabel4.setText("E-mail");

        jLabel5.setText("Address");

        jLabel6.setText("Contact No");

        jLabel9.setText("Qualification");

        insertins.setText("INSERT");
        insertins.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertinsActionPerformed(evt);
            }
        });

        resetin.setText("RESET");
        resetin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetinActionPerformed(evt);
            }
        });

        jLabel7.setText("Birth Of  Date");

        faculty.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "School of Computing", "School Of Business", "School Of Engineering", " " }));

        jLabel8.setText("Gender");

        jLabel10.setText("Subject");

        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });

        jLabel11.setText("Subject Id");

        date_of_birth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                date_of_birthActionPerformed(evt);
            }
        });

        jLabel12.setText("Type");

        contact_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contact_noActionPerformed(evt);
            }
        });

        buttonGroup1.add(male);
        male.setText("Male");

        buttonGroup1.add(female);
        female.setText("Female");

        subject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subjectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout addLayout = new javax.swing.GroupLayout(add);
        add.setLayout(addLayout);
        addLayout.setHorizontalGroup(
            addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(addLayout.createSequentialGroup()
                            .addComponent(jLabel10)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(subject, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(addLayout.createSequentialGroup()
                            .addGroup(addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(jLabel7)
                                .addComponent(jLabel6)
                                .addComponent(jLabel5)
                                .addComponent(jLabel8))
                            .addGap(125, 125, 125)
                            .addGroup(addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(addLayout.createSequentialGroup()
                                    .addComponent(male)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(female)
                                    .addGap(50, 50, 50))
                                .addComponent(faculty, 0, 258, Short.MAX_VALUE)
                                .addComponent(instru_id)
                                .addComponent(fullname)
                                .addComponent(email)
                                .addComponent(date_of_birth)
                                .addComponent(contact_no)
                                .addComponent(address)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addLayout.createSequentialGroup()
                            .addGroup(addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel11)
                                .addComponent(jLabel12))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(addLayout.createSequentialGroup()
                                    .addComponent(und_gra)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(post_gra))
                                .addComponent(subject_id, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(qualification, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 347, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(insertins)
                .addGap(105, 105, 105)
                .addComponent(resetin)
                .addGap(51, 51, 51))
        );
        addLayout.setVerticalGroup(
            addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(fullname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(instru_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(faculty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(contact_no, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(date_of_birth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(male)
                    .addComponent(female))
                .addGap(18, 18, 18)
                .addGroup(addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(subject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(subject_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(und_gra)
                    .addComponent(post_gra))
                .addGap(18, 18, 18)
                .addGroup(addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(qualification, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(insertins)
                    .addComponent(resetin))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cardin.add(add, "card3");

        view.setBackground(new java.awt.Color(0, 102, 255));

        viewbutt.setText("view");
        viewbutt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewbuttActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        jScrollPane1.setViewportView(jTable2);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jLabel14.setText("INDEX NO");

        javax.swing.GroupLayout viewLayout = new javax.swing.GroupLayout(view);
        view.setLayout(viewLayout);
        viewLayout.setHorizontalGroup(
            viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewLayout.createSequentialGroup()
                .addGroup(viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(viewLayout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jLabel14)
                        .addGap(39, 39, 39)
                        .addComponent(view_t_index, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(121, 121, 121)
                        .addComponent(viewbutt))
                    .addGroup(viewLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE))
                    .addGroup(viewLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        viewLayout.setVerticalGroup(
            viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(view_t_index, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(viewbutt))
                .addGap(58, 58, 58)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(190, Short.MAX_VALUE))
        );

        cardin.add(view, "card4");

        remove.setBackground(new java.awt.Color(0, 102, 255));

        jLabel15.setText("Instructor Id");

        RemoveIndexNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveIndexNoActionPerformed(evt);
            }
        });

        jButton1.setText("Remove");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout removeLayout = new javax.swing.GroupLayout(remove);
        remove.setLayout(removeLayout);
        removeLayout.setHorizontalGroup(
            removeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(removeLayout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addGroup(removeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RemoveIndexNo, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(533, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, removeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(321, 321, 321))
        );
        removeLayout.setVerticalGroup(
            removeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(removeLayout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jLabel15)
                .addGap(56, 56, 56)
                .addComponent(RemoveIndexNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 259, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(160, 160, 160))
        );

        cardin.add(remove, "card5");

        getContentPane().add(cardin, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void und_graActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_und_graActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_und_graActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void date_of_birthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_date_of_birthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_date_of_birthActionPerformed

    private void contact_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contact_noActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contact_noActionPerformed

    private void addinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addinActionPerformed
         home.setVisible(false);
        add.setVisible(true);
        remove.setVisible(false);
        view.setVisible(false);
    }//GEN-LAST:event_addinActionPerformed

    private void removeinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeinActionPerformed
         home.setVisible(false);
        add.setVisible(false);
        remove.setVisible(true);
        view.setVisible(false);
    }//GEN-LAST:event_removeinActionPerformed

    private void startmunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startmunActionPerformed
        this.hide();
       home frmin=new home();
       frmin.setVisible(true);
                                            
    
    }//GEN-LAST:event_startmunActionPerformed

    private void insertinsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertinsActionPerformed
          try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/form","root","");
            String sql="Insert into instructors Values (?,?,?,?,?,?,?,?,?,?,?,?) ";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1,fullname.getText());
            pst.setString(2,instru_id.getText());
            pst.setString(3,faculty.getSelectedItem().toString());
            pst.setString(4,email.getText());
            pst.setString(5,address.getText());
            pst.setString(6,contact_no.getText());
            pst.setString(7,date_of_birth.getText());
             if(male.isSelected()){
                pst.setString(8,"male");
            }
            else if(female.isSelected()){
                pst.setString(8,"female");
            }
            pst.setString(9,subject.getText());
            pst.setString(10,subject_id.getText());
             if(und_gra.isSelected()){
                pst.setString(11,"under graduate");
            }
             else if(post_gra.isSelected()){
                pst.setString(11,"post graduate");
            }
              else if(post_gra.isSelected()&& und_gra.isSelected()){
                pst.setString(11,"post graduate,post graduate");
            }
             
            pst.setString(12,qualification.getText());
             
           

            

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null,"successfully inserted");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_insertinsActionPerformed

    private void subjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subjectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subjectActionPerformed

    private void homeinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeinActionPerformed
        home.setVisible(true);
        add.setVisible(false);
        remove.setVisible(false);
        view.setVisible(false);
                                  
    }//GEN-LAST:event_homeinActionPerformed

    private void viewinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewinActionPerformed
         home.setVisible(false);
        add.setVisible(false);
        remove.setVisible(false);
        view.setVisible(true);
         DefaultTableModel tablem_1=(DefaultTableModel)jTable1.getModel();
        tablem_1.setRowCount(0);
       
       try{
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/form","root","");
            String sql="Select * From instructors";
            PreparedStatement pst=con.prepareStatement(sql);
            
            ResultSet result_s=pst.executeQuery();
            String col_name1[]={"Full Name","Instructors Id","Faculty","Email","Address","Contact No","Date Of Birth","Gender","Subject","Subject Id","Type","Qualification"};
            tablem_1.setColumnIdentifiers(col_name1);
            ResultSetMetaData rsmd2=result_s.getMetaData();
            int cols2=rsmd2.getColumnCount();
            while(result_s.next()){
                Object[] obj1=new Object[cols2];
                int i;
                for(i=0;i<cols2;i++){
                    obj1[i]=result_s.getObject(i+1);
                    
                }
                tablem_1.addRow(obj1);
            
         }
       }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);}
                         
    }//GEN-LAST:event_viewinActionPerformed

    private void resetinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetinActionPerformed
         instru_id.setText("");
        fullname.setText("");
        contact_no.setText("");
        email.setText("");
        faculty.setSelectedIndex(0);
        address.setText("");
        date_of_birth.setText("");
        qualification.setText("");
        subject.setText("");
        subject_id.setText("");
        buttonGroup1.clearSelection();
        post_gra.setSelected(false);
        und_gra.setSelected(false);
    }//GEN-LAST:event_resetinActionPerformed

    private void viewbuttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewbuttActionPerformed
        DefaultTableModel tablem_2=(DefaultTableModel)jTable2.getModel();
        tablem_2.setRowCount(0);

        try{

            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/form","root","");
            String sql="Select * From Instructors Where Instructors_Id="+view_t_index.getText()+"";
            PreparedStatement pst=con.prepareStatement(sql);

            ResultSet result_s=pst.executeQuery();
            String col_name2[]={"Full Name","Lecturers Id","Faculty","Email","Address","Contact No","Date Of Birth","Gender","Subject","Subject Id","Type","Qualification"};
            tablem_2.setColumnIdentifiers(col_name2);
            ResultSetMetaData rsmd1=result_s.getMetaData();
            int cols1=rsmd1.getColumnCount();
            while(result_s.next()){
                Object[] obj2=new Object[cols1];
                int i;
                for(i=0;i<cols1;i++){
                    obj2[i]=result_s.getObject(i+1);

                }
                tablem_2.addRow(obj2);

            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);}
    }//GEN-LAST:event_viewbuttActionPerformed

    private void RemoveIndexNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveIndexNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RemoveIndexNoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
              try{
          
    Class.forName("com.mysql.jdbc.Driver");
    Connection con =   DriverManager.getConnection("jdbc:mysql://localhost:3306/form","root","");
    String query="Delete  FROM `instructors` WHERE Instructors_Id=?";
    
    PreparedStatement pst=con.prepareStatement(query);
    

    pst.setString(1,RemoveIndexNo.getText());
    pst.executeUpdate();
   
    JOptionPane.showMessageDialog(null, "Removed Detail");
    }
        catch (Exception e) {        
            JOptionPane.showMessageDialog(null, e);
        }
        RemoveIndexNo.setText("");
        
    
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(instructors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(instructors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(instructors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(instructors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new instructors().setVisible(true);
           }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField RemoveIndexNo;
    private javax.swing.JPanel add;
    private javax.swing.JButton addin;
    private javax.swing.JTextField address;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel cardin;
    private javax.swing.JTextField contact_no;
    private javax.swing.JTextField date_of_birth;
    private javax.swing.JTextField email;
    private javax.swing.JComboBox<String> faculty;
    private javax.swing.JRadioButton female;
    private javax.swing.JTextField fullname;
    private javax.swing.JPanel home;
    private javax.swing.JButton homein;
    private javax.swing.JButton insertins;
    private javax.swing.JTextField instru_id;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JPanel logo;
    private javax.swing.JRadioButton male;
    private javax.swing.JPanel menu;
    private javax.swing.JCheckBox post_gra;
    private javax.swing.JTextField qualification;
    private javax.swing.JPanel remove;
    private javax.swing.JButton removein;
    private javax.swing.JButton resetin;
    private javax.swing.JButton startmun;
    private javax.swing.JTextField subject;
    private javax.swing.JTextField subject_id;
    private javax.swing.JCheckBox und_gra;
    private javax.swing.JPanel view;
    private javax.swing.JTextField view_t_index;
    private javax.swing.JButton viewbutt;
    private javax.swing.JButton viewin;
    // End of variables declaration//GEN-END:variables
}
