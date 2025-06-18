public class Operadores {

    public static void main(String[] args){

  
           String concatenacao = "?";
        concatenacao = 1+1+1+"1";
           System.out.println(concatenacao);
        
           concatenacao = "1"+1+1+1;
           System.out.println(concatenacao);

           concatenacao = 1+"1"+1+1;
           System.out.println(concatenacao);

           concatenacao = "1"+ (1+1+1);
              System.out.println(concatenacao);


boolean variavel = true;

variavel = !variavel;
// nega o valor booleano


//incrementação e decrementação
int numero = 8;
   System.out.println(-- numero);
numero ++;
   System.out.println(numero);
numero --;
    System.out.println(numero);
    numero = - numero; //tornou o numero negativo
    System.out.println(numero);
 numero = numero * -1; //tornou o numero positivo
    System.out.println(numero);

//operador ternário
    int a = 6;
    int b = 6;

     boolean resultado = a == b? true : false ;
     System.out.println(resultado);
     
   



    }


    




}