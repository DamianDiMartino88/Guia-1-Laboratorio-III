package com.company;

import com.Circulo.Circulo;
import com.Cuadrado.Cuadrado;
import com.Rectangulo.Rectangulo;
import com.Triangulo.Triangulo;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

	// Ejercicio 1


        int[] arregloDeNumeros = new int[10];
        int i=0, suma=0;
        double promedio;
        System.out.println("Ingrese 2 Numeros al Arreglo");
        System.out.println(arregloDeNumeros[0]);
        while (i<10){
           arregloDeNumeros[i]=(i<8)?(5*i):scan.nextInt();
            suma=suma+arregloDeNumeros[i];
            i++;
        }

        promedio=suma/arregloDeNumeros.length;
        System.out.println("El promedio de los numeros del Arreglo es: "+promedio);

        //Ejercicio 2
        System.out.println("INdique un numero para saber se es Par o Inpar?: ");

        int parInpar = scan.nextInt();
        System.out.println("El numero "+parInpar+" es "+((parInpar%2==0)?"Par":"Inpar"));

        //Ejercicio 3
        System.out.println("Los primeros 100 numeros primos son:");
        int primo;
        int contador=0;
        int n=1;
        while (contador<100){
            primo=0;
           for(i=1;i<=n;i++){
               if(n%i==0){
                   primo++;
               }
           }
        if(primo==2) {
            System.out.println(n);
            contador++;
        }
            n++;
        }


        //Ejercicio 4
        System.out.println("indique el Numero Maximo de numeros primosq quiere conocer ");
        int max=scan.nextInt();
        contador=0;
        n=1;
        while (contador<max){
            primo=0;
            for(i=1;i<=n;i++){
                if(n%i==0){
                    primo++;
                }
            }
            if(primo==2) {
                System.out.println(n);
                contador++;
            }
            n++;
        }


        //Ejercicio 6

        System.out.println("El siguiente numero es primo? ( 0 para terminar) : ");
        int numUs =scan.nextInt();
        n=1;
        while (numUs!=0){
            primo=0;
            n=1;
            for(i=1;i<=numUs;i++){
                if(numUs%i==0){
                    primo++;
                }
            }
            System.out.println((primo==2)?"El Numero "+numUs+" Es Primo":"El Numero "+numUs+" No Es Primo");
            System.out.println("El siguiente numero es primo? ( 0 para terminar) : ");
            numUs =scan.nextInt();
        }

        //Ejercicio 7
        suma=0;
        n=1;
        while (n<=10){
            suma+=n;
            n++;
        }
        System.out.println("La Suma de los primeros 10 numeros naturales es: "+suma);

        //Ejercicio 8
        n=0;
        suma=0;
        System.out.println("Ingrese un Numero una serie de numeros( 0 para terminar) : ");
        numUs =scan.nextInt();
        while (numUs!=0){
            suma++;
            System.out.println("Ingrese un Numero ( 0 para terminar) : ");
            numUs =scan.nextInt();
        }
        System.out.println("El Usuario ingreso: "+suma+" Numeros");

        //Ejercicio 9
        System.out.println("Ingrese un Año para saber si es Bisiesto ");
        numUs=scan.nextInt();
        System.out.println((numUs%4==0&&!(numUs%100==0))?"El Año "+numUs+" Es Bisiesto":"El Año "+numUs+" No Es Bisiesto");

        //Ejercicio 10
        System.out.println("Indique un caracter para saber su valor ASCII");
        char caracter=scan.next().charAt(0);
        int valorASCII=(int)caracter;
        System.out.println("El Valor ASCII del Caracter "+caracter+" Es: "+valorASCII);

        //Ejercicio 11
        double a=3.5,b=54;
        System.out.println("La Multiplicacion de "+a+" x "+b+" es:"+(a*b));

        //Ejercicio 12
        System.out.println("Elija El Area de Q Figura desea Calcular");
        System.out.println("1. Circulo");
        System.out.println("2. Cuadrado");
        System.out.println("3. Rectangulo");
        System.out.println("4. Triangulo");
        System.out.println("0. Salir");
        Scanner scan2=new Scanner(System.in);
        int eleccion=scan.nextInt();
        switch (eleccion){
            case 1:{
                System.out.println("Indique El Radio del Circulo, de la forma x,x");
                double radio=scan2.nextDouble();
                Circulo circulo= new Circulo(radio);
                System.out.println("El Area del Circulo es:"+circulo.areaCirculo());
            }break;

            case 2:{
                System.out.println("Indique El Radio del Cuadrado, de la forma x,x");
                Cuadrado cuadrado= new Cuadrado(scan.nextDouble());
                System.out.println("El Area del Cuadrado es:"+cuadrado.areaCuadrado());
            }break;

            case 3:{
                System.out.println("Indique La Base del Rectangulo, de la forma x,x");
                double base = scan.nextDouble();
                System.out.println("Indique La Altura del Rectangulo, de la forma x,x");
                double altura = scan.nextDouble();
                Rectangulo rectangulo= new Rectangulo(base,altura);
                System.out.println("El Area del Rectangulo es:"+rectangulo.areaRectangulo());
            }break;

            case 4:{
                System.out.println("Indique El Lado A, de la forma x,x");
                double ladoa = scan.nextDouble();
                System.out.println("Indique El Lado B, de la forma x,x");
                double ladob = scan.nextDouble();
                System.out.println("Indique El Lado C, de la forma x,x");
                double ladoc = scan.nextDouble();
                Triangulo triangulo= new Triangulo(ladoa,ladob,ladoc);
                System.out.println("El Area del Triangulo es:"+triangulo.areaTriangulo());

            }break;

            case 0:{
                System.out.println("Graciass.. Vuelva Prontoss");
            }
        }

        //Ejercicio 13
        /*

        ver porq el scanner no toma el double ni el String


         */
        System.out.println("Escriba su Nombre");
        String nombre=scan.next();
        System.out.println("Buenos Dias "+nombre);

        //Ejercicio 14

        System.out.println("Indique un Numero para calcular el Doble y el Triple:");
        int numero=scan.nextInt();
        System.out.println("Numero: "+numero+" Doble: "+(numero*2)+" Triple: "+(numero*3));

        //Ejercicio 15

        double gradosFarenheit;
        double gradosCelsius;
        System.out.println("Temperatura en Celsius a convertir:");
        gradosCelsius=scan.nextDouble();
        gradosFarenheit=(((gradosCelsius*9)/5)+32);
        System.out.println("El Equivalente en grados Farenheit de "+gradosCelsius+" Grados Celsius es: "+gradosFarenheit);

        //Ejercicio 16
        System.out.println("Indique Radio del Circulo para calcular la Longitud y el Area");
        Circulo circulo = new Circulo(scan.nextDouble());
        System.out.println("La Longitud del Circulo es: "+circulo.longitudCirculo()+" Y Su Area es: "+circulo.areaCirculo());

        //Ejercicio 17
        double km,metros;
        System.out.println("Indique Velocidad en Kilometros por Hora");
        km=scan.nextDouble();

        metros=km*1000;

        System.out.println("La Velocidad de "+km+" KM/H son: "+(metros/3600)+" Metros por Segundo");

        //Ejercicio 18
        double opuesto,adyacente, hipotenusa;
        System.out.println("Opuesto, de la forma x,x: ");
        opuesto=scan.nextDouble();
        System.out.println("Adyacente, de la forma x,x: ");
        adyacente=scan.nextDouble();
        hipotenusa=Math.sqrt(Math.pow(opuesto,2)+Math.pow(adyacente,2));

        System.out.println("Longitud de la Hipotenusa: "+hipotenusa);

        //Ejercicio 19
        Random ran = new Random();
        int maxTemp,minTemp;
        suma=0;
        int[] arregloDeTemperaturas = new int[30];
        arregloDeTemperaturas[0]=ran.nextInt(30);
        maxTemp=arregloDeTemperaturas[0];
        minTemp=arregloDeTemperaturas[0];
        suma+=arregloDeTemperaturas[0];
        i=1;
        while(i<30){
            arregloDeTemperaturas[i]=ran.nextInt(30);
            maxTemp=(arregloDeTemperaturas[i]>maxTemp)? arregloDeTemperaturas[i]:maxTemp;
            minTemp=(arregloDeTemperaturas[i]>minTemp)? arregloDeTemperaturas[i]:minTemp;
            suma+=arregloDeTemperaturas[i];
            i++;
        }

        System.out.println("El Promedio de las "+i+" Temperaturas es de: "+(suma/i));


        //Ejercicio 20
        int numeroAleatorio;
        int minAleatorio, maxAleatorio;
        int t =0;
        System.out.println("Indique numero Minimo: ");
        minAleatorio=scan.nextInt();
        System.out.println("Indique numero Maximo: ");
        maxAleatorio=scan.nextInt();
        while (t<10){
            System.out.println((int)(Math.random()*(maxAleatorio-minAleatorio+1)+minAleatorio));
            t++;
        }

        //Ejercicio 21
        System.out.println("Indique un dia de la Semana Para saber si es Laboral o no");
        String diaDeSemana=scan.next();
        switch (diaDeSemana){
            case "lunes":{
                System.out.println("Dia Laboral");
            }break;
            case "martes":{
                System.out.println("Dia Laboral");
            }break;
            case "miercoles":{
                System.out.println("Dia Laboral");
            }break;
            case "jueves":{
                System.out.println("Dia Laboral");
            }break;
            case "viernes":{
                System.out.println("Dia Laboral");
            }break;
            case "sabado":{
                System.out.println("Dia No Laboral");
            }break;
            case "domingo":{
                System.out.println("Dia No Laboral");
            }break;
        }


        //Ejercicio 22
        System.out.println("Ingrese un numero mayor que cero para saber el numero de cifras");
        int cifrasDelNumero=scan.nextInt();
        int cifras=0;
        while (cifrasDelNumero<=0){
            System.out.println("Debe Ingresar un numero mayor que 0");
            cifrasDelNumero=scan.nextInt();
        }
        while (cifrasDelNumero>0){
            cifrasDelNumero=cifrasDelNumero/10;
            cifras++;
        }
        System.out.println("El numero tiene "+cifras+" Cifras");

        //Ejercicio 23
        System.out.println("Esta es la Calculadora Polaca Inversa App");
        System.out.println("Ingrese dos numeros");
        int num1=scan.nextInt();
        int num2=scan.nextInt();
        System.out.println("Ingrese el signo de la Operacion a Realizar");
        String signo;
        signo=scan.next();
        switch (signo) {
            case "+": {
                System.out.println("La Suma de " + num1 + " + " + num2 + " Es: " + (num1 + num2));
            }
            break;
            case "-": {
                System.out.println("La Resta de " + num1 + " - " + num2 + " Es: " + (num1 - num2));
            }
            break;
            case "*": {
                System.out.println("La Multiplicacion de " + num1 + " + " + num2 + " Es: " + (num1 + num2));
            }
            break;
            case "/": {
                System.out.println("La Division de " + num1 + " / " + num2 + " Es: " + (num1 + num2));
            }
            break;
            case "^": {
                System.out.println("La Potencia de " + num1 + " Elevado a " + num2 + " Es: " + (Math.pow(num1, num2)));
            }
            break;
            case "%": {
                System.out.println("El Resto de la Division de " + num1 + " y " + num2 + " Es: " + (num1 % num2));
            }
            break;
        }

        //Ejercicio 23
        System.out.println("Nombre del Trabajador: ");
        String nombreTrabajador=scan.next();
        System.out.println("Edad del Trabajador: ");
        int edadTrabajador=scan.nextInt();
        System.out.println("Salario del Trabajador");
        double salarioTrabajador=scan.nextDouble();
        int opcion=0;
        if(edadTrabajador<16){
             opcion=1;
        }else if(edadTrabajador>=16&&edadTrabajador<19){
             opcion=2;
        }else if(edadTrabajador>=19&&edadTrabajador<=50){
             opcion=3;
        }else if(edadTrabajador>=51&&edadTrabajador<=60){
             opcion=4;
        }else if(edadTrabajador>60){
             opcion=5;
        }

        switch (opcion){
            case 1:{
                System.out.println(nombreTrabajador+" Todavia no esta en edad de trabajar");
            }break;
            case 2:{
                System.out.println(nombreTrabajador+" de "+edadTrabajador+" Años tiene un salario de: "+salarioTrabajador);
            }break;
            case 3:{
                System.out.println(nombreTrabajador+" de "+edadTrabajador+" Años tiene un salario de: "+(salarioTrabajador*1.05));
            }break;
            case 4:{
                System.out.println(nombreTrabajador+" de "+edadTrabajador+" Años tiene un salario de: "+(salarioTrabajador*1.1));
            }break;
            case 5:{
                System.out.println(nombreTrabajador+" de "+edadTrabajador+" Años tiene un salario de: "+(salarioTrabajador*1.15));
            }break;
            default:{
                System.out.println("Edad Incorrecta");
            }break;
        }

    }
}
