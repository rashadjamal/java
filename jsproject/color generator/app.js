let  getColor=()=>{
  const randomNumber= Math.floor( Math.random() *16777215);
  let randomCode= "#" +randomNumber.toString(16);
  console.log(randomNumber,randomCode);
  document.body.style.backgroundColor = randomCode;
  let h2 =document.querySelector("#color-code");
  h2.innerText=randomCode;
  navigator.clipboard.writeText(randomCode)


}
//  document.getElementById("btn").addEventListener("click",getColor);
let btn =document.querySelector("#btn");
btn.addEventListener("click",getColor)
 
getColor();