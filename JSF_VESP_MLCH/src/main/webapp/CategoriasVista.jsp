<%-- 
    Document   : CategoriasVista
    Created on : 22 jun. 2022, 19:23:05
    Author     : Apauki
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Categorías</title>
        <script <script src="./JS/CategoriasJS.js">></script>
        <%@include  file="./librerias/libs.jsp"%>
    </head>
    <div class="container">
        <div class="row">
            <div class="col-md-8" align="center">
                :..LOGO/IMAGEN..:
            </div>
            <div class="col-md-4">
                Nombre de usuario <br>
                Perfil<br>
                Cerrar Sesión
            </div>
        </div>
    </div>
<body>
    <%@include file="./librerias/menu.jsp" %>

    <div class="container" align="center">
        <h1>Categorías</h1>
        <hr>
        <form>
            <table>
                <tr>
                    <td>
                        <label>Buscar</label>
                    </td>
                    <td>
                        <input type="text" id="buscarC" class="form-control">
                    </td>
                </tr>
                <tr>
                    <td></td>
                    <td>
                        <button type="button" 
                                class="btn btn-primary" 
                                style="width: 80px; height: 40px" onclick="readCategorias()">Buscar</button>
                    </td>
                </tr>
                <tr>
                    <td></td>
                    <td>
                        <button 
                            type="button" 
                            class="btn btn-success" 
                            style="width: 80px; height: 40px"
                            data-toggle="modal"
                            data-target="#insertarModal">Insertar</button>
                    </td>
                </tr>
            </table>
        </form>
        <hr>
        <div id="tablaCategorias"></div>
    </div>


    <!-- Modal Insertar -->
    <div class="modal" id="insertarModal">
        <div class="modal-dialog">
            <div class="modal-content">

                <!-- Modal Header -->
                <div class="modal-header">
                    <h4 class="modal-title">Insertar Categoría</h4>
                    <button type="button" class="close" data-dismiss="modal">&times;</button>
                </div>

                <!-- Modal body -->
                <div class="modal-body" align="center">
                    <form>
                        <table>
                            <tr>
                                <td>
                                    <label>Categoría:</label>
                                </td>
                                <td>
                                    <input type="text" id="txtCategoria" class="form-control"/>
                                </td>
                            </tr>
                            <tr>
                                <td>Fecha:</td>
                                <td>
                                    <input type="date" id="txtFecha" class="form-control"/>
                                </td>
                            </tr>
                            <tr>       
                                <td></td>
                                <td>
                                    <button 
                                        type="button" 
                                        class="btn btn-success"
                                        style="width: 80px; height: 40px" onclick="insertCategorias()">Insertar</button>
                                </td>
                            </tr>
                        </table>
                    </form>
                </div>

                <!-- Modal footer -->
                <div class="modal-footer">
                    <button type="button" class="btn btn-danger" data-dismiss="modal">Close</button>
                </div>
            </div>
        </div>
    </div>
    
    <!-- Modal Actualizar -->
    <div class="modal" id="actualizarModal">
        <div class="modal-dialog">
            <div class="modal-content">

                <!-- Modal Header -->
                <div class="modal-header">
                    <h4 class="modal-title">Actualizar Categoría</h4>
                    <button type="button" class="close" data-dismiss="modal">&times;</button>
                </div>

                <!-- Modal body -->
                <div class="modal-body" align="center">
                    <form>
                        <table>
                            <tr>
                                <td>
                                    <label>ID:</label>
                                </td>
                                <td>
                                    <input type="number" id="numId" class="form-control" readonly=""/>
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <label>Categoría:</label>
                                </td>
                                <td>
                                    <input type="text" id="txtCategoriaUp" class="form-control"/>
                                </td>
                            </tr>
                            <tr>
                                <td>Fecha:</td>
                                <td>
                                    <input type="date" id="txtFechaUp" class="form-control"/>
                                </td>
                            </tr>
                            <tr>       
                                <td></td>
                                <td>
                                    <button 
                                        type="button" 
                                        class="btn btn-success" 
                                        style='width: 80px; height: 40px' onclick="updateCategorias()">Actualizar</button>
                                </td>
                            </tr>
                        </table>
                    </form>
                </div>
            </div> 
        </div>
    </div>
                <!-- The Modal -->
    <div class="modal" id="eliminarModal">
        <div class="modal-dialog">
            <div class="modal-content">
                <!-- Modal Header -->
                <div class="modal-header">
                    <h4 class="modal-title">Botón Eliminar</h4>
                    <button type="button" class="close" data-dismiss="modal">&times;</button>
                </div>

                <!-- Modal body -->
                <div class="modal-body"align"center">
                    <input type="hidden" id="numIdDel"/>
                    <h3>Desea eliminar esta categoría?</h3>
                </div>
            <!-- Modal footer -->
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" onclick="deleteCategorias()">Si</button>
                    <button type="button" class="btn btn-danger" data-dismiss="modal" id="deleteClose">Salir</button>     
                </div>
            </div>
        </div>
    </div>
    
</body>
</html>
