$(function() {
	jsonUrl = window.contextRoot + '/json/data/all/category';

	callajx(jsonUrl);


function callajx(jsonUrl)
{
	$.ajax({url: jsonUrl, success: function(data){
		categoryfiled(data);
    }});
 }

});





function categoryfiled(data)
{
	var mySelect = $('#category');
	for (var i = 0; i < data.length; i++) {
		
		this.$('select#categories').append('<option>'+data[i].name+'</option>');
	/*	$('#category').append('&lt;option value='+data[i].name+' &gt; &lt;/option&gt;');*/
	}
	
 }



$(document).ready(function(){
	
	$("#submitproduct").click(function() {

		var data = {}
		data["id"] = $("#id").val();
		data["domain"] = $("#domain").val();
		data["name"] = $("#name").val();
         var urlpath=window.contextRoot + '/manage/addProduct';
		$.ajax({
	             type: "POST",
	             contentType: "application/json",
	             url: urlpath,
	             data: JSON.stringify(data),
	             dataType: 'json',
	             timeout: 600000,
	             success: function (data) {
	                 alert("Success");
	             },
	             error: function (e) {
	            	 alert("fail");
	                 
	             }
		
		});
	

	});
	
	
	
	
	 $("#createCatButton").click(function(){
		
		 var data = {};
		 data["categoryname"] =$('#catNameID').val();
		 data["Discription"] = $('#catdescID').val();
		 data["isactive"] = $('#isActiveID').val();
		 data["fileid"]= $('#myFileID').val();
		 
	     var restUri=window.contextRoot + '/manage/addCategory';
    
	     $.ajax({
             type: "POST",
             contentType: "application/json",
             url: restUri,
             data: JSON.stringify(data),
             dataType: 'json',
             success: function (response) {
            	 alert("Category created");
            	 var jsonUrl=window.contextRoot + '/manage/categories';
            	 callajx(jsonUrl);

             },
             error: function (e) {
            	 alert("fail");
             }
	});
	     
	     
	});
});

