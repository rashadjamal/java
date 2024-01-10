let gameSeq=[];
let userSeq=[];


let btns = ["yellow", "red", "purple", "green"];  


let started = false;
let level =0;

let h2 = document.querySelector("h2");

let h3 = document.querySelector("h3");



document.addEventListener("keypress",function(){
    if (started == false){
        console.log("geme is started");
        started = true;
    }
    levelUp();
});

function gameFlash(btn){
btn.classList.add("flash")
setTimeout(function(){
    btn.classList.remove("flash");
}, 250);
}

function userFlash(btn){
    btn.classList.add("userflash")
    setTimeout(function(){
        btn.classList.remove("userflash");
    }, 250);
}



function levelUp(){
    userSeq = [];
level++;
h2.innerText = `level ${level}`;
h3.innerText =`highest Score ${level}`;

  let randIdx = Math.floor(Math.random() *3);
   let randoColor = btns[randIdx];
   let randbtn = document.querySelector(`.${randoColor}`);
   gameSeq.push(randoColor);
   console.log(gameSeq);
gameFlash(randbtn);
}


function cheakAns(idx){
   
    
    if(userSeq[idx] === gameSeq[idx]){
     if (userSeq.length == gameSeq.length){
        setTimeout(levelUp,1000);
     }
    }else{
        h2.innerHTML = `Game Over! your score was  <b> ${level} </b> <br> press any key to start.`;
       
        document.querySelector("body").style.backgroundColor = "red";
        setTimeout(function (){
            document.querySelector("body").style.backgroundColor="white";
        }, 150)
        reset();
    }
}


function btnPress(){
    console.log(this);
  let btn = this;
  userFlash(btn);

  userColor = btn.getAttribute("id");
  userSeq.push(userColor);

  cheakAns(userSeq.length-1);
}

let allBtns = document.querySelectorAll(".btn");

for(btn of allBtns){
    btn.addEventListener("click",btnPress);
}

function reset(){
    started = false;

gameSeq = [];
userSeq= [];
level =0;
}