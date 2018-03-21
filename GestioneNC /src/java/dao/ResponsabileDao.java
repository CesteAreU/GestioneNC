/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.Set;
import model.Responsabile;

/**
 *
 * @author FSEVERI\frasson3479
 */
public interface ResponsabileDao {
    
    void aggiungiResponsabile(Responsabile r);
    Responsabile leggiResponsabile(String matricola);
    Set<Responsabile> leggiAllResponsabili();
    void eliminaResponsabile(String matricola);
    
}
