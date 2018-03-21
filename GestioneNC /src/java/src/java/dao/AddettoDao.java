/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import java.util.Set;
import model.Addetto;

/**
 *
 * @author FSEVERI\frasson3479
 */
public interface AddettoDao{
    
    void aggiungiAddetto(Addetto A);
    Addetto leggiAddetto(String MatricolaAdetto);
    List<Addetto> leggiAllAddetti();
    void eliminaAdetto(String MatricolaAdetto);
}

