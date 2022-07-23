/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ptoyecto;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

/**
 *
 * @author Julio
 */
public class Tipo_D extends Peliculas{

    public Tipo_D() {
    }

    public Tipo_D(int ID, String Nombre, String Tipo, String Categoria, float Duracion, int Año, String Descripcion) {
        super(ID, Nombre, Tipo, Categoria, Duracion, Año, Descripcion);
    }
        @Override
    public String toString() {
        return "Peliculas" +"\n" +  "ID: " + ID +"\n" + "Nombre: " + Nombre+"\n"+ "Duracion: " + Duracion +"\n"+ "A\u00f1o: " + Año+"\n"   + "Tipo: " + Tipo+"\n" + "Categoria: " + Categoria + "\n"+ "Descripcion: " + Descripcion+"\n" +"\n";
    }
     
    @Override
     public void MostrarPelis() throws IOException {
         BufferedReader Leer = new BufferedReader (new FileReader("PeliculasD.txt")); 
            ArrayList <String> Array = new ArrayList();
            String au = "";
            String au1 = Leer.readLine();
            Array.add(au1);
            while(au1 !=null){
                au1 = Leer.readLine();
                Array.add(au1);
            }
            int Tamaño = (Array.size()-1);
            for(int i=0;i<Tamaño;i++){
                au= Array.get(i);
                System.out.println(au);
            }
            System.out.println("");
            System.out.println("");
        
     }
     @Override
     public void BuscarPeli(String Nombre, String Tipo) throws IOException{
         BufferedReader Leer = new BufferedReader (new FileReader("PeliculasD.txt")); 
            ArrayList <String> Array = new ArrayList();
            String au = "";
            String x="";
            String x1= "";
            String x2= "";
            String nom = Nombre.toLowerCase();
            String tipo = Tipo.toLowerCase();
            boolean Val = false;
            String au2 = "";
            String au1 = Leer.readLine();
            Array.add(au1);
            while(au1 !=null){
                au1 = Leer.readLine();
                Array.add(au1);
            }
            int Tamaño = (Array.size()-1);
            for(int i=0;i<Tamaño;i++){
                au = Array.get(i);
                StringTokenizer tok = new StringTokenizer(au,"/");
                tok.nextToken();
                au = tok.nextToken();
                au1 = au.toLowerCase();
                au = tok.nextToken();
                au2 = au.toLowerCase();
                if(au1.equals(nom)&&au2.equals(tipo)){
                    x =Array.get(i);
                    StringTokenizer token = new StringTokenizer (x,"/");
                        x1 = "Id: "+ token.nextToken() +"\n" ;
                        x1 += "Nombre: "+ token.nextToken()+"\n";
                        x1 += "Tipo: "+ token.nextToken()+"\n";
                        x1 += "Categoria: "+ token.nextToken()+"\n";
                        x1 += "Duracion: "+ token.nextToken()+"\n";
                        x1 += "Año: "+ token.nextToken()+"\n";
                        x1 += "Descripcion: "+ token.nextToken()+"\n";
                        x2 = x1;
                        System.out.println(x2);

                    Val = true;
                    System.err.println("Cuentas con esa pelicula");
                    break;
                }
                
            }
            if(Val !=true){
                System.err.println("No tienes peliculas de esta clasificacion con este nombre");
            }
            
         
     }
   /* public ArrayList<String> MostrarPelis() throws IOException,NoSuchElementException {
        ArrayList<String> pelis= new ArrayList();
        BufferedReader Leer = new BufferedReader (new FileReader("ClaseD.txt")); 
                    ArrayList <String> Array = new ArrayList();
                    String au = "";
                    String au1 = Leer.readLine();
                    Array.add(au1);
                    while(au1 !=null){
                        au1 = Leer.readLine();
                        Array.add(au1);
                    }
                    int Tamaño = Array.size() -1;
                    for(int i=0;i<Tamaño;i++){
                        pelis.add(i,Array.get(i));
                    }
                    return pelis;
    } */
    @Override
   public int getTotal() throws IOException,NoSuchElementException{
        BufferedReader Leer = new BufferedReader (new FileReader("ClaseD.txt")); 
        ArrayList <String> Array = new ArrayList();
        String au = "";
        String au1 = Leer.readLine();
        Array.add(au1);
        while(au1 !=null){
            au1 = Leer.readLine();
            Array.add(au1);
        } 
       int y = Array.size() -1 ;
        return y;
    }
    
