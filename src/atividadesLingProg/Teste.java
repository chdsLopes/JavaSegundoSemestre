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
		
		
		System.out.println();
		System.out.println("Objetos Profissional");
		System.out.println();
		
		Profissional profissional[] = new Profissional[5];
		//(String nome, String cargo, int registro, String departamento, double salario)
		
		profissional[0] = new Profissional("Carlos", "Estagiário", 12345, "Desenvolvimento", 1500);
		profissional[1] = new Profissional("Maria", "Desenvolvedor Júnior", 5812345, "Desenvolvimento", 3500);
		profissional[2] = new Profissional("João", "Desenvolvedor Pleno", 25345, "Desenvolvimento", 6500);
		profissional[3] = new Profissional("Rafael", "Desenvolvedor Senior", 9612345, "Desenvolvimento", 10500);
		profissional[4] = new Profissional("Luana", "Desenvolvedor Júnior", 52345, "Desenvolvimento", 3500);
		
		
		for(int i=0; i<5;i++){
			System.out.println("Nome: "+profissional[i].getNome()+" | Cargo: "+profissional[i].getCargo()+" | Registro: "+profissional[i].getRegistro()+" | Departamento: "+profissional[i].getDepartamento()+" | Salario: "+profissional[i].getSalario());	
		}
		
		System.out.println();
		System.out.println("Objetos Aluno Fatec");
		System.out.println();
		
		AlunoFatecSJC aluno[] = new AlunoFatecSJC[5];
		//(double ra, String name, double qtdDisciplicasCursadas, double nota)
		
		aluno[0] = new AlunoFatecSJC(456465, "Carlos", 52, 5.1);
		aluno[1] = new AlunoFatecSJC(454649, "Maria", 2, 6.1);
		aluno[2] = new AlunoFatecSJC(355465, "João", 36, 8.1);
		aluno[3] = new AlunoFatecSJC(985411, "Rafael", 15, 7.1);
		aluno[4] = new AlunoFatecSJC(454895, "Luana", 21, 9.1);
		
		for(int i=0; i<5;i++){
			System.out.println("Nome: "+aluno[i].getNome()+" | RA: "+aluno[i].getRa()+" | Quantidade de Disciplinas: "+aluno[i].getQtdDisciplinasCursadas()+" | Nota: "+aluno[i].getNota());	
		}
		
		System.out.println();
		System.out.println("Objetos Calçado");
		System.out.println();
		
		
		Calcado calcado[]=new Calcado[5];
		//(int tamanho, String tipo, String marca, String material, String cor)
		calcado[0] = new Calcado(43, "Esportivo", "Nike", "Nylon", "Preto");
		calcado[1] = new Calcado(38, "Casual", "All Star", "Tecido", "Musgo");
		calcado[2] = new Calcado(39, "Social", "Ferracini", "Couro", "Preto");
		calcado[3] = new Calcado(36, "Social", "Moleca", "Couro", "Vermelho");
		calcado[4] = new Calcado(43, "Esportivo", "Mizuno", "Tecido", "Cinza");
		
		
		for(int i=0; i<5;i++){
			System.out.println("Marca: "+calcado[i].getMarca()+" | Tamanho: "+calcado[i].getTamanho()+" | Tipo: "+calcado[i].getTipo()+" | Material: "+calcado[i].getMaterial()+" | Cor: "+calcado[i].getCor());	
		}
		
		
		System.out.println();
		System.out.println("Objetos Instrumento Musical");
		System.out.println();
		
		
		InstrumentoMusical instrumento[]=new InstrumentoMusical[5];
		//(String tipo, String fabricante, String modelo)
		instrumento[0] = new InstrumentoMusical("Violão", "Takamine", "GD11MCE");
		instrumento[1] = new InstrumentoMusical("Gaita", "SUPER GIG", "4020C");
		instrumento[2] = new InstrumentoMusical("Pianica", "Yamaha", "Escaleta");
		instrumento[3] = new InstrumentoMusical("Bateria Eletrônica", " Compact Roland","TD 17 KVX");
		instrumento[4] = new InstrumentoMusical("Flauta ", "Eagle", "FL 03S");
		
		for(int i=0; i<5;i++){
			System.out.println("Tipo: "+instrumento[i].getTipo()+" | Fabricante: "+instrumento[i].getFabricante()+" | Modelo: "+instrumento[i].getModelo());	
		}
		
		
		

	}

}
