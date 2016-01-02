import java.util.*;

public class tabTrad {
	final static int TABMAX = 100;
	static Scanner sc = new Scanner(System.in);
	static int[] table = new int[TABMAX];

	public static void main(String[] arg){
		
		
		int n, menu;
		char quitter = 'n';
		n = 0;
		
		do
		{
			espace();
			System.out.println("Menu :");
			System.out.print("0 - Quitter\n1 - \u00c9dition\n2 - Affichage\n3 - Somme\nChoix : ");
			menu = sc.nextInt();
			
			switch(menu)
			{
			case 0:	System.out.println("Quitter ? (o/n)");
					quitter = sc.next().charAt(0);
					while(quitter != 'o' && quitter != 'n')
					{
						System.out.println("Erreur : Voulez-vous vraiment quitter ? (o/n)");
						quitter = sc.next().charAt(0);
					}
				break;
				
				
			case 1:	espace();
					n = creation(table);
				break;
			
				
			case 2:	espace();
					affichage(table, n);
				break;
				
				
			case 3:	espace();
					somme(table, n);
				break;
				
				
			default: espace();
					 System.out.println("Erreur : Menu " + menu + " inexistant !");
				break;
			}
		}while(quitter != 'o');
	}
	
	public static int creation(int[] table){
		int n = 0;
		char reponse;
		do{
			System.out.println("Donner la valeur : ");
			table[n] = sc.nextInt();
			System.out.println("Encore ? (o/n)");
			reponse = sc.next().charAt(0);
			while(reponse != 'o' && reponse != 'n')
			{
				System.out.println("Erreur (o/n)\nEncore ? (o/n)");
				reponse = sc.next().charAt(0);
			}
			n++;
		}while(reponse != 'n' && n < TABMAX);
		if(n >= TABMAX)
		{
			System.out.println("Tableau plein");
		}
		System.out.println(n + " places utilis\u00e9es sur " + TABMAX);
		return n;
	}
	
	public static void affichage(int[] table, int n)
	{
			int i;
			for(i = 0; i < n; i++)
			{
				System.out.print(table[i] + " ");
			}
			System.out.println();
	}
	
	public static void somme(int[] table, int n)
	{
			int i, operation = 0;
			for(i = 0; i < n; i++)
			{
				operation = operation + table[i];
			}
			System.out.println("La somme des chiffres dans le tableau est " + operation);
	}
	
	public static void espace()
	{
		int i;
		for(i = 0; i < 30; i++)
		{
			System.out.print("-");
		}
		System.out.println();
	}
	
}
