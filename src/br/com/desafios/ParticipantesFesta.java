package br.com.desafios;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;


/*
Desafio
Todo final de ano ocorre uma festa na escola. As inscrições para participar da festa são abertas no início de julho. 
No momento da inscrição, o aluno pode escolher se quer ser "O Amigo do Pablo" na festa ou não. 
O mais lógico seria escolher a opção Sim, afinal, é um privilégio ser O Amigo do Pablo, já que ele é a pessoa mais descolada da escola. 
Porém, há indivíduos que definitivamente não pretendem ser O Amigo do Pablo, e por motivos desconhecidos.

Somente um será o escolhido. Em vista disso, muitos alunos que escolheram a opção Sim realizaram a inscrição diversas vezes para aumentar 
a própria probabilidade de ser O Amigo do Pablo. 
A diretora da escola pediu que você desenvolva um programa que organize as inscrições do site, pois está havendo um spam de inscrições. 
O critério para ser o escolhido é a quantidade de letras do primeiro nome, e em caso de empate, vence aquele que realizou primeiro a 
inscrição. A organização final dos inscritos deverá seguir a ordem de escolha (Sim ou Não), mas respeitando a ordem alfabética.

OBS.: Ninguém que escolheu a opção Não realizou a inscrição mais de uma vez.

Entrada
A entrada contém somente um caso de teste. Cada linha é composta pelo primeiro nome do participante (sem espaços), 
seguido da opção SIM (caso o usuário queira ser O Amigo do Pablo) ou NAO (caso não queira). 
A entrada termina assim que o usuário digita "FIM" (sem as aspas).

Saída
Seu programa deverá imprimir os inscritos pela ordem de escolha e por ordem alfabética, seguido do nome do vencedor. 
Imprima uma linha em branco entre a lista de inscritos e o nome do vencedor.

 
Exemplo de Entrada	|	Exemplo de Saída
Joao NAO			|		Abhay
					|
Carlos SIM			|		Aline
					|	
Abner NAO			|		Andres
					|
Samuel SIM			|		Carlos
					|
Ricardo NAO			|		Samuel
					|
Abhay SIM			|		Abner
					|
Samuel SIM			|		Joao
					|
Andres SIM			|		Ricardo
					|
Roberto NAO			|		Roberto
					|
Carlos SIM			|______________________
					|	Amigo do Pablo:	
Samuel SIM			|
					|		Carlos
Samuel SIM			|
Abhay SIM
Aline SIM
Andres SIM
 
FIM */

public class ParticipantesFesta {
	static Scanner reader = new  Scanner(System.in);
	static TreeMap<String , String> amigo = new TreeMap<>();
	private String name, result;
	int indice=0;
	String[] teste; 
	
	public void amigos() throws IOException{
	
	while(true) {
		name = reader.next();
		if(name.equals("FIM")) break;
		
		indice++;
		result = reader.next();		
		amigo.put(name, result);
		
	}	
	
		teste = new String[indice];
		Iterator<String> iterator = amigo.keySet().iterator();
		
		while(iterator.hasNext()) {
			int cont = 0;
			String key = iterator.next();
			
			System.out.println(key);
	}		
		
	if (name.length() != 6) {amigo.remove(name);}	
	System.out.println("\nAmigo do Pablo: \n"+ amigo.floorKey(name));
	amigo.clear();
}
	
	public static void main(String[] args) throws IOException{
		
		NovoParticipantes novo = new NovoParticipantes();
	//	ParticipantesFesta festa = new ParticipantesFesta();
	//	festa.amigos();
		novo.amigoPablo();
		
	}

	/*  Abhay, Aline, Andres, Carlos, Samuel, Abner, Joao, Ricardo, Roberto  */		
}


class NovoParticipantes {
	static Scanner token = new Scanner(System.in);
	Map<String, Integer> amigos = new LinkedHashMap<>(); 
	String name, result;
	int indice = 0;
	
	public void amigoPablo() throws IOException{
		
		while(true) {
			name = token.next();
			if(name.equals("FIM")) break;
			result = token.next();	
			amigos.put(name, indice);
			
			indice++;
	}
		
		
		Set<String> lista = new LinkedHashSet<>();
		lista.addAll(amigos.keySet());
		
		
		
		for (String listas : lista) {
			System.out.println("Dentro: "+listas);
		}
		 
		if(amigos.keySet().size() > 1) {amigos.remove(name);}		
		for(Map.Entry<String, Integer> saida : amigos.entrySet()) {
			//System.out.println(saida.getKey());
			
		}
				
		amigos.clear();
	}
	
	public void teste(String nomes) {
			String[] listas = new String[nomes.length()];
			
			System.out.println("Antes do for metodo teste: ");			
			System.out.println("Amigo teste: "+listas[1]);
	}
	
}
