let qustions =[{
    'que' :'which of the following is a markup language?',
    'a'   : 'HTML',
     'b'   : 'CSS',
     'c' : 'JS',
     'd':   'PHP',
     'correct' : 'a'
},
{
    'que' :'What is year of javaScript launched?',
    'a'   : '1999',
     'b'   : '1995',
     'c' : '1994',
     'd':   "non of the above",
     'correct' : 'b'
},
{
    'que' :'what does css stands for?',
    'a'   : 'Hypertext markup language',
     'b'   : 'Cascading Style Sheet',
     'c' : 'Java Script',
     'd':   'Jason objet Notaion',
     'correct' : 'b'
}
]
let index =0;
let total =qustions.length;
let right=0,
    wrong =0;
let quesBox=document.querySelector("#quesBox");
let opt = document.querySelectorAll(".options")

let loadQuestion =() =>{
    if(index === total){
        return endQuiz()
    }
    
    reset();
   let data =qustions[index]
   console.log(data)
   quesBox.innerText=`${index+1}) ${data.que}`;
   
   opt[0].nextElementSibling.innerText=data.a;
   opt[1].nextElementSibling.innerText=data.b;
   opt[2].nextElementSibling.innerText=data.c;
   opt[3].nextElementSibling.innerText=data.d;
}
let sumitQuiz = () =>{
    let data = qustions[index];
    let ans =getAnswer()
    if(ans === data.correct){
        right++;

    }else{
        wrong++;
    }
    index++;
    loadQuestion();
    return;
}
let getAnswer =() =>{
    let answer;
    opt.forEach(
        (input) =>{
            if(input.checked){
             answer= input.value;
            }
        }
    )
    return answer;
}
let reset= () =>{
    opt.forEach(
        (input)=>{
            input.checked =false;
        }
    )
}

let endQuiz=() =>{
    let box=document.querySelector("#box");
    box.innerHTML=`
    <div style ="text-align:center">
    <h3> Thank you for playin the quiz </h3>
     <h2> ${right } / ${total} are correct</h2>
     </div>`

}

loadQuestion()