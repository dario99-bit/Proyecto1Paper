/*
Diseño e Implementación de un algoritmo que me permita predecir el comportamiento
de emisiones de óxidos de nitrógeno (NOx) de un motor de combustión interna.

Descripción:
Mediante el uso de dos tipos de redes neuronales artificiales RBF y LOLIMOT
se desarrollo un modelo de las emisiones del motor de combustión interna,
se basa en la suma de productos de los modelos locales lineales.
 */
package proyecto_paper1;
//import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.String;
import java.util.Scanner;
import java.util.*;
/**
 *
 * @author Dario Chisaguano
 */
public class Proyecto_Paper1 {

  public static String Especificar_motor_combustion_interna(String tipo_motor, String modelo_motor, String marca_motor){
    String Especificaciones_motor = "\n El tipo de motor en el que se va a realizar los ensayos es un: " + tipo_motor + " "
                                  + "que tiene como modelo descrito " + modelo_motor +
                                    "\n a nombre de la marca " + marca_motor + "";

 return Especificaciones_motor;
    }

    public static String Determinar_puntos_operacion_motor(String tipo_operacion, String modo_operacion, String condicion_operacion ){

   String Punto_operacion = "\n Este motor tiene un tipo de opreracion : " + tipo_operacion +
           " con un modo de operacion :" +modo_operacion + "en condiciones "+condicion_operacion + "" ;


    return Punto_operacion;
}

    public static String Identificar_coeficiente_correlacion_red_neuronal(String tipo_coeficiente, int valor_coeficiente){

        int coeficiente = 9998;

        valor_coeficiente = coeficiente;

        String Coeficiente_numerico = "\nSe puede predecir las emisiones con el siguiente tipo:" + tipo_coeficiente
                + " que que llega a tener un valor de:" + valor_coeficiente + " relación";

        return Coeficiente_numerico;
    }

    public static String Comparar_dotos_medidos_establecidos(int valor_dato, String tipo_comparacion_dato){

        String Capa_entrada = "\nLos valores de las emisiones de gases contaminantes ya viene establecido por el fabricante, "
                + "\npor lo que cada marac y modelo tiene un valor especifico de emison de gases, "
                + "\npor ejemplo tenemos: " + tipo_comparacion_dato + " que posee una cantidad determinada  "
                + "\nde gramos de monóxido de nitrogeno a emitir" + valor_dato +"" ;

        return Capa_entrada;
    }

    public static String Reconocer_variables_capa_entrada( int valor_variable, int cantidad_variable_entrada){
        String Capa_entrada = "\tProecedimiento: "
                + "\n\nDespués de recolectar todos los datos del vehículo y sus especificaciones  "
                + "\nobtenemos que el valor de entrada es: " + valor_variable +"% la"
                + "\ncantidad obtenida fue de " + cantidad_variable_entrada + " de emisiones ";

        return Capa_entrada;
    }

     public static String Identificar_numero_datos_capa_oculta( int tipo_dato_oculto, int valor_dato_oculto){
        String Capa_oculta = "\tDatos en la capa oculta de la red neuronal: "
                + "\n\nUna vez ingresado las varibles por la capa de entrada  "
                + "\nse obtiene los siguientes tipos de datos en dicha capa" + tipo_dato_oculto +" el"
                + "\ndato oculto fue de " + valor_dato_oculto + "";

        return Capa_oculta;
    }

    public static String Comparar_modelos_Rbf_Lolimot( int tipo_modelo, int cantidad_modelo){
        String Modelos = "\tComparación entre Redes Neuronales: "
                + "\n\nDespués nuestro modelo neuronal realiza la comparación "
                + "\nlos modelos locales lineales " + tipo_modelo +"la"
                + "\ncomparación se lleva a cabo con la suma de productos en base radial " + cantidad_modelo + " ";

        return Modelos;
    }

