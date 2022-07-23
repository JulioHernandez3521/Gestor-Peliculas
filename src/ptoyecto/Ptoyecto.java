/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ptoyecto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

/**
 *
 * @author Julio
 */                                        
public class Ptoyecto {
    private static BufferedReader Leer = new BufferedReader (new InputStreamReader (System.in));
    private static PrintWriter escribe = new PrintWriter (System.out,true);
    private static PrintWriter escriberr = new PrintWriter (System.err,true);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        byte Opcion = 0;
        do{
            try{
                   do{
                       escribe.println("Bienvenido al menú");
                       escribe.println("1.- Ver Todas las peliculas");
                       escribe.println("2.- Ver Peliculas tipo A");
                       escribe.println("3.- Ver Peliculas tipo AA");
                       escribe.println("4.- Ver Peliculas tipo B");
                       escribe.println("5.- Ver Peliculas tipo B15");
                       escribe.println("6.- Ver Peliculas tipo C");
                       escribe.println("7.- Salir");
                       Opcion = Byte.parseByte(Leer.readLine());
                       switch(Opcion){
                           case 1:{
                               Peliculas P = new Tipo_A();
                               Peliculas P1 = new Tipo_B();
                               Peliculas P2 = new Tipo_B15();
                               Peliculas P3 = new Tipo_AA();
                               Peliculas P4 = new Tipo_C();
                               escriberr.println("Estas son todas sus peliculas");
                               P.MostrarPelis();
                               P1.MostrarPelis();
                               P2.MostrarPelis();
                               P3.MostrarPelis();
                               P4.MostrarPelis();
                               break;

                           }
                           case 2:{
                              byte opcion =0;
                              do{
                                  escribe.println("Bienvenido a peliculas Clase A");
                                  escribe.println("1.- Agregar Peliculas");
                                  escribe.println("2.- Vender Pelicula");
                                  escribe.println("3.- Busccar Pelicula");
                                  escribe.println("4.- Ver Peliculas");
                                  escribe.println("5.- Ir al menu principal");
                                  opcion = Byte.parseByte(Leer.readLine());
                                  switch(opcion){
                                      case 1:{
                                          escriberr.println("Bienvenido a la opcion agregar peliculas");
                                           Peliculas a= new Tipo_A();
                                           escribe.println("Ingrese el ID");
                                           int ID = Integer.parseInt(Leer.readLine());
                                           escribe.println("Ingrese el Nombre");
                                           String Nombre = Leer.readLine();
                                           escribe.println("Ingrese el Tipo");
                                           String tipo= Leer.readLine();
                                           escribe.println("Ingrese el Categoria");
                                           String categoria = Leer.readLine();
                                           escribe.println("Ingrese el Duracion");
                                           float duracion = Float.parseFloat(Leer.readLine());
                                           escribe.println("Ingrese el Año");
                                           int Año = Integer.parseInt(Leer.readLine());
                                           escribe.println("Ingrese el Descripcion");
                                           String descripcion = Leer.readLine();
                                           if(Nombre.isEmpty()||tipo.isEmpty()||categoria.isEmpty()||descripcion.isEmpty()){
                                              escriberr.println("Debe de llenar todos los datos");
                                               continue;
                                           }else{

                                               Peliculas v = new Tipo_A(ID,Nombre,tipo,categoria,duracion,Año,descripcion);
                                               a.agregarPeli(v);
                                               System.err.println("La Pelicula se agrego.");

                                               break;
                                           }   
                                      }
                                      case 2:{
                                          Peliculas pel = new Tipo_A();
                                          escriberr.println("Bienvenido a la opcion vender pelicula");
                                          escribe.println("Ingrese su ID");
                                          int Id = Integer.parseInt(Leer.readLine());
                                          escribe.println("Ingrese el tipo");
                                          String tipo = Leer.readLine();
                                          if(tipo.isEmpty()){
                                              escriberr.println("No ingreso el tipo de pelicula");
                                              continue;
                                          }else{
                                              pel.venderPeli(Id, tipo);
                                              break;
                                          }
                                      }
                                      case 3:{
                                          escriberr.println("Bienvenido a la opcion buscar peliculas");
                                          Peliculas peliA = new Tipo_A();
                                          escribe.println("Ingrese el Nombre de la pelicula");
                                          String Nombre = Leer.readLine();
                                          escribe.println("Ingrese el tipo de la pelicula");
                                          String Tipo = Leer.readLine();
                                          
                                          if(Nombre.isEmpty()&&Tipo.isEmpty()){
                                              escriberr.println("Debe ingresar todo");
                                              continue;
                                          }else{
                                              peliA.BuscarPeli(Nombre, Tipo);
                                              break;
                                          }
                                          
                                      }
                                      case 4:{
                                           Peliculas PelisA = new Tipo_A();
                                           escriberr.println("Estas son todas ts peliculas tipo A");
                                           PelisA.MostrarPelis();
                                           break;
                                      }
                                      case 5:{
                                          break;
                                      }
                                  }

                              }while(opcion!=5);

                               break;

                           }
                           case 3:{
                               byte opcion =0;
                              do{
                                  escribe.println("Bienvenido a peliculas Clase AA");
                                  escribe.println("1.- Agregar Peliculas");
                                  escribe.println("2.- Vender Pelicula");
                                  escribe.println("3.- Busccar Pelicula");
                                  escribe.println("4.- Ver Peliculas");
                                  escribe.println("5.- Ir al menu principal");
                                  opcion = Byte.parseByte(Leer.readLine());
                                  switch(opcion){
                                      case 1:{
                                          escriberr.println("Bienvenido a la opcion agregar peliculas");
                                           Peliculas a= new Tipo_AA();
                                           escribe.println("Ingrese el ID");
                                           int ID = Integer.parseInt(Leer.readLine());
                                           escribe.println("Ingrese el Nombre");
                                           String Nombre = Leer.readLine();
                                           escribe.println("Ingrese el Tipo");
                                           String tipo= Leer.readLine();
                                           escribe.println("Ingrese el Categoria");
                                           String categoria = Leer.readLine();
                                           escribe.println("Ingrese el Duracion");
                                           float duracion = Float.parseFloat(Leer.readLine());
                                           escribe.println("Ingrese el Año");
                                           int Año = Integer.parseInt(Leer.readLine());
                                           escribe.println("Ingrese el Descripcion");
                                           String descripcion = Leer.readLine();
                                           if(Nombre.isEmpty()||tipo.isEmpty()||categoria.isEmpty()||descripcion.isEmpty()){
                                              escriberr.println("Debe de llenar todos los datos");
                                               continue;
                                           }else{

                                               Peliculas v = new Tipo_AA(ID,Nombre,tipo,categoria,duracion,Año,descripcion);
                                               a.agregarPeli(v);
                                               System.err.println("La Pelicula se agrego.");

                                               break;
                                           }   
                                      }
                                      case 2:{
                                          Peliculas pel = new Tipo_AA();
                                          escriberr.println("Bienvenido a la opcion vender pelicula");
                                          escribe.println("Ingrese su ID");
                                          int Id = Integer.parseInt(Leer.readLine());
                                          escribe.println("Ingrese el tipo");
                                          String tipo = Leer.readLine();
                                          if(tipo.isEmpty()){
                                              escriberr.println("No ingreso el tipo de pelicula");
                                              continue;
                                          }else{
                                              pel.venderPeli(Id, tipo);
                                              break;
                                          }
                                      }
                                      case 3:{
                                          escriberr.println("Bienvenido a la opcion buscar peliculas");
                                          Peliculas peliA = new Tipo_AA();
                                          escribe.println("Ingrese el Nombre de la pelicula");
                                          String Nombre = Leer.readLine();
                                          escribe.println("Ingrese el tipo de la pelicula");
                                          String Tipo = Leer.readLine();
                                          
                                          if(Nombre.isEmpty()&&Tipo.isEmpty()){
                                              escriberr.println("Debe ingresar todo");
                                              continue;
                                          }else{
                                              peliA.BuscarPeli(Nombre, Tipo);
                                              break;
                                          }
                                          
                                      }
                                      case 4:{
                                           Peliculas PelisA = new Tipo_AA();
                                           escriberr.println("Estas son todas ts peliculas tipo AA");
                                           PelisA.MostrarPelis();
                                           break;
                                      }
                                      case 5:{
                                          break;
                                      }
                                  }

                              }while(opcion!=5);

                               break;

                           }
                           case 4:{
                                 byte opcion =0;
                              do{
                                  escribe.println("Bienvenido a peliculas Clase B");
                                  escribe.println("1.- Agregar Peliculas");
                                  escribe.println("2.- Vender Pelicula");
                                  escribe.println("3.- Busccar Pelicula");
                                  escribe.println("4.- Ver Peliculas");
                                  escribe.println("5.- Ir al menu principal");
                                  opcion = Byte.parseByte(Leer.readLine());
                                  switch(opcion){
                                      case 1:{
                                          escriberr.println("Bienvenido a la opcion agregar peliculas");
                                           Peliculas b= new Tipo_B();
                                           escribe.println("Ingrese el ID");
                                           int ID = Integer.parseInt(Leer.readLine());
                                           escribe.println("Ingrese el Nombre");
                                           String Nombre = Leer.readLine();
                                           escribe.println("Ingrese el Tipo");
                                           String tipo= Leer.readLine();
                                           escribe.println("Ingrese el Categoria");
                                           String categoria = Leer.readLine();
                                           escribe.println("Ingrese el Duracion");
                                           float duracion = Float.parseFloat(Leer.readLine());
                                           escribe.println("Ingrese el Año");
                                           int Año = Integer.parseInt(Leer.readLine());
                                           escribe.println("Ingrese el Descripcion");
                                           String descripcion = Leer.readLine();
                                           if(Nombre.isEmpty()||tipo.isEmpty()||categoria.isEmpty()||descripcion.isEmpty()){
                                              escriberr.println("Debe de llenar todos los datos");
                                               continue;
                                           }else{

                                               Peliculas B = new Tipo_B(ID,Nombre,tipo,categoria,duracion,Año,descripcion);
                                               b.agregarPeli(B);
                                               System.err.println("La Pelicula se agrego.");

                                               break;
                                           }   
                                      }
                                      case 2:{
                                          Peliculas pel = new Tipo_B();
                                          escriberr.println("Bienvenido a la opcion vender pelicula");
                                          escribe.println("Ingrese su ID");
                                          int Id = Integer.parseInt(Leer.readLine());
                                          escribe.println("Ingrese el tipo");
                                          String tipo = Leer.readLine();
                                          if(tipo.isEmpty()){
                                              escriberr.println("No ingreso el tipo de pelicula");
                                              continue;
                                          }else{
                                              pel.venderPeli(Id, tipo);
                                              break;
                                          }
                                      }
                                      case 3:{
                                          escriberr.println("Bienvenido a la opcion buscar peliculas");
                                          Peliculas peliB = new Tipo_B();
                                          escribe.println("Ingrese el Nombre de la pelicula");
                                          String Nombre = Leer.readLine();
                                          escribe.println("Ingrese el tipo de la pelicula");
                                          String Tipo = Leer.readLine();
                                          
                                          if(Nombre.isEmpty()&&Tipo.isEmpty()){
                                              escriberr.println("Debe ingresar todo");
                                              continue;
                                          }else{
                                              peliB.BuscarPeli(Nombre, Tipo);
                                              break;
                                          }
                                          
                                      }
                                      case 4:{
                                           Peliculas PelisB = new Tipo_B();
                                           escriberr.println("Estas son todas ts peliculas tipo B");
                                           PelisB.MostrarPelis();
                                           break;
                                      }
                                      case 5:{
                                          break;
                                      }
                                  }

                              }while(opcion!=5);

                               break;
                           }
                           case 5:{
                            byte opcion =0;
                              do{
                                  escribe.println("Bienvenido a peliculas Clase B15");
                                  escribe.println("1.- Agregar Peliculas");
                                  escribe.println("2.- Vender Pelicula");
                                  escribe.println("3.- Busccar Pelicula");
                                  escribe.println("4.- Ver Peliculas");
                                  escribe.println("5.- Ir al menu principal");
                                  opcion = Byte.parseByte(Leer.readLine());
                                  switch(opcion){
                                      case 1:{
                                          escriberr.println("Bienvenido a la opcion agregar peliculas");
                                           Peliculas B15= new Tipo_B15();
                                           escribe.println("Ingrese el ID");
                                           int ID = Integer.parseInt(Leer.readLine());
                                           escribe.println("Ingrese el Nombre");
                                           String Nombre = Leer.readLine();
                                           escribe.println("Ingrese el Tipo");
                                           String tipo= Leer.readLine();
                                           escribe.println("Ingrese el Categoria");
                                           String categoria = Leer.readLine();
                                           escribe.println("Ingrese el Duracion");
                                           float duracion = Float.parseFloat(Leer.readLine());
                                           escribe.println("Ingrese el Año");
                                           int Año = Integer.parseInt(Leer.readLine());
                                           escribe.println("Ingrese el Descripcion");
                                           String descripcion = Leer.readLine();
                                           if(Nombre.isEmpty()||tipo.isEmpty()||categoria.isEmpty()||descripcion.isEmpty()){
                                              escriberr.println("Debe de llenar todos los datos");
                                               continue;
                                           }else{

                                               Peliculas v = new Tipo_B15(ID,Nombre,tipo,categoria,duracion,Año,descripcion);
                                               B15.agregarPeli(v);
                                               System.err.println("La Pelicula se agrego.");

                                               break;
                                           }   
                                      }
                                      case 2:{
                                          Peliculas pel = new Tipo_B15();
                                          escriberr.println("Bienvenido a la opcion vender pelicula");
                                          escribe.println("Ingrese su ID");
                                          int Id = Integer.parseInt(Leer.readLine());
                                          escribe.println("Ingrese el tipo");
                                          String tipo = Leer.readLine();
                                          if(tipo.isEmpty()){
                                              escriberr.println("No ingreso el tipo de pelicula");
                                              continue;
                                          }else{
                                              pel.venderPeli(Id, tipo);
                                              break;
                                          }
                                      }
                                      case 3:{
                                          escriberr.println("Bienvenido a la opcion buscar peliculas");
                                          Peliculas peliB15 = new Tipo_B15();
                                          escribe.println("Ingrese el Nombre de la pelicula");
                                          String Nombre = Leer.readLine();
                                          escribe.println("Ingrese el tipo de la pelicula");
                                          String Tipo = Leer.readLine();
                                          
                                          if(Nombre.isEmpty()&&Tipo.isEmpty()){
                                              escriberr.println("Debe ingresar todo");
                                              continue;
                                          }else{
                                              peliB15.BuscarPeli(Nombre, Tipo);
                                              break;
                                          }
                                          
                                      }
                                      case 4:{
                                           Peliculas Pelisbb = new Tipo_B15();
                                           escriberr.println("Estas son todas ts peliculas tipo B15");
                                           Pelisbb.MostrarPelis();
                                           break;
                                      }
                                      case 5:{
                                          break;
                                      }
                                  }

                              }while(opcion!=5);

                               break;


                           }
                           case 6:{
                              byte opcion =0;
                              do{
                                  escribe.println("Bienvenido a peliculas Clase C");
                                  escribe.println("1.- Agregar Peliculas");
                                  escribe.println("2.- Vender Pelicula");
                                  escribe.println("3.- Busccar Pelicula");
                                  escribe.println("4.- Ver Peliculas");
                                  escribe.println("5.- Ir al menu principal");
                                  opcion = Byte.parseByte(Leer.readLine());
                                  switch(opcion){
                                      case 1:{
                                          escriberr.println("Bienvenido a la opcion agregar peliculas");
                                           Peliculas c= new Tipo_C();
                                           escribe.println("Ingrese el ID");
                                           int ID = Integer.parseInt(Leer.readLine());
                                           escribe.println("Ingrese el Nombre");
                                           String Nombre = Leer.readLine();
                                           escribe.println("Ingrese el Tipo");
                                           String tipo= Leer.readLine();
                                           escribe.println("Ingrese el Categoria");
                                           String categoria = Leer.readLine();
                                           escribe.println("Ingrese el Duracion");
                                           float duracion = Float.parseFloat(Leer.readLine());
                                           escribe.println("Ingrese el Año");
                                           int Año = Integer.parseInt(Leer.readLine());
                                           escribe.println("Ingrese el Descripcion");
                                           String descripcion = Leer.readLine();
                                           if(Nombre.isEmpty()||tipo.isEmpty()||categoria.isEmpty()||descripcion.isEmpty()){
                                              escriberr.println("Debe de llenar todos los datos");
                                               continue;
                                           }else{

                                               Peliculas v = new Tipo_C(ID,Nombre,tipo,categoria,duracion,Año,descripcion);
                                               c.agregarPeli(v);
                                               System.err.println("La Pelicula se agrego.");

                                               break;
                                           }   
                                      }
                                      case 2:{
                                          Peliculas pel = new Tipo_C();
                                          escriberr.println("Bienvenido a la opcion vender pelicula");
                                          escribe.println("Ingrese su ID");
                                          int Id = Integer.parseInt(Leer.readLine());
                                          escribe.println("Ingrese el tipo");
                                          String tipo = Leer.readLine();
                                          if(tipo.isEmpty()){
                                              escriberr.println("No ingreso el tipo de pelicula");
                                              continue;
                                          }else{
                                              pel.venderPeli(Id, tipo);
                                              break;
                                          }
                                      }
                                      case 3:{
                                          escriberr.println("Bienvenido a la opcion buscar peliculas");
                                          Peliculas peliC = new Tipo_C();
                                          escribe.println("Ingrese el Nombre de la pelicula");
                                          String Nombre = Leer.readLine();
                                          escribe.println("Ingrese el tipo de la pelicula");
                                          String Tipo = Leer.readLine();
                                          
                                          if(Nombre.isEmpty()&&Tipo.isEmpty()){
                                              escriberr.println("Debe ingresar todo");
                                              continue;
                                          }else{
                                              peliC.BuscarPeli(Nombre, Tipo);
                                              break;
                                          }
                                          
                                      }
                                      case 4:{
                                           Peliculas Pelisc = new Tipo_C();
                                           escriberr.println("Estas son todas ts peliculas tipo C");
                                           Pelisc.MostrarPelis();
                                           break;
                                      }
                                      case 5:{
                                          break;
                                      }
                                  }

                              }while(opcion!=5);

                               break;

                           }
                           case 7:{
                               break;
                           }

                       }

                   }while(Opcion != 7);


               }catch(IOException ioe){
                   escriberr.println("----------------");
                   continue;
               }catch(NoSuchElementException nse){
                   escriberr.println("Presiono un enter");
                   continue;
               }catch(NumberFormatException nfe){
                   escriberr.println("los datos no son del tipo correcto");
                   continue;
               }
            if(Opcion == 7){
                break;
            }

        }while(true);  
    }
    
}
