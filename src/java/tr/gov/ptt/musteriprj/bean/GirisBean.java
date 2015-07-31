/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.gov.ptt.musteriprj.bean;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import tr.gov.ptt.musteriprj.dao.GirisDAO;
import tr.gov.ptt.musteriprj.dto.Giris;


/**
 *
 * @author BEM
 */
@ManagedBean
@RequestScoped
public class GirisBean {
    private Giris giris;

    public GirisBean(Giris giris) {
        this.giris = giris;
    }
        
    public Giris getGiris() {
        return giris;
    }

    public void setGiris(Giris giris) {
        this.giris = giris;
    }
    
    public String girisKontrol(){
        
        try {
            boolean sonuc = GirisDAO.giriseYetkilimi(giris);
            
            if(sonuc){
                return "musteriListe.xhtml?faces-redirect=true";
            }else {
                return "giris.xhtml?faces-redirect=true";
            }
           
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
            return null;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
         
    }
    
}
