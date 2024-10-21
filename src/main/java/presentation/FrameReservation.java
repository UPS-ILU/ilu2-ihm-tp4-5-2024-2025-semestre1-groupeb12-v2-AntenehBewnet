/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentation;

import com.github.lgooddatepicker.optionalusertools.DateChangeListener;
import com.github.lgooddatepicker.zinternaltools.DateChangeEvent;
import com.sun.jdi.IntegerValue;
import dialog.DialogReservation;
import java.time.LocalDate;

@SuppressWarnings("serial")
public class FrameReservation extends javax.swing.JFrame {

    private DialogReservation dialog;

    public FrameReservation() {
    }

    public void initFrame() {
        initComponents();
    }

    public void setDialog(DialogReservation dialog) {
        this.dialog = dialog;
    }

    // /!\ /!\ /!\ ATTENTION /!\ /!\ /!\
    // ce code est auto généré et ne doit PAS être modifié
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dateTimePanel = new javax.swing.JPanel();
        datePicker = new com.github.lgooddatepicker.components.DatePicker();
        datePicker.addDateChangeListener(new DateChangeListener(){
            public void dateChanged(DateChangeEvent dateEvent) {
                datePickerDateChanged(dateEvent);
            }
        });
        hourPicker = new javax.swing.JComboBox<>();
        datePickerTitle = new javax.swing.JLabel();
        hourPickerTitle = new javax.swing.JLabel();
        nbPersonsPanel = new javax.swing.JPanel();
        nbrPersonnePickerTitle = new javax.swing.JLabel();
        nbrPersonnePicker = new javax.swing.JComboBox<>();
        pickTablePanel = new javax.swing.JPanel();
        tablesImage = new javax.swing.JLabel();
        tablePickerTitle = new javax.swing.JLabel();
        tableImage = new javax.swing.JLabel();
        listTable = new java.awt.List();
        validerButton = new javax.swing.JButton();
        annulerButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        dateTimePanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        hourPicker.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "11h30", "12h00", "12h30", "13h00", "13h30" }));
        hourPicker.setEnabled(false);
        hourPicker.setMinimumSize(new java.awt.Dimension(139, 21));
        hourPicker.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                hourPickerItemStateChanged(evt);
            }
        });

        datePickerTitle.setText("1. Choisissez la date");

        hourPickerTitle.setText("2. Choisissez l'heure");
        hourPickerTitle.setEnabled(false);

        javax.swing.GroupLayout dateTimePanelLayout = new javax.swing.GroupLayout(dateTimePanel);
        dateTimePanel.setLayout(dateTimePanelLayout);
        dateTimePanelLayout.setHorizontalGroup(
            dateTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dateTimePanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(dateTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(datePicker, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(datePickerTitle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(dateTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hourPicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hourPickerTitle))
                .addGap(77, 77, 77))
        );
        dateTimePanelLayout.setVerticalGroup(
            dateTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dateTimePanelLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(dateTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(datePickerTitle)
                    .addComponent(hourPickerTitle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(dateTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(datePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hourPicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        datePicker.getAccessibleContext().setAccessibleName("");
        datePicker.getAccessibleContext().setAccessibleDescription("");

        nbPersonsPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        nbrPersonnePickerTitle.setText("3. Indiquez le nombre de personnes");
        nbrPersonnePickerTitle.setEnabled(false);

        nbrPersonnePicker.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2", "3", "4", "5", "6", "7", "8" }));
        nbrPersonnePicker.setEnabled(false);
        nbrPersonnePicker.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                nbrPersonnePickerItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout nbPersonsPanelLayout = new javax.swing.GroupLayout(nbPersonsPanel);
        nbPersonsPanel.setLayout(nbPersonsPanelLayout);
        nbPersonsPanelLayout.setHorizontalGroup(
            nbPersonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nbPersonsPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(nbPersonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nbrPersonnePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nbrPersonnePickerTitle))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        nbPersonsPanelLayout.setVerticalGroup(
            nbPersonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nbPersonsPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(nbrPersonnePickerTitle)
                .addGap(18, 18, 18)
                .addComponent(nbrPersonnePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pickTablePanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tablePickerTitle.setText("4. Choisissez votre table");
        tablePickerTitle.setEnabled(false);

        tableImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Plan_tables.jpg"))); // NOI18N
        tableImage.setEnabled(false);

        listTable.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                listTableItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout pickTablePanelLayout = new javax.swing.GroupLayout(pickTablePanel);
        pickTablePanel.setLayout(pickTablePanelLayout);
        pickTablePanelLayout.setHorizontalGroup(
            pickTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pickTablePanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(pickTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tablePickerTitle)
                    .addGroup(pickTablePanelLayout.createSequentialGroup()
                        .addGap(0, 0, 0)
                        .addComponent(tableImage)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tablesImage, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(listTable, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        pickTablePanelLayout.setVerticalGroup(
            pickTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pickTablePanelLayout.createSequentialGroup()
                .addGroup(pickTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pickTablePanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tablesImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pickTablePanelLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(tablePickerTitle)
                        .addGap(39, 39, 39)
                        .addComponent(tableImage)
                        .addGap(0, 49, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(pickTablePanelLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(listTable, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        validerButton.setText("Valider");
        validerButton.setEnabled(false);
        validerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validerButtonActionPerformed(evt);
            }
        });

        annulerButton.setText("Annuler");
        annulerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                annulerButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateTimePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nbPersonsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pickTablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(validerButton)
                        .addGap(18, 18, 18)
                        .addComponent(annulerButton)
                        .addGap(9, 9, 9)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(dateTimePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(nbPersonsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pickTablePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(validerButton)
                    .addComponent(annulerButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void datePickerDateChanged(DateChangeEvent dateEvent) {
        dialog.handleDateSelectedEvent(dateEvent.getNewDate());
    }
    
    
    
    private void annulerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_annulerButtonActionPerformed
        dialog.handleCancelEvent();
    }//GEN-LAST:event_annulerButtonActionPerformed

    private void validerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validerButtonActionPerformed
        dialog.handleValidationEvent();
    }//GEN-LAST:event_validerButtonActionPerformed

    private void hourPickerItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_hourPickerItemStateChanged
        dialog.handleTimeSelectedEvent(evt.getItem().toString());
    }//GEN-LAST:event_hourPickerItemStateChanged

    private void nbrPersonnePickerItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_nbrPersonnePickerItemStateChanged
        dialog.handleNumOfPersonsSelectedEvent(Integer.parseInt(evt.getItem().toString()));
    }//GEN-LAST:event_nbrPersonnePickerItemStateChanged

    private void listTableItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_listTableItemStateChanged
        dialog.handleTableSelectedEvent(Integer.parseInt(evt.getItem().toString())+1);
    }//GEN-LAST:event_listTableItemStateChanged
    
    public void enableHourSelector(){
        hourPickerTitle.setEnabled(true);
        hourPicker.setEnabled(true);
    }
    
    public void enableNbrPersonneSelector(){
        nbrPersonnePickerTitle.setEnabled(true);
        nbrPersonnePicker.setEnabled(true);
    }
    
    public void addEltToTable(String elt){
        listTable.add(elt);
    }
    
    public void removeAllElt(){
        listTable.removeAll();
    }
    
    
    public void enableTableSelector(){
        tableImage.setEnabled(true);
        tablePickerTitle.setEnabled(true);
        listTable.setEnabled(true);
    }
    
    
     public void enableValiderButton(){
        validerButton.setEnabled(true);  
    }
     
     public void disableAll(){
         hourPicker.setEnabled(false);
         hourPickerTitle.setEnabled(false);
         nbrPersonnePicker.setEnabled(false);
         nbrPersonnePickerTitle.setEnabled(false);
         tableImage.setEnabled(false);
         tablePickerTitle.setEnabled(false);
         validerButton.setEnabled(false);       
         listTable.removeAll();
     }

    
    
    
    
   
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton annulerButton;
    private com.github.lgooddatepicker.components.DatePicker datePicker;
    private javax.swing.JLabel datePickerTitle;
    private javax.swing.JPanel dateTimePanel;
    private javax.swing.JComboBox<String> hourPicker;
    private javax.swing.JLabel hourPickerTitle;
    private java.awt.List listTable;
    private javax.swing.JPanel nbPersonsPanel;
    private javax.swing.JComboBox<String> nbrPersonnePicker;
    private javax.swing.JLabel nbrPersonnePickerTitle;
    private javax.swing.JPanel pickTablePanel;
    private javax.swing.JLabel tableImage;
    private javax.swing.JLabel tablePickerTitle;
    private javax.swing.JLabel tablesImage;
    private javax.swing.JButton validerButton;
    // End of variables declaration//GEN-END:variables

}
