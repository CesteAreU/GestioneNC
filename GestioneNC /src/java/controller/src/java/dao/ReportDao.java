/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import java.util.Set;
import model.Report;

/**
 *
 * @author FSEVERI\frasson3479
 */
public interface ReportDao {
    
    void aggiungiReport(Report r);
    Report leggiReport(int numeroReport);
    List<Report> leggiAllReport();
    void eliminaReport(int numeroReport);
    
}
