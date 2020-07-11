package globalProject.demo.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.time.LocalDate;
@Entity
@DiscriminatorValue("R")
public class Retrait extends Operation{
    public Retrait(){
        super();
    }
    public Retrait(LocalDate dateOperation, double montant, Compte compte) {
        super(dateOperation, montant, compte);
    }
}
