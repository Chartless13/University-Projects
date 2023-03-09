
package Modules;

import Students.Student;
import GUI.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.DefaultComboBoxModel;

public class ShowIndividualModule extends javax.swing.JFrame {
    
    //Initiates anything that is needed
    List<Module> list = new ArrayList<Module>();
    List<Student> nonAddedStudents = new ArrayList<Student>();
    List<Student> studentList = new ArrayList<Student>();
    DefaultComboBoxModel dblAdd = new DefaultComboBoxModel();
    DefaultComboBoxModel dblRemove = new DefaultComboBoxModel();
    public int index;
    public Module newModule;
    Student newStudent = null;
    
    public ShowIndividualModule(int index) {
        this.index = index;
        initComponents();
        populatejLable();
        populateAddRemoveStudents();
       
    }
    //Method that populates the jLabels with module information
    public void populatejLable() {
        list = Module.getList();
        newModule = list.get(index);
        
        jLabelModuleNameValue.setText(newModule.getModuleName());
        jLabelModuleCodeValue.setText(newModule.getModuleCode());
        jLabelModuleLeadValue.setText(newModule.getLeader());
        jLabelModuleModeratorValue.setText(newModule.getModerator());
        int gradeTotal = 0; 
        int gradeAmount = 0;
        double averageGrade = 0;
        //Loops of all results for the module and calculates an average grade
        for (int i = 0; i < newModule.getResult().size(); i++) {
            Result result;
            result = (Result) newModule.getResult().get(i);
            gradeTotal += result.getGrade();
            gradeAmount++;
        }
        
        try{averageGrade = gradeTotal / gradeAmount;
            newModule.getResult().get(index);
            jLabelModuleAverageGradeValue.setText(String.valueOf(averageGrade));
       }catch(Exception e) {
           
       }
       
        
    }
    
    //Method to populate the students in the add and remove comboboxes
    public void populateAddRemoveStudents () {
        
        studentList = Student.getList();
        nonAddedStudents = studentList;
        //If the there are no students in the module add all students to the add combobox
        if (newModule.getStudents().size() == 0) {
            for (int i = 0; i < Student.getList().size(); i++){
                dblAdd.addElement(studentList.get(i));
                nonAddedStudents.add(studentList.get(i));
            }
            
        }else {
            //Runs over each student
            for (int i = 0; i < studentList.size(); i++){
                //Runs over every student in the module and checks if the student is equal to the one in the list
                    for (int j = 0; j < newModule.getStudents().size(); j++) {
                        if (newModule.getStudents().get(j).getID().equals(studentList.get(i).getID())){
                        dblRemove.addElement(studentList.get(i));
                        nonAddedStudents.remove(studentList.get(i));
                        
                        System.out.println(nonAddedStudents.toString());
                        
                        }
                     } 
                      
                
            }
            //Adds all remaining students to the add combobox 
            for (int i = 0; i < studentList.size(); i++){
                if (nonAddedStudents.contains(studentList.get(i))) {
                dblAdd.addElement(studentList.get(i));
                }
            }
        }

            jComboBoxAddStudents.setModel(dblAdd);
            jComboBoxRemoveStudents.setModel(dblRemove);
            
            String textArea = Arrays.toString(newModule.getStudents().toArray()).replace("[", "").replace("]", "");           
            jTextArea.append(textArea);
    }
    //Method that adds students
    public void AddStudent() {
        //Adds students to a module and a module to the specific student
        newModule.setStudents(nonAddedStudents.get(jComboBoxAddStudents.getSelectedIndex()));
        dblRemove.addElement((Student) jComboBoxAddStudents.getSelectedItem());
        nonAddedStudents.remove(jComboBoxAddStudents.getSelectedIndex());
        dblAdd.removeElement((Student) jComboBoxAddStudents.getSelectedItem());
        jComboBoxAddStudents.setModel(dblAdd);
        jComboBoxRemoveStudents.setModel(dblRemove);
    }
    
    public void RemoveStudent() {
        //Removes students from a module and a module from a specific student
        newModule.removeStudents(jComboBoxRemoveStudents.getSelectedIndex());
        dblAdd.addElement( (Student) jComboBoxRemoveStudents.getSelectedItem());
        nonAddedStudents.add( (Student) jComboBoxRemoveStudents.getSelectedItem());
        dblRemove.removeElement( (Student) jComboBoxRemoveStudents.getSelectedItem());
        jComboBoxAddStudents.setModel(dblAdd);
        jComboBoxRemoveStudents.setModel(dblRemove);
    }
    //The following until line 352 creates the jframe and components
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabelModuleName = new javax.swing.JLabel();
        jLabelModuleCode = new javax.swing.JLabel();
        jLabelModuleModerator = new javax.swing.JLabel();
        jButtonDeleteModule = new javax.swing.JButton();
        jButtonReturn = new javax.swing.JButton();
        jLabelModuleLead = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelModuleNameValue = new javax.swing.JLabel();
        jLabelModuleCodeValue = new javax.swing.JLabel();
        jLabelModuleLeadValue = new javax.swing.JLabel();
        jLabelModuleModeratorValue = new javax.swing.JLabel();
        jComboBoxAddStudents = new javax.swing.JComboBox<>();
        jButtonAddStudents = new javax.swing.JButton();
        jButtonRemoveStudents = new javax.swing.JButton();
        jComboBoxRemoveStudents = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea = new javax.swing.JTextArea();
        jLabelStudentsTakingModule = new javax.swing.JLabel();
        jLabelModuleAverageGrade = new javax.swing.JLabel();
        jLabelModuleAverageGradeValue = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSeparator1.setBackground(new java.awt.Color(196, 168, 202));
        jSeparator1.setForeground(java.awt.Color.white);
        jSeparator1.setToolTipText("");
        jSeparator1.setMinimumSize(new java.awt.Dimension(50, 20));
        jSeparator1.setOpaque(true);
        jSeparator1.setPreferredSize(new java.awt.Dimension(50, 5));

