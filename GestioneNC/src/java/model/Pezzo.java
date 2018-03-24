/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
/**
 *
 * @author FSEVERI\frasson3479
 */

@Entity
@Table(name="Pezzi")
public class Pezzo implements Serializable{
    
    @Id
    @Column(name="CodiceP", length = 12, nullable = false)
    private String codice;
    
    @Column(name="Nome", length = 20, nullable = false)
    private String nome;
    
    
    @OneToMany(mappedBy="pezzo")
    private Set<NonConformità> nc;
    
    @ManyToMany
    @JoinTable(
            name="Pezzi_Lotti",
            joinColumns= { @JoinColumn(name="CodPezzo")},
            inverseJoinColumns = {@JoinColumn(name="NumeroLotto")}             
    )
    private Set<Lotto> lotti;

    public Pezzo(String codice, String nome, Set<NonConformità> nc, Set<Lotto> lotti) {
        this.codice = codice;
        this.nome = nome;
        this.nc = nc;
        this.lotti = lotti;
    }

    public String getCodice() {
        return codice;
    }

    public void setCodice(String codice) {
        this.codice = codice;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<NonConformità> getNc() {
        return nc;
    }

    public void setNc(Set<NonConformità> nc) {
        this.nc = nc;
    }

    public Set<Lotto> getLotti() {
        return lotti;
    }

    public void setLotti(Set<Lotto> lotti) {
        this.lotti = lotti;
    }
    
    
    
    
}
