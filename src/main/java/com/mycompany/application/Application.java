package com.mycompany.application;

import entities.Funcionario;

public class Application {
    public static void main(String[] args) {
         
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Luks");
        funcionario.setCpf("000.000.000-00");
        funcionario.setCargo("Programador mobile Flutter");
        funcionario.setSalario(10000.00);
   
        System.out.println(funcionario);  
    }
}
