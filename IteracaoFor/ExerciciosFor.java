package IteracaoFor;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthStyle;

public class ExerciciosFor {
    Scanner sc = new Scanner(System.in);

    public void atvd1() {
        int[] vetor = new int[5]; // criar vetor
        // preencher o vetor
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite um valor para a posição [" + i + "] ");
            vetor[i] = sc.nextInt();
        }
        // imprimir o vetor
        System.out.println("====================");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(" Os valores são: [" + i + "]= " + vetor[i]);
        }
    }

    public void atvd2() {
        double vetor[] = new double[10];
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um valor para a posição [" + i + "]=");
            vetor[i] = sc.nextDouble();
        }
        System.out.println("====================");
        for (int i = vetor.length - 1; i >= 0; i--) {
            System.out.println("Os valores são: [" + i + "]=" + vetor[i]);
        }
    }

    public void atvd3() {
        double vetorNotas[] = new double[4];
        for (int i = 0; i < vetorNotas.length; i++) {
            System.out.println(" Digite o valor da nota [" + (i + 1) + "] ");
            vetorNotas[i] = sc.nextDouble();
        }
        System.out.println("====================");
        double media = 0;
        for (int i = 0; i < vetorNotas.length; i++) {
            System.out.println(" Nota " + (i + 1) + "=" + vetorNotas[i]);
            media += vetorNotas[i]; // acumular o valor das notas do vetor/ somar todas as notas do vetor
        }
        System.out.println("====================");
        // dividir a media pelo numero de notas do vetor
        media /= vetorNotas.length;
        // mostrar a media
        System.out.println(" A média do aluno é " + media);

    }

    public void atvd4() {
        // criar vetor de 10 caracteres
        String letras[] = new String[] { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j" }; // difença char e string,
                                                                                             // char é uma aspa
                                                                                             // 'a',string é aspas
                                                                                             // duplas "a"
        // percorrer o vetor para achar as consoantes (ler uma por uma)
        int cont = 0; // contador
        for (int i = 0; i < letras.length; i++) {
            // tomada de decisão para saber se é vogal ou consoantes
            if (letras[i] != "a" && letras[i] != "e" && letras[i] != "i" && letras[i] != "o" && letras[i] != "u") {
                System.out.println(letras[i] + " é consoante ");
                cont++; // somar quando for consoante
            }
        }
        // mostrar o numero de consoantes
        System.out.println(" o nº de consoante é " + cont);
    }

    // exercicio 4 extra - contando consoantes de uma palavra
    public void atvd4extra() {
        // usuario vai digitar a palavra
        System.out.println(" Digite uma palavra!! ");
        String letras = sc.next();
        letras = letras.toLowerCase(); // converte para minuscula
        // percorrer o vetor para achar as consoantes (ler uma por uma)
        int cont = 0; // contador
        for (int i = 0; i < letras.length(); i++) {
            // tomada de decisão para saber se é vogal ou consoantes
            char c = letras.charAt(i); // char= caracter, guarda apenas 1 caracter
            if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
                System.out.println(c + " é consoante ");
                cont++; // somar quando for consoante
            }
        }
        // mostrar o numero de consoantes
        System.out.println(" o nº de consoante é " + cont);
    }

    public void atvd5() {
        int vetorNumeros[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
        int contPar = 0; // contador de numeros pares
        int contImpar = 0;// contador de numeros impares
        // percorrer o meu leitor e contar os numeros pares e impares
        for (int i = 0; i < vetorNumeros.length; i++) {
            if (vetorNumeros[i] % 2 == 0) {
                contPar++;
            } else {
                contImpar++;
            }
        }
        int nPar[] = new int[contPar];
        int nImpar[] = new int[contImpar];
        // distribuir os numeros nos vetores pares e impares
        contPar = 0;
        contImpar = 0;
        for (int i = 0; i < vetorNumeros.length; i++) {
            if (vetorNumeros[i] % 2 == 0) {
                nPar[contPar] = vetorNumeros[i];
                contPar++;
            } else {
                nImpar[contImpar] = vetorNumeros[i];
                contImpar++;
            }
        }
        for (int i = 0; i < vetorNumeros.length; i++) {
            System.out.println(" vetor [" + i + "]= " + vetorNumeros[i]);
        }
        System.out.println("=======VETOR PAR=============");
        for (int i = 0; i < nPar.length; i++) {
            System.out.println(" vetor [" + i + "]= " + nPar[i]);
        }
        System.out.println("=========VETOR IMPAR===========");
        for (int i = 0; i < nImpar.length; i++) {
            System.out.println(" vetor [" + i + "]= " + nImpar[i]);
        }
    }

    public void atvd5extra() {
        // atividade 5 com "gambiarra"
        int numeros[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
        int nPar[] = new int[numeros.length];
        int nImpar[] = new int[numeros.length];
        // distribuir os numeros nos vetores correspondentes
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                nPar[i] = numeros[i];
            } else {
                nImpar[i] = numeros[i];
            }
        }
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(" vetor [" + i + "]= " + numeros[i]);
        }
        System.out.println("=======VETOR PAR=============");
        for (int i = 0; i < nPar.length; i++) {
            System.out.println(" vetor [" + i + "]= " + nPar[i]);
        }
        System.out.println("=========VETOR IMPAR===========");
        for (int i = 0; i < nImpar.length; i++) {
            System.out.println(" vetor [" + i + "]= " + nImpar[i]);
        }
    }

    public void atvd6() {
        double mediasAlunos[] = new double[3];
        double notasAlunos[] = new double[4];
        int cont = 0;
        for (int i = 0; i < mediasAlunos.length; i++) {
            for (int j = 0; j < notasAlunos.length; j++) {
                System.out.print(" Informe a nota " + (j + 1) + " do aluno " + (i + 1) + ":");
                notasAlunos[j] = sc.nextDouble();
                // acumular nota
                mediasAlunos[i] += notasAlunos[j];
            }
            mediasAlunos[i] /= notasAlunos.length;
            if (mediasAlunos[i] >= 7) {
                cont++;
            }
        }
        for (int i = 0; i < mediasAlunos.length; i++) {
            System.out.println(" A média do aluno  " + (i + 1) + " é: " + mediasAlunos[i]);
        }
        System.out.println(" O nº de alunos com nota >=7 é " + cont);
    }

}
