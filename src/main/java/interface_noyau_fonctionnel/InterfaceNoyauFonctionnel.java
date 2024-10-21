package interface_noyau_fonctionnel;

public class InterfaceNoyauFonctionnel {
    

    public String[] trouverTableDisponible(int jour, int mois, int nombrePersonnes, String time) {
        if (nombrePersonnes > 4 ) {
            return new String[]{"Table 6"};         
        }
        if (nombrePersonnes > 2 && nombrePersonnes < 5){
            return new String[]{"Table 2", "Table 3", "Table 4", "Table 5"};
        }else {
                return new String[]{"Table 1", "Table 2", "Table 3", "Table 4", "Table 5"};
        }
        
    }
    
    
    public String confirmationMessage(int jour, String mois,int annee, int nombrePersonnes, String time,int numTable){
        return "Réservation validée pour le" + String.valueOf(jour) + " "+ mois + " "+ String.valueOf(annee) + " à " + time + " pour 4 personnes à la  Table " + String.valueOf(numTable);
    }

}
