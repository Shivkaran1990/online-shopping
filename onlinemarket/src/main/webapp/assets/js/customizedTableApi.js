function createProductTable(data) {
	for (var i = 0; i < data.length; i++) {
		drawRow(data[i]);
	}
}

function drawRow(rowData) {
	var str = '';
	str = '<a href="'+ window.contextRoot+ '/show/'+ rowData.id
			+ '/product" class="btn btn-primary"><span class="fa fa-eye"></span></a> ';
	if (rowData.quantity < 1) {
		 str += '<a href="'+ window.contextRoot+ '/cart/add/'+ rowData.id
				+ '/product" class="btn btn-success disabled"><span class="fa fa-cart-plus "></span></a>';
	} else {
		str += '<a href="'+ window.contextRoot+ '/cart/add/'+ rowData.id
				+ '/product" class="btn btn-success"><span class="fa fa-cart-plus "></span></a>';
	}

	var row = $("<tr />")
	$("#productListTable").append(row);
	row.append($("<td>" + '<img src="' + window.contextRoot
			+ '/resources/images/' + rowData.code + '.jpg" class="img_size">'
			+ "</td>"));
	row.append($("<td>" + rowData.name + "</td>"));
	row.append($("<td>" + rowData.brand + "</td>"));
	row.append($("<td>" + "&#8360; " + rowData.unitPrice + "</td>"));
	if(rowData.quantity < 1)
		{
		row.append($("<td>" + '<span style="color:red">Out of Stock! </span>' + "</td>"));
		}else
			{
			row.append($("<td>" + rowData.quantity + "</td>"));
			}
	
	row.append($("<td>" + str + "</td>"));
}