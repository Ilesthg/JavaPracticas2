package Inherit.Test;


import Inherit.Models.FigurasModel.FigureGeoAbs;
import Inherit.Models.FigurasModel.RectanguloAbs;

public class TestABS {

    public static void main(String[] args) {
        FigureGeoAbs figura = new RectanguloAbs("Rectangulo ");
        System.out.println(figura);
        figura.dibujar();
    }
}