package ciclos_for_dowhile_while;

public class Ciclos_For_DoWhile_While {

    public static void main(String[] args) {

        //Ciclo For
        for (int v = 0; v < 10; v++) {
            System.out.println("Valores sumados " + v);

        }

        // Ciclo While como contador
        int contador = 11;
        // Lo hace mientras la variable contador sea menor o igual a 10
        while (contador <= 10) {
            System.out.println(contador);
            contador = contador + 1;    // Le suma 1 a la variable contador
        }
        
        int variable2 = 11;
        /*
        Es un ciclo que por lo menos realiza una vez la operacion que esta dentro de él, 
        ya que su condición se encuentra en la parte inferior de su cuerpo
        */
        do{
            System.out.println(variable2);
            variable2++;
            
        }while(variable2 <= 10);
        
    }

}
