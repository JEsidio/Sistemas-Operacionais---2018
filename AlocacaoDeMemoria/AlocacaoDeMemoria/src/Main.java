public class Main {

	public static void main(String[] args) {

        FirstFit ff = new FirstFit();
        WorstFit wf = new WorstFit();
        BestFit  bf = new BestFit();

        String[] array;
        int[] numeros;

        //Caso1
        array = new String[] {"0","A","0","0","0","0","B","B","B","0"};
        numeros = new int[] {1,2,2};

        System.out.println("First Fit - Caso 1:");
        ff.Alocar(array, numeros);





        //
        array = new String[] {"0","A","0","0","0","0","B","B","B","0"};
        numeros = new int[] {1,2,2};
        
        System.out.println("\nWorst Fit - Caso 1:");
        wf.Alocar(array, numeros);





        //
        array = new String[] {"0","A","0","0","0","0","B","B","B","0"};
        numeros = new int[] {1,2,2};

        System.out.println("\nBest Fit - Caso 1:");
        bf.Alocar(array, numeros);





        //Caso2
        array = new String[] {"0","0","A","0","0","0","B","0","0","0"};
        numeros = new int[] {3,1,2,1};
        
        System.out.println("\nFirst Fit - Caso 2:");
        ff.Alocar(array, numeros);





        //
        array = new String[] {"0","0","A","0","0","0","B","0","0","0"};
        numeros = new int[] {3,1,2,1};
        
        System.out.println("\nWorst Fit - Caso 2:");
        wf.Alocar(array, numeros);





        //
        array = new String[] {"0","0","A","0","0","0","B","0","0","0"};
        numeros = new int[] {3,1,2,1};

        System.out.println("\nBest Fit - Caso 2:");
        bf.Alocar(array, numeros);




        //Caso3
        array = new String[] {"0","0","A","0","0","0","B","0","0","G"};
        numeros = new int[] {2,3,2,1};
        
        System.out.println("\nFirst Fit - Caso 3:");
        ff.Alocar(array, numeros);




        //
        array = new String[] {"0","0","A","0","0","0","B","0","0","G"};
        numeros = new int[] {2,3,2,1};
        
        System.out.println("\nWorst Fit - Caso 3:");
        wf.Alocar(array, numeros);






        array = new String[] {"0","0","A","0","0","0","B","0","0","G"};
        numeros = new int[] {2,3,2,1};

        System.out.println("\nBest Fit - Caso 3:");
        bf.Alocar(array, numeros);
	}

}