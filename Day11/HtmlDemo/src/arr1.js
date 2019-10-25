/**
 * 
 */

function show(){
	var arr=[1,
	         'Hello',
	         function(){
				return "Welcome";
			 },
			 {'city':'Chennai',
			 'state':'TamilNadu'}
	         ];
	var res="";
	res+="First Element " + arr[0] +"<br/>";
	res+="Second Element " + arr[1] +"<br/>";
	res+="Third Element " + arr[2]() +"<br/>";
	res+="Key Value 1 " + arr[3].city +"<br/>";
	res+="Key Value 2 " + arr[3].state +"<br/>";
	
	document.getElementById("res").innerHTML=res;
}