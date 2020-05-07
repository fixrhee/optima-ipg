<!doctype html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Jatelindo Payment Page - Redirect</title>
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<meta name="apple-mobile-web-app-capable" content="yes">
<meta name="apple-mobile-web-app-status-bar-style" content="black">
<!--[if lt IE 9]>
<script src="http://html5shiv.googlecode.com/svn/trunk/html5.js"></script>
<![endif]-->

<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>   
</head>

<body onload="document.bankTransferRedirect.submit();">
	<div>
		<form id="bankTransferRedirect" name="bankTransferRedirect" role="form" class="form-horizontal" action="/payment/bankTransfer" method="POST" modelAttribute="transfer">								
		<input type="hidden" name="name" id="name" value="${name}" class="form-control validate">
		<input type="hidden" name="email" id="email" value="${email}" class="form-control validate">
		<input type="hidden" name="msisdn" id="msisdn" value="${msisdn}" class="form-control validate">
		<input type="hidden" name="ticketID" id="ticketID" value="${ticketID}" class="form-control validate">
		<input type="hidden" name="description" id="description" value="${description}" class="form-control validate">
		<input type="hidden" name="amount" id="amount" value="${amount}" class="form-control validate">
		<button type="submit" class="btn btn-default" data-toggle="modal" style="width:100%;">Bank Transfer
		</button>
		</form>
	</div>		    
</body>
</html>
