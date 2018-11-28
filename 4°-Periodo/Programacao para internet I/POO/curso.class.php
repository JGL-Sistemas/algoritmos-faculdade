<?php

class Curso{

    //atributos
    private $codigo = array();
    private $nome   = array();
    private $id;
    
    public function setTurma(array $turmas,$i){
        $this->id = $i;
        $this->codigo[$this->id] = $turmas[$this->id]['codigo']; 
        $this->nome[$this->id] = $turmas[$this->id]['nome']; 
    }
    public function getNome(){
        return $this->nome[$this->id];
    } 
}

$turma = new Curso;

$turmas = array(
    array('codigo'=>'1','nome'=>'Sistemas de Informação </br>'),
    array('codigo'=>'2','nome'=>'Direito </br>'),
    array('codigo'=>'3','nome'=>'Pedagogia </br>'),
    array('codigo'=>'4','nome'=>'Pedagogia2 </br>'),
);

$qtd = count($turmas);


for($i=0; $i<$qtd; $i++){ 
    $turma->setTurma($turmas,$i);

   // echo $turma->getCodigo();
   echo $turma->getNome();
}


