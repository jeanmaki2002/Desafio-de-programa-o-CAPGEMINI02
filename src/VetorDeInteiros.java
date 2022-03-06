import java.util.Scanner;

public class VetorDeInteiros {

    public  void Vetor(int[] arr2)
    {
        System.out.println("\nEntre com o valor da diferencia");
        Scanner in = new Scanner(System.in);
        int cont = 0;
         int x = in.nextInt();
         for (int i = 0; i<arr2.length; i++)
             for (int j = 0; j<arr2.length; j++) {
                 if (arr2[i] - arr2[j] == x) cont++;
             }
         System.out.print("Elemento pares são: " +cont);



    }
}
