public class BestFit {

	Utils ut = new Utils();

	public void Alocar(String[] arrayFixo, int[] programas){

        for (int i = 0; i < programas.length; i++){
            String prog = ut.Programa(i);

            int cont = 0;
            int menor = 10;
            int pos = 0;

            for(int j = 0; j < arrayFixo.length; j++){

                if (arrayFixo[j].equals("0")){
                    cont++;
                }

                if ((!arrayFixo[j].equals("0"))||(j==arrayFixo.length-1)){

                	if ((cont>0) && (cont < menor) && (cont>=programas[i])){
                    	menor = cont;

                        if (j==arrayFixo.length-1 && (arrayFixo[j].equals("0"))){
                            pos = j+1;
                        } else{
                            pos = j;
                        }
                    }
                    cont = 0;
                }
            }

            if (programas[i]<=menor && menor != 10){
	            for(int k = (pos-menor) + programas[i]-1; k>=pos-menor; k--){
	                arrayFixo[k] = prog;
	            }
        	}
        }
        ut.Print(arrayFixo);
    }
}