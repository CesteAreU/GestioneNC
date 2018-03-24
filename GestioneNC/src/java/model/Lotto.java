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
import javax.persistence.GeneratedValue;
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


public class Lotto implements Serializable{
    
    @Id @GeneratedValue
    @Column(name="NumeroLotto")
    private int numLotto;
    
    @ManyToMany(mappedBy="lotti")
    private Set<Pezzo> pezzi; 

    public Lotto(int numLotto, Set<Pezzo> pezzi) {
        this.numLotto = numLotto;
        this.pezzi = pezzi;
    }

    public int getNumLotto() {
        return numLotto;
    }

    public void setNumLotto(int numLotto) {
        this.numLotto = numLotto;
    }

    public Set<Pezzo> getPezzi() {
        return pezzi;
    }

    public void setPezzi(Set<Pezzo> pezzi) {
        this.pezzi = pezzi;
    }
    
    
}