    public static String Comparar_datos_salida_entrada( int tipo_dato_salida, int cantidad_dato_salida){
        String  Datos_salida = "\tResultados de salida: "
                + "\n\nDespués de todo el proceso realizado "
                + "\nse llega al final de análisis de los gases emitidos con tipo: " + tipo_dato_salida +"la "
                + "\ncantidad  de contaminante es:" + cantidad_dato_salida + "%";

        return Datos_salida;
    }

    public static String Precisar_valor_emision_mediante_capa_salida( int valor_emision, int cantidad_emision){
        String  Emision = "\tRESUSLTADOS FINALES: "
                + "\n\nDespués de todo el proceso ejecutado y realizado por medio de las "
                + "\nredes neuronales se obtiene un valor de: " + valor_emision +"% la"
                + "\ncual es posible predecir la cantidad de :  " + cantidad_emision + " % monóxido de Nitrógeno hacia la Atmósfera";

        return Emision;
    }


public static void verificar(int valor_variable, int cantidad_variable_entrada, int valor_dato,
        String tipo_motor, String modelo_motor, String marca_motor, String tipo_comparacion_dato,
        String tipo_sensor, int rapidez_pulso, String tipo_operacion, String modo_operacion,
        String condicion_operacion, int tipo_dato_oculto, int valor_dato_oculto,int tipo_modelo, int cantidad_modelo
        , int tipo_dato_salida, int cantidad_dato_salida, int valor_emision, int cantidad_emision){

   int coeficiente_relacion = 9998;
   int oxido_nitrogeno = 600;

    if (coeficiente_relacion >= oxido_nitrogeno){

        System.out.println(Reconocer_variables_capa_entrada( valor_variable, cantidad_variable_entrada));
        System.out.println(Especificar_motor_combustion_interna( tipo_motor, modelo_motor, marca_motor));
        System.out.println(Comparar_dotos_medidos_establecidos( valor_dato, tipo_comparacion_dato));
        System.out.println(Identificar_coeficiente_correlacion_red_neuronal( tipo_sensor, rapidez_pulso));
        System.out.println(Determinar_puntos_operacion_motor( tipo_operacion, modo_operacion, condicion_operacion  ));
        System.out.println(Identificar_numero_datos_capa_oculta( tipo_dato_oculto, valor_dato_oculto));
        System.out.println(Comparar_datos_salida_entrada( tipo_dato_salida, cantidad_dato_salida));
        System.out.println(Precisar_valor_emision_mediante_capa_salida( valor_emision, cantidad_emision));


    }else{
        System.out.println("Se procede a verificar todos los datos obtenidos");
    }

}

    public static void main(String[] args) {
        // TODO code application logic here
        int valor_variable = 6;
        int cantidad_variable_entrada = 4;
        int valor_dato = 80;
        String tipo_comparacion_dato = "Alto parámetro de rendimiento";
        String marca_motor="Chevrolet";
        String tipo_motor="Motor a gasolina de cuatro cilindros";
        String modelo_motor="Z16SE 2005";
        String tipo_gas=" Contaminante";
        int revoluciones_minuto= 3200;
       String tipo_operacion="secuencial";
       String modo_operacion="Depende del angulo del acelerador";
       String condicion_operacion="Bajo condiciones ideales";
        int tipo_dato_oculto= 10;
        int valor_dato_oculto=4;
        int tipo_modelo= 3;
        int cantidad_modelo=6;
        int tipo_dato_salida=5;
        int cantidad_dato_salida=68;
        int valor_emision=58;
        int cantidad_emision=60;
        verificar ( valor_variable, cantidad_variable_entrada, valor_dato, tipo_motor,
                modelo_motor, marca_motor, tipo_comparacion_dato, tipo_gas, revoluciones_minuto,tipo_operacion,
                modo_operacion, condicion_operacion,tipo_dato_oculto, valor_dato_oculto, tipo_modelo, cantidad_modelo
                ,tipo_dato_salida, cantidad_dato_salida, valor_emision, cantidad_emision);

    }

}