    /**
     *
     * @param object
     * @throws FileNotFoundException
     * @throws IOException
     * @throws NumberFormatException
     */
    
    @Override
    public void agregarPeli(Peliculas object) throws FileNotFoundException, IOException, NumberFormatException{
           BufferedReader Leer = new BufferedReader(new FileReader("ClaseD.txt"));
           try{
               String Renglon = Leer.readLine();
                String auxiliar= "";
                String comparador="";
                String Com= "A";
                String COm1 = object.getTipo();
                String Com1 = COm1.toUpperCase();
                String comparador1=Integer.toString(object.getID());
                boolean val= false;
                boolean Val1=false;
                String NuevaPelicula = "";
                ArrayList <String> Arreglo = new ArrayList();
                Arreglo.add(Renglon);
                int contador =0;
                while(Renglon!=null){
                    Renglon = Leer.readLine();
                    Arreglo.add(Renglon);

                }
                contador = Arreglo.size()-1;
                System.err.println("Contador   "+ contador);
                    for(int i=0;i<contador;i++){
                        auxiliar = Arreglo.get(i);
                        StringTokenizer token = new StringTokenizer(auxiliar,"/");
                        comparador = token.nextToken();
                        if(comparador.equals(comparador1)){
                            System.out.println("EL Id ya existe");
                            val = true;
                        }
                        if(Com1.equals(Com)){
                                Val1 = true;
                        }
                    }
                    if(Val1 != true){
                        System.err.println("El Tipo de pelicula no es D");
                    }
                    if(val !=true && Val1==true){
                        NuevaPelicula = Integer.toString(object.getID())+"/";
                        NuevaPelicula += object.getNombre() +"/";
                        NuevaPelicula += object.getTipo()+"/";
                        NuevaPelicula += object.getCategoria() +"/";
                        NuevaPelicula += Float.toString(object.getDuracion()) +"/";
                        NuevaPelicula += Integer.toString(object.getAño())+"/";
                        NuevaPelicula += object.getDescripcion();
                        Arreglo.add(contador, NuevaPelicula);
                    }
                    contador = Arreglo.size()-1;
                    System.err.println("Con "+ contador);
                     PrintWriter fileOut = new PrintWriter(new FileWriter("ClaseD.txt"));
                     for(int i=0;i<contador;i++){
                         fileOut.println(Arreglo.get(i));
                     }
                     fileOut.close();
                     Leer.close();
                
           }catch(NullPointerException npe){
               
           }catch(NoSuchElementException nse){
               
           }
           
      }
    @Override
       public void venderPeli(int Id, String Tipo) throws  IOException{
           BufferedReader Leer = new BufferedReader(new FileReader("ClaseD.txt"));
           try{
               ArrayList<String> Arreglo = new ArrayList();
               String renglon = Leer.readLine();
               int Tamaño = 0;
               int contador = 0;
               String auxiliar= "";
               boolean val = false;
               String comparador="";
               String comparadorx="";
               String comparadorx1="";
               String comparador1="";
               String comparadorA=Integer.toString(Id);
               Arreglo.add(renglon);
               while(renglon!=null){
                   renglon = Leer.readLine();
                   Arreglo.add(renglon);
               }
               
               Tamaño= Arreglo.size()-1;
               System.err.println("Tamaño=   "+Tamaño);
               for(int i=0;i<Tamaño;i++){
                   auxiliar = Arreglo.get(i);
                   StringTokenizer token = new StringTokenizer (auxiliar,"/");
                   comparador1 = token.nextToken();
                   token.nextToken();
                   comparador = token.nextToken();
                   comparadorx = comparador.toUpperCase();
                   comparadorx1 = Tipo.toUpperCase();
                   if(comparador1.equals(comparadorA) && comparadorx.equals(comparadorx1)){
                       System.err.println("La Peli Existe");
                       System.err.println("La Pelicula fue vendida");
                       val = true;
                       contador = i;
                       break;
                   }
               }
               if(val != true){
                    System.err.println("La Peli NoExiste o no es de la clase D");
               }
               if(val == true){
                   Arreglo.remove(contador);
                   Tamaño = Arreglo.size()-1;
                   System.err.println("Tamño   "+Tamaño);
                   PrintWriter fileOut = new PrintWriter(new FileWriter("ClaseD.txt"));
                   for(int j=0;j<Tamaño;j++){
                       fileOut.println(Arreglo.get(j));
                   }
                   fileOut.close();
               }
               Leer.close();
           }catch(NumberFormatException nfe){
               
           }
       }
}
