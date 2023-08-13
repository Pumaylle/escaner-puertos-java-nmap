
package Pack_Herramientas;

//importamos librerias de java.net y java.io
import java.net.MalformedURLException;//manejamos los errores de la red
import java.net.URL;//maneja las urls y direcciones ip de los sitios web
import java.io.IOException; // manejo de errores
import java.net.InetAddress;//maneja los protocolos de internet



public class ClassPing {
    //Declaracion de variables de tipo String InfoTry y InfoCatch
    String InfoTry = "";
    String InfoCatch="";
    
    public String getInfoPing(){
        return InfoTry;//retornamos los resultados que estan dentro de la variable InfoTry
    }
    
    public void setPing(String TargetUrl){//recibimos lso valores del parametro, enviado anteriormente
        
        //Declaracion de la variable tipo String HOST
        String HOST = TargetUrl;// guardamos el valor del parametro TargetUrl en la variable HOST
      
        //Manejo de errores
       try{
           InetAddress direccion = InetAddress.getByName(HOST);//Instanciamos la clase InetAddress y asu ves a la clase InetAddress.get.By.Name, le pasamos la variable HOST
           boolean conexion = direccion.isReachable(5000);//creamos una varible de tipo boleanos para guardar el resultado
           InfoTry = direccion +" " + conexion;// Guradmos la informacion de la direccion y la conexcion en la variable InfoTry
       }catch(IOException e){//Si por alguna razon marca error le decimos que guarde error en la varible InfoCatch
           InfoCatch = "Error";
       }
    }
}
