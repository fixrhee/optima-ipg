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
				
					<div class="col-sm-4">
						<div class="box clearfix">
							<div class="invoice">
								<div class="content">
									<h3 style="margin-top: 0">Organizer</h3>
									<h2>${eventName}</h2>
									<br />	
									<h3>Description</h3>
									<p>${description}</p>
									<h3>Amount</h3>
									<p>${formattedAmount}</p>	
									<br />	
									<br />
									<br />
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
								<p>Please <b>SELECT</b> the provided payment option(s) below. Or click <b>CANCEL</b> to close this page</p>
						<div class="row">			
							<div class="col-sm-12">
							<form id="bankTransferPayment" name="bankTransferform" role="form" class="form-horizontal" action="${receiveURL}" method="post" modelAttribute="transfer">								
					          <input type="hidden" name="MALLID" id="MALLID" value="${mallID}" class="form-control validate">
					          <input type="hidden" name="CHAINMERCHANT" id="CHAINMERCHANT" value="NA" class="form-control validate">
					          <input type="hidden" name="AMOUNT" id="AMOUNT" value="${amount}" class="form-control validate">
					          <input type="hidden" name="PURCHASEAMOUNT" id="PURCHASEAMOUNT" value="${amount}" class="form-control validate">
							  <input type="hidden" name="TRANSIDMERCHANT" id="TRANSIDMERCHANT" value="${transID}" class="form-control validate">
					          <input type="hidden" name="WORDS" id="WORDS" value="${words}" class="form-control validate">
					          <input type="hidden" name="REQUESTDATETIME" id="REQUESTDATETIME" value="${requestDate}" class="form-control validate">
					          <input type="hidden" name="SESSIONID" id="SESSIONID" value="${sessionID}" class="form-control validate">
					          <input type="hidden" name="EMAIL" id="EMAIL" value="${email}" class="form-control validate">
					          <input type="hidden" name="NAME" id="NAME" value="${name}" class="form-control validate">
					          <input type="hidden" name="CURRENCY" id="CURRENCY" value="${currency}" class="form-control validate">
					          <input type="hidden" name="PURCHASECURRENCY" id="PURCHASECURRENCY" value="${currency}" class="form-control validate">
					          <input type="hidden" name="PAYMENTCHANNEL" id="PAYMENTCHANNEL" value="15" class="form-control validate">
					          <input type="hidden" name="BASKET" id="BASKET" value="${basket}" class="form-control validate">
					    		  <button type="submit" class="btn btn-default" data-toggle="modal" style="width:100%;">Credit Card
							</button>
							</form>
  							</div>
						</div>	
    						<br />
    						<div class="row">			
							<div class="col-sm-12">
							<form id="bankTransferPayment" name="bankTransferform" role="form" class="form-horizontal" action="/payment/bankTransfer" method="post" modelAttribute="transfer">								
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
    						</div>	  
    						<br />
    						
    						<!-- div class="row">			
							<div class="col-sm-12">
							<button type="button" class="btn btn-default" data-toggle="modal" data-target="#modalLoginForm" style="width:100%;">OPTIMA eMoney
							</button>
  							</div>
						</div>	
    						<br /-->
 
					
					<!-- BANK TRANSFER MODAL -->
					 <div class="modal fade" id="modalBankTransferForm" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
					  <div class="modal-dialog" role="document">
					    <div class="modal-content">
					      <div class="modal-header text-center">
					        <h4 class="modal-title w-100 font-weight-bold">Bank Transfer Payment</h4>
					        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
					          <span aria-hidden="true">&times;</span>
					        </button>
					        <br />
					      </div>
					      <div class="modal-body mx-3">
					      <form id="bankTransferPayment" name="bankTransferform" role="form" class="form-horizontal" action="/payment/bankTransfer" method="post" modelAttribute="transfer">								
					        <div class="md-form mb-5">
					          <label data-error="wrong" data-success="right" for="defaultForm-email">Your Name :</label>
					          <input type="text" name="name" id="name" class="form-control validate">
					        </div>
							<br />
					        <div class="md-form mb-5">
					          <label data-error="wrong" data-success="right" for="defaultForm-pass">Your Email :</label>
					          <input type="text" name="email" id="email" class="form-control validate">
					        </div>
					        <br />
					        <div class="md-form mb-5">
					          <label data-error="wrong" data-success="right" for="defaultForm-pass">Your Reference Number :</label>
					          <input type="text" name="msisdn" id="msisdn" class="form-control validate">
					          <input type="hidden" name="ticketID" id="ticketID" value="${ticketID}" class="form-control validate">
					          <input type="hidden" name="description" id="description" value="${description}" class="form-control validate">
					          <input type="hidden" name="amount" id="amount" value="${amount}" class="form-control validate">
					        </div>
					        <br />
					      </div>
					      <div class="modal-footer d-flex justify-content-center">
					        <button type="submit" class="btn btn-primary">Process Payment</button>
					      </div>
					      </form>
					    </div>
					  </div>
					</div>



							</div> <!-- main -->
						</div><!-- login -->
					</div><!-- box -->
					
					
				</div>
			</div>
		 </div> 
		

	    <script>
		    function quitBox(cmd) { 
		      if (cmd=='quit') {
		           open(location, '_self').close(); 
		       }
		       return false;
		     }   
	    </script>
	    
	</body>
</html>