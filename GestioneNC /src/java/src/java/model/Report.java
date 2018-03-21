/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.io.Serializable;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author marzaro3364
 */

@Entity
@Table(name ="Report")

public class Report implements Serializable {
    
    @Id @GeneratedValue
    @Column (name="NumeroReport", nullable = false)
    private int numeroReport;
    
    @Column (name="AzioniContenitive", length = 1000)
    private String azioniContenitive;
    
    @Column (name="AzioniCorrettive", length = 1000)
    private String azioniCorrettive;
    
    @Column (name="AzioniPreventive", length = 1000)
    private String azioniPreventive;
    
    @Column (name="Cause", length = 500)
    private String cause;
    
    @OneToOne
    @JoinColumn (name="CodiceNC")
    private String codiceNC;
    
    
    @ManyToOne
    @JoinColumn(name="Responsabile")
    private Responsabile responsabile;
    
    @ManyToMany
    @JoinTable(
            name="Add_Rep",
            joinColumns = {@JoinColumn(name ="NumReport")},
            inverseJoinColumns = {@JoinColumn (name="MatrAdd")}
    )   
    private Set<Addetto> addetti;

    public Report() {
    }

    public Report(int numeroReport, String azioniContenitive, String azioniCorrettive, String azioniPreventive, String cause, String codiceNC, Set<Addetto> addetti) {
        this.numeroReport = numeroReport;
        this.azioniContenitive = azioniContenitive;
        this.azioniCorrettive = azioniCorrettive;
        this.azioniPreventive = azioniPreventive;
        this.cause = cause;
        this.codiceNC = codiceNC;
        this.addetti = addetti;
    }

    public int getNumeroReport() {
        return numeroReport;
    }

    public void setNumeroReport(int numeroReport) {
        this.numeroReport = numeroReport;
    }

    public String getAzioniContenitive() {
        return azioniContenitive;
    }

    public void setAzioniContenitive(String azioniContenitive) {
        this.azioniContenitive = azioniContenitive;
    }

    public String getAzioniCorrettive() {
        return azioniCorrettive;
    }

    public void setAzioniCorrettive(String azioniCorrettive) {
        this.azioniCorrettive = azioniCorrettive;
    }

    public String getAzioniPreventive() {
        return azioniPreventive;
    }

    public void setAzioniPreventive(String azioniPreventive) {
        this.azioniPreventive = azioniPreventive;
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }

    public String getCodiceNC() {
        return codiceNC;
    }

    public void setCodiceNC(String codiceNC) {
        this.codiceNC = codiceNC;
    }

    public Set<Addetto> getAddetti() {
        return addetti;
    }

    public void setAddetti(Set<Addetto> addetti) {
        this.addetti = addetti;
    }
    
   
    
}
