<?php

class Curso{

    //atributos
    private $codigo = array();
    private $nome   = array();
    public $id;
    
    public function setTurma(array $turmas,$i){
        $this->id = $i;
        $this->codigo[$this->id] = $turmas[$this->id]['codigo']; 
        $this->nome[$this->id] = $turmas[$this->id]['nome']; 
    }
    public function getCodigo(){
        return $this->codigo[$this->id];
    }
    public function getNome(){
        return $this->nome[$this->id];
    }
    public function mostrar(){
        for ($i=0; $i <count($this->codigo); $i++){
            $this->id = $i;
            if($this->getCodigo() != NULL and $this->getNome() != NULL){
                echo $this->getCodigo().'-';
                echo $this->getNome().'<hr>';    
            }              
        }
    }
    public function excluir($id){
        for ($i=0; $i <count($this->codigo); $i++){
            if($id == $this->codigo[$i]){
                 $this->codigo[$i] = NULL;
                 $this->nome[$i] = NULL;
             }
        }
    }
    public function editar($id,$novonome){
        for ($i=0; $i <count($this->codigo); $i++){
            if($id == $this->codigo[$i]){
                 $this->codigo[$i] = $this->codigo[$i];
                 $this->nome[$i] = $novonome;
             }
        }
    } 
}
$turma = new Curso;
$turmas = array(
    array('codigo'=>'1','nome'=>'Sistemas de Informação'),
    array('codigo'=>'2','nome'=>'Direito'),
    array('codigo'=>'3','nome'=>'Pedagogia'),
    array('codigo'=>'4','nome'=>'Direito'),
    array('codigo'=>'5','nome'=>'Administração'),
    array('codigo'=>'6','nome'=>'Engenharia Civil'),
    array('codigo'=>'7','nome'=>'Ciências Contábeis'),
    array('codigo'=>'8','nome'=>'Ciência da Computação'),
    array('codigo'=>'9','nome'=>'Engenharia de Produção'),
    array('codigo'=>'10','nome'=>'Engenharia Mecânica'),
    array('codigo'=>'11','nome'=>'Educação Física'),
    array('codigo'=>'12','nome'=>'Engenharia Elétrica'),
    array('codigo'=>'13','nome'=>'Gestão Logística')
);

$qtd = count($turmas);
for($i=0; $i<$qtd; $i++){ 
   $turma->setTurma($turmas,$i);
}

$turma->excluir(1);
$turma->excluir(12);
$turma->editar(3,'dieisson');


$turma->mostrar();


