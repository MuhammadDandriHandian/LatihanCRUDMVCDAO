/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mdandrihandian.latihanmvcjdbc.main;

import edu.mdandrihandian.latihanmvcjdbc.database.KingsBarbershopDatabase;
import edu.mdandrihandian.latihanmvcjdbc.entity.Pelanggan;
import edu.mdandrihandian.latihanmvcjdbc.error.PelangganException;
import edu.mdandrihandian.latihanmvcjdbc.service.PelangganDao;
import java.sql.SQLException;

/**
 *
 * @author ASUS
 */
public class LatihanCRUDMVCDAO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, PelangganException{
        // TODO code application logic here
        
        PelangganDao dao = KingsBarbershopDatabase.getPelangganDao();
        Pelanggan pelanggan = dao.getPelanggan(1);
        pelanggan.setNama("HULK");
        pelanggan.setAlamat("Gelatik");
  
        dao.updatePelanggan(pelanggan);
        
             
        
    }
    
}
