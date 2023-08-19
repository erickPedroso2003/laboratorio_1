
package laboratorio_1;

public class Laboratorio_1 {

    
    public static void main(String[] args)
    {
        Persona ref =new Persona();
        ref.setApellido("PEDROSO GUZMAN");
        ref.setDni(         "73019889");
        ref.setNombre(    "ERICK JUVENAL");
        ref.setEdad(       20);
        String escrib =ref.Datos();
        System.out.print(escrib);
    }
    
}
