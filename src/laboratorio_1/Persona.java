
package laboratorio_1;

public class Persona 
{
    
    private String Nombre;
    private String Apellido;
    private String Dni;
    private int Edad;
    
    public String getNombre() {
        if(this.Nombre==null)
            return "SIN NOMBRE";
        return Nombre;
    }
    public Persona(String Nombre, String Apellido, String Dni) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Dni = Dni;
    }

    public Persona ()
    {
        
    }
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

   
    public String getApellido() {
         if(this.Apellido==null)
            return "SIN APELLIDO";
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getDni() {
         if(this.Dni==null)
            return "SIN DNI";
        return Dni;
    }

    
    public void setDni(String Dni) {
        this.Dni = Dni;
    }


    public int getEdad() {
        return Edad;
    }

  
    public void setEdad(int Edad) {
        this.Edad = Edad;
    }
 
   
    public String Datos()
    {
        return 
                "NOMBRE   : "+Persona.this.getNombre()
                +"\nAPELLIDO : "+Persona.this.getApellido()
                +"\nDNI      : "+Persona.this.getDni()
                +"\nEDAD     : "+Persona.this.getEdad();
                
    }

}
