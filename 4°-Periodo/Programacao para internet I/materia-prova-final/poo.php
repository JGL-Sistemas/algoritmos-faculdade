<?
//Métodos mágicos em PHP são métodos previamente definidos de uma classe que tem funcionalidades específicas, que são invocados quando trabalhamos com as propriedades e métodos de um objeto (instância de uma classe).
public function _construct() { //encapsulamento
 

//Com eles você pode fazer interceptações ao longo da execução do script e modificar o curso da aplicação, caso necessário.
}


class Produto{

	
	//delimitador de acesso: private, public
			//atributo caracteristica
	private $descricao;
	private $preco;

	public function __construct($descricao, $preco){
		$this->descricao = $descricao;
		$this->preco = $preco;
	}

	//metodos ações para um objeto pega valor 
	public function setDescricao($valor){
		$this->descricao = $valor;
	}

	//metodos ações para um objeto
	public function setPreco($valor){
		$this->preco = $valor;
	}

	//metodos ações para um objeto retorna valor
	public function getDescricao(){
		return $this->descricao;
	}
	//metodos ações para um objeto
	public function getPreco(){
		return $this->preco;
	}

	//metodos ações para um objeto
	public function getDetalhes(){
		return "O produto {$this->descricao} custa {$this->preco} reais";
	}

}

/*cria novo objeto*/
$p1 = new Produto('livro', 50);

//var_dump($p1);

/*atribui valor a descrição*/
//$p1->setDescricao('livro');
//$p1->setPreco(50);

//var_dump($p1);
echo $p1->getDetalhes();

//-------------------------

//Método get
//Quando formos acessar, “pegar” alguns atributos da classe, devemos utilizar os métodos GET. Esse método sempre retornará um valor, seja ele String, int ,double etc. Então devemos criar uma função.

//--------------------------
//Método set
//ara alterarmos, modificarmos os valores de um atributo da classe de maneira protegida, utilizamos os métodos SET. Esse método não terá um retorno, pois o atributo será somente modificado, criando um método de tipo VOID, sem retorno. Porém ele deve receber algum argumento para que possa ocorrer a devida alteração. 

//-----------------------------
//HERANÇA
//A herança representa uma das principais características da Orientação a Objetos, até porque, somos capazes de implementar tipos de dados hierarquicamente. Através do conceito de herança, conseguimos implementar classes de uso geral, que possuam características comuns a várias entidades relacionadas.

//Essas classes poderão ser estendidas por outras, produzindo assim, classes mais especializadas e, que implementem funcionalidades que as tornam únicas.

//----------------------------------
class Pai()
{

}

class Filho extends Pai
{
    #a classe filha utiliza a instrução `extends` e em seguida define
    # o nome da classe que está sendo estendida
}










?>