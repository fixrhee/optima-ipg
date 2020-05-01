<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!doctype html>
<html lang="en">

<head>
	<meta charset="UTF-8">
	<title>OPTIMA - Redirect</title>
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
	<meta name="apple-mobile-web-app-capable" content="yes">
	<meta name="apple-mobile-web-app-status-bar-style" content="black">
	<!--[if lt IE 9]>
	<script src="http://html5shiv.googlecode.com/svn/trunk/html5.js"></script>
	<![endif]-->

	<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
	<script type="text/javascript">
		var DYN = (new Date%9e6).toString(36);
		
		window['COUNTER' + DYN] = 10;
		setTimeout(countDown,1000);
		
		function countDown(){
				window['COUNTER' + DYN]--;
				if(window['COUNTER' + DYN] > 0){
					setTimeout(countDown,1000);
				}
				else
				{
					$('#TEXT-CONTINUE').show();
					$('#BTN-CONTINUE').show();
				}
		}
			
		$(document).ready(function(){
			$('#TEXT-CONTINUE').hide();
			$('#BTN-CONTINUE').hide();
		});    						
	</script>

</head>

<body class="tempdefault tempcolor tempone" onload="document.formRedirect.submit()">

	<section class="default-width">

		<div class="head padd-default">
			<div class="left-head fleft">
			</div>

			<div class="clear"></div>
		</div>

		<br />

		<div class="">

			<div class="loading">
				<div class="spinner">
					<div class="double-bounce1"></div>
					<div class="double-bounce2"></div>
				</div>
				<div class="color-one">
					Please wait.<br />
				Your request is being processed...<br />
					<br />
					<span id="TEXT-CONTINUE">Click button below if the page is not change</span>
				</div>
			</div>

			<form action="${urlRedirection}" method="POST"
				id="formRedirect" name="formRedirect">

				<input type="submit" class="default-btn-page font-reg" id="BTN-CONTINUE" value="Continue">
		</form>

		</div>

	</section>

	<div class="footer">
		<div id="copyright" class="">Copyright OPTIMA 2019</div>
	</div>

</body>

</html>