$(function() {
	switch (menu) {
	
	case'About Us':
		$('#about').addClass('active');
		break;
		
	case'Contact Us':
		$('#contactus').addClass('active');
		break;
		
	case'All Products':
		$('#listofproduct').addClass('active');
		break;
		
	default:
		$('#listofproduct').addClass('active');
	    $('#a_'+menu).addClass('active');
		

	}
})