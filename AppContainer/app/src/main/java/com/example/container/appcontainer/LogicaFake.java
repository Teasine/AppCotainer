// .....................................................................
// Autor: Santiago Pérez Torres
// Fecha inicio: 24/10/2019
// Última actualización: 29/12/2019
// LogicaFake.js
// .....................................................................

package com.example.container.appcontainer;

import android.util.Log;

import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class LogicaFake {

    private final String TAG = "---LogicaDebug---";

    // -------------------------------------------------------------------------------
    // -------------------------------------------------------------------------------
    interface RespuestaAPreguntarAlgo {
        public void respuesta(String respuesta);

    } // interface


    private String urlServidor = "http://192.168.1.139:8080/";


    // -------------------------------------------------------------------------------------------------------
    //                      --> obtenerContenedoresValencia() --> elCallback: Callback
    // -------------------------------------------------------------------------------------------------------
    public void obtenerContenedoresValencia(Double distancia,Double latitud, Double longitud,PeticionarioREST.Callback elCallback) {

        PeticionarioREST elPeticionario = new PeticionarioREST();

        Map<String, String> params = new HashMap<String, String>();
        JSONObject eljson = new JSONObject(params);

        //Posicion ficticia del usuario en valencia
        latitud = 39.470868;
        longitud = -0.358238;

        elPeticionario.hacerPeticionREST("GET", this.urlServidor + "obtenerContenedoresValencia/" + distancia +"&" + latitud + "&" + longitud, eljson.toString(), elCallback,
                "application/json; charset=utf-8"
        );
    }

} // class

