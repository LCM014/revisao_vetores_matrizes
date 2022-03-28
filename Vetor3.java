import java.util.Random;
public class Vetor3 
{       
    public static void main(String[] args) 
    {
        Random random = new Random();
        int numeros[] = {random.nextInt(100),random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100)};

        for (int index = 0; index < numeros.length; index++) 
        {   
            if(numeros[index]%2 == 0)
            {
                System.out.println("Par");
                System.out.println(numeros[index]);
            }
            else
            {
                System.out.println("Impar");
                System.out.println(numeros[index]);
            }
        }
    }
    
}
