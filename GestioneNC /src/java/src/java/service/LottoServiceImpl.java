/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.LottoDao;
import model.Lotto;
import java.util.List;
import java.util.Set;
import model.Pezzo;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author FSEVERI\agostini3381
 */
public class LottoServiceImpl implements LottoService {
    
    @Autowired
    private LottoDao dao;
     
    public Lotto findById(int id) {
        return dao.leggiLotto(id);
    }
 
    public void saveLotto(Lotto lotto) {
        dao.aggiungiLotto(lotto);
    }
 
    public void updateLotto(Lotto lotto) {
        Lotto entity = dao.leggiLotto(lotto.getNumLotto());
        if(entity!=null){
            entity.setPezzi(lotto.getPezzi());
        }
    }
 
    public void deleteLotto(int id) {
        dao.eliminaLotto(id);
    }
     
    public List<Lotto> findAllLotti() {
        return dao.leggiAllLotti();
    }
 
   
}

