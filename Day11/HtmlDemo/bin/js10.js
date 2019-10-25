/**
 * 
 */
function show(){
	var res="";
	var obj=new Date();
	res+="Today's date is " + obj.getDate() + "<br/>";
	var month=obj.getMonth();
	month=month+1;
	res+="Month is " + month +"<br/>";
	res+="Year is " + obj.getFullYear() + "<br/>";
	res+="Hours " +obj.getHours() + "<br/>";
	res+="Minutes " +obj.getMinutes() +"<br/>";
	res+="seconds " +obj.getSeconds() + "<br/>";
	document.getElementById("res").innerHTML=res;
}