<div class="container">

	<div class="row">

		<!-- 	display side bar -->
		<div class="col-md-3">
			<%@include file="./comman/sidebar.jsp"%>
		</div>

		<!-- display products -->
		<div class="col-md-9">
			<!-- bradcrumb commponet -->
			<div class="row">
				<div class="col-lg-12">
					<c:if test="${userClickAllProducts == true}">
						<script>
							window.categoryId = '';
						</script>
						<ol class="breadcrumb">
							<li><a href="${contextRoot}/homepage">Home</a></li>
							<li class="active">All Products</li>
						</ol>
					</c:if>

					<c:if test="${userClickCategoryProducts == true}">
						<script>
							window.categoryId = '${category.id}';
						</script>
						<ol class="breadcrumb">
							<li><a href="${contextRoot}/homepage">Home</a></li>
							<li class="active">Category</li>
							<li class="active">${category.name}</li>
						</ol>
					</c:if>


				</div>
			</div>
			<%@include file="./comman/searchandshow.jsp"%>
			<div class="row">

				<div class="col-lg-12">
					<table id="productListTable"
						class="table  table-striped table-borderd">
						<thead>
							<tr>
							     <th></th>
								<th>Name</th>
								<th>Brand</th>
								<th>Price</th>
								<th>Qty. Available</th>
								<th></th>
								
							
							</tr>
						</thead>
					</table>
				</div>

			</div>

		</div>
	</div>
</div>