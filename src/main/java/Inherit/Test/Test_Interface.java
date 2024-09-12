package Inherit.Test;


import Inherit.Models.Interface_Base.BaseDatos;
import Inherit.Models.Interface_Base.My_sql_inter;

public class Test_Interface {
    public static void main(String[] args) {
        BaseDatos obj = new My_sql_inter();
        obj.actualizar();
    }
}
