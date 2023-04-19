/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import Modelo.modeloUsuario;
import Vista.FRMtodo;
import Vista.FRMusuario;
import Vista.FRMInventairo;
import Vista.FRMMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
/**
 *
 * @author Zero
 */
public class controlador implements ActionListener
{
    private FRMusuario _view;
    private FRMInventairo _inven;
    private modeloUsuario _model;
    private FRMMenu _menu;
    private FRMtodo _tablaTodo;
    private String usuarioSeleccionado = null;
   
    public void iniciar()
    {
        _view.setTitle("Heladeria");
        _inven.setTitle("Heladeria");
    }
    public void limpiar()
    {
        _view.txtNombre.setText(null);
        _view.txtApellidoP.setText(null);
        _view.txtUsuario.setText(null); 
        _view.txtContrasena.setText(null);
        _view.txtArea.setText(null);
        
        _inven.txtCantidad.setText(null);
        _inven.txtNombreI.setText(null);
        _inven.txtCantidadM.setText(null);
        
    }
    public controlador(FRMusuario view, modeloUsuario model, FRMtodo tablaTodo, FRMInventairo inven, FRMMenu menu){
        this._model=model;
        this._view=view;
        this._tablaTodo= tablaTodo;
        this._inven=inven;
        this._menu=menu;
        
        this._view.btnContinuar.addActionListener(this);
        this._view.btnTodo.addActionListener(this);
        this._tablaTodo.btnEliminar.addActionListener(this);
        this._tablaTodo.bntRegresar.addActionListener(this);
        this._tablaTodo.btnModificar.addActionListener(this);
        this._inven.btnContinuarI.addActionListener(this);
        this._menu.btnInventario.addActionListener(this);
        this._menu.btnEmpleados.addActionListener(this);
        this._tablaTodo.tablaT.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mouseClicTable(evt);
            }

            private void mouseClicTable(MouseEvent evt) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        });
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String leyenda = "";
        if (e.getSource() == _view.btnContinuar){
            leyenda = _model.alta("empleados","null,'"+_view.txtNombre.getText()+"','"+_view.txtApellidoP.getText()+"','"
                    +_view.txtArea.getText()+"','"+_view.txtUsuario.getText()+"','"+ _view.txtContrasena.getText()+"'");
            //leyenda = _model.alta("tb_usuarios","'No se','12345','Pedro','Navarro',Null");
            JOptionPane.showMessageDialog(null, leyenda);
            limpiar();
        }
        if(e.getSource( )== _inven.btnContinuarI){
            leyenda = _model.alta("inventario", "null,'"+_inven.txtNombreI.getText()+"',"+_inven.txtCantidad.getText()
                    +","+_inven.txtCantidadM.getText()+"");
            //leyenda = _model.alta("inventario","null,'Conos de Helado',500,50");
            JOptionPane.showMessageDialog(null, leyenda);
            limpiar();
          }
        if(e.getSource( )== _menu.btnEmpleados){
            _view.setVisible(true);
            _menu.setVisible(false);
        }
        if(e.getSource( )== _menu.btnInventario){
            _inven.setVisible(true);
            _menu.setVisible(false);
        }
        {
            
        }
    }
       /* if (e.getSource() == _tablaTodo.btnEliminar){
            
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
    
    

