<?php

class Curso{

    //atributos
    private $codigo;
    private $nome;
    private $categoria;
    
    //metodos
    public function setTurma(array $turma){
        $this->codigo = $turma['codigo'];
        $this->nome = $turma['nome'];
        $this->categoria = $turma['categoria'];
    }
    
    public function getCodigo(){
        return $this->codigo;
    }
    public function getNome(){
        return $this->nome;
    }
    public function getCategoria(){
        return $this->categoria;
    }
}

$turma1 = new Curso;

$arrayturma = array(
    'codigo'=>'32',
    'nome'=>'Sistemas de Informação',
    'categoria'=>'Exatas'
);
//var_dump($turma1);

$turma1->setTurma($arrayturma);
    echo $turma1->getNome();
    echo '</br>';
    echo $turma1->getCategoria();
    echo '</br>';
    echo $turma1->getCodigo();
    echo '</br>';

$turma2 = new Curso;

$vetor = array(
 'codigo'=>'33',
 'nome'=>'engenharia',
 'categoria'=>'exatas'
);

$turma2->setTurma($vetor);
    echo $turma2->getNome()."<br>";
    echo $turma2->getCategoria()."<br>";
    echo $turma2->getCodigo();