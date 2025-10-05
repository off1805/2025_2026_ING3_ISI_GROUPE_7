package Models;

import java.util.Date;

public class Absence {
    private Date dateDebut;
    private Date dateFin;
    private int etudiantId;
    private int professeurId;
    private int ueId;
    private int justificatifId; //Ce champ sera null par defaut
}
