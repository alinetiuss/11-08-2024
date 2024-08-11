import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
    System.out.println("Digite a senha: "); 

    int x = sc.nextInt();
    int senha = 2022;

    while ( x != 2022 ) {
    System.out.println("Senha Incorreta!");
      x = sc.nextInt();
}
    if (x==senha) {
    System.out.println("Acesso Permitido!");
    }
    
    sc.close();
  }

  
}