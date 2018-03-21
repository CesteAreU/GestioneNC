/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import java.util.Set;
import model.Lotto;

/**
 *
 * @author FSEVERI\frasson3479
 */
public interface LottoDao{

    void aggiungiLotto(Lotto l);
    Lotto leggiLotto(int NumeroLotto);
    List<Lotto> leggiAllLotti();
    void eliminaLotto(int NumeroLotto);

}

