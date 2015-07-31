/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.gov.ptt.musteriprj.test;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import tr.gov.ptt.musteriprj.dto.Giris;
import tr.gov.ptt.musteriprj.util.VTBaglanti;
import tr.gov.ptt.musteriprj.dao.GirisDAO;
/**
 *
 * @author BEM
 */
public class GirisDAOTest {
    
    public static void testGiriseYetkilimi(){
        
        try {
            Giris giris = new Giris();
            
            boolean sonuc = GirisDAO.giriseYetkilimi(giris);
            
            
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
            
       
    }
    
    public static void main(String[] args) {
        testGiriseYetkilimi();
    }
}
