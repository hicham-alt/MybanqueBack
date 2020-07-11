package globalProject.demo.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="TYPE_OP",discriminatorType = DiscriminatorType.STRING, length = 1)
public abstract class Operation implements Serializable {
    @Id @GeneratedValue
    private Long numero;
    private LocalDate dateOperation;
    private double montant;
    @ManyToOne
    @JoinColumn(name="CODE_CPTE")
    private Compte compte;

    public Operation(){
    }

    public Operation(LocalDate dateOperation, double montant, Compte compte) {
        this.dateOperation = dateOperation;
        this.montant = montant;
        this.compte = compte;
    }

    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

    public LocalDate getDateOperation() {
        return dateOperation;
    }

    public void setDateOperation(LocalDate dateOperation) {
        this.dateOperation = dateOperation;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public Compte getCompte() {
        return compte;
    }

    public void setCompte(Compte compte) {
        this.compte = compte;
    }
}
