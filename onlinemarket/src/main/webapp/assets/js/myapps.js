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
	case'Home':
		$('#home').addClass('active');
		break;
		
	default:
		$('#listofproduct').addClass('active');
	    $('#a_'+menu).addClass('active');
	    break;

	}
	
	var $table=$('#productListTable');
	
	if($table.length)
		{
		
		var jsonUrl = '';
		if (window.categoryId == '') {
			jsonUrl = window.contextRoot + '/json/data/all/products';
		} else {
			jsonUrl = window.contextRoot + '/json/data/category/'
					+ window.categoryId + '/products';
		}
		callajx(jsonUrl);
		console.log('test is working');
		}
	
	function callajx(jsonUrl)
	{
		$.ajax({url: jsonUrl, success: function(data){
			createProductTable(data);
        }});
	
	
	 }

	
})