/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.modeloUsuario;
import Vista.FRMtodo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Zero
 */
public class controladorT implements ActionListener{

    private FRMtodo _todo;
    private modeloUsuario _model;
    
    public void limpiar()
    {
        _todo.txtId.setText(null);
        _todo.txtName.setText(null);
        _todo.txtLast.setText(null);
        _todo.txtPass.setText(null);
        _todo.txtPass.setText(null);
    }
    
    public controladorT(FRMtodo todo, modeloUsuario model)
    {
        this._todo=todo;
        this._model=model;
        
        this._todo.btnActualizar.addActionListener(this);
    }

    
    @Override
    public void actionPerformed(ActionEvent e) {
        String leyenda = "";
        if(e.getSource()==_todo.btnActualizar){
        
        List<String> datos = new ArrayList<>();
        String consulta = _model.MostrarRegistro("empleados", "idUsuario,nombre,apellidoP,area,contraseña", "idUsuario!=0");
        datos.addAll(Arrays.asList(consulta.split(",")));

        DefaultTableModel tabla2 = new DefaultTableModel();
        tabla2.addColumn("idEmpleado");
        tabla2.addColumn("Nombre");
        tabla2.addColumn("Apellido");
        tabla2.addColumn("Area");
        tabla2.addColumn("Contraseña");

        _todo.tablaT.setModel(tabla2);

        for (int i = 0; i < datos.size(); i += 5) 
        {
        Object[] fila = new Object[5];
        for (int j = 0; j < 5; j++) {
        fila[j] = datos.get(i + j);
        }
        tabla2.addRow(fila);
        }

          }
      
     
        if (e.getSource() == _todo.btnModificar){
            leyenda = _model.modificar("empleados","'"+_todo.txtId.getText()+"'','"+_todo.txtName.getText()+"','"+_todo.txtLast.getText()+"','"
                    +_todo.txtArea.getText()+"','"+ _todo.txtPass.getText()+"'");
            //leyenda = _model.alta("tb_usuarios","'No se','12345','Pedro','Navarro',Null");
            JOptionPane.showMessageDialog(null, leyenda);
            limpiar();
        }
    }
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    

