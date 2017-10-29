/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosswitch;

import java.util.Scanner;

/**
 *
 * @author Sofia
 */
public class EjerciciosResueltosSwitch {
    
/**
 * Se ingresa un mes del año, si es febrero o enero, mostrar el mensaje 
 * “Feliz verano” de lo contrario Informar “No es Verano”.
 * 
 * 
 */    
public static void Numero28()
{
    Scanner miSc = new Scanner(System.in);
        
        String mesDelAño;
        
        System.out.println("Ingrese el mes del año");
        mesDelAño = miSc.next();
        
        
        switch (mesDelAño) 
        {
            case "enero": 
                System.out.println("Feliz verano");
                break;
                
            case "febrero":
                System.out.println("Feliz verano");
                break;
            
            default:
                System.out.println("No es verano");
                break;
        }
        
        
        
    }  
               








/**
 * 
 * Se ingresa un mes del año, si es febrero o enero, mostrar el mensaje
 * “Iniciando el año” ,si esjunio o julio el mensaje” Mitad del año” y si es
 * diciembre el mensaje fin de año
 * 
 */    
public static void Numero29()
{

     Scanner miSc = new Scanner(System.in);
        
        String mesDelAño;
        
        System.out.println("Ingrese el mes del año");
        mesDelAño = miSc.next();
        
        switch(mesDelAño)
        {
            case "enero":
                System.out.println("Iniciando el año");
                break;
                
            case "febrero":
                System.out.println("Iniciando el año");
                break;
                
            case "junio":
                System.out.println("Mitad de año");
                break;
                
            case "julio":
                System.out.println("Mitad de año");
                break;
                
            case "diciembre":
                System.out.println("Fin de año");
                break;
        }
        
    


}





/**
 * Se ingresa un mes del año y si es Enero: "que comiences bien el año!” 
 * ,si es Marzo: "a clases!” , si es Julio: "se vienen las vacaciones!” ,
 * si es Diciembre: "Felices fiesta!”.
 * 
 * 
 */    
public static void Numero30()
{
    Scanner miSc = new Scanner(System.in);
        
        String mesDelAño;
        
        System.out.println("Ingrese el mes del año");
        mesDelAño = miSc.next();
        
        switch(mesDelAño)
        {
            case "enero":
                System.out.println("Que comiences bien el año");
                break;
                
            case "marzo":
                System.out.println("A clases");
                break;
                
            case "julio":
                System.out.println("Se vienen las vacaciones");
                break;
                
            case "diciembre":
                System.out.println("Felices Fiestas");
                break;    
            
        }



}





/**
 * Se ingresa un mes del año al seleccionar un mes informar: si tiene 28 días 
 *,si tiene 30 días, si tiene 31 días
 * 
 * 
 */    
public static void Numero31()
{

    Scanner miSc = new Scanner(System.in);
        
        String mesDelAño;
        
        System.out.println("Ingrese el mes del año");
        mesDelAño = miSc.next();
        
        switch(mesDelAño)
        {
            case "enero":
                System.out.println("Tiene 31 días");
                break;
                
            case "febrero":
                System.out.println("Tiene 28 días");
                break;
                
            case "marzo":
                System.out.println("Tiene 31 días");
                break;
                
            case "abril":
                System.out.println("Tiene 30 días");
                break;
                
            case "mayo":
                System.out.println("Tiene 31 días");
                break;
                
            case "junio":
                System.out.println("Tiene 30 días");
                break;
                
            case "julio":
                System.out.println("Tiene 31 días");
                break;
                
            case "agosto":
                System.out.println("Tiene 31 días");
                break;
                
            case "septiembre":
                System.out.println("Tiene 30 días");
                break;
                
            case "octubre":
                System.out.println("Tiene 31 días");
                break;
                
            case "noviembre":
                System.out.println("Tiene 30 días");
                break;
                
            case "diciembre":
                System.out.println("Tiene 31 días");
                break;
                
        }


}






/**
 * Al ingresar una hora del día, informar: si está entre las 7 y las 11:
 * "Es de mañana."
 * 
 * 
 */    
public static void Numero32()
{

    Scanner miSc = new Scanner(System.in);
        
        String datoAux;
        Double hora;
        
        System.out.println("Ingrese la hora");
        datoAux = miSc.next();
        hora = Double.parseDouble(datoAux);
        
        if (hora>7 && hora<11) {
            System.out.println("Es de mañana");
        }
    


}






/**
 * 
 * -al ingresar un signo del zodíaco devolver el nombre de la imagen 
 * asociada a ese signo
 * 
 */    
public static void Numero33()
{
    Scanner miSc = new Scanner(System.in);
        
        String signoZ;
        
        System.out.println("Ingresar su signo del zodíaco: ");
        signoZ = miSc.next();
        
        switch(signoZ)
        {
            case "aries":
                System.out.println("El Carnero");
                break;
                
            case "tauro":
                System.out.println("El Toro");
                break;
                
            case "geminis":
                System.out.println("Los Gemelos");
                break;
                
            case "cancer":
                System.out.println("El Cangrejo");
                break;
                
            case "leo":
                System.out.println("El León");
                break;
                
            case "virgo":
                System.out.println("La virgen");
                break;
                
            case "libra":
                System.out.println("La balanza");
                break;
                
            case "escorpio":
                System.out.println("El Escorpion");
                break;
                
            case "sagitario":
                System.out.println("El Arquero");
                break;
                
            case "capricornio":
                System.out.println("La Cabra");
                break;
                
            case "acurario":
                System.out.println("El Aguador");
                break;
                
            case "piscis":
                System.out.println("Los peces");
                break;
            
            
        }



}






/**
 * - Se pide un día de la semana, si es lunes mostrar el mensaje “Buen comienzo”
 * , para el resto de los días hábiles mostrar” a aguantar “ si es sábado o 
 * domingo mostrar “ Buen fin de”.
 * 
 * 
 */    
public static void Numero34()
{
    String diaSemana;
    Scanner miSc = new Scanner(System.in);
        
        System.out.println("Ponga día de la semana: ");
        diaSemana = miSc.next();
        
        switch(diaSemana)
        {
            case "lunes":
                System.out.println("Buen comienzo de semana");
                break;
            
            case "sabado":
                System.out.println("Buen finde");
                break;
                
            case "domingo":
                System.out.println("Buen finde");
                break;
                
            default:
                System.out.println("A aguantar");
                break;
        
        }



}






/**
 * Debemos hacer una serie de aplicaciones para este negocio
35- Las lámparas están al mismo precio de $35 pesos final.
A. Si compra 6 o más lamparitas bajo consumo tiene un descuento del 50%.
B. Si compra 5 lamparitas bajo consumo marca "ArgentinaLuz" se hace un descuento del
40 % y si es de otra marca el descuento es del 30%.
C. Si compra 4 lamparitas bajo consumo marca "ArgentinaLuz" o “FelipeLamparas” se hace
un descuento del 25 % y si es de otra marca el descuento es del 20%.
D. Si compra 3 lamparitas bajo consumo marca "ArgentinaLuz" el descuento es del 15%, si
es “FelipeLamparas” se hace un descuento del 10 % y si es de otra marca un 5%.
E. Si el importe final con descuento suma más de $120 se debe sumar un 10% de ingresos
brutos en informar del impuesto con el siguiente mensaje:”IIBB Usted pago X”, siendo X el
impuesto que se pagó.
 * 
 * 
 */    
public static void Numero35()
{
   Scanner miSc= new Scanner(System.in);
    Integer precioLamparas=35;
        Integer canLamparas;
        String auxCantidad;
        String marca;
        Integer PrecioBruto;
        Double PrecioFinal=(double)0;
        Double PrecioConIIBB;
        Double IIBB;
        
        System.out.println("Ingrese la marca que desea comprar");
        marca = miSc.next();
        
        System.out.println("Ingrese el número de lamparas que compra");
        auxCantidad = miSc.next();
        canLamparas = Integer.parseInt(auxCantidad);
        
        PrecioBruto = canLamparas * precioLamparas;
        
        if (canLamparas>5) {
            PrecioFinal = PrecioBruto * 0.5;
            
        }
        else
        {
            if (canLamparas==5) {
                switch(marca){
                    case "ArgentinaLuz":
                    PrecioFinal = PrecioBruto * 0.6; 
                    break;
                    
                    default:
                    PrecioFinal = PrecioBruto * 0.7;   
                }
            }
             else
        {
                if (canLamparas==4) 
                {
                    switch(marca){
                        case "ArgentinaLuz":
                        PrecioFinal = PrecioBruto * 0.75;
                        break;
                        
                        case "FelipeLamparas":
                        PrecioFinal = PrecioBruto * 0.75;
                        break;
                        
                        default:
                        PrecioFinal = PrecioBruto * 0.80;
                        break;
                    }
                }
        }
       
        }
        if (canLamparas==3) {
            switch(marca){
                case "ArgentinaLuz":
                PrecioFinal = PrecioBruto * 0.85;
                break;
                
                case "FelipeLamparas":
                PrecioFinal = PrecioBruto * 0.90;
                break;
                
                default:
                PrecioFinal = PrecioBruto * 0.95;
                break;
            }
                    
        }
        
        
        
        if (PrecioFinal<120) {
                System.out.println("Debe pagar " + PrecioFinal);
            }else {
            PrecioConIIBB = PrecioFinal * 1.10;
            IIBB = PrecioConIIBB - PrecioFinal;
                System.out.println("Usted pagó " + PrecioConIIBB + " siendo " + IIBB + " el impuesto que pagó");
            }
        
    }
        
    }




