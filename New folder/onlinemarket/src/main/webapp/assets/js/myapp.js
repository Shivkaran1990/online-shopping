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
	
	
	var products=[	
		['1','ABC','1','ABC','1','ABC'],
		['3','ABC','1','ABC','1','ABC'],
		['2','ABC','1','ABC','1','ABC'],
		['5','ABC','1','ABC','1','ABC'],
		['6','ABC','1','ABC','1','ABC'],
		['7','ABC','1','ABC','1','ABC'],
		['8','ABC','1','ABC','1','ABC'],
		['9','ABC','1','ABC','1','ABC']
		
	];
	
	var $table=$('#productListTable');
	
	if($table.length)
		{
		$table.DataTable({
			lengthMenu:[[3,5,10,-1],['3 Records','5 Records','10 Records','All Records']],
			data:products});
		console.log('test is working');
		}
	
	
	
})