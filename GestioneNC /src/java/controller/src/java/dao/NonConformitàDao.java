/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import java.util.Set;
import model.NonConformità;

/**
 *
 * @author FSEVERI\frasson3479
 */
public interface NonConformitàDao{

    void aggiungiNonConformità(NonConformità NC);
    NonConformità leggiNonConformità(String codiceNC);
    List<NonConformità> leggiAllNonConformità();
    void eliminaNonConformità(String codiceNC);

}

