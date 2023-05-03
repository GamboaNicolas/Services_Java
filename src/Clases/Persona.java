
package Clases;

/**
 *
 * @author Nicolas
 */
public class Persona {
    
//    atributos
    
    private String nombre;
    private byte edad;
    private String sexo;
    private double peso;
    private double altura;
    
    
    
//    contructores
    
    public Persona(){
    }

    public Persona(String nombre, byte edad, String sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }
    
    

    
//    getters y setters
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }
    

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    
    
}
