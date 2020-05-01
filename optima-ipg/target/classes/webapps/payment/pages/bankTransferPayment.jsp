<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<html>
	<head>
		<link rel="shortcut icon" href="image/NB.png" />
		<meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
		<title>Payment Page</title>
		<link rel="stylesheet" href="css/optima.css" />
		<link rel="stylesheet" href="css/main.min.css" />
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
		
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
	</head>
	<body>
		<div class="container">
			<div class="main-content">
				<div class="row-5">
					<div class="col-sm-4 hidden-xs">
						<div class="box clearfix">
							<div class="invoice">
								<div class="content">
									<h3 style="margin-top: 0">Organizer</h3>
									<h2>${eventName}</h2>
									<br />	
									<h3>Description</h3>
									<p>${description}</p>
									<h3>Amount</h3>
									<p id="test">${amount}</p>	
									<br />	
									<br />	
									<br />	
									<br />
									<br />
									<br />
									<br />
									<h3>Powered by OPTIMA</h3>
								</div><!--.content-->
							</div><!--.invoice-->
						</div><!--.box-->
					</div><!--.col-->
					
					<div class="box col-sm-8">
						<div class="login">
							<div class="head">
								<div class="logo"><img src="image/${username}.png" onerror="this.onerror=null;this.src='image/default.png';"></div>
							</div>
							<div class="midbar hidden-xs"></div>
						
								<div class="main">
									<p>Below is Your <b>Payment Code</b>. <br/> Please do transfer before <b>${expiredAt}</b></p>
									<div style="width: 100%; text-align:center; margin: 0px auto;">
										<hr/>
										<h1><input style="text-align:center;border:0px;" type="text" id="nomorbayar" value="${paymentCode}" readonly/></h1>
										<hr/>
									</div>
	
									<p><a href="#" onclick="copy()"><u>Copy Payment Code</u></a><br><br>Please note, we only <b>accept your payment</b> in accordance with the amount of payment as stated beside, we will <b>not process neither do refund</b> if your payment amount is not the exact amount as stated</p>
								</div>
							</div>
						</div>
					</div>
					
				</div>
			</div>
		</div>  
		
		<script>
			function copy() {
			  /* Get the text field */
			  var copyText = document.getElementById("nomorbayar");
			
			  /* Select the text field */
			  copyText.select();
			
			  /* Copy the text inside the text field */
			  document.execCommand("copy");
			
			}
		</script>
	</body>
</html>