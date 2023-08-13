package Pack_Herramientas;

import java.net.*;//importamos la libreria java.net y todas sus clases

public class ClassEscaner {
    String info2="";//declaramos una variable info2 tipo String
    //Declaramos una array tipo entero, donde se almacenara los puertos mas comunes en una web
    int [] port ={80,443,21,990,14147,22,23,53,853,110,995,143,993,25,587,3306,101,111,445,951,1723};
    
    public void setEscaner(String ipTarget){//String ipTarget -> recibimos los valores mandado anteriormente
        String Host= ipTarget; //Declaramos una varible de tipo String HOST donde capturara el valor que trae el parametro ipTarget
        //Verificando los puertos abiertos con un for
         for(int i=0;i<port.length;i++){//Declaramos una varible tipo entero i, donde si es menor que la cantidad de puertos que hay en el array, se seguira ejecutando
             
             //Manejando los erros con el try y catch
            try{
                Socket con=new Socket(); //Instamciamos la clase Socket de la libreria java.net; a la varible con
                con.connect(new InetSocketAddress(Host,port[i]),3000);//dentro de la clase connect, llamamos a otra clase InetSocketAddress; y este va a tener como parametro HOST, port, y 3000 -> este de encarga de verificar los puertos
                if(con.isConnected()){//con la clase isConnected veremos si los puertos que estan en nuestro array son validos o no
                    System.out.println("Puerto Conectado: "+port[i]);//por consola mostramos los resultados encontrados
                    
                    info2 = info2 +" "+ port[i];//Guradmos la informacion de los puertos en la variable info2
                }
            }catch(Exception e){
            }
        }
    }
    
    public String getInfo2(){
        System.out.println("Puerto");//mostramos un mensaje por consola
        System.out.println(". "+info2);//mostamos los puertos por consola
        return info2;//retornamos la informacion guardada
    }
    

    
}
