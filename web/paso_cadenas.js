function validar(){

	var sexo=1;
	var estatura=1;
	var peso=1;
        var k=0;
        
	while(k===0){	

	if(document.getElementById("Sexo").value===""){

		document.getElementById("Sexo").value=prompt('el sexo debe ser Hombre o mujer');

	}else {

		sexo=0;	

	}

	if(document.getElementById("Peso").value==="" || !(/^([0-9])*$/.test(document.getElementById("Peso").value)) || 0>document.getElementById("Peso").value){

		document.getElementById("Peso").value=prompt('el Peso no puede estar vacio y/o solo puede contener numeros positivos enteros');

	}else{
            peso=0;
	}
	
	
	if(document.getElementById("Estatura").value==="" || !(/^\d*\.?\d*$/.test(document.getElementById("Estatura").value)) || 0>document.getElementById("Estatura").value){

		document.getElementById("Estatura").value=prompt('la estaura no puede estar vacio y/o solo puese ser un decimal o entero positivo');
		
	}else{
		estatura=0;
	}		

	if(sexo===0 && estatura===0 && peso ===0){
		
		k=1;

	}
	
    }
    
}

