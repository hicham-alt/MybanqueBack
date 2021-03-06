package globalProject.demo.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.time.LocalDate;
@Entity
@DiscriminatorValue("CC")
public class CompteCourant extends Compte {
    private double decouvert;

    public CompteCourant(){
        super();
    }
    public CompteCourant(String codeCompte, LocalDate dateCreation, double solde, Client client, double decouvert) {
        super(codeCompte, dateCreation, solde, client);
        this.decouvert = decouvert;
    }

    public double getDecouvert() {
        return decouvert;
    }

    public void setDecouvert(double decouvert) {
        this.decouvert = decouvert;
    }
}
