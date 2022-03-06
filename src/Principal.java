import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException {


        System.out.println("Entre com o texto");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String texto = br.readLine();
        texto = texto.replaceAll(" ", "");

        System.out.println("Quantos elementos tem no seu Array? ");
        Scanner in = new Scanner(System.in);
        int indice = in.nextInt();

        while (indice%2 == 0)
        {
            System.out.println(" O numero não pode ser par");
            indice = in.nextInt();
        }
        int[] array = new int[indice];
         for (int i = 0; i < array.length; i++)
        {
            System.out.println("Entre com os valores da Array");
            array[i] = in.nextInt();
        }
        int tamanho = texto.length();

        double raiz = Math.sqrt(tamanho);
        int linhas = (int) raiz;
        int colunas = linhas + 1;
        if (linhas * colunas <= tamanho)
        {
            linhas++;
        }
        Mediana ex = new Mediana();
        VetorDeInteiros ex2 = new VetorDeInteiros();
        ex.mediana(array); // Exercício 1
        ex2.Vetor(array);  // Exercício 02


        char[][] text = encryptString(texto, linhas, colunas);

        printCrypto(text, linhas, colunas);


    }


    /**
     * @param str
     * @param linhas
     * @param colunas
     * @return
     */
    private static char[][]  encryptString(String str, int linhas, int colunas) {
        char[][] text = new char[linhas][colunas];

        int sizeStr = str.length();
        int index = 0;
        for(int i=0;i<linhas;i++) {

            for(int j=0; j<colunas;j++) {

                if(index < sizeStr) {
                    text[i][j] = str.charAt(index++);
                }
            }
        }
        return text;
    }

    /**
     * @param text
     * @param linhas
     * @param colunas
     */
    private static void printCrypto(char[][] text, int linhas, int colunas) {
        StringBuilder sb = new StringBuilder();
        for(int j=0;j<colunas;j++) {
            sb.append(" ");
            for(int i=0;i<linhas;i++) {
                sb.append(text[i][j]);
            }

        }

        System.out.print(sb.toString());
    }

}




