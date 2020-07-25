package br.edu.fadam.estruturadedados.ead.aula4.revisao;

//0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ...
/*
 * 
 * Fibonacci(0) = 0
 * Fibonacci(1) = 1
 * Fibonacci(n) = Fibonacci(n-1) + Fibonacci(n-2)
 * 
 */
public class Fibonacci {
  
    static long fibo(int n) {
        if (n < 2) {
            return n;
        } else {//fibo(5) = fibo(4) + fibo(3) | fibo (4) = fibo(3) + fibo(2)
            return fibo(n - 1) + fibo(n - 2);
        }
    }
  
    public static void main(String[] args) {   
     
    // teste do programa. Imprime os 10 primeiros termos       
    for (int i = 0; i <= 5; i++) {
            System.out.println("(" + i + "):" + Fibonacci.fibo(i) + "\t");
        }
    }
  
}