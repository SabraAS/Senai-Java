package controller;
import util.Teclado;
public class Ex_7_Q9 {
public static void main(String[] args) {
	
	String data1 ;
	data1 =Teclado.lerTexto("o sua data de nascimento : ");

	String dia = data1.substring(0,3);
	System.out.println("o dia do nascimento foi  :"+ dia);	
	
	String mes = data1.substring(3,6);
	System.out.println("o mês de nascimento foi :"+     mes);
		
	String ano = data1.substring(6,10);
	System.out.println("1° palavra  :"     +     ano);
	

}
}
