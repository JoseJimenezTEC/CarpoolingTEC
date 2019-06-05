/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexiones.peticiones;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import java.io.IOException;
import java.io.OutputStream;

/**
 *
 * @author jeja1
 */
public class LoginHandler implements HttpHandler{

    @Override
    public void handle(HttpExchange he) throws IOException {
        if(he.getRequestMethod().compareTo("GET")==0){
            
        }else if(he.getRequestMethod().compareTo("POST")==0){
            System.out.println(he.getRequestMethod()+ " /");
            he.sendResponseHeaders(200, 0);
            OutputStream os = he.getResponseBody();
            String respuesta = "Informacion Recibida";
            os.write(respuesta.toString().getBytes());
            os.close();
        }
    }
    
}
