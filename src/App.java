import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in); //Scanner class : nos permite q el usuario escriba, y escanear lo escrito lol.
        //declaracion y asignacion de variables.
        String secretWord = "inteligence";
        int maximunAttemps = 11;
        int attemps = 0;
        boolean wordGuessed = false;
        //arreglos (arrays)
        char[] charsGuesseds = new char[secretWord.length()];
        //estructura de control(iterativa):bucle
        for (int i = 0; i < charsGuesseds.length; i++) {
            charsGuesseds[i] = '_';
        }
        while (!wordGuessed && attemps < maximunAttemps) {
            //Esto se usa cuando tenemos una palabra de chars(formacion de una palabra)
            System.out.println("word to guesse: "+String.valueOf(charsGuesseds)+ " (" + secretWord.length()+ " letters)"); 
            System.out.println("Enter a letter, please");                        
            char letter = Character.toLowerCase(scanner.next().charAt(0));                        
             //usamos la clase scanner para pedir una letra                   
            boolean correctLetter = false;                                    
            //Estructura de control(bucle) iterativo
            for (int i = 0; i < secretWord.length(); i++) {
                //Estructura de control condicional
                if (secretWord.charAt(i) == letter) {
                    charsGuesseds[i] = letter;
                    correctLetter = true;
                }
            }
            if (!correctLetter) {
                attemps++;
                System.out.println("incorrect letter!, "+(maximunAttemps - attemps)+ "attemps left");
            }
            if (String.valueOf(charsGuesseds).equals(secretWord)) {
                wordGuessed = true;
                System.out.println("!congratulations¡, you have guessed the right word :"+secretWord);
            }
        }
        if (!wordGuessed) {
            System.out.println("GAME OVER, !You ran out of attempts¡");
        }
        scanner.close();
    
    }
}
/*String.valueOf(wordGuessed), basicamente esta variable de tipo string de las letras adivinadas (fijense que en la linea 12(es un array de letras
, no es un string, un string es como una especie de estructura de datos de muchas letras). pero esto es un array de chars(characters)tambien de 
cierta forma, forma una palabra). Entonces String.valueOf(wordGuessed) es una palabra entera(va a contener la palabra).Entonces va a ser la 
cantidad de guiones, pero a medida que vaya pasando y vayas adivinando van a ir siendo (___l___l). y en la linea 35(lo mismo).Entonces siguiendo
la linea vemos la variable (misma que la linea 18) se va a ir completando y cuando termine de completarse, si es esta variable de la linea 18 
es igual a la variable(wordsecret) recien ahi ganaras 
hay una coincidencia que la persona se equivoque y comience a escribir la palabra a adivinar en mayuscula, pero la palabra asignada es en minuscula
para que no haya problemas vamos a declarar la variable toLowerCase(Character.toLowerCase(scanner.next().charAt(0));) para que cuando el jugador
quiera meter una letra que si el jugador lo tienen en mayuscula, el metodo lo convierta en minuscula. en la linea 19 se actualizo el codigo para 
que el jugador sepa cuantas letras requiere la palabra a adivinar y no se le haga complicado el juego.
 */