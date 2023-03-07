/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.api.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Aprendiz
 */
@RestController
public class ApiRest {
    
    @GetMapping("/Hola")
    public String hola(){
        return "Hola Rest";
    }
    
    @GetMapping("/sumar/{numero1}/{numero2}")
    public Integer sumar(@PathVariable Integer numero1, @PathVariable Integer numero2){
        return numero1 + numero2;
    }
    
    @GetMapping("/restar")
    public Integer restar(@RequestParam Integer numero1, @RequestParam Integer numero2){
        return numero1 + numero2;
    }
    
    @GetMapping("/salario/{numero1}/{numero2}") 
    public Integer total(@PathVariable Integer numero1, @PathVariable Integer numero2){
        int numero3; 
        int numero4 = 0;
        if(numero2 == 1){
            //Resultado 1
            numero3 = numero1 * 5 / 100;
            numero4 = numero1 + numero3;
        }
        if(numero2 == 2){
            //Resultado 2
            numero3 = numero1 * 10 / 100;
            numero4 = numero1 + numero3;

        }
        if(numero2 == 3){
            //Resultado 3
            numero3 = numero1 * 15 / 100;
            numero4 = numero1 + numero3;

        }
        if(numero2 == 4){
            //Resultado 4
            numero3 = numero1 * 20 / 100;
            numero4 = numero1 + numero3;

        }
        if(numero2 == 5){
            //Resultado 5
            numero3 = numero1 * 25 / 100;
            numero4 = numero1 + numero3;

        }
        return numero4;
    }
}
