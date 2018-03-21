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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 *
 * @author marzaro3364
 */

@Entity
@Table (name="Addetti")

public class Addetti implements Serializable{
    
    //Chiave primaria
    @Id
    @Column (name="MatricolaAddetto", length = 10, nullable = false)
    private String matricolaAddetto;
    
    @Column (name="Password", length = 25, nullable = false)
    private String password;
    
    @Column (name="Nome", length = 30, nullable = false)
    private String nome;
    
    @Column (name="Cognome", length = 30, nullable = false)
    private String cognome;
    
    @Column (name="DataNascita")
    private Date dataNascita;
    
    @ManyToMany(mappedBy="")
    private Set<Report> report;
    
    /**
     * Costruttore parametrico vuoto
     */
    public Addetti() {
    }
    
    /**
     * Costruttore parametrico
     * @param matricolaAddetto la matricola del addetto
     * @param password la password del addetto
     * @param nome il nome del addetto 
     * @param cognome il cognome del addetto
     * @param dataNascita la data di nascita del addetto
     */
    public Addetti(String matricolaAddetto, String password, String nome, String cognome, Date dataNascita) {
        this.matricolaAddetto = matricolaAddetto;
        this.password = password;
        this.nome = nome;
        this.cognome = cognome;
        this.dataNascita = dataNascita;
    }

    /**
     * Metodo getMatricolaAddetto
     * @return la matricola del addetto
     */
    public String getMatricolaAddetto() {
        return matricolaAddetto;
    }

    /**
     * Metodo setAddetto
     * @param matricolaAddetto la nuova matricola del addetto 
     */
    public void setMatricolaAddetto(String matricolaAddetto) {
        this.matricolaAddetto = matricolaAddetto;
    }

    /**
     * Metodo getPassword
     * @return la password del addetto
     */
    public String getPassword() {
        return password;
    }

    /**
     * Metodo setPassword
     * @param password la nuova password del addetto
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Metodo getNome
     * @return il nome del addetto
     */
    public String getNome() {
        return nome;
    }

    /**
     * Metodo setNome
     * @param nome il nuovo nome del addetto
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Metodo getCognome
     * @return il cognome del addetto
     */
    public String getCognome() {
        return cognome;
    }

    /**
     * Metodo setCognome
     * @param cognome 
     */
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public Date getDataNascita() {
        return dataNascita;
    }

    public void setDataNascita(Date dataNascita) {
        this.dataNascita = dataNascita;
    }
    
    
    
}
