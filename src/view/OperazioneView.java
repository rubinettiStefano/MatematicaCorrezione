package view;

import model.Operazione;

//HA LA RESPOSABILITÀ DI GRAFICARE OGGETTI di tipo Operazione
public class OperazioneView 
{
    public String render(Operazione o)
    {
        return o.num1+" "+o.determinaSegno()+" "+o.num2+" = "+o.calcola();
    }
}
