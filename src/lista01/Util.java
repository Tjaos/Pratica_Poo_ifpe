/*
 * Copyright (c) 2024 Thiago José Amaral Oliveira da Silva
 * Licensed under the MIT License.
 */
package lista01;

public class Util {
    
    /*1. somar: recebe dois inteiros e retorna a soma entre eles */
    /**
     * Soma dois valores inteiros
     * 
     * @param a primeiro parâmetro int
     * @param b segundo parâmetro int
     * @return soma dos inteiros
     */

    public static int somar(int a, int b){

        return (a + b);
    }



    /* 2. somarPositivo: recebe dois inteiros e retorna o valor absoluto do resultado da soma entre eles -
    reutilizar o método do item 1*/
    /**
     * Soma dois inteiros
      * @param a primeiro parâmetro int
     * @param b segundo parâmetro int
     * @return valor absoluto da soma dos inteiros
     */

    public static int somarPositivo(int a, int b){
        return Math.abs(somar(a, b));
    }



    /* 3. subtrair: recebe dois doubles e retorna o resultado do primeiro menos o segundo*/
    /**
     * Subtrai dois doubles
     * @param a primeiro double
     * @param b segundo double
     * @return subtração do primeiro pelo segundo
     */

    public static double subtrair(double a, double b){
        return (a - b);
    }


    /*4. subtrairPositivo: recebe dois doubles e retorna o valor absoluto do resultado do primeiro menos o
    segundo - reutilizar o método do item 3 */
    /**
     * Subtrai dois doubles
     * @param a primeiro double
     * @param b segundo double
     * @return valor absoluto da subtração do primeiro pelo segundo
     */

    public static double subtrairPositivo(double a, double b){
        return Math.abs(subtrair(a, b));
    }



    /*5. obterResto: recebe dois inteiros e retorna o resto da divisão do primeiro pelo segundo */
    /**
     * Obtem o resto da divisão do primeiro int pelo segundo int
     * @param a primeiro inteiro
     * @param b segundo inteiro
     * @return resto da divisão do primeiro pelo segundo
     */

    public static int obterResto(int a, int b){
        return (a % b);
    }



    
    /*
    6. ajustarNota: recebe uma nota (double) e retorna o valor:
    - 0 : caso a nota seja menor que 0
    - 10 : caso a nota seja maior que 10
    - própria nota : caso contrário.
    */
    /**
     * 
     * @param nota Um double aleatório
     * @return A nota double ajustada de acordo com as condicionais
     */
    public static double ajustarNota(double nota){
        double resultado;
        if(nota < 0){
            resultado = 0;
        }
        else if(nota > 10){
            resultado = 10;
        }else{
            resultado = nota;
        }
        
        return resultado;
    }




    /*7. calcularMedia: recebe três notas (double), ajustar as notas (item 6) e retorna o valor da média
    aritmética */
    /**
     * Recebe 3 valores double e retorna a media aritmetica entre eles
     * @param a primeiro double
     * @param b segundo double
     * @param c terceiro double
     * @return A média aritimetica dos tres double após seus Ajustes
     */

    public static double calcularMedia(double a, double b, double c){

        a = ajustarNota(a);
        b = ajustarNota(b);
        c = ajustarNota(c);

        return ((a+b+c) / 3);
    }

    /*
    8. verificarAprovacao: recebe três notas (double), calcula a média (item 7) e retorna o texto:
    - APROVADO : caso a média seja maior ou igual a 7.0
    - EXAME FINAL : caso a média seja maior ou igual a 2.0 e menor que 7.0
    - REPROVADO : caso contrário
    */
    /**
     * 
     * @param a primeiro double
     * @param b segundo double
     * @param c terceiro double
     * @return Uma String informando se foi APROVADO, REPROVADO ou EXAME FINAL
     */
    public static String verificarAprovacao(double a, double b, double c){

        String resultado = "";
        double media = calcularMedia(a, b, c);

        if(media >= 7.0){
            resultado = "APROVADO";
        }else if(media >= 2 && media < 7){
            resultado = "EXAME FINAL";
        }else{
            resultado = "REPROVADO";
        }

        return resultado;
    }

    /*9. verificarAprovacaoCompleta: recebe três notas (double) e um percentual de frequência (double) e
    retorna:
    - REPROVADO POR FALTA : caso o percentual de frequência seja menor que 0.75
    - o resultado do método do item 8 : caso contrário 
    */
    /**
     * 
     * @param a primeiro double
     * @param b segundo double
     * @param c terceiro double
     * @param frequencia quarto double
     * @return String informando se foi REPROVADO POR FALTA ou retorna o resultado do item 8.
     */
    public static String verificarAprovacaoCompleta(double a, double b, double c, double frequencia){
        String resultado = ""; 
        if(frequencia < 0.75){
            resultado = "REPROVADO POR FALTA";
        }else{
            resultado = verificarAprovacao(a, b, c);
        }


        return resultado;
    }





}
