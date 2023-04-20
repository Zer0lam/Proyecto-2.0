/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import Modelo.modeloUsuario;
import Vista.FRMMenu;
import Vista.Registro;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
/**
 *
 * @author Zero
 */
public class controladorU implements ActionListener
{

    private Registro _view;
    private modeloUsuario _model;
   
    public void iniciar()
    {
        _view.setTitle("Heladeria");
    }
    public void limpiar()
    {
        _view.txtNombreR.setText(null);
        _view.txtApellidoR.setText(null);
        _view.txtContrasenaR.setText(null);
        
    }
    public controladorU(Registro view, modeloUsuario model){
        this._model=model;
        this._view=view;
        
        this._view.btnContinuar.addActionListener(this);
        this._view.btnVolver.addActionListener(this);
        
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String leyenda = "";
        if (e.getSource() == _view.btnContinuar){
            leyenda = _model.alta("empleados","null,'"+_view.txtNombreR.getText()+"','"+_view.txtApellidoR.getText()+"','"
                    +_view.txtArea.getSelectedItem()+"','"+ _view.txtContrasenaR.getText()+"'");
            //leyenda = _model.alta("tb_usuarios","'No se','12345','Pedro','Navarro',Null");
            JOptionPane.showMessageDialog(null, leyenda);
            limpiar();
        }

        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
    
    

