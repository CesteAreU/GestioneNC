/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
/**
 *
 * @author FSEVERI\frasson3479
 */
@Entity
@Table(name="NonConformita")
public class NonConformità implements Serializable{
    
    @Id
    @Column(name="Codice", length = 9, nullable = false)
    private String codiceNC;
    
    @Column(name= "Descrizione", length = 1000, nullable = false)
    private String descrizione;
    
    //@Column(name="Tipo")
    private enum Tipo{
        Interna,
        Esterna
    }
    
    //@Column(name="Prolematica")
    private enum Problema{
        //ENUMERATIVO
    }
    
    @Column(name="Costo", length = 10, nullable = false)
    private double costo;
    
    //@Column(name="Stato")
    private enum stato{
        //ENUMERATIVO
    }
    
    @Column(name="DataInizio", nullable = false)
    private Date dataI;
    
    @Column(name="DataFine")
    private Date dataF;
    
    @Column(name="Reparto", length = 30)
    private String reparto;
    
    @Column(name="CodiceCliente", length = 8)
    private String codiceCliente;
    
    @Column(name="NomeCliente", length = 40)
    private String nomeCliente;
    
    @ManyToOne
    @JoinColumn(name="CodP")
    private Pezzo pezzo;
    
    @ManyToOne
    @JoinColumn(name="MatricolaRes")
    private Responsabile resQ;
    
    @OneToOne(mappedBy="CodiceNC")
    private Report report;

    public NonConformità() {
    }
    
    public NonConformità(String codiceNC, String descrizione, double costo, Date dataI, Date dataF, String reparto, String codiceCliente, String nomeCliente, Pezzo pezzo, Responsabile responsabile) {
        this.codiceNC = codiceNC;
        this.descrizione = descrizione;
        this.costo = costo;
        this.dataI = dataI;
        this.dataF = dataF;
        this.reparto = reparto;
        this.codiceCliente = codiceCliente;
        this.nomeCliente = nomeCliente;
        this.pezzo = pezzo;
        this.resQ = responsabile;
    }

    public String getCodiceNC() {
        return codiceNC;
    }

    public void setCodiceNC(String codiceNC) {
        this.codiceNC = codiceNC;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public Date getDataI() {
        return dataI;
    }

    public void setDataI(Date dataI) {
        this.dataI = dataI;
    }

    public Date getDataF() {
        return dataF;
    }

    public void setDataF(Date dataF) {
        this.dataF = dataF;
    }

    public String getReparto() {
        return reparto;
    }

    public void setReparto(String reparto) {
        this.reparto = reparto;
    }

    public String getCodiceCliente() {
        return codiceCliente;
    }

    public void setCodiceCliente(String codiceCliente) {
        this.codiceCliente = codiceCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public Pezzo getPezzo() {
        return pezzo;
    }

    public void setPezzo(Pezzo pezzo) {
        this.pezzo = pezzo;
    }

    public Responsabile getResponsabile() {
        return resQ;
    }

    public void setResponsabile(Responsabile responsabile) {
        this.resQ = responsabile;
    }
    
    
    
            
}
