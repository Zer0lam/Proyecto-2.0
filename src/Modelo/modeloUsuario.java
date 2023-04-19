/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import java.util.ArrayList;
import java.util.List;
import pkgServicio.WSBD;
import pkgServicio.WSBD_Service;

/**
 *
 * @author Zero
 */
public class modeloUsuario {
    
    private WSBD_Service obj1 = new WSBD_Service();
    private WSBD obj = obj1.getWSBDPort();
    String leyenda;
    
    public String alta (String tabla,String datos){
        leyenda = obj.altas(tabla,datos);
        return leyenda;
    }
    public String MostrarRegistro(String tabla , String datos, String condicion){
        leyenda = obj.verEmpleado(tabla,datos,condicion);
        return leyenda;
    }
   public String modificar(String tabla, String datos, String condicion){
        String leyenda;
        leyenda = obj.modificar(tabla, datos,condicion );
        return leyenda;
    }
    /*public String consultas(String tabla, String id, String id__0){
        String leyenda;
        leyenda = obj.consultas(tabla,id);
        return leyenda;
    }*/
      
    
}
