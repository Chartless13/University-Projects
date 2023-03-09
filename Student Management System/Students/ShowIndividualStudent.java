
package Students;

import GUI.Result;
import Modules.*;
import java.util.ArrayList;
import java.util.List;
import Modules.Module;
import javax.swing.DefaultComboBoxModel;

public class ShowIndividualStudent extends javax.swing.JFrame {

    //Initiates anything that is needed
    List<Student> list = new ArrayList<Student>();
    List<Module> moduleList = new ArrayList<Module>();
    List<String> nameList = new ArrayList<String>();
    List<Result> resultList = new ArrayList<Result>();
    DefaultComboBoxModel dblAdd = new DefaultComboBoxModel();
    DefaultComboBoxModel dblGrade = new DefaultComboBoxModel();
    public int index;
    public Student newStudent;
    
    
    public ShowIndividualStudent(int index) {
        this.index = index;
        initComponents();
        populatejLable();
        
        
        
    }
    //This method populates the combobox with all modules the student takes
    
    
    public void populatejLable() {
        //Gets the list of Modules, Students and gets the student selected from the list
        moduleList = Module.getList();
        list = Student.getList();
        newStudent = list.get(index);
        //Enters student information into jLabels
        jLabelFirstNameValue.setText(newStudent.getFirstName());
        jLabelSurnameValue.setText(newStudent.getLastName());
        jLabelDOBValue.setText(newStudent.getDOB());
        jLabelAddressValue.setText(newStudent.getAddress());
        jLabelCourseValue.setText(newStudent.getCourse());
        //Loops over every module
        for (int i = 0 ; i < moduleList.size(); i++) {
            //Loops over every Student in each module
            for (int j = 0; j < moduleList.get(i).getStudents().size(); j++) {
                //If the students ID is equal to the student in the module, then add that module to the students module list 
                if (newStudent.getID().equals(moduleList.get(i).getStudents().get(j).getID())) {
                     jLabelModuleValue.setText(jLabelModuleValue.getText() + moduleList.get(i).toString() + ", ");
                     dblAdd.addElement(moduleList.get(i).toString());
                     break;
                }
            }
         }
        jComboBoxModules.setModel(dblAdd);
        jComboBoxAverageGradeModule.setModel(dblAdd);
    }

    //The following until line 294 creates the jframe and components
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabelFirstName = new javax.swing.JLabel();
        jLabelSurname = new javax.swing.JLabel();
        jLabelAddress = new javax.swing.JLabel();
        jButtonReturn = new javax.swing.JButton();
        jLabelDateOfBirth = new javax.swing.JLabel();
        jLabelCourse = new javax.swing.JLabel();
        jLabelFirstNameValue = new javax.swing.JLabel();
        jLabelDOBValue = new javax.swing.JLabel();
        jLabelSurnameValue = new javax.swing.JLabel();
        jLabelAddressValue = new javax.swing.JLabel();
        jLabelCourseValue = new javax.swing.JLabel();
        jLabelModule = new javax.swing.JLabel();
        jLabelModuleValue = new javax.swing.JLabel();
        jButtonDeleteStudent = new javax.swing.JButton();
        jComboBoxModules = new javax.swing.JComboBox<>();
        jLabelAddResult = new javax.swing.JLabel();
        jSpinnerPercentage = new javax.swing.JSpinner();
        jSpinnerDate = new javax.swing.JSpinner();
        jTextFieldFeedback = new javax.swing.JTextField();
        jButtonAddResult = new javax.swing.JButton();
        jLabelAverageGrade = new javax.swing.JLabel();
        jComboBoxAverageGradeModule = new javax.swing.JComboBox<>();
        jLabelAverageGradeGrade = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setBackground(new java.awt.Color(103, 30, 117));
        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setForeground(java.awt.Color.white);
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Edge Hill University - Individual Student");
        jLabel2.setOpaque(true);

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

        jLabelCourse.setText("Course:");

        jLabelModule.setText("Modules:");

