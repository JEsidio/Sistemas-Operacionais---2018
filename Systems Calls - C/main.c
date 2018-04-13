#include<stdlib.h>
#include<stdio.h>
#include<string.h>

int main(){
    
    //Declaracao de String em C
    char nome_arquivo_entrada[100] = "meu_arquivo.xyz";
    char nome_arquivo_saida[100] = "saida.txt";
    char ch;
    int num=0;
    
    //Declaracao de um arquivo
    FILE *arq;

    //ABRIR O ARQUIVO PARA LEITURA, opção "r"
    arq=fopen(nome_arquivo_entrada,"r");
    
    //Contagem de linhas do arquico de entrada
    while( (ch=fgetc(arq))!= EOF ){
			if(ch == '\n'){
			  num++;
			}
    }
    
    int linhas=num;

    fclose(arq);


    
    //Declaracao de variaveis
    int   inteiro = 0;
    int   flag    = 1;
    
    FILE *arquivo;
    
    arquivo=fopen(nome_arquivo_entrada,"r");
   
    int vetor[linhas];
    int i=0;
    while(1){

        //Realiza a leitura de um inteiro
        flag = fscanf(arquivo, "%d", &inteiro);

        //Verifica se realizou a leitura corretamente
        // Se for menor que 0 finalizou o arquivo
        if(flag < 0){
            break;
        }
        
        vetor[i] = inteiro;
        i++;
    }

      //Ordena os número em ordem crescente
      int r, s, tempo; 
      for(r = 0; r < linhas; r++){
        for(s=r+1;s<linhas;s++){
          if (vetor[r]>vetor[s]){
            tempo=vetor[r];
            vetor[r]=vetor[s];
            vetor[s]=tempo;
          }
        }
      }
      
      //Mostra da tela os números
      for(r=0;r<linhas;r++){
        printf("%d\n",vetor[r]);
      }
     
     fclose(arquivo);
    

    
    FILE* arqui;
    
    //ABRIR O ARQUIVO PARA ESCRITA, opção "w"
    arqui=fopen(nome_arquivo_saida,"w");
    
    int p=0;
    int soma = 0;
    double multiplicacao = 1;
    
    //Escreve no arquivo de saida
    
    fprintf(arqui, "Aqui os número são ordenados em ordem crescente \n\n");
    
    for(p=0; p<linhas; p++){
      soma = soma + vetor[p];
      if (vetor[p] != 0){
        multiplicacao = multiplicacao * vetor[p];
      }
      fprintf(arqui, "%d\n", vetor[p]);
    }
    
    fprintf(arqui, "\n");
    
    fprintf(arqui, "A Soma de todos os números da lista é: %d \n\n", soma);
    
    fprintf(arqui, "A Multiplicacao de todos os números da lista, tirando o zero, é: %.0f \n", multiplicacao);
      
    //FECHAR O ARQUIVO
    fclose(arqui);

    return 0;
}