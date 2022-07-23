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
import java.util.Objects;
import java.util.StringTokenizer;

/**
 *
 * @author Julio
 */
public abstract class Peliculas {
    int ID;
    String Nombre;
    String Tipo ;
    String Categoria;
    float Duracion;
    int Año;
    String Descripcion;

    
    public Peliculas() {
    }
    
    public Peliculas(int ID, String Nombre, String Tipo, String Categoria, float Duracion, int Año, String Descripcion) {
        this.ID = ID;
        this.Nombre = Nombre;
        this.Tipo = Tipo;
        this.Categoria = Categoria;
        this.Duracion = Duracion;
        this.Año = Año;
        this.Descripcion = Descripcion;
    }

 
    public int getID() {
        return ID;
    }

    public float getDuracion() {
        return Duracion;
    }

    public int getAño() {
        return Año;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public String getTipo() {
        return Tipo;
    }

    public String getCategoria() {
        return Categoria;
    }
 
    /**
     *
     * @param object
     * @throws java.io.FileNotFoundException
     */
    public abstract void agregarPeli(Peliculas object)throws FileNotFoundException, IOException, NumberFormatException;
   
    public abstract void venderPeli(int id, String Tipo)throws  IOException;
    public abstract void MostrarPelis() throws IOException;
    public abstract void BuscarPeli(String Nombre, String Tipo) throws IOException;
    @Override
    public String toString() {
        return "Peliculas" +"\n" +  "ID: " + ID +"\n"+ "Duracion: " + Duracion +"\n"+ "A\u00f1o: " + Año+"\n" + "Nombre: " + Nombre+"\n"  + "Tipo: " + Tipo+"\n" + "Categoria: " + Categoria + "\n"+ "Descripcion: " + Descripcion+"\n";
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Peliculas other = (Peliculas) obj;
        if (this.ID != other.ID) {
            return false;
        }
        if (Float.floatToIntBits(this.Duracion) != Float.floatToIntBits(other.Duracion)) {
            return false;
        }
        if (this.Año != other.Año) {
            return false;
        }
        if (!Objects.equals(this.Nombre, other.Nombre)) {
            return false;
        }
        if (!Objects.equals(this.Descripcion, other.Descripcion)) {
            return false;
        }
        if (!Objects.equals(this.Tipo, other.Tipo)) {
            return false;
        }
        if (!Objects.equals(this.Categoria, other.Categoria)) {
            return false;
        }
        return true;
    }
    public abstract int getTotal() throws IOException;  
   
}
