package uni_system;





/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class home extends javax.swing.JFrame {

    /**
     * Creates new form home
     */
    public home() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        home_under_std = new javax.swing.JButton();
        home_post_std = new javax.swing.JButton();
        home_lecturer = new javax.swing.JButton();
        home_course = new javax.swing.JButton();
        home_instructor = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uni_system/nsbm.jpg"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 102));
        jLabel2.setText("Welcome to NSBM Green University!");

        home_under_std.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        home_under_std.setText("UNDERGRADUATE STUDENT");
        home_under_std.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                home_under_stdActionPerformed(evt);
            }
        });

        home_post_std.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        home_post_std.setText("POSTGRADURATE STUDENT");
        home_post_std.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                home_post_stdActionPerformed(evt);
            }
        });

        home_lecturer.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        home_lecturer.setText("LECTURER");
        home_lecturer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                home_lecturerActionPerformed(evt);
            }
        });

        home_course.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        home_course.setText("COURSE");
        home_course.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                home_courseActionPerformed(evt);
            }
        });

        home_instructor.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        home_instructor.setText("INSTRUCTOR");
        home_instructor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                home_instructorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(home_lecturer, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(home_instructor)
                            .addComponent(home_course)
                            .addComponent(home_post_std)
                            .addComponent(home_under_std))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 103, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(81, 81, 81)
                .addComponent(home_under_std)
                .addGap(18, 18, 18)
                .addComponent(home_post_std)
                .addGap(18, 18, 18)
                .addComponent(home_lecturer)
                .addGap(18, 18, 18)
                .addComponent(home_instructor)
                .addGap(18, 18, 18)
                .addComponent(home_course)
                .addContainerGap(65, Short.MAX_VALUE))
        );

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

    private void home_under_stdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_home_under_stdActionPerformed
       under_student ustd=new under_student();
       ustd.setVisible(true);
       setVisible(false);
    }//GEN-LAST:event_home_under_stdActionPerformed

    private void home_post_stdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_home_post_stdActionPerformed
        post_std pstd=new post_std();
        pstd.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_home_post_stdActionPerformed

    private void home_lecturerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_home_lecturerActionPerformed
        lecturer lct= new lecturer();
        lct.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_home_lecturerActionPerformed

    private void home_courseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_home_courseActionPerformed
        course cou=new course();
        cou.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_home_courseActionPerformed

    private void home_instructorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_home_instructorActionPerformed
        instructors ins=new instructors();
        ins.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_home_instructorActionPerformed

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
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton home_course;
    private javax.swing.JButton home_instructor;
    private javax.swing.JButton home_lecturer;
    private javax.swing.JButton home_post_std;
    private javax.swing.JButton home_under_std;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}