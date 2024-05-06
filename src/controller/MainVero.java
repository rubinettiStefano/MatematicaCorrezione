package controller;

import java.util.Scanner;

public class MainVero 
{
    static Scanner term = new Scanner(System.in);

    public static void main(String[] args) 
    {
        
        String cmd = "";
        String output = "";
        do 
        {
            
            System.out.println("--Inserisci tipologia operazione");
            cmd = term.nextLine().toLowerCase();

            switch (cmd) 
            {
                case "somma":
                    output = somma();
                break;
                case "sottrazione":
                    output = sottrazione();
                break;
                case "divisione":
                    output = divisione();
                break;
                case "moltiplicazione":
                    output = moltiplicazione();
                break;
                case "quit":
                    output = "--Programma terminato";
                break;
                default:
                    output = "--Comando non riconosciuto";
                break;
            }

            System.out.println(output);

        } while (!cmd.equals("quit"));
    }

    static String somma()
    {
        //Chiede input
        //richiama BL
        System.out.println("--Inserisci primo numero");
        double num1 = Double.parseDouble(term.nextLine());
        System.out.println("--Inserisci secondo numero");
        double num2 = Double.parseDouble(term.nextLine());
        
        String risultatoGraficato = OperazioneBL.somma(num1, num2);
        return risultatoGraficato;
    }

    static String sottrazione()
    {
        System.out.println("--Inserisci primo numero");
        double num1 = Double.parseDouble(term.nextLine());
        System.out.println("--Inserisci secondo numero");
        double num2 = Double.parseDouble(term.nextLine());
        
        String risultatoGraficato = OperazioneBL.sottrazione(num1, num2);
        return risultatoGraficato;
    }

    static String divisione()
    {
        System.out.println("--Inserisci primo numero");
        double num1 = Double.parseDouble(term.nextLine());
        System.out.println("--Inserisci secondo numero");
        double num2 = Double.parseDouble(term.nextLine());
        
        String risultatoGraficato = OperazioneBL.divisione(num1, num2);
        return risultatoGraficato;
    }

    static String moltiplicazione()
    {
        System.out.println("--Inserisci primo numero");
        double num1 = Double.parseDouble(term.nextLine());
        System.out.println("--Inserisci secondo numero");
        double num2 = Double.parseDouble(term.nextLine());
        
        String risultatoGraficato = OperazioneBL.moltiplicazione(num1, num2);
        return risultatoGraficato;
    }


}
