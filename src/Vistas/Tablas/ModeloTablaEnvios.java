/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas.Tablas;

import Controlador.ListaDoble.ListaDoble;
import Modelo.Envio;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Sebastian
 */
public class ModeloTablaEnvios extends AbstractTableModel{
    private ListaDoble envios = new ListaDoble();

    public ListaDoble getEnvios() {
        return envios;
    }

    public void setEnvios(ListaDoble envios) {
        this.envios = envios;
    }

    @Override
    public int getRowCount() {
        return envios.tamano();
    }

    @Override
    public int getColumnCount() {
        return 11;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Envio e = (Envio)envios.verDatoPos(rowIndex);
        switch (columnIndex) {
            case 0:
                return e.getIdEnvio();
            case 1:
                return e.getPaquete().getIdPaquete();
            case 2:
                return e.getPaquete().getRemitente().getNombre();
            case 3:
                return e.getPaquete().getRemitente().getCI_RUC();
            case 4:
                return e.getPaquete().getFecha_Envio();
            case 5:
                return e.getPaquete().getFecha_Entrega();
            case 6:
                return e.getPrioridad();
            case 7:
                return e.getEstado();
            case 8:
                return e.getPaquete().getRemitente().getCiudad();
            case 9:
                return e.getPaquete().getDestinatario().getCiudad();
            case 10:
                return e.getPaquete().isFragil();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Id Envio";
            case 1:
                return "Id Paquete";
            case 2:
                return "Remitente";
            case 3:
                return "CI Cliente";
            case 4:
                return "Fecha de Envio";
            case 5:
                return "Fecha de Entrega";
            case 6:
                return "Prioridad";
            case 7:
                return "Estado de Envio";
            case 8:
                return "Origen";
            case 9:
                return "Destino";
            case 10:
                return "Es Fragil";
            default:
                return null;
        }
    }
}
