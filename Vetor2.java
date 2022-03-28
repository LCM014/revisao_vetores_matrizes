public class Vetor2 
{
    public static void main (String[] args)
    {
        String meses[] = {"janeiro", "fevereiro", "março","abril","maio", "junho","julho","agosto","setembro","outubro", "novembro","dezembro"};

        System.out.println(" 1º semestre");

        for (int i = 0 ; i < (meses.length)/2 ; i++) 
        {
            System.out.println(meses[i]);    
        }

        System.out.println("2º semestre");
        
        for (int i = 7 ; i < meses.length ; i++) 
        {
            System.out.println(meses[i]);    
        }

    }
}
