$(function() {
	switch (menu) {
	
	case'About Us':
		$('#about').addClass('active');
		break;
		
	case'Contact Us':
		$('#contactus').addClass('active');
		break;
		
	default:
		$('#home').addClass('active');
		

	}
})