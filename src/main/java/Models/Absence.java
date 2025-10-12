package Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Absence {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Date dateDebut;
    private Date dateFin;
    private int etudiantId;
    private int professeurId;
    private int ueId;
    private int justificatifId; //Ce champ sera null par defaut
}
