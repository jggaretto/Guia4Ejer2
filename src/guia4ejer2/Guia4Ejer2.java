/*
En Java, Crear una superclase llamada Electrodoméstico con los siguientes atributos: precio, color,
consumo energético (letras entre A y F) y peso.
Los constructores que se deben implementar son los siguientes:
• Un constructor vacío.
• Un constructor con todos los atributos pasados por parámetro.
Los métodos a implementar son:
• Métodos getters y setters de todos los atributos.
• Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta, sino es
correcta usara la letra F por defecto. Este método se debe invocar al crear el objeto y no será visible.
9

• Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es, usa el
color blanco por defecto. Los colores disponibles para los electrodomésticos son blanco, negro,
rojo, azul y gris. No importa si el nombre está en mayúsculas o en minúsculas. Este método se
invocará al crear el objeto y no será visible.
• Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del precio.
Esta es la lista de precios:

Letra | Precio
______|________
A     | $1000
______|________
B     | $800
______|________
C     | $600
______|________
D     | $500
______|________
E     | $300
______|________
F     | $100
______|________


Peso                | Precio
____________________|________
Entre 1 y 19 kg     | $100
____________________|________
Entre 20 y 49 kg    | $500
____________________|________
Entre 50 y 79 kg    | $800
____________________|________
Mayor que 80 kg     | $1000
____________________|________

A continuación se debe crear una subclase llamada Lavadora, con el atributo carga, además de los
atributos heredados.
Los constructores que se implementarán serán:
• Un constructor vacío.
• Un constructor con la carga y el resto de atributos heredados. Recuerda que debes llamar al
constructor de la clase padre.
Los métodos que se implementara serán:
• Método get y set del atributo carga.
• Método precioFinal(): este método será heredado y se le sumará la siguiente funcionalidad. Si
tiene una carga mayor de 30 kg, aumentará el precio en $500, si la carga es menor o igual, no se
incrementará el precio. Este método debe llamar al método padre y añadir el código necesario.
Recuerda que las condiciones que hemos visto en la clase Electrodoméstico también deben afectar
al precio.
10
Se debe crear también una subclase llamada Televisor con los siguientes atributos: resolución (en
pulgadas) y sintonizador TDT (booleano), además de los atributos heredados.
Los constructores que se implementarán serán:
• Un constructor vacío.
• Un constructor con la resolución, sintonizador TDT y el resto de atributos heredados. Recuerda
que debes llamar al constructor de la clase padre.
Los métodos que se implementara serán:
• Método get y set de los atributos resolución y sintonizador TDT.

• Método precioFinal(): este método será heredado y se le sumará la siguiente funcionalidad. Si el
televisor tiene una resolución mayor de 40 pulgadas, se incrementará el precio un 30% y si tiene un
sintonizador TDT incorporado, aumentará $500. Recuerda que las condiciones que hemos visto en
la clase Electrodomestico también deben afectar al precio.
Finalmente, en el main debemos realizar lo siguiente:
Vamos a crear una Lavadora y un Televisor y llamar a los métodos necesarios para mostrar el precio
final de los dos electrodomésticos.
 */
package guia4ejer2;


public class Guia4Ejer2 {

    
    public static void main(String[] args) {
        Lavadora lavadora = new Lavadora(35, 500, "blanco", 'A', 50);
        Televisor televisor = new Televisor(50, true, 800, "negro", 'D', 30);
        //Lavadora
        System.out.println("Detalles de la lavadora:");
        System.out.println("Precio: $" + lavadora.getPrecio());
        System.out.println("Color: " + lavadora.getColor());
        System.out.println("Consumo energético: " + lavadora.getConsumoEnergetico());
        System.out.println("Peso: " + lavadora.getPeso() + " kg");
        System.out.println("Carga: " + lavadora.getCarga() + " kg");
        System.out.println("Precio final: $" + lavadora.precioFinal());

        System.out.println();
        //Televisor
        System.out.println("Detalles del televisor:");
        System.out.println("Precio: $" + televisor.getPrecio());
        System.out.println("Color: " + televisor.getColor());
        System.out.println("Consumo energético: " + televisor.getConsumoEnergetico());
        System.out.println("Peso: " + televisor.getPeso() + " kg");
        System.out.println("Resolución: " + televisor.getResolucion() + " pulgadas");
        System.out.println("Sintonizador TDT: " + (televisor.hasSintonizadorTDT() ? "Sí" : "No"));
        System.out.println("Precio final: $" + televisor.precioFinal());
    }
    
}