        jLabelModuleName.setText("Module Name:");

        jLabelModuleCode.setText("Module Code:");

        jLabelModuleModerator.setText("Module Moderator:");

        jButtonDeleteModule.setText("Delete Module");
        jButtonDeleteModule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteModuleActionPerformed(evt);
            }
        });

        jButtonReturn.setText("Previous Page");
        jButtonReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReturnActionPerformed(evt);
            }
        });

        jLabelModuleLead.setText("Module Lead:");

        jLabel2.setBackground(new java.awt.Color(103, 30, 117));
        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setForeground(java.awt.Color.white);
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Edge Hill University - Individual Module");
        jLabel2.setOpaque(true);

        jLabelModuleNameValue.setText("jLabel1");

        jLabelModuleCodeValue.setText("jLabel1");

        jLabelModuleLeadValue.setText("jLabel1");

        jLabelModuleModeratorValue.setText("jLabel1");

        jComboBoxAddStudents.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButtonAddStudents.setText("Add Students");
        jButtonAddStudents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddStudentsActionPerformed(evt);
            }
        });

        jButtonRemoveStudents.setText("Remove Students");
        jButtonRemoveStudents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoveStudentsActionPerformed(evt);
            }
        });

        jComboBoxRemoveStudents.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jTextArea.setEditable(false);
        jTextArea.setBackground(new java.awt.Color(240, 240, 240));
        jTextArea.setColumns(20);
        jTextArea.setLineWrap(true);
        jTextArea.setRows(5);
        jTextArea.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextArea.setCaretColor(new java.awt.Color(240, 240, 240));
        jTextArea.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jScrollPane1.setViewportView(jTextArea);

        jLabelStudentsTakingModule.setText("Students taking Module:");

        jLabelModuleAverageGrade.setText("Module Average Grade:");

        jLabelModuleAverageGradeValue.setText("No grade added");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelModuleAverageGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelModuleAverageGradeValue, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jButtonAddStudents, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonRemoveStudents, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelModuleModerator, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelModuleLead, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabelModuleCode, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabelModuleName, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabelStudentsTakingModule, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                            .addComponent(jLabelModuleModeratorValue, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelModuleLeadValue, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelModuleCodeValue, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelModuleNameValue, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBoxRemoveStudents, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBoxAddStudents, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(8, 8, 8)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(12, 12, 12))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jButtonDeleteModule)
                                    .addGap(207, 207, 207)
                                    .addComponent(jButtonReturn))
                                .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(8, 8, 8)))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelModuleName)
                    .addComponent(jLabelModuleNameValue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelModuleCode)
                    .addComponent(jLabelModuleCodeValue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelModuleLead)
                    .addComponent(jLabelModuleLeadValue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelModuleModerator, javax.swing.GroupLayout.DEFAULT_SIZE, 15, Short.MAX_VALUE)
                    .addComponent(jLabelModuleModeratorValue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelModuleAverageGrade)
                    .addComponent(jLabelModuleAverageGradeValue))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxAddStudents, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonAddStudents))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxRemoveStudents, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonRemoveStudents))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelStudentsTakingModule, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(53, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(24, 24, 24)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 259, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonReturn)
                        .addComponent(jButtonDeleteModule))
                    .addGap(24, 24, 24)))
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

    private void jButtonDeleteModuleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteModuleActionPerformed
        //removes module from module list and updates to file
        list.remove(index);
        Module.updateList(list);
        new ShowModules().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonDeleteModuleActionPerformed

    private void jButtonReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReturnActionPerformed
       //Updates the modules list to the file and opens new jFrame form and closes this one
        list.remove(index);
        list.add(newModule);
        Module.updateList(list);
        new ShowModules().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonReturnActionPerformed

    private void jButtonAddStudentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddStudentsActionPerformed
        //Calls method to add students
        AddStudent();
    }//GEN-LAST:event_jButtonAddStudentsActionPerformed

    private void jButtonRemoveStudentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoveStudentsActionPerformed
        //Calls method to remove students
        RemoveStudent();
    }//GEN-LAST:event_jButtonRemoveStudentsActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddStudents;
    private javax.swing.JButton jButtonDeleteModule;
    private javax.swing.JButton jButtonRemoveStudents;
    private javax.swing.JButton jButtonReturn;
    private javax.swing.JComboBox<String> jComboBoxAddStudents;
    private javax.swing.JComboBox<String> jComboBoxRemoveStudents;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelModuleAverageGrade;
    private javax.swing.JLabel jLabelModuleAverageGradeValue;
    private javax.swing.JLabel jLabelModuleCode;
    private javax.swing.JLabel jLabelModuleCodeValue;
    private javax.swing.JLabel jLabelModuleLead;
    private javax.swing.JLabel jLabelModuleLeadValue;
    private javax.swing.JLabel jLabelModuleModerator;
    private javax.swing.JLabel jLabelModuleModeratorValue;
    private javax.swing.JLabel jLabelModuleName;
    private javax.swing.JLabel jLabelModuleNameValue;
    private javax.swing.JLabel jLabelStudentsTakingModule;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea;
    // End of variables declaration//GEN-END:variables
}
