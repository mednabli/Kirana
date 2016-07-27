<%@ include file="../layout/taglib.jsp"%>




		<div class="row">
            <div class="col-md-2 col-sm-4 col-xs-6">
                <div class="box">
                    <div class="icon">
                        <i class="fa fa-calendar"></i>
                    </div>
                    <div class="description">
                        <strong>14</strong> meetings
                    </div>
                </div>
            </div>
            <div class="col-md-2 col-sm-4 col-xs-6">
                <div class="box">
                    <div class="big-text">
                        3.28%
                    </div>
                    <div class="description">
                        <i class="fa fa-user"></i>
                        User Growth
                    </div>
                </div>
            </div>
        </div>

<div class="col-md-4" id="productManagement" style="cursor:pointer">
	<section class="widget normal">
		<header class="text-align-center"><h3>product management</h3></header>
        <div class="body">
            <div class="text-align-center">
                <img src="${pageContext.request.contextPath}/resources/img/jpeg/4.jpg" alt="img" style="max-width:100%">
            </div>
        </div>
    </section>
</div>

<div class="col-md-4" id="userManagement" style="cursor:pointer">
	<section class="widget normal">
		<header class="text-align-center"><h3>User management</h3></header>
        <div class="body">
            <div class="text-align-center">
                <img src="${pageContext.request.contextPath}/resources/img/jpeg/3.jpg" alt="img" style="max-width:100%">
            </div>
        </div>
    </section>
</div>

<script src="${pageContext.request.contextPath}/resources/lib/jquery/dist/jquery.min.js"></script>
<script type="text/javascript">
<!--

//-->
$("#productManagement").click(function(){
	window.location.href = "products";
});

</script>
