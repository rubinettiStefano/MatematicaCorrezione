package controller;

import model.Operazione;
import view.OperazioneView;

//Servizi che offriamo al main, I SOTTOPROGRAMMA
public class OperazioneBL 
{
    static OperazioneView view = new OperazioneView();

    //2 input ESPLICITI   -> numeri da sommare
    //1 input IMPLICITO   -> il fatto di aver chiamato questo metodo
    public static String somma(double num1,double num2)
    {
        //1) Utilizza il model per oggettificarli
        Operazione o = new Operazione(num1, num2, "somma");
        //2) Passa la palla alla view per graficarli
        String versioneGraficata = view.render(o);
        //3) restituisce la string al main
        return versioneGraficata;
    }

    public static String sottrazione(double num1,double num2)
    {
        Operazione o = new Operazione(num1, num2, "sottrazione");
        String versioneGraficata = view.render(o);
        return versioneGraficata;
    }

    public static String moltiplicazione(double num1,double num2)
    {
        Operazione o = new Operazione(num1, num2, "moltiplicazione");
        String versioneGraficata = view.render(o);
        return versioneGraficata;
    }

    public static String divisione(double num1,double num2)
    {
        Operazione o = new Operazione(num1, num2, "divisione");
        String versioneGraficata = view.render(o);
        return versioneGraficata;
    }
}
