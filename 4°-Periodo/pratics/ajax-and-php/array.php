<?php

$a = array('dieisson','Miguel','phia','Davi','Alice','Arthur','lia','Pedro','sabella','Gabriel','uela','Bernardo','Laura','Lucas','uiza','Matheus','entina','Rafael','ovanna','Heitor','ria Eduarda','Enzo','Helena','Guilherme','eatriz','Nicolas','ia Luiza','Lorenzo','a','Gustavo','iana','Felipe','cole','Samuel','faela','João','18  Heloísa','Daniel','adora','Vitor','ívia','Leonardo','Maria Clara','Henrique','Ana Clara','Theo','Lorena','Murilo','briela','Eduardo','min','Pedro','e  26  Isabelly','Pietro','rah','Cauã','Ana Julia','Isaac','etícia','Caio','Ana Luiza','Vinicius','Melissa','Benjamin','Marina','João','Clara','Lucca','ecília','João','35  Esther','Bryan','manuelly','Joaquim','eca','João','38  Ana Beatriz','Thiago','vínia','Antônio','ória','Davi','41  Bianca','Francisco','atarina','Enzo','    43  Larissa','Bruno','aria Fernanda','Emanuel','nanda','João','    46  Amanda','Ian','cia','Davi','48  Carolina','Rodrigo','tha','Otávio','brielly');

// Array with names
$a[] = "Anna";
$a[] = "Brittany";
$a[] = "Cinderella";
$a[] = "Diana";
$a[] = "Eva";
$a[] = "Fiona";
$a[] = "Gunda";
$a[] = "Hege";
$a[] = "Inga";
$a[] = "Johanna";
$a[] = "Kitty";
$a[] = "Linda";
$a[] = "Nina";
$a[] = "Ophelia";
$a[] = "Petunia";
$a[] = "Amanda";
$a[] = "Raquel";
$a[] = "Cindy";
$a[] = "Doris";
$a[] = "Eve";
$a[] = "Evita";
$a[] = "Sunniva";
$a[] = "Tove";
$a[] = "Unni";
$a[] = "Violet";
$a[] = "Liza";
$a[] = "Elizabeth";
$a[] = "Ellen";
$a[] = "Wenche";
$a[] = "Vicky";

// get the q parameter from URL
$q = $_REQUEST["q"];

$hint = "";

// lookup all hints from array if $q is different from "" 
if ($q !== "") {
    $q = strtolower($q);
    $len=strlen($q);
    foreach($a as $name) {
        if (stristr($q, substr($name, 0, $len))) {
            if ($hint === "") {
                $hint = $name;
            } else {
                $hint .= ", $name";
            }
        }
    }
}

// Output "no suggestion" if no hint was found or output correct values 
echo $hint === "" ? "Sem sugestão :(" : $hint;
?>