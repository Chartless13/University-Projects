
package Tutors;

import java.util.ArrayList;
import java.util.List;

public class ShowIndividualTutor extends javax.swing.JFrame {
    
    //Initiates anything that is needed
    List<Tutor> list = new ArrayList<Tutor>();
    public int index;
    public Tutor newTutor;
    
    public ShowIndividualTutor(int index) {
        this.index = index;
        initComponents();
        populatejLable();
        
    }
    //This method populates the jlabels with the Tutors details
    public void populatejLable() {
        list = Tutor.getList();
        newTutor = list.get(index);
        System.out.println(newTutor.getFirstName());
        jLabelFirstNameValue.setText(newTutor.getFirstName());
        jLabelSurnameValue.setText(newTutor.getLastName());
        jLabelDOBValue.setText(newTutor.getDOB());
        jLabelAddressValue.setText(newTutor.getAddress());
        jLabelModuleValue.setText(newTutor.getModules());
        jLabelOfficeValue.setText(newTutor.getOffice());
        jLabelExpertiseValue.setText(newTutor.getExpertise());
        jLabelPositionValue.setText(newTutor.getPosition());
        jLabelStatusValue.setText(newTutor.getStatus());
    }
    //The following until line 237 creates the jframe and components 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabelFirstName = new javax.swing.JLabel();
        jLabelSurname = new javax.swing.JLabel();
        jLabelAddress = new javax.swing.JLabel();
        jButtonReturn = new javax.swing.JButton();
        jLabelDateOfBirth = new javax.swing.JLabel();
        jLabelModule = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelFirstNameValue = new javax.swing.JLabel();
        jLabelSurnameValue = new javax.swing.JLabel();
        jLabelDOBValue = new javax.swing.JLabel();
        jLabelAddressValue = new javax.swing.JLabel();
        jLabelModuleValue = new javax.swing.JLabel();
        jLabelOffice = new javax.swing.JLabel();
        jLabelPosition = new javax.swing.JLabel();
        jLabelExpertise = new javax.swing.JLabel();
        jLabelOfficeValue = new javax.swing.JLabel();
        jLabelExpertiseValue = new javax.swing.JLabel();
        jLabelPositionValue = new javax.swing.JLabel();
        jLabelStatus = new javax.swing.JLabel();
        jLabelStatusValue = new javax.swing.JLabel();
        jButtonDeleteTutor = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSeparator1.setBackground(new java.awt.Color(196, 168, 202));
        jSeparator1.setForeground(java.awt.Color.white);
        jSeparator1.setToolTipText("");
        jSeparator1.setMinimumSize(new java.awt.Dimension(50, 20));
        jSeparator1.setOpaque(true);
        jSeparator1.setPreferredSize(new java.awt.Dimension(50, 5));

        jLabelFirstName.setText("First name:");

        jLabelSurname.setText("Surname:");

        jLabelAddress.setText("Address:");

        jButtonReturn.setText("Previous Page");
        jButtonReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReturnActionPerformed(evt);
            }
        });

        jLabelDateOfBirth.setText("Date of Birth:");

        jLabelModule.setText("Modules:");

        jLabel2.setBackground(new java.awt.Color(103, 30, 117));
        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setForeground(java.awt.Color.white);
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Edge Hill University - Individual Tutor");
        jLabel2.setOpaque(true);

        jLabelFirstNameValue.setText("jLabel1");

        jLabelSurnameValue.setText("jLabel1");

        jLabelDOBValue.setText("jLabel1");

        jLabelAddressValue.setText("jLabel1");

        jLabelModuleValue.setText("jLabel1");

        jLabelOffice.setText("Office:");

        jLabelPosition.setText("Position:");

        jLabelExpertise.setText("Expertise:");

        jLabelOfficeValue.setText("jLabel1");

        jLabelExpertiseValue.setText("jLabel1");

        jLabelPositionValue.setText("jLabel1");

        jLabelStatus.setText("Status:");

        jLabelStatusValue.setText("jLabel1");

        jButtonDeleteTutor.setText("Delete Tutor");
        jButtonDeleteTutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteTutorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonDeleteTutor)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelFirstNameValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelSurnameValue, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelModule, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelModuleValue, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelAddressValue, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelDateOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelDOBValue, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelOffice, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelOfficeValue, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelExpertise, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelExpertiseValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelPositionValue, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelStatusValue, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)))
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(5, 5, 5)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(300, 300, 300)
                            .addComponent(jButtonReturn)
                            .addGap(13, 13, 13))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(5, 5, 5)))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFirstName)
                    .addComponent(jLabelFirstNameValue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSurname, javax.swing.GroupLayout.DEFAULT_SIZE, 16, Short.MAX_VALUE)
                    .addComponent(jLabelSurnameValue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDateOfBirth, javax.swing.GroupLayout.DEFAULT_SIZE, 15, Short.MAX_VALUE)
                    .addComponent(jLabelDOBValue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAddress, javax.swing.GroupLayout.DEFAULT_SIZE, 17, Short.MAX_VALUE)
                    .addComponent(jLabelAddressValue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelModule, javax.swing.GroupLayout.DEFAULT_SIZE, 17, Short.MAX_VALUE)
                    .addComponent(jLabelModuleValue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelOffice, javax.swing.GroupLayout.DEFAULT_SIZE, 17, Short.MAX_VALUE)
                    .addComponent(jLabelOfficeValue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelExpertise, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
                    .addComponent(jLabelExpertiseValue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPosition, javax.swing.GroupLayout.DEFAULT_SIZE, 17, Short.MAX_VALUE)
                    .addComponent(jLabelPositionValue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelStatus, javax.swing.GroupLayout.DEFAULT_SIZE, 17, Short.MAX_VALUE)
                    .addComponent(jLabelStatusValue))
                .addGap(37, 37, 37)
                .addComponent(jButtonDeleteTutor)
                .addGap(28, 28, 28))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(19, 19, 19)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 248, Short.MAX_VALUE)
                    .addComponent(jButtonReturn)
                    .addGap(29, 29, 29)))
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

    private void jButtonReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReturnActionPerformed
        //Opens new jFrame form and closes this one
        new ShowTutors().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonReturnActionPerformed

    private void jButtonDeleteTutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteTutorActionPerformed
        //Deletes the Tutor
        list.remove(index);
        Tutor.updateList(list);
        new ShowTutors().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonDeleteTutorActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDeleteTutor;
    private javax.swing.JButton jButtonReturn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelAddress;
    private javax.swing.JLabel jLabelAddressValue;
    private javax.swing.JLabel jLabelDOBValue;
    private javax.swing.JLabel jLabelDateOfBirth;
    private javax.swing.JLabel jLabelExpertise;
    private javax.swing.JLabel jLabelExpertiseValue;
    private javax.swing.JLabel jLabelFirstName;
    private javax.swing.JLabel jLabelFirstNameValue;
    private javax.swing.JLabel jLabelModule;
    private javax.swing.JLabel jLabelModuleValue;
    private javax.swing.JLabel jLabelOffice;
    private javax.swing.JLabel jLabelOfficeValue;
    private javax.swing.JLabel jLabelPosition;
    private javax.swing.JLabel jLabelPositionValue;
    private javax.swing.JLabel jLabelStatus;
    private javax.swing.JLabel jLabelStatusValue;
    private javax.swing.JLabel jLabelSurname;
    private javax.swing.JLabel jLabelSurnameValue;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
