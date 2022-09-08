package com.itsqm.servlet;

import com.itsqm.acceso.Clientes;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Apauki
 */
@WebServlet(name = "ClientesS", urlPatterns = "/ClientesS")
public class ClientesServlet extends HttpServlet {

    //Polimorfismo
    //GET   = dominio.com/Proyecto01/pag.jsp?crud=delete&txtId=3
    //POST  = dominio.com/Proyecto01/pag.jsp
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String menu = request.getParameter("crud");
        if (menu.equals("select")) {
            //Read
            selectClientes(request, response);
        } else if (menu.equals("update")) {
            //Update
            updateClientes(request, response);
        } else if (menu.equals("insert")) {
            //Insert
            insertClientes(request, response);
        } else if (menu.equals("delete")) {
            //Delete
            deleteClientes(request, response);
        }
    }

    /*
    protected void doPost(HttpServletRequest request, HttpServletResponse response){
        
    }
     */
    //Delete
    private void deleteClientes(HttpServletRequest request, HttpServletResponse response) {
        try {
            response.setContentType("text/html");
            PrintWriter pw = response.getWriter();
            int id = Integer.parseInt(request.getParameter("txtId"));
            Clientes cli = new Clientes();
            boolean r = cli.deleteClientes(id);
            pw.println(r);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void insertClientes(HttpServletRequest request, HttpServletResponse response) {

        try {
            response.setContentType("text/html");
            PrintWriter pw = response.getWriter();
            String nombre = request.getParameter("txtNombre");
            int documento = Integer.parseInt(request.getParameter("txtDocumento"));
            String eMail = request.getParameter("txteMail");
            String telefono = request.getParameter("txtTelefono");
            String direccion = request.getParameter("txtDireccion");
            String fechaNacimiento = request.getParameter("txtFechaNac");
            int compras = Integer.parseInt(request.getParameter("txtCompras"));
            String ultimaCompra = request.getParameter("txtCompraUlti");
            String fecha = request.getParameter("txtFecha");
            Clientes cli = new Clientes();
            boolean r = cli.insertClientes(nombre, documento, eMail, telefono, direccion, fechaNacimiento, compras, ultimaCompra, fecha);
            pw.println(r);
        } catch (Exception e) {
        }

    }

    private void updateClientes(HttpServletRequest request, HttpServletResponse response) {

        try {
            response.setContentType("text/html");
            PrintWriter pw = response.getWriter();
            int id = Integer.parseInt(request.getParameter("numId"));
            String nombre = request.getParameter("txtNombre");
            int documento = Integer.parseInt(request.getParameter("txtDocumento"));
            String eMail = request.getParameter("txteMail");
            String telefono = request.getParameter("txtTelefono");
            String direccion = request.getParameter("txtDireccion");
            String fechaNacimiento = request.getParameter("txtFechaNac");
            int compras = Integer.parseInt(request.getParameter("txtCompras"));
            String ultimaCompra = request.getParameter("txtCompraUlti");
            String fecha = request.getParameter("txtFecha");
            Clientes cli = new Clientes();
            boolean r = cli.updateClientes(id, nombre, documento, eMail, telefono, direccion, fechaNacimiento, compras, ultimaCompra, fecha);
            pw.println(r);
        } catch (Exception e) {
        }
    }

    private void selectClientes(HttpServletRequest request, HttpServletResponse response) {

        try {
            response.setContentType("text/html");
            PrintWriter pw = response.getWriter();
            String buscar = request.getParameter("txtBuscar");
            Clientes cli = new Clientes();
            ResultSet rs = cli.selectClientes(buscar);
            String tabla = "<table class='table table-hover'>";
            tabla += "<thead class='thead-dark'>";
            tabla += "<tr>";
            tabla += "<th>ID";
            tabla += "</th>";
            tabla += "<th>NOMBRE";
            tabla += "</th>";
            tabla += "<th>DOCUMENTO";
            tabla += "</th>";
            tabla += "<th>eMAIL";
            tabla += "</th>";
            tabla += "<th>TELEFONO";
            tabla += "</th>";
            tabla += "<th>DIRECCION";
            tabla += "</th>";
            tabla += "<th>FECHA NACIMIENTO";
            tabla += "</th>";
            tabla += "<th>COMPRAS";
            tabla += "</th>";
            tabla += "<th>ULTIMA COMPRA";
            tabla += "</th>";
            tabla += "<th>FECHA";
            tabla += "</th>";
            tabla+="<th>accion";
            tabla+="</th>";
            tabla += "</tr>";
            tabla += "</thead>";
            tabla += "</tbody>";
            while (rs.next()) {
                tabla += "<tr>";
                tabla += "<td>" + rs.getInt("id");
                tabla += "</td>";
                tabla += "<td>" + rs.getString("nombre");
                tabla += "</td>";
                tabla += "<td>" + rs.getString("documento");
                tabla += "</td>";
                tabla += "<td>" + rs.getString("email");
                tabla += "</td>";
                tabla += "<td>" + rs.getString("telefono");
                tabla += "</td>";
                tabla += "<td>" + rs.getString("direccion");
                tabla += "</td>";
                tabla += "<td>" + rs.getString("fecha_nacimiento");
                tabla += "</td>";
                tabla += "<td>" + rs.getString("compras");
                tabla += "</td>";
                tabla += "<td>" + rs.getString("ultima_compra");
                tabla += "</td>";
                tabla += "<td>" + rs.getString("fecha");
                tabla += "</td>";
                tabla += "<td>";
                tabla += "<button type='button' class='btn btn-warning' data-toggle='modal' data-target='#actualizarModal' onclick=\"cargarDatosActualizar('"+rs.getInt("id")+"', '"+rs.getString("nombre")+"', '"+rs.getString("documento")+"', '"+rs.getString("email")+"', '"+rs.getString("telefono")+"', '"+rs.getString("direccion")+"', '"+rs.getString("fecha_nacimiento")+"', '"+rs.getString("compras")+"', '"+rs.getString("ultima_compra")+"', '"+rs.getString("fecha")+"')\">Actualizar</button>";
                tabla += "<button type='button' class='btn btn-danger'>Eliminar</button>";
                tabla += "</td>";
                tabla += "</tr>";
            }
            tabla += "</tbody>";
            tabla += "</table>";

            pw.println(tabla);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
