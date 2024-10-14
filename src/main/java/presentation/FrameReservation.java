/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentation;

import com.github.lgooddatepicker.optionalusertools.DateChangeListener;
import com.github.lgooddatepicker.zinternaltools.DateChangeEvent;
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

        jPanel1 = new javax.swing.JPanel();
        popupMenu1 = new java.awt.PopupMenu();
        jPopupMenu1 = new javax.swing.JPopupMenu();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tablePicker = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        validerButton = new javax.swing.JButton();
        annulerButton = new javax.swing.JButton();

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

        popupMenu1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        popupMenu1.setLabel("popupMenu1");
        popupMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popupMenu1ActionPerformed(evt);
            }
        });
        popupMenu1.getAccessibleContext().setAccessibleParent(validerButton);

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
        hourPicker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hourPickerActionPerformed(evt);
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
        nbrPersonnePicker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nbrPersonnePickerActionPerformed(evt);
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

        tablePicker.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Table 2", "Table 3", "Table 4", "Table 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        tablePicker.setEnabled(false);
        jScrollPane1.setViewportView(tablePicker);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Plan_tables.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout pickTablePanelLayout = new javax.swing.GroupLayout(pickTablePanel);
        pickTablePanel.setLayout(pickTablePanelLayout);
        pickTablePanelLayout.setHorizontalGroup(
            pickTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pickTablePanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(pickTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pickTablePanelLayout.createSequentialGroup()
                        .addComponent(tablePickerTitle)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pickTablePanelLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel1)
                        .addGap(120, 120, 120)
                        .addComponent(tablesImage, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))))
        );
        pickTablePanelLayout.setVerticalGroup(
            pickTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pickTablePanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(tablePickerTitle)
                .addGroup(pickTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pickTablePanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pickTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tablesImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(pickTablePanelLayout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(pickTablePanelLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel1)
                        .addContainerGap(55, Short.MAX_VALUE))))
        );

        validerButton.setText("Valider");
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
        System.out.println(dateEvent.getNewDate());
        //throw new UnsupportedOperationException("Not implemented yet");
    }
    
    public void enableHourSelector(){
        hourPickerTitle.setEnabled(true);
        hourPicker.setEnabled(true);
    }
    
    
    private void hourPickerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hourPickerActionPerformed
        //dialog.handleTimeSelectedEvent(evt..getActionCommand());
       // System.out.println(hourPicker.getSelectedItem());
    }//GEN-LAST:event_hourPickerActionPerformed

    public void enableNbrPersonneSelector(){
        nbrPersonnePickerTitle.setEnabled(true);
        nbrPersonnePicker.setEnabled(true);
    }
    
    private void annulerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_annulerButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_annulerButtonActionPerformed

    private void validerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validerButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_validerButtonActionPerformed

    private void nbrPersonnePickerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nbrPersonnePickerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nbrPersonnePickerActionPerformed

    private void hourPickerItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_hourPickerItemStateChanged
        dialog.handleTimeSelectedEvent(evt.getItem().toString());
        dialog.handleTimeSelectedEvent(evt.getItem().toString());
        System.out.println(evt.getItem().toString());
    }//GEN-LAST:event_hourPickerItemStateChanged

    private void nbrPersonnePickerItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_nbrPersonnePickerItemStateChanged
        dialog.handleNumOfPersonsSelectedEvent(Integer.parseInt(evt.getItem().toString()));
        System.out.println(evt.getItem().toString());
    }//GEN-LAST:event_nbrPersonnePickerItemStateChanged

    private void popupMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popupMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_popupMenu1ActionPerformed

    public void enableTableSelector(){
        tablePickerTitle.setEnabled(true);
        tablePicker.setEnabled(true);
    }

    
    
    
    
   
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton annulerButton;
    private com.github.lgooddatepicker.components.DatePicker datePicker;
    private javax.swing.JLabel datePickerTitle;
    private javax.swing.JPanel dateTimePanel;
    private javax.swing.JComboBox<String> hourPicker;
    private javax.swing.JLabel hourPickerTitle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel nbPersonsPanel;
    private javax.swing.JComboBox<String> nbrPersonnePicker;
    private javax.swing.JLabel nbrPersonnePickerTitle;
    private javax.swing.JPanel pickTablePanel;
    private java.awt.PopupMenu popupMenu1;
    private javax.swing.JList<String> tablePicker;
    private javax.swing.JLabel tablePickerTitle;
    private javax.swing.JLabel tablesImage;
    private javax.swing.JButton validerButton;
    // End of variables declaration//GEN-END:variables

}
