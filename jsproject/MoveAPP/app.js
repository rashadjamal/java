
let searchForm = document.querySelector("form");
let movecontainer = document.querySelector(".move-container");
let inptbox = document.querySelector(".inptbox");

//function fecth move deatils using omdbb api
let getMovieInfo =  async(movie) => {
    let  myApiKey ="https://www.omdbapi.com/?i=tt3896198&apikey=a09556c3"
    let url ='http://www.omdbapi.com/?apikey=[yourkey]&=${myApiKey}&t=${movie}';

    let response = await fetch (url);
    let data =  await response.json();

    console.log(data);

}


searchForm.addEventListener("submit", (e)=>{
    e.preventDefault();
  let movieName = inptbox.value.trim();
  if(movieName !== ''){
    getMovieInfo(movieName);
  }

});
