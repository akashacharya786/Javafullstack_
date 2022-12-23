let arr=[]
function data(){
    var name = document.getElementById("formGroupExample1").value;
    var id  = document.getElementById("formGroupExample2").value;
    var date = document.getElementById("formGroupExample3").value;
    var hours = parseInt(document.getElementById("formGroupExample4").value);
    var des = document.getElementById("formGroupExample5").value;
    arr.push(name);
    arr.push(id);
    arr.push(date);
    arr.push(hours);
    arr.push(des);

    if(arr[4] == "Manager"){
        var salary = arr[3]*90;
       
    }
    else if(arr[4] == "Consultant"){
    
        var salary = arr[3]*70;
        
    }
    else if(arr[4] == "Trainee"){
        var salary = arr[3]*45;
        
    }
    var print = arr[0]+" "+"who is a"+" "+arr[4]+" "+"will get $"+" "+salary;
    localStorage.setItem("print",print);
}


