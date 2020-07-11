package globalProject.demo.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.time.LocalDate;
@Entity
@DiscriminatorValue("CE")
public class CompteEpargne extends Compte{
    private double taux;
    public CompteEpargne(){
        super();
    }

    public CompteEpargne(String codeCompte, LocalDate dateCreation, double solde, Client client, double taux) {
        super(codeCompte, dateCreation, solde, client);
        this.taux = taux;
    }

    public double getTaux() {
        return taux;
    }

    public void setTaux(double taux) {
        this.taux = taux;
    }
}
