/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import Modelo.modeloUsuario;
import Vista.FRMInventairo;
import Vista.Registro;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;

public class controladorE implements ActionListener
{

    private FRMInventairo _inven;
    private modeloUsuario _model;
    
    public void iniciar()
    {
    _inven.setTitle("Heladeria");
    }
    public void limpiar()
    {
        _inven.txtNombreI.setText(null);
        _inven.txtCantidadM.setText(null);
        _inven.txtCantidad.setText(null);
        _inven.txtPrecioU.setText(null);
        _inven.txtPrecioV.setText(null);
        _inven.txtNoEntrega.setText(null);
    }
    
    public controladorE(FRMInventairo inven, modeloUsuario model)
    {
        this._inven=inven;
        this._model=model;
        
        this._inven.btnContinuarI.addActionListener(this);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String leyenda="";
        if (e.getSource()==_inven.btnContinuarI)
        {
            leyenda = _model.alta("inventario", "null,'"+_inven.txtNombreI.getText()+"',"+_inven.txtCantidad.getText()+","
            +_inven.txtCantidadM.getText()+","+_inven.txtPrecioU.getText()+","+_inven.txtPrecioV.getText()+","+"CURRENT_TIMESTAMP()"+","+_inven.txtNoEntrega.getText()+"");
            //leyenda =_model.alta("inventario", "null,'Barquillo',100,50,10,15,CURRENT_TIMESTAMP(),13");
            JOptionPane.showMessageDialog(null, leyenda);
            limpiar();
        }
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    

    
    
}

