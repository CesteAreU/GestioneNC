/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import java.util.Set;
import model.Lotto;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Andrea Frasson
 */
public class LottoDaoImpl implements LottoDao{
    
    @Autowired
    private SessionFactory sessionFactory;
 
    
    protected Session getSession(){
        return sessionFactory.getCurrentSession();
    }
    
    @Override
    public void aggiungiLotto(Lotto l) {
        getSession().persist(l);
    }

    @Override
    public Lotto leggiLotto(int numeroLotto) {
        return (Lotto) getSession().get(Lotto.class, numeroLotto);
    }
    
    @SuppressWarnings("unchecked")
    @Override
    public List<Lotto> leggiAllLotti() {
        Session f = sessionFactory.openSession();
        Transaction t = null;
        try{
            t = f.beginTransaction();
            List<Lotto> lotti = f.createQuery("FROM Lotti").list();
            t.commit();
            return lotti;
        }
        catch(HibernateException e){
            if(t!=null) t.rollback();
        }
        finally{
            f.close();
        }
        return null;
    }

    @Override
    public void eliminaLotto(int NumeroLotto) {
        Lotto l = (Lotto) getSession().load(Lotto.class, NumeroLotto);
        if(l!=null) getSession().delete(l);
    }
    
}
