var hyperlinks = document.querySelectorAll('a');
hyperlinks.forEach(function(elem){
	elem.addEventListener('mouseover', mouseOver);
	elem.addEventListener('mouseout', mouseOut);
})
function mouseOver(){
	this.style.fontSize = '26px';
}
function mouseOut(){
	this.style.fontSize = '22px';
}