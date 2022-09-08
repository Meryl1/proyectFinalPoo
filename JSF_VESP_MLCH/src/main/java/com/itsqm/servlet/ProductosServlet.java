package com.itsqm.servlet;

import com.itsqm.acceso.Categorias;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "CategoriasS", urlPatterns = "/CategoriasS")
public class ProductosServlet {
//    protected void doGet(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        String menu = request.getParameter("crud");
//        if (menu.equals("select")) {
//            //Read
//            selectProductos(request, response);
//        } else if (menu.equals("update")) {
//            //Update
//            updateProductos(request, response);
//        } else if (menu.equals("insert")) {
//            //Insert
//            insertProductos(request, response);
//        } else if (menu.equals("delete")) {
//            //Delete
//            deleteProductos(request, response);
//        }
    
    //Delete
//    private void deleteProductos(HttpServletRequest request, HttpServletResponse response) {
//        try {
//            response.setContentType("text/html");
//            PrintWriter pw = response.getWriter();
//            int id = Integer.parseInt(request.getParameter("txtId"));
//            Productos p = new Productos();
//            boolean r = p.deleteProductos(id);
//            pw.println("<h1>Respuesta: </h1>" + r);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    } 
//    
//    private void insertProductos(HttpServletRequest request, HttpServletResponse response) {
//
//        try {
//            response.setContentType("text/html");
//            PrintWriter pw = response.getWriter();
//            String productos = request.getParameter("txtProductos");
//            String fecha = request.getParameter("txtFecha");
//            Productos p = new Productos();
//            boolean r = p.insertProductos(categoria, fecha);
//            pw.println(r);
//        } catch (Exception e) {
//        }
//
//    }
//     private void updateProductos(HttpServletRequest request, HttpServletResponse response) {
//
//        try {
//            response.setContentType("text/html");
//            PrintWriter pw = response.getWriter();
//            int id = Integer.parseInt(request.getParameter("numId"));
//            String categoria = request.getParameter("txtCategoria");
//            String fecha = request.getParameter("txtFecha");
//            Categorias c = new Categorias();
//            boolean r = c.updateCategorias(id, categoria, fecha);
//            pw.println(r);
//        } catch (Exception e) {
//        }
//    }
//     
//private void selectProductos(HttpServletRequest request, HttpServletResponse response) {
//
//        try {
//            response.setContentType("text/html");
//            PrintWriter pw = response.getWriter();
//            String buscar = request.getParameter("txtBuscar");
//            Categorias c = new Categorias();
//            ResultSet rs = c.selectCategorias(buscar);
//            String tabla = "<table class='table table-hover'>";
//            tabla += "<thead class='thead-dark'>";
//            tabla += "<tr>";
//            tabla += "<th>ID";
//            tabla += "</th>";
//            tabla += "<th>CATEGORIA";
//            tabla += "</th>";
//            tabla += "<th>FECHA";
//            tabla += "</th>";
//            tabla += "<th>ACCIÓN";
//            tabla += "</th>";
//            tabla += "</tr>";
//            tabla += "</thead>";
//            tabla += "</tbody>";
//            while (rs.next()) {
//                tabla += "<tr>";
//                tabla += "<td>" + rs.getInt("id");
//                tabla += "</td>";
//                tabla += "<td>" + rs.getString("Categoria");
//                tabla += "</td>";
//                tabla += "<td>" + rs.getString("Fecha");
//                tabla += "</td>";
//                tabla += "<td>";
//                tabla += "<button type='button' class='btn btn-warning' data-toggle='modal' data-target='#actualizarModal' onclick=\"cargarDatosActualizar('"+rs.getInt("id")+"','"+rs.getString("categoria")+"','"+rs.getString("fecha")+"')\">Actualizar</button>";
//                tabla += "<button type='button' class='btn btn-danger' data-toggle='modal' data-target='#eliminarModal' onclick=\"cargarIdEliminar('"+rs.getInt("id")+"')\">Eliminar</button>";
//                tabla += "</td>";
//                tabla += "</tr>";
//            }
//            tabla += "</tbody>";
//            tabla += "</table>";
//
//            pw.println(tabla);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }

}
