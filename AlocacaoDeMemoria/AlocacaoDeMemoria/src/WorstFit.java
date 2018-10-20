public class WorstFit {

	Utils ut = new Utils();

	public void Alocar(String[] arrayFixo, int[] programas){

        for (int i = 0; i < programas.length; i++){
            String prog = ut.Programa(i);

            int cont = 0;
            int maior = 0;
            int pos = 0;

            for(int j = 0; j < arrayFixo.length; j++){

                if (arrayFixo[j].equals("0")){
                    cont++;

                    if (cont > maior){
                    	maior = cont;
                    	pos = j;
                    }
                } else{
                    cont = 0;
                }
            }
            if (programas[i]<=maior){

	            for(int k = 1; k<=programas[i]; k++){
	                arrayFixo[pos-maior+k] = prog;
	                cont = 0;
	            }
        	}
        }
        ut.Print(arrayFixo);
    }
}