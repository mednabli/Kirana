<%@ include file="../layout/taglib.jsp"%>
<!DOCTYPE html>
<html>

<head><meta http-equiv="content-type" content="text/html;charset=UTF-8">

    <title>Light Blue - Responsive Admin Dashboard Template</title>

        <link href="${pageContext.request.contextPath}/resources/css/application.min.css" rel="stylesheet">
    <link rel="shortcut icon" href="${pageContext.request.contextPath}/resources/img/favicon.png">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <meta charset="utf-8">
    <script>
        
    </script>

</head>

<body>


		<nav id="sidebar" class="sidebar nav-collapse collapse">
            <ul id="side-nav" class="side-nav">
                <li class="">
                    <a href="index-2.html"><i class="fa fa-home"></i> <span class="name">Dashboard</span></a>
                </li>
                <li class="panel ">
                    <a class="accordion-toggle collapsed" data-toggle="collapse" data-parent="#side-nav" href="#forms-collapse"><i class="fa fa-pencil"></i> <span class="name">Forms</span></a>
                    <ul id="forms-collapse" class="panel-collapse collapse ">
                        <li class=""><a href="form_account.html">Account</a></li>
                        <li class=""><a href="form_article.html">Article</a></li>
                    </ul>
                </li>
                <li class="panel active">
                    <a class="accordion-toggle collapsed" data-toggle="collapse" data-parent="#side-nav" href="#stats-collapse" aria-expanded="false"><i class="fa fa-area-chart"></i> <span class="name">Statistics</span></a>
                    <ul id="stats-collapse" class="panel-collapse collapse" aria-expanded="false" style="height: 0px;">
                        <li class="active"><a href="stat_statistics.html">Stats</a></li>
                        <li class=""><a href="stat_charts.html">Charts</a></li>
                        <li class=""><a href="stat_realtime.html">Realtime</a></li>
                    </ul>
                </li>
                <li class="panel ">
                    <a class="accordion-toggle collapsed" data-toggle="collapse" data-parent="#side-nav" href="#ui-collapse"><i class="fa fa-magic"></i> <span class="name">User Interface</span></a>
                    <ul id="ui-collapse" class="panel-collapse collapse ">
                        <li class=""><a href="ui_buttons.html">Buttons</a></li>
                        <li class=""><a href="ui_dialogs.html">Dialogs</a></li>
                    </ul>
                </li>
            </ul>
        </nav>
        
        
        
        <div class="wrap">
        <header class="page-header">
            <div class="navbar">
                <ul class="nav navbar-nav navbar-right pull-right">
                    <li class="visible-phone-landscape">
                        <a href="#" id="search-toggle">
                            <i class="fa fa-search"></i>
                        </a>
                    </li>
                    <li class="dropdown">
                        <a href="#" title="Messages" id="messages" class="dropdown-toggle" data-toggle="dropdown">
                            <i class="glyphicon glyphicon-comment"></i>
                        </a>
                    </li>
                    <li class="dropdown">
                        <a href="#" title="8 support tickets" class="dropdown-toggle" data-toggle="dropdown">
                            <i class="glyphicon glyphicon-globe"></i>
                        </a>
                    </li>
                    <li class="divider"></li>
                    <li class="hidden-xs">
                        <a href="#" id="settings" title="" data-toggle="popover" data-placement="bottom" data-original-title="Settings">
                            <i class="glyphicon glyphicon-cog"></i>
                        </a>
                    </li>
                    <li class="hidden-xs dropdown">
                        <a href="#" title="Account" id="account" class="dropdown-toggle" data-toggle="dropdown">
                            <i class="glyphicon glyphicon-user"></i>
                        </a>
                    </li>
                    <li class="visible-xs">
                        <a href="#" class="btn-navbar" data-toggle="collapse" data-target=".sidebar" title="">
                            <i class="fa fa-bars"></i>
                        </a>
                    </li>
                    <li class="hidden-xs"><a href="login.html"><i class="glyphicon glyphicon-off"></i></a></li>
                </ul>
                
            </div>
        </header>        
        <div class="content container">
        	<h1><tiles:getAsString name="title" /></h1>
			<tiles:insertAttribute name="body"></tiles:insertAttribute>
	    </div>
        <div class="loader-wrap hiding hide">
            <i class="fa fa-circle-o-notch fa-spin"></i>
        </div>
    </div>
</body>

<script src="${pageContext.request.contextPath}/resources/lib/jquery/dist/jquery.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/lib/jquery-pjax/jquery.pjax.js"></script>
<script src="${pageContext.request.contextPath}/resources/lib/bootstrap-sass/assets/javascripts/bootstrap.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/lib/widgster/widgster.js"></script>
<script src="${pageContext.request.contextPath}/resources/lib/underscore/underscore.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/app.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/settings.js"></script>

</html>