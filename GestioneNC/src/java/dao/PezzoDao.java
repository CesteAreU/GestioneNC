/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.Set;
import model.Pezzo;

/**
 *
 * @author FSEVERI\frasson3479
 */
public interface PezzoDao {
    
    void aggiungiPezzo(Pezzo P);
    Pezzo leggiPezzo(String codice);
    Set<Pezzo> leggiAllPezzi();
    void eliminaPezzo(String codice);
    
}
