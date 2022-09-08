
window.onload = function(){
    readCategorias();
};

function readCategorias() {
    let buscar = document.getElementById('buscarC').value; //getElementById  este elemento toma control total de la etiqueta buscarC para extraer el valor que se ingresa 

    //Estructura bÃ¡sica de un ajax: debo utilizar la misma estructura
    // localhost:8080/JSP_VESP/CategoriasS?crud=select&txtBuscar=
    $.ajax({
        data:{                   //preparo la informacion que voy a enviar
            "crud": "select",     
            "txtBuscar": buscar
        },
        url:"./CategoriasS",
        async:true,
        type:"GET",
        dataType:"text",
        success: function(datos){
            document.getElementById('tablaCategorias').innerHTML = datos;
        }
    });
}

function insertCategorias(){
    let cat = document.getElementById('txtCategoria').value;
    let fecha = document.getElementById('txtFecha').value;
    
    //alert(cat+"\n"+fecha);
     $.ajax({
        data:{
            "crud":"insert",
            "txtCategoria": cat,
            "txtFecha": fecha
        },
        url:"./CategoriasS",
        async:true,
        type:"GET",
        dataType:"text",
        success: function(datos){
            datos = datos.trim();
            if(datos === 'true'){
                alert("Categoria insertada");
            }else{
                alert("Categoria no insertada");
            }
            document.getElementById('closeInsertar').click();
            readCategorias();
        }
    });
}

function cargarDatosActualizar(id, cat, fec){
    document.getElementById('numId').value = id;
    document.getElementById('txtCategoriaUp').value = cat;
    document.getElementById('txtFechaUp').value = fec;

}

function updateCategorias() {
    let id = document.getElementById('numId').value;
    let cat = document.getElementById('txtCategoriaUp').value;
    let fec = document.getElementById('txtFechaUp').value;
    
    $.ajax({
        data:{                   //preparo la informacion que voy a enviar
            "crud": "update",     
            "numId": id,
            "txtCategoria": cat,
            "txtFecha": fec
        },
        url:"./CategoriasS",
        async:true,
        type:"GET",
        dataType:"text",
        success: function(datos){
            datos = datos.trim();
            if(datos === 'true') {
                alert("Categoría actulizada");
            } else {
                alert("Categoría no actualizada");
            }
            document.getElementById('closeUpdate').click();
            readCategorias();
        }
    });
}
function cargarIdEliminar(id) {
    
    document.getElementById('numIdDel').value = id;
}

function deleteCategorias() {
    let id = document.getElementById('numIdDel').value;
    $.ajax({
        data: {
            "crud": "delete",
            "txtId": id,
        },
        url: "./CategoriasS",
        async: true,
        type: "GET",
        dataType: "text",
        success: function (datos) {
             datos = datos.trim();
            document.getElementById('deleteClose').click();
            readCategorias();
            debugger;
            if (datos === 'true') {
                alert("Categoria eliminada");
            } else {
                alert("Categoria no eliminada");
            }
      
        }
    });
}
