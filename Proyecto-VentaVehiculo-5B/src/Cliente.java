/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ruben
 */
public class Cliente {
    private String rs;
private String rfc;
private String email;
public Cliente(String rs,String rfc, String email){
    this.rs=rs;
    this.rfc=rfc;
    this.email=email;
    }
@Override 
public String toString(){
    String cadena;
    cadena="RS = "+this.rs+"\n"+
    "RFC = "+this.rfc+"\n"+
    "Email = "+this.email+"\n";
    
    return cadena;
}
}
    

