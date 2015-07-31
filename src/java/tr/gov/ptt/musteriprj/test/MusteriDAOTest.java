
package tr.gov.ptt.musteriprj.test;

import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import tr.gov.ptt.musteriprj.dao.MusteriDAO;
import tr.gov.ptt.musteriprj.dto.Musteri;

public class MusteriDAOTest {
    
    public static void testMusteriListesiGetir()
    {
        try {
            List<Musteri> liste = MusteriDAO.musteri_listesi_Getir();
            
            for(Musteri musteri:liste)
            {
                System.out.println(musteri.getNo()+" "+musteri.getAd());
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MusteriDAOTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(MusteriDAOTest.class.getName()).log(Level.SEVERE, null, ex);
        }
       
       
    }
    
    public static void main(String[] args) {
        
       testMusteriListesiGetir();
        
    }

    
}
