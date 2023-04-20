/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import Modelo.modeloUsuario;
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
    private String usuarioSeleccionado = null;
   
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
        
    }
       /*if (e.getSource() == _tablaTodo.btnEliminar){
            
            if(usuarioSeleccionado.isBlank()){
                JOptionPane.showMessageDialog(null, leyenda);
            }
            else{
                _model.borrar("tb_usuarios", "id="+usuarioSeleccionado);
            }
            _tablaTodo.ActualizarTabla();
            leyenda = _model.borrar("tb_usuraios", _view.txtUsuario.getText());
            JOptionPane.showMessageDialog(null, leyenda);
            limpiar();
        }
        if(e.getSource() == _view.btnTodo){
            _tablaTodo.setVisible(true);
            _view.setVisible(false);
            _tablaTodo.ActualizarTabla();
        }
        if(e.getSource() == _tablaTodo.bntRegresar){
            _view.setVisible(true);
            _tablaTodo.setVisible(false);
            
        }
       */
    
      /* if(e.getSource() == _tablaTodo.btnModificar){
           leyenda = _model.modificarRegistro("tb_usuarios","id = "+_tablaTodo.txtId.getText() + 
                   ", nombre = '" + _tablaTodo.txtName.getText() + "', apPaterno = '" + _tablaTodo.txtLast.getText() +
                   "', user = '" + _tablaTodo.txtUser.getText() + "', psw = " + _tablaTodo.txtPass.getText(),
                   "id = " + _tablaTodo.txtId.getText());
            JOptionPane.showMessageDialog(null, leyenda);
            limpiar();
            _tablaTodo.ActualizarTabla();
       }
        */
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    

