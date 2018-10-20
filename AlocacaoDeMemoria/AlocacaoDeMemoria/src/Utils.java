public class Utils {

	public void Print(String[] array){
        for (int i=0; i<array.length; i++){
            if (array[i] == null) {
                System.out.print("0 ");
            }
            else {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }

	public String Programa(int i){
		String prog = "";
        switch (i){
        case 0:
        	prog = "C";
            break;
        case 1:
            prog = "D";
            break;
        case 2:
            prog = "E";
            break;
        case 3:
            prog = "F";
            break;
        }
		return prog;
	}

}