/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author joshi
 */
public class Paciente extends Persona {
    private String dni;
    private String telefono;
    private String sexo;
    
    public Paciente() {
        
    }
    

    public Paciente(String dni, String telefono, String sexo, String nombre) {
        super(nombre);
        this.dni = dni;
        this.telefono = telefono;
        this.sexo = sexo;
    }
    

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setsexo(String masculino) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public String getTexto(){
      return this.nombre+" "+this.dni+" "+this.telefono+" "+this.sexo;
    }
    
    
}
