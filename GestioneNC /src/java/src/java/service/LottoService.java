/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

/**
 *
 * @author Andrea Frasson
 */

import java.util.List;
 
import model.Lotto;
 
public interface LottoService {
    Lotto findById(int id);
    void saveLotto(Lotto lotto);
    void updateLotto(Lotto lotto);
    void deleteLotto(int id);
    List<Lotto> findAllLotti(); 
}

