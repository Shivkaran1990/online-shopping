<!DOCTYPE html>
<html lang="en">

<head>
 <script src="${js}/manageproduct.js"></script>
</head>
<body>
<div class="container">
  <div>
    <h3 align="center" style="margin-top: 10;">Add Products</h3>
  </div>
  <hr/>
  <div>
 <!--  <form action="/action_page.php"> -->
    <label ><strong>Enter Product Name :</strong></label>
    <input class="orgnizesize" type="text" id="pname" placeholder="Product Name">

    <label ><strong>Enter Brand Name :</strong></label>
    <input class="orgnizesize" type="text" id="brandname" name="brandname" placeholder="Brand Name">

   <label ><strong>Enter Unit Price :</strong></label>
    <input class="orgnizesize" type="text" id="unitprice" name="unitprice" placeholder="Unit Price">
  
    <label><strong>Quantity Available :</strong></label>
    <input class="orgnizesize" type="text" id="qavail" name="qavail" placeholder="Quantity Available">
  
    <label ><strong>Select Cetegory :</strong></label> <br>
    <select class="orgnizesize" id="categories" name="category" style="width:200px">
    </select>
     <input type="submit" value="Add New Category" data-toggle="modal" data-target="#addnewcategory">
    <br>
    <label ><strong>Product Description :</strong></label>
    <textarea id="productdesc" name="productdesc" placeholder="Write something.." style="height:150px"></textarea>

    <input type="submit" value="Submit" id="submitproduct">
<!--   </form> -->
  </div>
  
  <div id="addnewcategory" class="modal fade" role="dialog">
  <div class="modal-dialog">

    <!-- Modal content-->
    <div class="modal-content">
      <div class="modal-header">
      <h4 class="modal-title">Add New Category</h4>
        <button type="button" class="close" data-dismiss="modal">&times;</button>
        
      </div>
      <div class="modal-body">
        
      <label ><strong>Category Name:</strong></label>
       <input type="text" id="catNameID" placeholder="Enter Category Name..">

      <label ><strong>Description:</strong></label>         
        <input type="text"  id="catdescID" placeholder="Write Something" >

      <label><strong>Active: </strong></label><input type="checkbox" name="isactive" id="isActiveID" style="zoom: 2.5;"> 
      
     <label><strong> Select a file to upload:</strong><label>
     <input type="file" id="myFileID" size="50">

      </div>
      
      <div class="modal-footer">
      <button type="button" id="createCatButton" class="btn btn-primary" data-dismiss="modal">Submit</button>
        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
      </div>
    </div>

  </div>
</div>
  
  
  
</div>
<body>
</html>
