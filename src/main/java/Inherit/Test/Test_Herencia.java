package Inherit.Test;


import Inherit.Models.Herencia.Clase_Hija;
import Inherit.Models.Herencia.Clase_Padre;

public class Test_Herencia {
    public static void main(String[] args) {
        Clase_Padre obj = new Clase_Hija("Pedro", 15, 'm', "humano");
        System.out.println(obj);
        obj.saludar();
    }
}
