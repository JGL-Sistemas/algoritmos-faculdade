$(Document).ready(function(){
    
    var num1 = "0";
    var num2 = "0";
    var total = "0";
    var vazio = "0";
    var $visor;
    var vi;
    var op = '0';
    
    $('.dividir') .click(function(){
        num1 = $visor.val();
        op = '/';
        $visor.val(0);
        console.log(num1);
    });
    
    $('.multiplicar') .click(function(){
        num1 = $visor.val();
        op = '*';
        $visor.val(0);
        console.log(op);
    });
    
    $('.somar') .click(function(){
        num1 = $visor.val();
        op = '+';
        $visor.val(0);
        console.log(op);
    });
    
    $('.subtrair') .click(function(){
        num1 = $visor.val();
        op = '-';
        $visor.val(0);
        console.log(op);
    });
    
   $('.num').click(function(){
       $visor = $('.visor');
       vi = $visor.val();
       if(vi!='0'){
           $visor.val(vi+$(this).val());
       } else{
           $visor.val($(this).val());
       }
       
   });
   
   $('.resultado').click(function(){
       
       num2 = $visor.val();
       
        switch (op){
            case '/':
               total =  parseInt(num1) / parseInt(num2);
                $visor.val(0);
                $visor.val(total);
                break;
            case '*':
                total =  parseInt(num1) * parseInt(num2);
                $visor.val(0);
                $visor.val(total);
                break;
            case '+':
                total =  parseInt(num1) + parseInt(num2);
                $visor.val(0);
                $visor.val(total);
                break;
            case '-':
                total =  parseInt(num1) - parseInt(num2);
                $visor.val(0);
                $visor.val(total);
                break;
        }
       
       
   });
       
//    $('.op') .click(function(){
//        
//        if(num1 == 0){
//            num1 = $visor.val();
//            
//            console.log('fui1',num1);
//            
//            $visor.val(0) = vazio;
//            
//        } else if(num2 == 0){
//            num2 = $visor.val();
//            
//            console.log ('fui2',num2);
//        }    
//    });
    
    $('.C') .click(function(){
        
//        window.location.reload();
        
        window.location.href=window.location.href;    
    });
});