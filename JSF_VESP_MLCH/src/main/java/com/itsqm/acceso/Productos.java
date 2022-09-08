package com.itsqm.acceso;

import com.itsqm.modelo.CBDD;
import java.sql.ResultSet;

public class Productos {

    private int id;
    private int id_categoria;
    private String codigo;
    private String descripcion;
    private String imagen;
    private int stock;
    private double precioCompra;
    private double precioVenta;
    private int ventas;
    private String fecha;
    private String buscar;
    private CBDD cbdd = new CBDD();

    public Productos() {
        cbdd = new CBDD();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public int getVentas() {
        return ventas;
    }

    public void setVentas(int ventas) {
        this.ventas = ventas;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getBuscar() {
        return buscar;
    }

    public void setBuscar(String buscar) {
        this.buscar = buscar;
    }

    public CBDD getCbdd() {
        return cbdd;
    }

    public void setCbdd(CBDD cbdd) {
        this.cbdd = cbdd;
    }

    public boolean insertProductos(int id, int id_categoria, String codigo, String descripcion, String imagen, int stock, double precioCompra, double precioVenta, int ventas, String fecha) {
        
        setCodigo(codigo);
        setDescripcion(descripcion);
        setImagen(imagen);
        setStock(stock);
        setPrecioCompra(precioCompra);
        setPrecioVenta(precioVenta);
        setVentas(ventas);
        setFecha(fecha);
        
        String sql = "INSERT INTO `productos`"
                + "(`codigo`, "
                + "`descripcion`, "
                + "`imagen`, "
                + "`stock`, "
                + "`precio_compra`, "
                + "´precio_venta`, "
                + "`ventas`, "
                + "`ultima_compra`) "
                + "VALUES ('" + getCodigo() + "',"
                + "'" + getDescripcion() + "', "
                + "'" + getImagen() + "', "
                + "'" + getStock() + "', "
                + "'" + getPrecioCompra() + "', "
                + "'" + getPrecioVenta() + "', "
                + "'" + getVentas() + "', "
                + "'" + getFecha() + "')";
        
        boolean r = cbdd.ejecutar(sql);
        
        return r;
        
    }
    
    public boolean deleteProductos(int id) {

        setId(id);
        String sql = "DELETE FROM `productos` "
                + "WHERE `id` =" + getId();
        boolean r = cbdd.ejecutar(sql);

        return r;
    }
    
    public boolean updateProductos(int id, int id_categoria, String codigo, String descripcion, String imagen, int stock, double precioCompra, double precioVenta, int ventas, String fecha) {

        setCodigo(codigo);
        setDescripcion(descripcion);
        setImagen(imagen);
        setStock(stock);
        setPrecioCompra(precioCompra);
        setPrecioVenta(precioVenta);
        setVentas(ventas);
        setFecha(fecha);

        String sql = "UPDATE `productos` \n"
                + "SET `codigo`='" + getCodigo() + "',\n"
                + "`descripcion`='" + getDescripcion() + "' \n"
                + "`imagen`='" + getImagen() + "' \n"
                + "`stock`='" + getStock() + "' \n"
                + "`precio_compra`='" + getPrecioCompra() + "' \n"
                + "`precio_venta`='" + getPrecioVenta() + "' \n"
                + "`ventas`='" + getVentas() + "' \n"
                + "`fecha`='" + getFecha() + "' \n"
                + "WHERE `id`= " + getId();

        return cbdd.ejecutar(sql);

    }
    
    public ResultSet selectProductos(String buscar) {

        setBuscar(buscar);
        String sql = "SELECT * FROM `productos` \n"
                + "WHERE `productos` like '%" + getBuscar() + "%'";
        return cbdd.consulta(sql);

    }

}
