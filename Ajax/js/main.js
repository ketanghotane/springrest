//create the object of XML HTTP Request

var xhr= new XMLHttpRequest();
xhr.open('GET','http://localhost:9098/employees',true);
xhr.responseType = 'text';
xhr.send();


xhr.onload= function(){
    if(xhr.status == 200){
        var data=JSON.parse(xhr.responseText);
        var myString=" <table> ";
        for(var i=0; i<data.length; i++){

            myString += "<tr>";
            myString += "<td>"+data[i].employeeId+"</td>";
            myString += "<td>"+data[i].employeeName+"</td>";
            myString += "<td>"+data[i].employeeSalary+"</td>";
            myString += "</tr>";
        }
        myString += "</table>";
        document.getElementById("container").innerHTML=myString;

    } 
}



