/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.gov.ptt.musteriprj.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import tr.gov.ptt.musteriprj.dto.Giris;
import tr.gov.ptt.musteriprj.util.VTBaglanti;

/**
 *
 * @author BEM
 */
public class GirisDAO {
    
    public static boolean  giriseYetkilimi(Giris p_giris) throws ClassNotFoundException, SQLException{
        String vtSifre = null;
        
        Connection conn = VTBaglanti.baglantiGetir();
        PreparedStatement ps = conn.prepareStatement("select sifre from giris where kullanici=?");
        ps.setString(1, p_giris.getKullanici());
        
        ResultSet rs = ps.executeQuery();
        
        while (rs.next()) {            
            vtSifre = rs.getString("sifre");                    
        }
        rs.close();
        ps.close();
        VTBaglanti.baglantiKapat(conn);
        
        if (p_giris.getSifre().equals(vtSifre)) {
            return true;
        }else{
            return false;
        }
        
        
        
        
    }
}
