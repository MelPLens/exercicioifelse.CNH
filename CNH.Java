import java.util.Scanner;
class exerciciohabilitacao
{
    public static void main(String [] args);
}

System.out.print(" Ola ! voce podera ter uma habilitacao se possuir umas dessas opcoes abaixo,caso entre dentro das condicoes digite o numero da opcao! /n Digite 1 se voce foi ja foi aprovado no exame psicotecnico /n Digite 2 se voce aprovado no exame de legislacao /n Digite 3 se voce ja foi aprovado no exame de direcao /n Caso voce nao entre em nenhumas dessas opcaoes digite 4 ")
Scanner ler = new Scanner (System.in); //ler as instruções
int habilitacao;

if(habilitacao=1) //e se  for...
{
   System.out.print("Voce pode ter uma habilitacao!");
   numero1=ler.nextInt;
}
else if (habilitacao=2) //senao se
{
   System.out.print ("Voce pode ter uma habilitacao!");
   numero1=ler.nextInt;
}
else if (habilitacao=3) //senao se
{
    System.out.print ("Voce pode ter uma habilitacao");
    numero1=ler.nextInt;
}
else if (habilitacao=4) //senaose
{
    System.out.print ("voce NAO pode ter uma habilitacao!");
    numero1=ler.nextInt;
}
else //senao
{
    System.out.print ("Digite uma das opcoes 1,2,3 e 4 !");
    numero1=ler.nextInt;
}
}
