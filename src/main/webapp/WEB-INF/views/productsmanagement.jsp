<%@ include file="../layout/taglib.jsp"%>

<div class="row">		
		<c:if test="${ not empty notificationMessage }">
			<div class="col-md-12">
                <div class="alert alert-${notificationMessage.type}">
                    <button type="button" class="close" data-dismiss="alert" aria-hidden="true">×</button>
                    <p>${notificationMessage.message}.</p>
                </div>
            </div>
		</c:if>
</div>

<section class="widget">
                    
                    <div class="body">
                        <a href="productForm"><button  type="button" class="btn btn-primary" data-placement="top" data-original-title=".btn .btn-primary">
                                       <span class="glyphicon glyphicon-plus"></span> Add product
                                    </button></a>
                    </div>
                    
                    <div class="widget-table-overflow">
                    <c:if test="${not empty products }">
                        <table id="datatable-table" class="table table-striped table-lg mt-lg mb-0">
                            <thead class="no-bd">
                            <tr>
                                <th>
                                    <div class="checkbox">
                                        <input id="checkbox210" type="checkbox" data-check-all="">
                                        <label for="checkbox210"></label>
                                    </div>
                                </th>
                                <th>Product ID</th>
                                <th>Name</th>
                                <th>Price</th>
                                <th class="text-align-center">Media</th>
                            </tr>
                            </thead>
                            <tbody>
                            <c:forEach items="${products}" var="product">
                            <tr>
                                <td>
                                    <div class="checkbox">
                                        <input id="${product.id}" type="checkbox" data-check-all="">
                                        <label for="${product.id}"></label>
                                    </div>
                                </td>
                                <td>${product.id}</td>
                                <td>${product.name}</td>
                                <td>1254</td>
                                <td class="text-align-center">
									<img class="img-rounded" src="${pageContext.request.contextPath}/resources/img/jpeg/1.jpg" alt="" height="50">
								</td>
                            </tr>
                            
                            </c:forEach>
                            
                            
                            </tbody>
                        </table>
                        </c:if>
                        <c:if test="${ empty products }">
                        
                        <div class="jumbotron">
                        <div class="container">
                            <p class="lead"><em>NO DATA TO DISPLAY</em></p>
                
                        </div>
                    </div>
                        	
                        
                        </c:if>
                        </div>
                       
                    
                </section>
                 <div class="row">
                        
                        <div class="text-right">
                        <div class="dataTables_paginate paging_bootstrap" id="datatable-table_paginate">
                        <ul class="pagination no-margin">
                        <li class="prev disabled"><a href="#">Previous</a></li>
                        <li class="active"><a href="#">1</a></li>
                        <li class="next disabled"><a href="#">Next</a></li>
                        </ul>
                        </div>
                        </div>
                        </div>

                        
                       
						

                