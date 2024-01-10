let searchBox = document.querySelector(".searchBox");
let searchBtn = document.querySelector(".searchBtn");
let recpieContainer = document.querySelector(".recpie-container");

let fetchRecipes = (query) =>{
    let data = fetch(`https://www.themealdb.com/api/json/v1/1/search.php?s=Arrabiata`);
    let response  = data.json();
    console.log(response);

}

searchBtn.addEventListener("click", (e)=>{
    e.preventDefault();
    let searchInput = searchBox.value.trim();
    fetchRecipes(searchInput);
});