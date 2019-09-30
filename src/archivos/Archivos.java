
package archivos;


import java.io.File;
import java.io.IOException;

/**
 *
 * @author oracle
 */
public class Archivos {


    public static void main(String[] args) throws IOException {
        //1
        File carpeta1= new File ("/home/oracle/NetBeansProjects/arquivos/arquivosdir/");
        carpeta1.mkdir();
        //2
        File archivo1= new File ("/home/oracle/NetBeansProjects/arquivos/"+"Products1.txt");
        if(archivo1.createNewFile()==true){
            System.out.println("Archivo creado");
        }
        else{
            System.out.println("Archivo no creado");
        }
        //4
        File carpeta2= new File ("/home/oracle/NetBeansProjects/arquivos/arquivosdir/subdir");
        carpeta2.mkdir();
        File archivo2= new File (carpeta2 + "Products2.txt");
        //5
        System.out.println("");
        System.out.println(carpeta2.getName());
        System.out.println(archivo1.getName());
        //6
        System.out.println("");
        System.out.println(carpeta1.getAbsolutePath());
        //7
        System.out.println("");
        System.out.println(archivo1.getName());
        System.out.println(archivo1.getAbsolutePath());
        System.out.println("Se puede escribir? "+archivo1.canWrite());
        System.out.println("Se puede leer? "+archivo1.canRead());
        //8
        archivo1.setReadOnly();
        //9
        archivo1.setWritable(true);
        //10
//        archivo1.delete();
//        //11
//        archivo2.delete();
//        carpeta2.delete();
//        carpeta1.delete();
        
    }
}