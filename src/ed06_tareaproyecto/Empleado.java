/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed06_tareaproyecto;

/**
 *
 * @author ED06
 */
public class Empleado 
{

    /**
     * @return the dni
     * Getter para dni
     */
    public String getDni() {
        return dni;
    }

    /**
     * @param dni the dni to set
     * Setter para dni
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * @return the nombre
     * Getter para nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     * Setter para nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the direccion
     * Getter para direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     * Setter para direccion
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the cargo
     * Getter para cargo
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * @param cargo the cargo to set
     * Setter para cargo
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    /**
     * @return the numHijos
     * Getter para numHijos
     */
    public int getNumHijos() {
        return numHijos;
    }

    /**
     * @param numHijos the numHijos to set
     * Setter para numHijos
     */
    public void setNumHijos(int numHijos) {
        this.numHijos = numHijos;
    }
    
    /**
     * Dni del empleado
     */
    private String dni;
    /**
     * Nombre del empleado
     */
    private String nombre;
    /**
     * Direccion del empleado
     */
    private String direccion;
    /**
     * Cargo del empleado
     */
    private String cargo;
    /**
     * Numero de hijos del empleado
     */
    private int numHijos;
    
    /**
     *
     * @param dni
     * @param nombre
     * Contructor de clase empleado
     */
    public Empleado (String dni, String nombre)
    {
        this.dni=dni;
        this.nombre=nombre;
        this.cargo="EMPLEADO";
        this.numHijos=0;
    }
    
    /**
     *
     * @param base
     * @return
     * Metodo para calcular el sueldo total del empleado
     */
    public double calcula_sueldo(double base)
    {
        double total=base;
        
        switch (cargo)
        {
            case "ENCARGADO":
                total+=300;
                break;
                
            case "DIRECTOR":
                total+=1000;
                break;
                
            default:
                total+=0;
        }    

        if(getNumHijos()>=3)
            total+=getNumHijos()*50;
        return total;
    }
}
