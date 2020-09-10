package atividadesLingProg;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Objetos Lugar");
		
		Lugar lugar[] = new Lugar[5];
		
		lugar[0]= new Lugar("Londres","Big Bang", 8000000 ,"Inglaterra");
		lugar[0].setClima("Frio");
		lugar[1]= new Lugar("Havaí","Praias", 1500000 , "Estados Unidos");
		lugar[1].setClima("Quente");
		lugar[2]= new Lugar("Paris","Torre Eiffel", 2000000 ,"Fraça");
		lugar[2].setClima("Temperado");
		lugar[3]= new Lugar("Rio de Janeiro","Cristo Redento", 6000000 ,"Brasil");
		lugar[3].setClima("Quente");
		lugar[4]= new Lugar("Dublin","Guinness Storehouse", 1400000 ,"Irlanda");
		lugar[4].setClima("Chuvoso");
		
		for(int i=0; i<5;i++){
			System.out.println(lugar[i].getPais()+", cidade "+lugar[i].getNome()+", com  "+lugar[i].getPopulacao()+" habitantes, ponto turístico "+lugar[i].getPontosTuristicos()+" e o clima é "+lugar[i].getClima());	
		}
		System.out.println();
		System.out.println("Objetos Pessoa");
		System.out.println();
		
		Pessoa pessoa[] = new Pessoa[5];
		
		pessoa[0]= new Pessoa(158968752, "Carlos", 25, 1.80, "Masculino");
		pessoa[1]= new Pessoa(558858752, "Maria", 18, 1.60, "Feminino");
		pessoa[2]= new Pessoa(687521589, "João", 42, 1.90, "Masculino");
		pessoa[3]= new Pessoa(589618752, "Rafael", 38, 1.73, "Masculino");
		pessoa[4]= new Pessoa(751589682, "Luana", 41, 1.72, "Feminino");

		for(int i=0; i<5;i++){
			System.out.println("Nome: "+pessoa[i].getName()+" | Idade: "+pessoa[i].getIdade()+" | CPF: "+pessoa[i].getCpf()+" | Altura: "+pessoa[i].getAltura()+" | Gênero: "+pessoa[i].getGenero());	
		}
		
		
		

	}

}
