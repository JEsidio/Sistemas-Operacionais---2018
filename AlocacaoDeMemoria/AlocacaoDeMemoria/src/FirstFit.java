public class FirstFit {

	Utils ut = new Utils();

	public void Alocar(String[] arrayFixo, int[] programas){

        for (int i = 0; i < programas.length; i++){
            int cont = 0;
            String prog = ut.Programa(i);

            forArrayFixo:
            for(int j = 0; j < arrayFixo.length; j++){
                if (arrayFixo[j].equals("0")){
                    cont++;

                    if (programas[i]==cont){

                        for(int k = j-cont+1; k<=j; k++){
                            arrayFixo[k] = prog;
                            cont = 0;
                        }
                        break forArrayFixo;
                    }
                } else{
                    cont = 0;
                }
            }
        }
        ut.Print(arrayFixo);
    }
}