package globalProject.demo.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.time.LocalDate;
@Entity
@DiscriminatorValue("V")
public class Versement extends Operation {
        public Versement(){
            super();
        }

    public Versement(LocalDate dateOperation, double montant, Compte compte) {
        super(dateOperation, montant, compte);
    }
}
