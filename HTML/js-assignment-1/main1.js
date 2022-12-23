let count =1;
function lucky(){
    var lucky_number = parseInt(document.getElementById("exampleFormControlInput1").value);
    if(lucky_number == 5){
        document.getElementById("result").innerHTML = "Great!! You took "+count+" attempts to guess it right. ";   
    }
    else{
        document.getElementById("result").innerHTML = "Not Really! Give it another try…… ";
        count++;
    }
}