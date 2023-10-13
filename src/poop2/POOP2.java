/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop2;

/**
 *
 * @author Eduardo, Adolfo, Mariana
 */
public class POOP2 {

    /**
     *  
     * La clase POOP2 demuestra el uso de los principales enunciados del contro 
     * de flujo de Java
     */
    public static void main(String[] args) {
        System.out.println("Hola mundo");
        System.err.println("Hola mundo");
        
        /**
         * @param El enunciado if permite ejecutar un bloque de código 
         * si una condición específica se evalúa como verdadera.
         */
        System.out.println("############## if ##############");
        int a;
        a = 15;
        int b = 10;
        if (a<b) {
            System.out.println("a es menor que b");
        } else if (a==b){
            System.out.println("a es igual a b");
        }else{
            System.out.println("a es mayor que b");
        }
        /**
         * @param El enunciado else if permite ejecutar un bloque de código 
         * si una condición específica se evalúa como verdadera, pero solo si 
         * otra condición anterior se evalúa como falsa.
         */
        System.out.println("############## if ##############");
        if(menor(a,b)){
            System.out.println("metodo menor retorna true");
        }else{
            System.out.println("metodo menor retorna false");
        }
        /**
         * @param El enunciado switch permite ejecutar un bloque de código 
         * específico en función del valor de una variable.
         */
        
        System.out.println("############## Switch ##############");
        int dia = 1;
        switch (dia) {
            case 1: 
                System.out.println("Domingo"); 
                break;
            case 2: System.out.println("Lunes"); break;
            case 3: System.out.println("Martes"); break;
            case 4: System.out.println("Miercoles"); break;
            case 5: System.out.println("Jueves"); break;
            case 6: System.out.println("Viernes"); break;
            case 7: System.out.println("Sabado"); break;
            default:
                System.out.println("Día incorrecto");
        }
        System.out.println("############## Switch ##############");
        char vocal = '9';
        switch (vocal) {
            case 'a': System.out.println("Seleccionó vocal a"); break;
            case 'e': System.out.println("Seleccionó vocal e"); break;
            case 'i': System.out.println("Seleccionó vocal i"); break;
            case 'o': System.out.println("Seleccionó vocal o"); break;
            case 'u': System.out.println("Seleccionó vocal u"); break;
            default:
                System.out.println("No se seleccionó una vocal");
        }
        /**
         * @param El enunciado while permite ejecutar un bloque de código 
         * repetidamente mientras una condición específica
         * se evalúa como verdadera.
         */
        System.out.println("############## While ##############");
        int n=0;
        while (n<10) {
            System.out.println("Contando hacia arriba n="+n);
            n++;
        }
        while (n>0) {
            System.out.println("Contando hacia abajo n="+n);
            n--;
        }
        System.out.println("n="+n);
        /**
         * @param El enunciado do-while es similar al enunciado while, 
         * pero el bloque de código se ejecuta al menos una vez, incluso si
         * la condición se evalúa como falsa. 
         */
        
        System.out.println("############## Do-While ##############");
        do {            
            System.out.println("Contando hacia abajo");
            n--;
        } while (n>0);
        System.out.println("n="+n);
        /**
         * @param El enunciado for permite ejecutar un bloque de código 
         * repetidamente un número determinado de veces. 
         */
        
        System.out.println("############## For ##############");
        for (int i = 0; i < 10; i++) {
            System.out.println("Contando hacia arriba "+i);  
        }
        
        for (int i = 10; i > 0; i--) {
            System.out.println("Contando hacia abajo " + i);
        }
        
        System.out.println("############## For ##############");
        int[] miArreglo = {1,2,3,4,5};
        int numElementos = miArreglo.length;
        System.out.println("miArreglo tiene "+numElementos+" elementos");
        int[] miArreglo2 = new int[10];
        numElementos = miArreglo2.length;
        System.out.println("miArreglo2 tiene "+numElementos+" posiciones");
        for (int i = 0; i < miArreglo2.length; i++) {
            miArreglo2[i] = i*10;
        }
        for (int i = 0; i < miArreglo2.length; i++) {
            System.out.println("miArreglo2["+i+"]="+miArreglo2[i]);
        }
        for (int i = 0; i < miArreglo2.length; i++) {
            int j = miArreglo2[i];
            System.out.println("Mapeo en porcentaje "+j+"%");
        }
        /**
         * @param El enunciado for-each permite iterar sobre una colección de 
         * elementos y ejecutar un bloque de código para cada elemento 
         * de la colección.
         */
        
        System.out.println("############## For-each ##############");
        for (int i : miArreglo2) {
            System.out.println("Hackeando la nasa "+i+"%");
        }
    }

    private static boolean menor(int x, int y) {
        return x<y;
    }
    
}
