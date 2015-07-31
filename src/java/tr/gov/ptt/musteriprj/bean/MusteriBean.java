
package tr.gov.ptt.musteriprj.bean;

import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import tr.gov.ptt.musteriprj.dao.MusteriDAO;
import tr.gov.ptt.musteriprj.dto.Musteri;

@ManagedBean
@ViewScoped
public class MusteriBean {
    
    private List<Musteri> musteriListesi;
    
    @PostConstruct
    public void init(){
        
        try {
            musteriListesi = MusteriDAO.musteri_listesi_Getir();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MusteriBean.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(MusteriBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List getMusteriListesi(){
        
        return musteriListesi;
    }
}
