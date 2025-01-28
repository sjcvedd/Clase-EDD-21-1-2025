/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package claseonline211;

/**
 *
 * @author Silver
 */
class Persona{
    String nombre, numero;
    void darNombre(){
        System.out.println("Saludos, Mi nombre es: " + this.nombre);
    }
}
class Estudiante extends Persona{
    String codigoBiblioteca,codigoCarnet;

    Estudiante() {
    }

    Estudiante(String Nombre, String Numero, String CBib, String CCar) {
        this.nombre = Nombre;
        this.numero = Numero;
        this.codigoBiblioteca = CBib;
        this.codigoCarnet = CCar;
    }
    
    void darCarnet(){
        System.out.println("Saludos, Mi nombre es: " + this.nombre + " y mi numero de carnet es: " +this.codigoCarnet);
    }
}

public class ClaseOnline211 {
    
    public static void main(String[] args) {
        int a,b,c; // a,b,c : integer
        Persona edson = new Persona();
        //Estudiante jose = new Estudiante();
        Estudiante jose = new Estudiante("Jose Daniel Mora Alu","04245048789","123456","20005");
        Estudiante Pedro = new Estudiante("Pedro Ruiz","04265048789","112356","20105");
        /*jose.nombre = "Jose Daniel Mora Alu";
        jose.numero = "04245048789";
        jose.codigoBiblioteca = "123456";
        jose.codigoCarnet = "20005";*/
        jose.darCarnet();
        Pedro.darCarnet();
        a=1;//a:=1
        b=2;//a:=1
        c=1;//a:=1
        /*if (a==c) { // a=b
            System.out.println("verdadero");
        }else{
            System.out.println("falso");
        }*/
        /*if (a!=c) { // ab
            System.out.println("verdadero");
        }else{
            System.out.println("falso");
        }*/
        /*switch (a) { //case a of
            case 1:
                
                break;
            case 2:
                
                break;
            case 3:
                
                break;
            default:
                throw new AssertionError();
        }*/
        // i++ = i:=i+1 (pascal) = i= i+1 = i+=1
        /*for (int i = 0; i < 10;i+=2) { // for i:=1 to 10 do
            System.out.println(i);
        }*/
        /*int i=0;
        while (i == 0){ // <--  while (i=0) -> while(true)
            
        }
        */
        /*
        do { // repeat
            
        } while (false); //until
        */
        //System.out.println("Hola mundo");
        // TODO code application logic here
    }
    
}
