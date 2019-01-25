/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   main.c
 * Author: kbarreto001
 *
 * Created on January 25, 2019, 4:04 PM
 */

#include <stdio.h>
#include <stdlib.h>

#define PI 10//variables globales, constantes

int main() 


//uso de scanf
/*{
    int x;
            
    printf("Introduzca un valor:\n");
    scanf("%i",&x);
    //x = x + PI;//es lo mismo que la siguiente linea
    x += PI;
    printf("El valor es: %i\n",x);
        
    return (EXIT_SUCCESS);
}*/

//uso de fgets solo para leer texto
/*{
  char name[10];

  printf("Who are you? ");
  fgets(name,10,stdin);//lee hasta que llega un /n o 10 caracteres
  printf("Glad to meet you, %s",name);
  
  return (EXIT_SUCCESS);
}*/

//ops basicas
/*{
    int x,y,z;
    
    x = 20;
    y = 10;
    
    z = x % y;// sirve para sumar restar dividir y multiplicar.
    printf("Operacion modulo (x mod y): %i",z);
      
    return (EXIT_SUCCESS);
}*/

//Operadores de incremento
{
    int x;
    x++;
    printf("El valor de X es: %i",x);
            
}