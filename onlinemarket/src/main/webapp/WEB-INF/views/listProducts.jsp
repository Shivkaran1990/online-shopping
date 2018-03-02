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
					<c:if test="${userClickAllProducts==true}">
						<ol class="breadcrumb">
							<li><a href="${contextRoot}/homepage">Home</a></li>
							<li class="active"></li>
						</ol>
					</c:if>
					<c:if test="${userClickCategoryProducts==true}">
						<ol class="breadcrumb">
							<li><a href="${contextRoot}/homepage">Home </a></li> /
							<li class="active">Category </li> /
							<li class="active">${category.name}</li>
						</ol>
					</c:if>
					
				</div>
			</div>
		</div>
	</div>
</div>