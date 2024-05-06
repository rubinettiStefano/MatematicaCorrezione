package model;

public class Operazione 
{

    public double num1,num2;
    public String tipologia;//somma,sottrazione,moltiplicazione,divisione

    public Operazione(){}

    public Operazione(double num1,double num2,String tipologia)
    {
        this.num1 = num1;
        this.num2 = num2;
        this.tipologia = tipologia;
    }

    public double calcola()
    {
        double res = 0;
        switch (tipologia) 
        {
            case "somma":
               res = num1+num2;
            break;
            case "sottrazione":
                res = num1-num2;
            break;
            case "moltiplicazione":
                res = num1*num2;
            break;
            case "divisione":
                res = num1/num2;
            break;
            default:
                res = 0;
            break;
        }

        return res;
    }


    public String determinaSegno()
    {
        String res = "";
        switch (tipologia) 
        {
            case "somma":
                res ="+";    
            break;
            case "sottrazione":
                res ="-";    
            break;
            case "moltiplicazione":
                res ="*";    
            break;
            case "divisione":
                res ="/";    
            break;
            default:
                res = "???";
            break;
        }

        return res;
    }

}
