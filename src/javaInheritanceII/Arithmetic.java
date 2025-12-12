package javaInheritanceII;

public class Arithmetic {
	    int add(int a, int b) {
	        return a + b;
	    }
	}

   class Adder extends Arithmetic {
	    // La clase Adder hereda el método add de la clase Arithmetic

	public class Solution {
	    public static void main(String []args){
	        
	        // Crear un objeto de la clase Adder, que es un Arithmetic por herencia.
	        Adder a = new Adder();
	        
	        // Imprimir el mensaje de la superclase
	        System.out.print("My superclass is: ");
	        System.out.println(a.getClass().getSuperclass().getName());
	        
	        // Llamar al método add heredado de la superclase Arithmetic
	        System.out.print(a.add(42, 13) + " " + a.add(10, 20) + " ");
	    }
	}
}
