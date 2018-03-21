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
import javax.persistence.Table;

/**
 *
 * @author FSEVERI\frasson3479
 */
@Entity
@Table(name="Responsabili")
public class Responsabile implements Serializable {
    
    //chiave primaria
    @Id
    @Column(name="MatricolaResponsabile", length = 10, nullable = false)
    private String matricola;
    
    @Column(name="Password", length = 25, nullable = false)
    private String password;
    
    @Column(name="Nome", length = 30, nullable = false)
    private String nome;
    
    @Column(name="Cognome", length = 30, nullable = false)
    private String cognome;
    
    @Column(name="DataNascita", nullable = false)
    private Date data;
    
    @OneToMany(mappedBy="responsabile")
    private Set<Report> report;
    
    @OneToMany(mappedBy="resQ")
    private Set<NonConformità> nonconf; 
    
    /**
     * Costruttore parametrico vuoto
     */
    public Responsabile(){}
    
    /**
     * Costruttore parametrico
     * @param matricola matricola del responsabile
     * @param password password del responsabile 
     * @param nome nome del responsabile
     * @param cognome cognome del responsabile 
     * @param data data di nascita del responsabile
     */
    public Responsabile(String matricola, String password, String nome, String cognome, Date data) {
        this.matricola = matricola;
        this.password = password;
        this.nome = nome;
        this.cognome = cognome;
        this.data = data;
    }
    
    /**
     * Metodo getMatricola
     * @return la matricola del responsabile 
     */
    public String getMatricola() {
        return matricola;
    }

    /**
     * Metodo setMatricola
     * @param matricola la nuova matricola del responsabile
     */
    public void setMatricola(String matricola) {
        this.matricola = matricola;
    }

    /**
     * Metodo getPassword
     * @return restituisce la password del responsabile
     */
    public String getPassword() {
        return password;
    }

    /**
     * Metodo setPassword
     * @param password la nuova password del responsabile 
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Metodo getNome
     * @return il nome del responsabile
     */
    public String getNome() {
        return nome;
    }

    /**
     * Metodo setNome
     * @param nome il nuovo nome del responsabile
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Metodo getCognome
     * @return il cognome del responsabile
     */
    public String getCognome() {
        return cognome;
    }

    /**
     * Metodo setCognome
     * @param cognome il nuovo cognome del responsabile
     */
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    /**
     * Metodo getData
     * @return la data di nascita del responsabile
     */
    public Date getData() {
        return data;
    }

    /**
     * Metodo setData
     * @param data la nuova data di nascita del reponsabile
     */
    public void setData(Date data) {
        this.data = data;
    }

    /**
     * Metodo getReport
     * @return il report
     */
    public Set<Report> getReport() {
        return report;
    }

    /**
     * Metodo setReport
     * @param report il nuovo report
     */
    public void setReport(Set<Report> report) {
        this.report = report;
    }
    
}
