function add(){
    if(document.getElementById("formGroupExampleInput1").value<0){
        alert("Please Enter Positive Number");
    }
    var x = parseInt(document.getElementById("formGroupExampleInput1").value);
    var y = parseInt(document.getElementById("formGroupExampleInput2").value);
     
    var sum = x + y;
    document.getElementById("result").innerHTML = sum;
}
function sub(){
    var x = parseInt(document.getElementById("formGroupExampleInput1").value);
    var y = parseInt(document.getElementById("formGroupExampleInput2").value);
     
    var sub = x - y;
    document.getElementById("result").innerHTML = sub;
}
function mul(){
    var x = parseInt(document.getElementById("formGroupExampleInput1").value);
    var y = parseInt(document.getElementById("formGroupExampleInput2").value);
     
    var mul = x * y;
    document.getElementById("result").innerHTML = mul;
}
function div(){
    var x = parseInt(document.getElementById("formGroupExampleInput1").value);
    var y = parseInt(document.getElementById("formGroupExampleInput2").value);
     
    var division = x / y;
    document.getElementById("result").innerHTML = division;
}