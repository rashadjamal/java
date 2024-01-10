let inputbox =document.getElementById("#input-box");

let listcontainer =document.getElementById("#list-containe");


function addTask(){
   
    if(inputbox.value === ''){
        alert("you must write something");
    }else{
        let li =document.createElement("li");
        li.innerHTML= inputbox.value;
        listcontainer.appendChild(li);
    }
}