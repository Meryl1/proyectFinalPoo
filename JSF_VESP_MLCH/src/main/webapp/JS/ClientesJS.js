
window.onload = function(){
    readClientes();
};

function readClientes() {
    let buscar = document.getElementById('buscarCli').value; //getElementById  este elemento toma control total de la etiqueta buscarCli para extraer el valor que se ingresa 

    //Estructura bÃ¡sica de un ajax: debo utilizar la misma estructura
    // c
    $.ajax({
        data:{                   //preparo la informacion que voy a enviar
            "crud": "select",     
            "txtBuscar": buscar
        },
        url:"./ClientesS",
        async:true,
        type:"GET",
        dataType:"text",
        success: function(datos){
            document.getElementById('tablaClientes').innerHTML = datos;
        }
    });
}

function insertClientes(){
    let nom = document.getElementById('txtNombre').value;
    let doc = document.getElementById('txtDocumento').value;
    let mail = document.getElementById('txteMail').value;
    let tel = document.getElementById('txtTelefono').value;
    let dir = document.getElementById('txtDireccion').value;
    let nac = document.getElementById('txtFechaNac').value;
    let compra = document.getElementById('txtCompras').value;
    let compraU = document.getElementById('txtCompraUlti').value;
    let fecha = document.getElementById('txtFecha').value;
    
    //alert(cat+"\n"+fecha);
     $.ajax({
        data:{
            "crud":"insert",
            "txtNombre": nom,
            "txtDocumento": doc,
            "txteMail": mail,
            "txtTelefono": tel,
            "txtDireccion": dir,
            "txtFechaNac": nac,
            "txtCompras": compra,
            "txtCompraUlti": compraU,
            "txtFecha": fecha
        },
        url:"./ClientesS",
        async:true,
        type:"GET",
        dataType:"text",
        success: function(datos){
            datos = datos.trim();
            if(datos === 'true'){
                alert("Cliente insertado");
            }else{
                alert("Cliente no insertado");
            }
            document.getElementById('closeInsertar').click();
            readClientes();
        }
    });
}

function cargarDatosActualizar(id, nom, doc, mail, tel, dir, nac, compra, compraU, fecha){
    document.getElementById('numId').value = id;
    document.getElementById('txtNombreUp').value = nom;
    document.getElementById('txtDocumentoUp').value = doc;
    document.getElementById('txteMailUp').value = mail;
    document.getElementById('txtTelefonoUp').value = tel;
    document.getElementById('txtDireccionUp').value = dir;
    document.getElementById('txtFechaNacUp').value = nac;
    document.getElementById('txtComprasUp').value = compra;
    document.getElementById('txtCompraUltiUp').value = compraU;
    document.getElementById('txtFechaUp').value = fecha;
}

function updateClientes() {
    let id = document.getElementById('numId').value;
    let nom = document.getElementById('txtNombreUp').value;
    let doc = document.getElementById('txtDocumentoUp').value;
    let mail = document.getElementById('txteMailUp').value;
    let tel = document.getElementById('txtTelefonoUp').value;
    let dir = document.getElementById('txtDireccionUp').value;
    let nac = document.getElementById('txtFechaNacUp').value;
    let compra = document.getElementById('txtComprasUp').value;
    let compraU= document.getElementById('txtCompraUltiUp').value;
    let fecha = document.getElementById('txtFechaUp').value;
    
    $.ajax({
        data:{                   //preparo la informacion que voy a enviar
            "crud": "update",
            "numId": id,
            "txtNombre": nom,
            "txtDocumento": doc,
            "txteMail": mail,
            "txtTelefono": tel,
            "txtDireccion": dir,
            "txtFechaNac": nac,
            "txtCompras": compra,
            "txtCompraUlti": compraU,
            "txtFecha": fecha
        },
        url:"./ClientesS",
        async:true,
        type:"GET",
        dataType:"text",
        success: function(datos){
            datos = datos.trim();
            if(datos === 'true') {
                alert("Cliente actulizado");
            } else {
                alert("Cliente no actualizado");
            }
            document.getElementById('closeUpdate').click();
            readClientes();
        }
    });
}
