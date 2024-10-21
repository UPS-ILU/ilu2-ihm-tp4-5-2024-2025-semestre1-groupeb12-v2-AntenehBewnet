/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dialog;

import interface_noyau_fonctionnel.InterfaceNoyauFonctionnel;
import java.awt.EventQueue;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import presentation.FrameReservation;

public class DialogReservation {

    private FrameReservation frameReservation;
    private InterfaceNoyauFonctionnel inf;
    private int jour;
    private int moisInt;
    private String moisString;
    private int annee;
    private int nombrePersonnes;
    private String time;
    private int numTable;

    public DialogReservation(InterfaceNoyauFonctionnel inf) {
        this.inf = inf;
        
    }

    public void initDialog() {
        frameReservation = new FrameReservation();
        frameReservation.initFrame();
        frameReservation.setDialog(this);
        frameReservation.setVisible(true);
    }

   
    public void handleDateSelectedEvent(LocalDate date) {
        this.jour = date.getDayOfMonth();
        this.moisString = date.getMonth().toString();
        this.annee = date.getYear();
        frameReservation.enableHourSelector();
    }

    public void handleTimeSelectedEvent(String time) {        
        this.time = time;
        frameReservation.enableNbrPersonneSelector();
    }

    public void handleNumOfPersonsSelectedEvent(int nbPersons) {
        this.nombrePersonnes = nbPersons;
        frameReservation.enableTableSelector();
        String[] table = inf.trouverTableDisponible(jour, moisInt, nombrePersonnes, time);
        frameReservation.removeAllElt();
        for (int i = 0; i < table.length; i++) {
            frameReservation.addEltToTable(table[i]);
        }
    }

    public void handleTableSelectedEvent(int numTable) {
        this.numTable = numTable;
        frameReservation.enableValiderButton();
    }

    public void handleCancelEvent() {
        frameReservation.disableAll();
    }

    public void handleValidationEvent() {
        JOptionPane.showMessageDialog(frameReservation, inf.confirmationMessage(jour, moisString,annee, nombrePersonnes, time,numTable),"Confirmation de réservation",1);
        frameReservation.removeAllElt();
        frameReservation.disableAll();
    }

    public static void main(String[] args) {
        DialogReservation dialog = new DialogReservation(new InterfaceNoyauFonctionnel());
        EventQueue.invokeLater(() -> {
            dialog.initDialog();
        });
    }

}
