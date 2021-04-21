/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Edgar GZ
 */
public class GitHub {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Soy Edgar Eduardo");
        System.out.println("hellow my friends");
        
     
    int resultado = suma(5,10);
        
        System.out.println(resultado);
    }
     public static int suma (int inicio,int fin){
        if(fin>inicio) 
     return fin+suma(inicio,fin-1);
     
     else{
     return fin;
}
     }
}