        jButtonDeleteStudent.setText("Delete Student");
        jButtonDeleteStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteStudentActionPerformed(evt);
            }
        });

        jComboBoxModules.setModel(new DefaultComboBoxModel(nameList.toArray()));

        jLabelAddResult.setText("Add Result:");

        jSpinnerPercentage.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));

        jSpinnerDate.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(), null, new java.util.Date(), java.util.Calendar.DAY_OF_WEEK));

        jButtonAddResult.setText("Add Result");
        jButtonAddResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddResultActionPerformed(evt);
            }
        });

        jLabelAverageGrade.setText("Average Grade:");

        jComboBoxAverageGradeModule.setModel(new DefaultComboBoxModel(nameList.toArray()));
        jComboBoxAverageGradeModule.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxAverageGradeModuleItemStateChanged(evt);
            }
        });
        jComboBoxAverageGradeModule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxAverageGradeModuleActionPerformed(evt);
            }
        });

        jLabelAverageGradeGrade.setText("text");

        jLabel1.setText("Click module again to refresh grade");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelModule, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelModuleValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelDateOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelDOBValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelFirstNameValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelSurnameValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelCourseValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelAddressValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButtonDeleteStudent)
                                        .addGap(60, 60, 60)
                                        .addComponent(jButtonAddResult)
                                        .addGap(74, 74, 74)
                                        .addComponent(jButtonReturn))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabelAddResult, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelAverageGrade, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jSpinnerDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jComboBoxAverageGradeModule, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jSpinnerPercentage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(jComboBoxModules, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(jLabelAverageGradeGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(jTextFieldFeedback, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFirstName, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(jLabelFirstNameValue))
                .addGap(1, 1, 1)
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
                    .addComponent(jLabelCourse, javax.swing.GroupLayout.DEFAULT_SIZE, 17, Short.MAX_VALUE)
                    .addComponent(jLabelCourseValue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelModule, javax.swing.GroupLayout.DEFAULT_SIZE, 17, Short.MAX_VALUE)
                    .addComponent(jLabelModuleValue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAverageGrade)
                    .addComponent(jComboBoxAverageGradeModule, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelAverageGradeGrade))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAddResult)
                    .addComponent(jSpinnerDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerPercentage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxModules, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldFeedback, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonReturn)
                    .addComponent(jButtonDeleteStudent)
                    .addComponent(jButtonAddResult))
                .addGap(37, 37, 37))
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
        //Updates module list in file and opens a new jframe form 
        Module.updateList(moduleList);
        new ShowStudents().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonReturnActionPerformed

    private void jButtonDeleteStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteStudentActionPerformed
        //Loops over every module
        for (int i = 0; i < moduleList.size(); i++) {
            //Loops over all the students in each module
                for (int j = 0; j < moduleList.get(i).getStudents().size(); j++) {
                    //If the students ID from the module is equal to the student from the student list then remove that student from the module list and update the list
                    if (moduleList.get(i).getStudents().get(j).getID().equals(list.get(index).getID())) {                       
                        moduleList.get(i).removeStudents(j);
                        Module.updateList(moduleList);                       
                    }
                }
           
        }
        //remove the student from the student list and update the file
        list.remove(index);
        Student.updateList(list);
        //Open new Jframe and closes this one
        new ShowStudents().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonDeleteStudentActionPerformed

    private void jButtonAddResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddResultActionPerformed
       //Creates new result based on user input and adds it to the student and the module
        Result result = new Result(jSpinnerDate.getValue().toString(), (int) jSpinnerPercentage.getValue(), jComboBoxModules.getSelectedItem().toString(), jTextFieldFeedback.getText());
        newStudent.setResult(result);
        for (Module module1: moduleList) {
           
            if (module1.toString().equals(jComboBoxModules.getSelectedItem())) {
                module1.setResult(result);
            }
        }
        
        //Updates the module list
        Module.updateList(moduleList);
        
    }//GEN-LAST:event_jButtonAddResultActionPerformed

    private void jComboBoxAverageGradeModuleItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxAverageGradeModuleItemStateChanged
        
        
    }//GEN-LAST:event_jComboBoxAverageGradeModuleItemStateChanged

    private void jComboBoxAverageGradeModuleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxAverageGradeModuleActionPerformed
        double gradeTotal = 0;
        double gradeAmount = 0;
        double averageGrade;
        //Gets result list from the student and checks which result is for the selected module,
        //then makes an average out of the results
        resultList = newStudent.getResult();
        for (Result result1: resultList) {
        
            if (result1.getmodule().equals(jComboBoxAverageGradeModule.getSelectedItem())) {
                gradeTotal = gradeTotal + result1.getGrade();
                
            }
        }
        System.out.println();
        for (int i = 0; i < newStudent.getResult().size(); i++) {
            Result checkResult = (Result) newStudent.getResult().get(i);
            if (checkResult.getmodule().equals(jComboBoxAverageGradeModule.getSelectedItem())) {
              gradeAmount++;
          }
        }
        
        averageGrade = gradeTotal / gradeAmount;
        
        jLabelAverageGradeGrade.setText(String.valueOf(averageGrade));
        Student.updateList(list);
        
    }//GEN-LAST:event_jComboBoxAverageGradeModuleActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddResult;
    private javax.swing.JButton jButtonDeleteStudent;
    private javax.swing.JButton jButtonReturn;
    private javax.swing.JComboBox<String> jComboBoxAverageGradeModule;
    private javax.swing.JComboBox<String> jComboBoxModules;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelAddResult;
    private javax.swing.JLabel jLabelAddress;
    private javax.swing.JLabel jLabelAddressValue;
    private javax.swing.JLabel jLabelAverageGrade;
    private javax.swing.JLabel jLabelAverageGradeGrade;
    private javax.swing.JLabel jLabelCourse;
    private javax.swing.JLabel jLabelCourseValue;
    private javax.swing.JLabel jLabelDOBValue;
    private javax.swing.JLabel jLabelDateOfBirth;
    private javax.swing.JLabel jLabelFirstName;
    private javax.swing.JLabel jLabelFirstNameValue;
    private javax.swing.JLabel jLabelModule;
    private javax.swing.JLabel jLabelModuleValue;
    private javax.swing.JLabel jLabelSurname;
    private javax.swing.JLabel jLabelSurnameValue;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSpinner jSpinnerDate;
    private javax.swing.JSpinner jSpinnerPercentage;
    private javax.swing.JTextField jTextFieldFeedback;
    // End of variables declaration//GEN-END:variables
}
