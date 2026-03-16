import java.util.*;
import java.io.*;

class JavaLoopsII{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();

        for(int i=0;i<t;i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int aux = 0;
            int soma = 0;
            int c = 1;
            for(int p = 1; p < n + 1; p++) {

                aux =  c * b;

                soma =  soma + aux;

                System.out.print((soma + a) + " ");



                c *=2;

            }



        }


        in.close();
    }
}