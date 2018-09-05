package uni_system;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
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
public class under_student extends javax.swing.JFrame {
int p=0;
double q=0;
    /**
     * Creates new form under_student
     */
    public under_student() {
        initComponents();
    }
DefaultListModel lis_model1 = new DefaultListModel();
DefaultListModel lis_model2 = new DefaultListModel();
DefaultListModel lis_model3 = new DefaultListModel();
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jButton4 = new javax.swing.JButton();
        Menu = new javax.swing.JPanel();
        homeb = new javax.swing.JButton();
        addb = new javax.swing.JButton();
        removeb = new javax.swing.JButton();
        viewb = new javax.swing.JButton();
        startmenu = new javax.swing.JButton();
        Card = new javax.swing.JPanel();
        HomeP = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        update_delete = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        address1 = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        alresult1 = new javax.swing.JTextField();
        email1 = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        indexno1 = new javax.swing.JTextField();
        insertstu1 = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();
        rank1 = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        semester1 = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        dateofbirth1 = new javax.swing.JTextField();
        resetbn1 = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        faculty1 = new javax.swing.JTextField();
        contactno1 = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        name1 = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        delete = new javax.swing.JButton();
        Go = new javax.swing.JButton();
        degree1 = new javax.swing.JTextField();
        gender = new javax.swing.JTextField();
        intakeun = new javax.swing.JTextField();
        ViewP = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        view_t_index = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        viewbn = new javax.swing.JButton();
        AddP = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        faculty = new javax.swing.JTextField();
        contactno = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        degree = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        address = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        alresult = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        indexno = new javax.swing.JTextField();
        insertstu = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        rank = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        semester = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        dateofbirth = new javax.swing.JTextField();
        resetbn = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        intake = new javax.swing.JComboBox<>();
        AddC = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        IndexNo1 = new javax.swing.JTextField();
        year1 = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        Subjects1 = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        OSubjects1 = new javax.swing.JList<>();
        credit = new javax.swing.JTextField();
        totfee = new javax.swing.JTextField();
        toamont = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        studtable = new javax.swing.JTable();
        resetsub = new javax.swing.JButton();
        up_sub = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        semest1 = new javax.swing.JList<>();
        add_detail = new javax.swing.JPanel();
        add_stu = new javax.swing.JButton();
        add_cou = new javax.swing.JButton();
        view_detial = new javax.swing.JPanel();
        viewstu = new javax.swing.JButton();
        view_cou = new javax.swing.JButton();
        ViewC = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        logo = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jButton4.setText("jButton4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Menu.setBackground(new java.awt.Color(255, 255, 255));

        homeb.setText("Home");
        homeb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homebActionPerformed(evt);
            }
        });

        addb.setText("ADD ");
        addb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbActionPerformed(evt);
            }
        });

        removeb.setText("REMOVE ");
        removeb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removebActionPerformed(evt);
            }
        });

        viewb.setText("VIEW");
        viewb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewbActionPerformed(evt);
            }
        });

        startmenu.setText("Start Menu");
        startmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startmenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MenuLayout = new javax.swing.GroupLayout(Menu);
        Menu.setLayout(MenuLayout);
        MenuLayout.setHorizontalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(removeb, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                    .addComponent(viewb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(homeb, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                    .addComponent(startmenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        MenuLayout.setVerticalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(startmenu)
                .addGap(73, 73, 73)
                .addComponent(homeb, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(addb, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(removeb, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(viewb, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(199, Short.MAX_VALUE))
        );

        getContentPane().add(Menu, java.awt.BorderLayout.LINE_START);

        Card.setLayout(new java.awt.CardLayout());

        HomeP.setBackground(new java.awt.Color(255, 255, 255));

        jLabel26.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Desktop\\NSBM-Career-Fair-2017-1-1024x630.jpg")); // NOI18N

        javax.swing.GroupLayout HomePLayout = new javax.swing.GroupLayout(HomeP);
        HomeP.setLayout(HomePLayout);
        HomePLayout.setHorizontalGroup(
            HomePLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomePLayout.createSequentialGroup()
                .addComponent(jLabel26)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        HomePLayout.setVerticalGroup(
            HomePLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Card.add(HomeP, "card2");

        update_delete.setBackground(new java.awt.Color(0, 51, 255));

        jLabel14.setText("Faculty");

        jLabel29.setText("Address");

        jLabel30.setText("Date Of Birth");

        jLabel31.setText("A/L Result");

        jLabel32.setText("Rank");

        insertstu1.setText("update");
        insertstu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertstu1ActionPerformed(evt);
            }
        });

        jLabel33.setText("Index No");

        jLabel34.setText("Semester");

        jLabel35.setText("Gender");

        resetbn1.setText("Reset");
        resetbn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetbn1ActionPerformed(evt);
            }
        });

        jLabel36.setText("Name");

        jLabel37.setText("Intake");

        jLabel38.setText("Contact no");

        jLabel39.setText("Email");

        jLabel40.setText("Degree");

        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        Go.setText("GO");
        Go.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GoActionPerformed(evt);
            }
        });

        degree1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                degree1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout update_deleteLayout = new javax.swing.GroupLayout(update_delete);
        update_delete.setLayout(update_deleteLayout);
        update_deleteLayout.setHorizontalGroup(
            update_deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(update_deleteLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(update_deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(update_deleteLayout.createSequentialGroup()
                        .addComponent(jLabel37)
                        .addGap(21, 946, Short.MAX_VALUE))
                    .addGroup(update_deleteLayout.createSequentialGroup()
                        .addGroup(update_deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel32)
                            .addComponent(jLabel31)
                            .addComponent(jLabel30)
                            .addComponent(jLabel29)
                            .addGroup(update_deleteLayout.createSequentialGroup()
                                .addGroup(update_deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(update_deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(update_deleteLayout.createSequentialGroup()
                                            .addGroup(update_deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel33)
                                                .addComponent(jLabel36)
                                                .addComponent(jLabel39)
                                                .addComponent(jLabel38))
                                            .addGap(51, 51, 51))
                                        .addGroup(update_deleteLayout.createSequentialGroup()
                                            .addComponent(jLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGap(69, 69, 69)))
                                    .addGroup(update_deleteLayout.createSequentialGroup()
                                        .addComponent(jLabel35)
                                        .addGap(69, 69, 69)))
                                .addGroup(update_deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(contactno1, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                                    .addComponent(email1)
                                    .addComponent(indexno1)
                                    .addComponent(name1)
                                    .addComponent(semester1)
                                    .addComponent(faculty1)
                                    .addComponent(dateofbirth1)
                                    .addComponent(alresult1)
                                    .addComponent(rank1)
                                    .addComponent(address1)
                                    .addComponent(degree1)
                                    .addComponent(gender)
                                    .addComponent(intakeun))
                                .addGroup(update_deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(update_deleteLayout.createSequentialGroup()
                                        .addGap(75, 75, 75)
                                        .addComponent(Go))
                                    .addGroup(update_deleteLayout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addComponent(insertstu1)
                                        .addGap(38, 38, 38)
                                        .addComponent(resetbn1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(delete)))))
                        .addGap(23, 23, 23))))
        );
        update_deleteLayout.setVerticalGroup(
            update_deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, update_deleteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(update_deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(indexno1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Go))
                .addGap(18, 18, 18)
                .addGroup(update_deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(name1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(update_deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contactno1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(update_deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(email1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(update_deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel40)
                    .addComponent(degree1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(update_deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addGroup(update_deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(faculty1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(update_deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(address1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(update_deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(dateofbirth1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(update_deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(alresult1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(update_deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(rank1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(update_deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(semester1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(update_deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(intakeun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(update_deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resetbn1)
                    .addComponent(insertstu1)
                    .addComponent(delete))
                .addGap(18, 18, 18))
        );

        Card.add(update_delete, "card4");

        ViewP.setBackground(new java.awt.Color(0, 51, 255));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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

        jLabel6.setText("INDEX NO");

        viewbn.setText("view");
        viewbn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewbnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ViewPLayout = new javax.swing.GroupLayout(ViewP);
        ViewP.setLayout(ViewPLayout);
        ViewPLayout.setHorizontalGroup(
            ViewPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewPLayout.createSequentialGroup()
                .addGroup(ViewPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(ViewPLayout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jLabel6)
                        .addGap(39, 39, 39)
                        .addComponent(view_t_index, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(121, 121, 121)
                        .addComponent(viewbn))
                    .addGroup(ViewPLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE))
                    .addGroup(ViewPLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2)))
                .addContainerGap(359, Short.MAX_VALUE))
        );
        ViewPLayout.setVerticalGroup(
            ViewPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewPLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(ViewPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(view_t_index, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(viewbn))
                .addGap(58, 58, 58)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(171, Short.MAX_VALUE))
        );

        Card.add(ViewP, "card5");

        AddP.setBackground(new java.awt.Color(0, 51, 255));

        jLabel1.setText("Name");

        jLabel2.setText("Contact no");

        jLabel3.setText("Email");

        degree.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BSC in Computer Science", "BSC in Information System", "BM In Accounting And Finance", "BSC in Business Management", "BSC(Hons) In Networking Engineering", "BSC(Hons) In Electronic Engineering", " " }));
        degree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                degreeActionPerformed(evt);
            }
        });

        jLabel4.setText("Degree");

        jLabel5.setText("Faculty");

        jLabel8.setText("Address");

        jLabel9.setText("Date Of Birth");

        jLabel10.setText("A/L Result");

        jLabel11.setText("Rank");

        insertstu.setText("Insert");
        insertstu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertstuActionPerformed(evt);
            }
        });

        jLabel12.setText("Index No");

        jLabel13.setText("Semester");

        jLabel15.setText("Gender");

        buttonGroup1.add(male);
        male.setText("Male");

        buttonGroup1.add(female);
        female.setText("Female");

        resetbn.setText("Reset");
        resetbn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetbnActionPerformed(evt);
            }
        });

        jLabel28.setText("Intake");

        intake.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "February", "July", " " }));

        javax.swing.GroupLayout AddPLayout = new javax.swing.GroupLayout(AddP);
        AddP.setLayout(AddPLayout);
        AddPLayout.setHorizontalGroup(
            AddPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddPLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(AddPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddPLayout.createSequentialGroup()
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(resetbn)
                        .addGap(151, 151, 151))
                    .addGroup(AddPLayout.createSequentialGroup()
                        .addGroup(AddPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(jLabel15)
                            .addGroup(AddPLayout.createSequentialGroup()
                                .addGroup(AddPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4))
                                .addGap(51, 51, 51)
                                .addGroup(AddPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(AddPLayout.createSequentialGroup()
                                        .addComponent(male)
                                        .addGap(43, 43, 43)
                                        .addComponent(female))
                                    .addComponent(contactno)
                                    .addComponent(email)
                                    .addComponent(indexno)
                                    .addComponent(degree, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(name)
                                    .addComponent(intake, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(semester)
                                    .addComponent(faculty)
                                    .addComponent(dateofbirth)
                                    .addComponent(alresult)
                                    .addComponent(rank)
                                    .addComponent(address))
                                .addGap(18, 18, 18)
                                .addComponent(insertstu)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        AddPLayout.setVerticalGroup(
            AddPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddPLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(AddPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(indexno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(AddPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(AddPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contactno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AddPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(AddPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddPLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel4))
                    .addComponent(degree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(AddPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(male)
                    .addComponent(female))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addGroup(AddPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(faculty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(AddPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(AddPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(dateofbirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(AddPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(alresult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(AddPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(rank, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(AddPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(semester, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(AddPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddPLayout.createSequentialGroup()
                        .addGroup(AddPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28)
                            .addComponent(intake, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddPLayout.createSequentialGroup()
                        .addGroup(AddPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(insertstu)
                            .addComponent(resetbn))
                        .addGap(42, 42, 42))))
        );

        Card.add(AddP, "card3");

        AddC.setBackground(new java.awt.Color(0, 51, 255));

        jLabel7.setText("Index No");

        jLabel16.setText("Year");

        jLabel17.setText("Semester");

        jLabel18.setText("Compulsory Subject");

        jLabel19.setText("Opitanal Subject");

        jLabel20.setText("Total Credits");

        jLabel21.setText("Total Fee");

        jLabel22.setText("Amount to be paid");

        IndexNo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IndexNo1ActionPerformed(evt);
            }
        });

        year1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select year", "1", "2", "3", "4" }));
        year1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                year1ActionPerformed(evt);
            }
        });

        jScrollPane3.setViewportView(Subjects1);

        jScrollPane4.setViewportView(OSubjects1);

        studtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "subject code", "subject name", "credit", "fees"
            }
        ));
        jScrollPane5.setViewportView(studtable);

        resetsub.setText("Reset");
        resetsub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetsubActionPerformed(evt);
            }
        });

        up_sub.setText("Update");
        up_sub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                up_subActionPerformed(evt);
            }
        });

        semest1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                semest1MouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(semest1);

        javax.swing.GroupLayout AddCLayout = new javax.swing.GroupLayout(AddC);
        AddC.setLayout(AddCLayout);
        AddCLayout.setHorizontalGroup(
            AddCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddCLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AddCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddCLayout.createSequentialGroup()
                        .addGroup(AddCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(AddCLayout.createSequentialGroup()
                                .addGroup(AddCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel17))
                                .addGroup(AddCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(AddCLayout.createSequentialGroup()
                                        .addGap(99, 99, 99)
                                        .addGroup(AddCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel19)
                                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(AddCLayout.createSequentialGroup()
                                        .addGap(43, 43, 43)
                                        .addGroup(AddCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                            .addComponent(year1, 0, 146, Short.MAX_VALUE)
                                            .addComponent(IndexNo1))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(AddCLayout.createSequentialGroup()
                        .addGroup(AddCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addComponent(jLabel21)
                            .addComponent(jLabel22))
                        .addGap(48, 48, 48)
                        .addGroup(AddCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(credit)
                            .addComponent(totfee)
                            .addComponent(toamont, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(resetsub)
                        .addGap(112, 112, 112)
                        .addComponent(up_sub))))
        );
        AddCLayout.setVerticalGroup(
            AddCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddCLayout.createSequentialGroup()
                .addGroup(AddCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(AddCLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(AddCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(IndexNo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(AddCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(year1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(AddCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(AddCLayout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jLabel17)
                                .addGap(26, 26, 26))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddCLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(AddCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(AddCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(36, 36, 36)
                        .addComponent(jLabel20))
                    .addGroup(AddCLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(credit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addGroup(AddCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(totfee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(AddCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(toamont, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                .addGroup(AddCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resetsub)
                    .addComponent(up_sub))
                .addGap(29, 29, 29))
        );

        Card.add(AddC, "card6");

        add_detail.setBackground(new java.awt.Color(51, 204, 255));

        add_stu.setText("Add stu");
        add_stu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_stuActionPerformed(evt);
            }
        });

        add_cou.setText("Add course");
        add_cou.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_couActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout add_detailLayout = new javax.swing.GroupLayout(add_detail);
        add_detail.setLayout(add_detailLayout);
        add_detailLayout.setHorizontalGroup(
            add_detailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(add_detailLayout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addGroup(add_detailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(add_stu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(add_cou, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE))
                .addContainerGap(767, Short.MAX_VALUE))
        );
        add_detailLayout.setVerticalGroup(
            add_detailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(add_detailLayout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(add_stu, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(add_cou, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(320, Short.MAX_VALUE))
        );

        Card.add(add_detail, "card7");

        view_detial.setBackground(new java.awt.Color(51, 204, 255));

        viewstu.setText("view stu");
        viewstu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewstuActionPerformed(evt);
            }
        });

        view_cou.setText("view course");
        view_cou.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view_couActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout view_detialLayout = new javax.swing.GroupLayout(view_detial);
        view_detial.setLayout(view_detialLayout);
        view_detialLayout.setHorizontalGroup(
            view_detialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(view_detialLayout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addGroup(view_detialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(view_cou, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                    .addComponent(viewstu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(791, Short.MAX_VALUE))
        );
        view_detialLayout.setVerticalGroup(
            view_detialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(view_detialLayout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(viewstu, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78)
                .addComponent(view_cou, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(322, Short.MAX_VALUE))
        );

        Card.add(view_detial, "card8");

        ViewC.setBackground(new java.awt.Color(0, 51, 255));

        jLabel23.setText("Index No");

        jLabel24.setText("Faculty");

        jLabel27.setText("Course");

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane6.setViewportView(jTable4);

        jButton3.setText("GO");

        javax.swing.GroupLayout ViewCLayout = new javax.swing.GroupLayout(ViewC);
        ViewC.setLayout(ViewCLayout);
        ViewCLayout.setHorizontalGroup(
            ViewCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ViewCLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(205, 205, 205))
            .addGroup(ViewCLayout.createSequentialGroup()
                .addGroup(ViewCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ViewCLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel23)
                        .addGap(83, 83, 83)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ViewCLayout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ViewCLayout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(ViewCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel27)
                            .addComponent(jLabel24))
                        .addGap(151, 151, 151)
                        .addGroup(ViewCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField6, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                            .addComponent(jTextField7))))
                .addContainerGap(490, Short.MAX_VALUE))
        );
        ViewCLayout.setVerticalGroup(
            ViewCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewCLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(ViewCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(jButton3)
                .addGap(66, 66, 66)
                .addGroup(ViewCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ViewCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(134, Short.MAX_VALUE))
        );

        Card.add(ViewC, "card9");

        getContentPane().add(Card, java.awt.BorderLayout.CENTER);

        logo.setBackground(new java.awt.Color(255, 255, 255));

        jLabel25.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Desktop\\nsbm-team-logo new.jpg")); // NOI18N

        javax.swing.GroupLayout logoLayout = new javax.swing.GroupLayout(logo);
        logo.setLayout(logoLayout);
        logoLayout.setHorizontalGroup(
            logoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logoLayout.createSequentialGroup()
                .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, 1067, Short.MAX_VALUE)
                .addGap(63, 63, 63))
        );
        logoLayout.setVerticalGroup(
            logoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
        );

        getContentPane().add(logo, java.awt.BorderLayout.PAGE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homebActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homebActionPerformed
        HomeP.setVisible(true);
        AddP.setVisible(false);
        update_delete.setVisible(false);
        ViewP.setVisible(false);
        add_detail.setVisible(false);
        AddC.setVisible(false);
        ViewC.setVisible(false);
        view_detial.setVisible(false);
        
    }//GEN-LAST:event_homebActionPerformed

    private void addbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbActionPerformed
        HomeP.setVisible(false);
        AddP.setVisible(false);
        update_delete.setVisible(false);
        ViewP.setVisible(false);
        add_detail.setVisible(true);
        AddC.setVisible(false);
         ViewC.setVisible(false);
        view_detial.setVisible(false);
    }//GEN-LAST:event_addbActionPerformed

    private void degreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_degreeActionPerformed
         if(degree.getSelectedItem().toString().equals("BSC in Computer Science" )){
            faculty.setText("School of Computing");
            }
            
             else if(degree.getSelectedItem().toString().equals("BSC in Information System")){
            faculty.setText("School Of Computing");
            }
            
            else if(degree.getSelectedItem().toString().equals("BM In Accounting And Finance" )){
            faculty.setText("School Of Business");
            }
             else if(degree.getSelectedItem().toString().equals("BSC in Business Management" )){
            faculty.setText("School Of Business");
            }
            
            else if(degree.getSelectedItem().toString().equals("BSC(Hons) In Networking Engineering" )){
            faculty.setText("School Of Engineering");
            }
            else if(degree.getSelectedItem().toString().equals("BSC(Hons) In Electronic Engineering" )){
            faculty.setText("School Of Engineering");
            }
        
    }//GEN-LAST:event_degreeActionPerformed

    private void removebActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removebActionPerformed
        HomeP.setVisible(false);
        AddP.setVisible(false);
        update_delete.setVisible(true);
        ViewP.setVisible(false);
        add_detail.setVisible(false);
        AddC.setVisible(false);
         ViewC.setVisible(false);
        view_detial.setVisible(false);
    }//GEN-LAST:event_removebActionPerformed

    private void viewbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewbActionPerformed
        HomeP.setVisible(false);
        AddP.setVisible(false);
        update_delete.setVisible(false);
        ViewP.setVisible(false);
        add_detail.setVisible(false);
        AddC.setVisible(false);
        ViewC.setVisible(false);
        view_detial.setVisible(true);
    }//GEN-LAST:event_viewbActionPerformed

    public ArrayList<subject> subjectsList(){
    ArrayList<subject> subjectList=new ArrayList<>();
    try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con =   DriverManager.getConnection("jdbc:mysql://localhost:3306/NSBM","root","");
        for(int i=0;i<Subjects1.getModel().getSize();i++){
           String query="Select * from Subject where SName='"+Subjects1.getModel().getElementAt(i)+"' ";
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery(query);
            subject s;
        if(rs.next()){
            s= new uni_system.subject(rs.getInt("Credits"), rs.getDouble("Fees"), rs.getString("SName"), rs.getString("SCode"));
            subjectList.add(s);
        }
          
        }
        for(int i=0;i<OSubjects1.getModel().getSize();i++){
           String query="Select * from Subject where SName='"+OSubjects1.getModel().getElementAt(i)+"' ";
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery(query);
            subject s;
        if(rs.next()){
            s= new uni_system.subject(rs.getInt("Credits"), rs.getDouble("Fees"), rs.getString("SName"), rs.getString("SCode"));
            subjectList.add(s);
        }
          
        }
        
       
    }
    catch (Exception e) {        
            JOptionPane.showMessageDialog(null, e);
        }
    return subjectList;
    
}
    
    public void ShowSubject(){
    ArrayList<uni_system.subject> list=subjectsList();
    
    DefaultTableModel model=(DefaultTableModel)studtable.getModel();
    Object[] row=new Object[4];
    for(int i=0;i<list.size();i++){
        row[0]=list.get(i).getCode();
        row[1]=list.get(i).getName();
        row[2]=list.get(i).getCredit();
        row[3]=list.get(i).getFees();
        
       
        model.addRow(row);
    }   
    }
public void ShowSubject1(){
    ArrayList<uni_system.subject> list=subjectsList();
    
    DefaultTableModel model=(DefaultTableModel)studtable.getModel();
    Object[] row=new Object[4];
    for(int i=0;i<list.size();i++){
        row[0]=list.get(i).getCode();
        row[1]=list.get(i).getName();
        row[2]=list.get(i).getCredit();
        row[3]=list.get(i).getFees();
        
       
        model.addRow(row);
    }   
    }
    private void insertstuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertstuActionPerformed
        try{
	Class.forName("com.mysql.jdbc.Driver");
	Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/form","root","");
	String sql="Insert into student_detail Values (?,?,?,?,?,?,?,?,?,?,?,?,?) ";
	PreparedStatement pst = con.prepareStatement(sql);
	pst.setString(1,indexno.getText());
        pst.setString(2,name.getText());
        pst.setString(3,contactno.getText());
        pst.setString(4,email.getText());
        pst.setString(5,degree.getSelectedItem().toString());
        pst.setString(6,faculty.getText());
        pst.setString(7,address.getText());
        
        pst.setString(8,dateofbirth.getText());
        pst.setString(9,alresult.getText());
        pst.setString(10,rank.getText());
        pst.setString(11,semester.getText());
        if(male.isSelected()){
        pst.setString(12,"male");
        }
        else if(female.isSelected()){
             pst.setString(12,"female");
        }
        pst.setString(13,intake.getSelectedItem().toString());   
        
        
	
	pst.executeUpdate();
        JOptionPane.showMessageDialog(null,"successfully inserted");
        }
        catch(Exception e){
     JOptionPane.showMessageDialog(null,e);
        }
    
    }//GEN-LAST:event_insertstuActionPerformed

    private void add_stuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_stuActionPerformed
        HomeP.setVisible(false);
        AddP.setVisible(true);
        update_delete.setVisible(false);
        ViewP.setVisible(false);
        add_detail.setVisible(false);
        AddC.setVisible(false);
        ViewC.setVisible(false);
        view_detial.setVisible(false);
    }//GEN-LAST:event_add_stuActionPerformed

    private void add_couActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_couActionPerformed
        HomeP.setVisible(false);
        AddP.setVisible(false);
        update_delete.setVisible(false);
        ViewP.setVisible(false);
        add_detail.setVisible(false);
        AddC.setVisible(true);
        ViewC.setVisible(false);
        view_detial.setVisible(false);
    }//GEN-LAST:event_add_couActionPerformed
    
                                          

    
       
    private void viewbnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewbnActionPerformed
          DefaultTableModel tablem_2=(DefaultTableModel)jTable2.getModel();
        tablem_2.setRowCount(0);
       
       try{
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/form","root","");
            String sql="Select * From student_detail Where Index_No="+view_t_index.getText()+"";
            PreparedStatement pst=con.prepareStatement(sql);
            
            ResultSet result_s=pst.executeQuery();
            String col_name2[]={"Index No","Name","Contact No","Email","Degree","Faculty","Address","Date Of Birth","A/L Result","Rank","Semester","Gender","Intake"};
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
    }//GEN-LAST:event_viewbnActionPerformed

    private void viewstuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewstuActionPerformed
         HomeP.setVisible(false);
        AddP.setVisible(false);
        update_delete.setVisible(false);
        ViewP.setVisible(true);
        add_detail.setVisible(false);
        AddC.setVisible(false);
        ViewC.setVisible(false);
        view_detial.setVisible(false);
        
        DefaultTableModel tablem_1=(DefaultTableModel)jTable1.getModel();
        tablem_1.setRowCount(0);
       
       try{
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/form","root","");
            String sql="Select * From student_detail";
            PreparedStatement pst=con.prepareStatement(sql);
            
            ResultSet result_s=pst.executeQuery();
            String col_name1[]={"Index No","Name","Contact No","Email","Degree","Faculty","Address","Date Of Birth","A/L Result","Rank","Semester","Gender"};
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
                                          

        
        
    }//GEN-LAST:event_viewstuActionPerformed

    private void view_couActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_view_couActionPerformed
         HomeP.setVisible(false);
        AddP.setVisible(false);
        update_delete.setVisible(false);
        ViewP.setVisible(false);
        add_detail.setVisible(false);
        AddC.setVisible(false);
        ViewC.setVisible(true);
        view_detial.setVisible(false);
    }//GEN-LAST:event_view_couActionPerformed

    private void resetbnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetbnActionPerformed
        indexno.setText("");
        name.setText("");
        contactno.setText("");
        email.setText("");
        degree.setSelectedIndex(0);
        faculty.setText("");
        address.setText("");
        dateofbirth.setText("");
        alresult.setText("");
        rank.setText("");
        semester.setText("");
        buttonGroup1.clearSelection();
    }//GEN-LAST:event_resetbnActionPerformed

    private void startmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startmenuActionPerformed
       this.hide();
       home frm=new home();
       frm.setVisible(true);
    }//GEN-LAST:event_startmenuActionPerformed

    private void up_subActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_up_subActionPerformed
          try{
            Class.forName("com.mysql.jdbc.Driver");
    Connection con =   DriverManager.getConnection("jdbc:mysql://localhost:3306/form","root","");
    String query= "update student_detail set Year='"+year1.getSelectedItem()+"' , Semester='"+semest1.getSelectedValue()+"' , Fees='"+Double.parseDouble(totfee.getText())+"' where IndexNo='"+IndexNo1.getText()+"' ";
    PreparedStatement pst=con.prepareStatement(query);
    pst.executeUpdate();
    String query1="delete from Study where Index_No='"+IndexNo1.getText()+"'";
    PreparedStatement pst1=con.prepareStatement(query1);
    pst1.executeUpdate();
    
    for(int i=0;i<Subjects1.getModel().getSize();i++){
        String query2="Select SCode from Subject where SName='"+Subjects1.getModel().getElementAt(i).toString()+"' and DCode=(Select DCode from Degree where DName=(Select Degree from undergraduateStudent where IndexNo='"+IndexNo1.getText()+"'))";
        PreparedStatement pst2=con.prepareStatement(query2);
        ResultSet rs=pst2.executeQuery(query2);
        while(rs.next()){
             String query3="insert into Study(SCode,IndexNo)values ('"+rs.getString("SCode")+"','"+IndexNo1.getText()+"') ";
             PreparedStatement pst3=con.prepareStatement(query3);
             pst3.executeUpdate();
        }
    }
     }
     catch (Exception e) {        
            JOptionPane.showMessageDialog(null, e);
        }
         IndexNo1.setText("");
        lis_model1.clear();
        lis_model2.clear();
        lis_model3.clear();
        semest1.setModel(lis_model3);
        Subjects1.setModel(lis_model1);
        OSubjects1.setModel(lis_model2);
        year1.setSelectedItem("select year");
        credit.setText("");
        totfee.setText("");
        toamont.setText("");
      
        p=0;
        q=0;
            
    }//GEN-LAST:event_up_subActionPerformed

    private void insertstu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertstu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_insertstu1ActionPerformed

    private void resetbn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetbn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resetbn1ActionPerformed

    private void GoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GoActionPerformed
     try{
    
    Class.forName("com.mysql.jdbc.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/form","root","");
    String sql="SELECT * FROM student_detail WHERE index_no="+indexno1.getText()+"";
    PreparedStatement pst=con.prepareStatement(sql);
    
    ResultSet rs=pst.executeQuery(sql);
    
    name1.setText(rs.getString("Name"));
    contactno1.setText(rs.getString("Contact No"));
    email1.setText(rs.getString("Email"));
    address1.setText(rs.getString("Address"));
    dateofbirth1.setText(rs.getString("Date Of Birth"));
    alresult1.setText(rs.getString("A/L Result"));
    rank1.setText(rs.getString("Rank"));
    degree1.setText(rs.getString("Degree"));
    gender.setText(rs.getString("Gender"));
    intakeun.setText(rs.getString("Intake"));
    semester1.setText(rs.getString("Semester"));
    faculty1.setText(rs.getString("Faculty"));
    }
   
        catch (Exception e) {        
            JOptionPane.showMessageDialog(null, e);
        }
        
         
   
    
          
           
                    
    
                
           
         
    }//GEN-LAST:event_GoActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteActionPerformed

    private void IndexNo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IndexNo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IndexNo1ActionPerformed

    private void year1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_year1ActionPerformed
         lis_model3.clear();
     p=0;
     q=0;
        switch(year1.getSelectedItem().toString()){
            case "1":if(lis_model3.isEmpty()){lis_model3.addElement("1");lis_model3.addElement("2");}break;
        case "2":if(lis_model3.isEmpty()){lis_model3.addElement("3");lis_model3.addElement("4");}break;
        case "3":if(lis_model3.isEmpty()){lis_model3.addElement("5");lis_model3.addElement("6");}break;
        case "4":if(lis_model3.isEmpty()){lis_model3.addElement("7");lis_model3.addElement("8");}break;}
     semest1.setModel(lis_model3);
    }//GEN-LAST:event_year1ActionPerformed

    private void resetsubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetsubActionPerformed
         IndexNo1.setText("");
        lis_model1.clear();
        lis_model2.clear();
        lis_model3.clear();
        semest1.setModel(lis_model3);
        Subjects1.setModel(lis_model1);
        OSubjects1.setModel(lis_model2);
        year1.setSelectedItem("select year");
        credit.setText("");
        totfee.setText("");
        toamont.setText("");
        DefaultTableModel model=(DefaultTableModel)studtable.getModel();
        model.setRowCount(0);
    }//GEN-LAST:event_resetsubActionPerformed

    private void semest1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_semest1MouseClicked
            DefaultTableModel model=(DefaultTableModel)studtable.getModel();
        model.setRowCount(0);
        
        if(semest1.getSelectedValue().toString()=="6"){JOptionPane.showMessageDialog(null, "Internship Semester");}
        else {
        try{
            Class.forName("com.mysql.jdbc.Driver");
    Connection con =   DriverManager.getConnection("jdbc:mysql://localhost:3306/form","root","");
    String query="Select DCode from Degree where DName=(Select Degree from student_detail where Index_No='"+IndexNo1.getText()+"')";
    PreparedStatement pst=con.prepareStatement(query);
    ResultSet rs=pst.executeQuery(query);
    
    if(rs.next()){
    
  
    String query1="Select * from Subject where  DCode= '"+rs.getString("DCode")+"' and Credits=3 and Semester='"+semest1.getSelectedValue()+"'";
    
    PreparedStatement pst1=con.prepareStatement(query1);
    ResultSet rs1=pst1.executeQuery(query1);
    
    lis_model1.clear();
    
    while(rs1.next()){
        
        if(!lis_model1.contains(rs1.getString("SName"))){
        lis_model1.addElement(rs1.getString("SName"));}
        p += 3;
        q +=(rs1.getDouble("Fees"));
        
        credit.setText(Integer.toString(p));
        totfee.setText(Double.toString(q));
        
    }
    
    Subjects1.setModel(lis_model1);
    
    
    String query2="Select SName from Subject where  DCode= '"+rs.getString("DCode")+"' and Credits<3 and Semester='"+semest1.getSelectedValue()+"'";
    PreparedStatement pst2=con.prepareStatement(query2);
    ResultSet rs2=pst2.executeQuery(query2);
    
    lis_model2.clear();
    while(rs2.next()){
        if(!lis_model2.contains(rs2.getString("SName")))
        lis_model2.addElement(rs2.getString("SName"));
        
      
    }
    }
    OSubjects1.setModel(lis_model2);
    
    
    }
        
          
        catch (Exception e) {        
            JOptionPane.showMessageDialog(null, e);
        }
        ShowSubject1();
        
        }
    }//GEN-LAST:event_semest1MouseClicked

    private void degree1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_degree1ActionPerformed
        
    }//GEN-LAST:event_degree1ActionPerformed
    


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
            java.util.logging.Logger.getLogger(under_student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(under_student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(under_student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(under_student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new under_student().setVisible(true);
            }
        });
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AddC;
    private javax.swing.JPanel AddP;
    private javax.swing.JPanel Card;
    private javax.swing.JButton Go;
    private javax.swing.JPanel HomeP;
    private javax.swing.JTextField IndexNo1;
    private javax.swing.JPanel Menu;
    private javax.swing.JList<String> OSubjects1;
    private javax.swing.JList<String> Subjects1;
    private javax.swing.JPanel ViewC;
    private javax.swing.JPanel ViewP;
    private javax.swing.JButton add_cou;
    private javax.swing.JPanel add_detail;
    private javax.swing.JButton add_stu;
    private javax.swing.JButton addb;
    private javax.swing.JTextField address;
    private javax.swing.JTextField address1;
    private javax.swing.JTextField alresult;
    private javax.swing.JTextField alresult1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField contactno;
    private javax.swing.JTextField contactno1;
    private javax.swing.JTextField credit;
    private javax.swing.JTextField dateofbirth;
    private javax.swing.JTextField dateofbirth1;
    private javax.swing.JComboBox<String> degree;
    private javax.swing.JTextField degree1;
    private javax.swing.JButton delete;
    private javax.swing.JTextField email;
    private javax.swing.JTextField email1;
    private javax.swing.JTextField faculty;
    private javax.swing.JTextField faculty1;
    private javax.swing.JRadioButton female;
    private javax.swing.JTextField gender;
    private javax.swing.JButton homeb;
    private javax.swing.JTextField indexno;
    private javax.swing.JTextField indexno1;
    private javax.swing.JButton insertstu;
    private javax.swing.JButton insertstu1;
    private javax.swing.JComboBox<String> intake;
    private javax.swing.JTextField intakeun;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
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
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JPanel logo;
    private javax.swing.JRadioButton male;
    private javax.swing.JTextField name;
    private javax.swing.JTextField name1;
    private javax.swing.JTextField rank;
    private javax.swing.JTextField rank1;
    private javax.swing.JButton removeb;
    private javax.swing.JButton resetbn;
    private javax.swing.JButton resetbn1;
    private javax.swing.JButton resetsub;
    private javax.swing.JList<String> semest1;
    private javax.swing.JTextField semester;
    private javax.swing.JTextField semester1;
    private javax.swing.JButton startmenu;
    private javax.swing.JTable studtable;
    private javax.swing.JTextField toamont;
    private javax.swing.JTextField totfee;
    private javax.swing.JButton up_sub;
    private javax.swing.JPanel update_delete;
    private javax.swing.JButton view_cou;
    private javax.swing.JPanel view_detial;
    private javax.swing.JTextField view_t_index;
    private javax.swing.JButton viewb;
    private javax.swing.JButton viewbn;
    private javax.swing.JButton viewstu;
    private javax.swing.JComboBox<String> year1;
    // End of variables declaration//GEN-END:variables
}
