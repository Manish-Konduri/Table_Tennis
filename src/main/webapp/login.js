$(document).ready(function(){
$("#loginbtn").on("click", function(){
console.log("hi");
var email = $('#Email').val();
var password = $('#pwd').val();
$.get('log', {
Email : email,
pwd : password
}, function(responseText) {
alert(responseText);
});
});
});