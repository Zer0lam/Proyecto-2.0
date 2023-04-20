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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

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
        _inven.txtId.setText(null);
    }
    
    public controladorE(FRMInventairo inven, modeloUsuario model)
    {
        this._inven=inven;
        this._model=model;
        
        this._inven.btnContinuarI.addActionListener(this);
        this._inven.btnActualizar.addActionListener(this);
        this._inven.btnEliminar.addActionListener(this);
        this._inven.btnModificar.addActionListener(this);
        
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
        if(e.getSource()==_inven.btnActualizar){
        
        List<String> datos = new ArrayList<>();
        String consulta = _model.MostrarRegistro("inventario", "idInventario,nombre,stock,cantidadMinima,precioU,precioVenta,fechaEn,noElaboracion", "idInventario!=0");
        datos.addAll(Arrays.asList(consulta.split(",")));

        DefaultTableModel tabla2 = new DefaultTableModel();
        tabla2.addColumn("Id");
        tabla2.addColumn("Nombre");
        tabla2.addColumn("Stock");
        tabla2.addColumn("Cantidad M");
        tabla2.addColumn("Precio U");
        tabla2.addColumn("Precio V");
        tabla2.addColumn("Fecha En");
        tabla2.addColumn("Numero Elab");

        _inven.tablaTinven.setModel(tabla2);

        for (int i = 0; i < datos.size(); i += 8) 
        {
        Object[] fila = new Object[8];
        for (int j = 0; j < 8; j++) {
        fila[j] = datos.get(i + j);
        }
        tabla2.addRow(fila);
        }
        JOptionPane.showMessageDialog(null, "Se ha actualizado la tabla");

          }
      
     
        if (e.getSource() == _inven.btnModificar){
            leyenda = _model.modificar("inventario","idInventario= '"+_inven.txtId.getText()+"' , nombre = '"+_inven.txtNombreI.getText()+"' ,  stock= '"
                    +_inven.txtCantidad.getText()+"' , cantidadMinima='"+_inven.txtCantidadM.getText()+"' ,  precioU= '"+_inven.txtPrecioU.getText()
                    +"' , precioVenta='"+_inven.txtPrecioV.getText()+"'", "idInventario = "+_inven.txtId.getText());
           
            
            JOptionPane.showMessageDialog(null, leyenda);
         
        limpiar();//se limpian las cajas de texto
     //agregar otros botones si se necesitan implementar
        

        }
        if(e.getSource()== _inven.btnEliminar)
        {
         leyenda = _model.eliminar("inventario","idInventario = "+ _inven.txtId.getText());
          JOptionPane.showMessageDialog(null, leyenda);
          
                  
            limpiar();
        }
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    

    
    
}

