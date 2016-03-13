$(document).ready(function() {
	
	
	$("#botao1").click(function() {
		$("#p1").show("slow");
		$("#p2").hide("slow");
	});
	
	$("#botao2").click(function() {
		$("#p1").hide("slow");
		$("#p2").show("slow");
	});
	
	$("#botao3").click(function() {
		$("#p3").show("slow");
		$("#p4").hide("slow");
	});
	
	$("#botao4").click(function() {
		$("#p3").hide("slow");
		$("#p4").show("slow");
	});
	

	
});
