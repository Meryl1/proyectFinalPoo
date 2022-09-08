<%-- 
    Document   : ClientesVista
    Created on : 29 jun. 2022, 14:52:24
    Author     : Apauki
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Clientes</title>
        <script <script src="./JS/ClientesJS.js">></script>
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
        <h1>Clientes</h1>
        <hr>
        <form>
            <table>
                <tr>
                    <td>
                        <label>Buscar</label>
                    </td>
                    <td>
                        <input type="text" id="buscarCli" class="form-control">
                    </td>
                </tr>
                <tr>
                    <td></td>
                    <td>
                        <button type="button" 
                                class="btn btn-primary" 
                                style="width: 80px; height: 40px" onclick="readClientes()">Buscar</button>
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
        <div id="tablaClientes"></div>
    </div>


    <!-- Modal Insertar -->
    <div class="modal" id="insertarModal">
        <div class="modal-dialog">
            <div class="modal-content">

                <!-- Modal Header -->
                <div class="modal-header">
                    <h4 class="modal-title">Insertar Cliente</h4>
                    <button type="button" class="close" data-dismiss="modal">&times;</button>
                </div>

                <!-- Modal body -->
                <div class="modal-body" align="center">
                    <form>
                        <table>
                            <tr>
                                <td>
                                    <label>Nombre:</label>
                                </td>
                                <td>
                                    <input type="text" id="txtNombre" class="form-control"/>
                                </td>
                            </tr>
                            <tr>
                                <td>Documento:</td>
                                <td>
                                    <input type="text" id="txtDocumento" class="form-control"/>
                                </td>
                            </tr>
                            <tr>
                            <tr>
                                <td>eMail:</td>
                                <td>
                                    <input type="email" id="txteMail" class="form-control"/>
                                </td>
                            </tr>
                            <tr>       
                            <tr>
                                <td>Teléfono:</td>
                                <td>
                                    <input type="text" id="txtTelefono" class="form-control"/>
                                </td>
                            </tr>
                            <tr>       
                            <tr>
                                <td>Dirección:</td>
                                <td>
                                    <input type="text" id="txtDireccion" class="form-control"/>
                                </td>
                            </tr>
                            <tr>  
                            <tr>
                                <td>Fecha de nacimiento:</td>
                                <td>
                                    <input type="date" id="txtFechaNac" class="form-control"/>
                                </td>
                            </tr>
                            <tr>       
                            <tr>
                                <td>Compras:</td>
                                <td>
                                    <input type="text" id="txtCompras" class="form-control"/>
                                </td>
                            </tr>
                            <tr>       
                            <tr>
                                <td>Última compra:</td>
                                <td>
                                    <input type="date" id="txtCompraUlti" class="form-control"/>
                                </td>
                            </tr>
                            <tr>     
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
                                        style="width: 80px; height: 40px" onclick="insertClientes()">Insertar</button>
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
                    <h4 class="modal-title">Actualizar Cliente</h4>
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
                                    <label>Nombre:</label>
                                </td>
                                <td>
                                    <input type="text" id="txtNombreUp" class="form-control"/>
                                </td>
                            </tr>
                            <tr>
                                 <td>Documento:</td>
                                <td>
                                    <input type="text" id="txtDocumentoUp" class="form-control"/>
                                </td>
                            </tr>
                            <tr>
                            <tr>
                                <td>eMail:</td>
                                <td>
                                    <input type="text" id="txteMailUp" class="form-control"/>
                                </td>
                            </tr>
                            <tr>       
                            <tr>
                                <td>Teléfono:</td>
                                <td>
                                    <input type="text" id="txtTelefonoUp" class="form-control"/>
                                </td>
                            </tr>
                            <tr>       
                            <tr>
                                <td>Dirección:</td>
                                <td>
                                    <input type="text" id="txtDireccionUp" class="form-control"/>
                                </td>
                            </tr>
                            <tr>  
                            <tr>
                                <td>Fecha de nacimiento:</td>
                                <td>
                                    <input type="date" id="txtFechaNacUp" class="form-control"/>
                                </td>
                            </tr>
                            <tr>       
                            <tr>
                                <td>Compras:</td>
                                <td>
                                    <input type="text" id="txtComprasUp" class="form-control"/>
                                </td>
                            </tr>
                            <tr>       
                            <tr>
                                <td>Última compra:</td>
                                <td>
                                    <input type="date" id="txtCompraUltiUp" class="form-control"/>
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
                                        style='width: 80px; height: 40px' onclick="updateClientes()">Actualizar</button>
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

</body>
</html>
