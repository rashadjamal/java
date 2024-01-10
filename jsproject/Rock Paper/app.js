let userScore =0;
let compScore =0;

const choices = document.querySelectorAll(".choice")
const msg = document.querySelector("#msg")
const body =document.querySelector("body");


const userScorePara = document.querySelector("#user-score");
const compScorePara = document.querySelector("#comp-score");

const genCompChoice =() =>{
    const options =["rock", "paper","scissors"];
    const randIdx =Math.floor(Math.random()*3);
    return options[randIdx];
};

const drawGame = () =>{
    msg.innerText = "Game was Draw. Play again."
    msg.style.backgroundColor ="#081b31"
    body.style.backgroundColor="#081b31"
    

}

const showWinner = (userWin,userChoice,compChoice) =>{
if(userWin){
   userScore++;
   userScorePara.innerText = userScore;
   userScorePara.style.color="#fff"
    msg.innerText = `you win!  Your ${userChoice} beats ${compChoice}`;
    msg.style.backgroundColor ="green"
    body.style.backgroundColor="green"
  
}else{
    compScore++;
    compScorePara.innerText = compScore;
    compScorePara.style.color="#fff"
    msg.innerText = `you lose. ${compChoice} beats your ${userChoice}`;
    msg.style.backgroundColor ="red"
    body.style.backgroundColor="red"
}
}
    


const playGame =(userChoice) =>{
   
    //generate computer
    const compChoice = genCompChoice();
   

    if(userChoice === compChoice){
    //draw game
 drawGame();
    } else{
        let userWin = true;
   if(userChoice === "rock"){

    userWin=compChoice === "paper" ?  false : true;

   }else if (userChoice === "paper"){
     userWin = compChoice === "scissors" ? false : true
   }else{

    userWin = compChoice === "rock" ? false : true;
   }
   showWinner(userWin,userChoice,compChoice);
    }
};



choices.forEach((choice)=>{
    choice.addEventListener("click",() =>{
        const userChoice=choice.getAttribute("id");
      
        playGame(userChoice)

    })
})