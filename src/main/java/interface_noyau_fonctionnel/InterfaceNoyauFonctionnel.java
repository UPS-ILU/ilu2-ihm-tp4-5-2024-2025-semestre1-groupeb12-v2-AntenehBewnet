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
    
    public void truc(String time){
     
        System.out.println("le time estttttttttttt " + time);
    }

}
