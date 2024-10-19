/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dialog;

import interface_noyau_fonctionnel.InterfaceNoyauFonctionnel;
import java.awt.EventQueue;
import java.time.LocalDate;
import presentation.FrameReservation;

public class DialogReservation {

    private FrameReservation frameReservation;
    private InterfaceNoyauFonctionnel inf;
    private int jour;
    private int mois;
    private int nombrePersonnes;
    private String time;

    public DialogReservation(InterfaceNoyauFonctionnel inf) {
        this.inf = inf;
        this.jour = jour;
        this.mois = mois;
        this.nombrePersonnes = nombrePersonnes;
        this.time = time;
    }

    public void initDialog() {
        frameReservation = new FrameReservation();
        frameReservation.initFrame();
        frameReservation.setDialog(this);
        frameReservation.setVisible(true);
    }

   
    public void handleDateSelectedEvent(LocalDate date) {
        System.out.println("handleDateSelectedEvent");
        System.out.println("yoooooooooooooo" + date);
        this.jour = date.getDayOfMonth();
        System.out.println(jour +"gebaaaaaaa");
       // inf.truc();
        frameReservation.enableHourSelector();
        //throw new UnsupportedOperationException("Not implemented yet");
    }

    public void handleTimeSelectedEvent(String time) {
        System.out.println("handleTimeSelectedEvent");
        
        this.time = time;
        inf.truc(this.time);
        frameReservation.enableNbrPersonneSelector();
        //throw new UnsupportedOperationException("Not implemented yet");
    }

    public void handleNumOfPersonsSelectedEvent(int nbPersons) {
        System.out.println("handleNumOfPersonsSelectedEvent");
       // inf.truc();
        this.nombrePersonnes = nbPersons;
        frameReservation.enableTableSelector();
        String[] table = inf.trouverTableDisponible(jour, mois, nombrePersonnes, time);
        frameReservation.removeAllElt();
        for (int i = 0; i < table.length; i++) {
            frameReservation.addEltToTable(table[i]);
        }
        
        //throw new UnsupportedOperationException("Not implemented yet");
    }

    public void handleTableSelectedEvent(int numTable) {
        frameReservation.enableValiderButton();
       // throw new UnsupportedOperationException("Not implemented yet");
    }

    public void handleCancelEvent() {
        frameReservation.disableAll();
        //throw new UnsupportedOperationException("Not implemented yet");
    }

    public void handleValidationEvent() {
        //TODO
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public static void main(String[] args) {
        DialogReservation dialog = new DialogReservation(new InterfaceNoyauFonctionnel());
        EventQueue.invokeLater(() -> {
            dialog.initDialog();
        });
    }

}
