$("#myorders").click(function(){
    var customerId= session.getAttribute("login-user").getId();
    var link="http://localhost:9090/orders/all/";
    $.ajax({
		type:'GET',
		url:link+customerId,
		dataType:'json',
		success: function(data){

			$.each(data, function(index, element){
				var z ="";
				
				if(element.mobile == null){
					z =	"<div class='item  col-xs-4 col-lg-4'>"
						+"<div class='thumbnail'>"
						+"<img class='group list-group-image' src='http://placehold.it/400x250/000/fff'/>"
						+"<div class='caption'>"
						+"<h4 class='group inner list-group-item-heading'>"
						+element.accessories.name+"</h4>"
						+"<div class='row'>"
						+"<div class='col-xs-12 col-md-6'>"
						+"<p class='lead'>"
						+element.price
						+"</p>"
						+"</div>"
						+"<div class='col-xs-12 col-md-6'>"
	                    +"<a class='btn btn-success' href='#'>Add to cart</a>"
	                    +"</div></div></div></div></div>";
				}
				
				else{
					z = "<div class='item  col-xs-4 col-lg-4'>"
						+"<div class='thumbnail'>"
						+"<img class='group list-group-image' src='http://placehold.it/400x250/000/fff'/>"
						+"<div class='caption'>"
						+"<h4 class='group inner list-group-item-heading'>"
						+element.mobile.name+"</h4>"
						+"<p class='group inner list-group-item-text'>"
						+"<br>RAM: "+element.mobile.ram
						+"<br>ROM: "+element.mobile.rom
						+"<br>Front Camera: "+element.mobile.fcamera
						+"<br>Rear Camera: "+element.mobile.rcamera
						+"</p>"
						+"<div class='row'>"
						+"<div class='col-xs-12 col-md-6'>"
						+"<p class='lead'>"
						+element.price
						+"</p>"
						+"</div>"
						+"<div class='col-xs-12 col-md-6'>"
	                    +"<a class='btn btn-success' href='#'>Add to cart</a>"
	                    +"</div></div></div></div></div>";
				}
				$("#products").append(z);
			});
			$("#main-item-page").css("display","block");
		}});
	
	
	
	});
	