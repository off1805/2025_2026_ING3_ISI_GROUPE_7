package Models;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "abscence")
public class Absence {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date dateDebut;
    private Date dateFin;
    private int etudiantId;
    private int professeurId;
    private int ueId;
    private int justificatifId; // Ce champ sera null par défaut (voir note)

    // Getters & Setters
    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public int getEtudiantId() {
        return etudiantId;
    }

    public void setEtudiantId(int etudiantId) {
        this.etudiantId = etudiantId;
    }

    public int getProfesseurId() {
        return professeurId;
    }

    public void setProfesseurId(int professeurId) {
        this.professeurId = professeurId;
    }

    public int getUeId() {
        return ueId;
    }

    public void setUeId(int ueId) {
        this.ueId = ueId;
    }

    public int getJustificatifId() {
        return justificatifId;
    }

    public void setJustificatifId(int justificatifId) {
        this.justificatifId = justificatifId;
    }
}
