/**
 * 
 */
function show(){
	var today=new Date();
	var fullYear=today.getFullYear();
	var future=new Date("August 15, "+fullYear);
	var diff=future.getTime()-today.getTime();
	var days=Math.ceil(diff/(1000 * 60 * 60 * 24));
	var res="Only <u>" + days + "</u> days left till New year Day";
	document.getElementById("res").innerHTML=res;
	
}