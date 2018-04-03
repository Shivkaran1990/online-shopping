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
	
	
/*	var products=[	
		['1','ABC','1','ABC','1','ABC'],
		['3','ABC','1','ABC','1','ABC'],
		['2','ABC','1','ABC','1','ABC'],
		['5','ABC','1','ABC','1','ABC'],
		['6','ABC','1','ABC','1','ABC'],
		['7','ABC','1','ABC','1','ABC'],
		['8','ABC','1','ABC','1','ABC'],
		['9','ABC','1','ABC','1','ABC']
		
	];*/
	
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
		
		$table.DataTable({
			lengthMenu:[[3,5,10,-1],['3 Records','5 Records','10 Records','All Records']],
		ajax:{
			url:jsonUrl,
			dataSrc:''
		},
		columns:[
				{
					data:'name'
				},
				{
					data:'brand'
				},
				{
					data :'unitPrice',
					mRender : function(data, type, row) {
						return '&#x20A8; ' + data
					}
				}
				,
				{
					data:'quantity'
				},
				{
					data :'id',
					mRender : function(data, type, row) {
						
						var str = '';
						str += '<a href="'
								+ window.contextRoot
								+ '/show/'
								+ data
								+ '/product" class="btn btn-primary"><span class="fa fa-eye">View</span></a>';
						
						
						str += '<a href="'
								+ window.contextRoot
								+ '/cart/add/'
								+ data
								+ '/product" class="btn btn-success"><span class="fa fa-cart-plus ">Add</span></a>';

						
						return str;
					}
				}
			
		]
		
			
		});
		console.log('test is working');
		}
	
	
	
})