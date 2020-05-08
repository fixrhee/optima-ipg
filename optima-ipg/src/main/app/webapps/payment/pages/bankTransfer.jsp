<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<html>
	<head>
		<link rel="shortcut icon" href="image/NB.png" />
		<meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
		<title>Payment Page</title>
		<link rel="stylesheet" href="css/bootstrap.min.css" />
		<link rel="stylesheet" href="css/optima.css" />
		<link rel="stylesheet" href="css/main.min.css" />
	</head>
	<body>
		<div class="container">
			<div class="main-content">
				<div class="row-5">
					<div class="col-sm-4 hidden-xs">
						<div class="box clearfix">
							<div class="invoice">
								<div class="content">
									<h3 style="margin-top: 0">Merchant</h3>
									<h2>${eventName}</h2>
									<br />	
									<h3>Description</h3>
									<p>${description}</p>
									<h3>Amount</h3>
									<p>${amount}</p>	
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
								<p>Please provide your name, phone number, email and click <b>SUBMIT</b> to get your <b>Payment Code</b>. Or click <b>CANCEL</b> to close this page</p>
								<form id="payment" name="ecommform" role="form" class="form-horizontal" action="/payment/submitTransferForm" method="post" modelAttribute="transfer">
									<div class="form-group">
										<label class="control-label col-md-3 col-sm-3 col-xs-12" for="bankVAList">Bank : </label>
										<div class="col-md-6 col-sm-6 col-xs-12">
											<select name="bankID" class="select2_single form-control" tabindex="-1" required/>
												<option value="">Select Bank</option>
												<c:forEach var="bankVAList" items="${bankVAList}">
													<option name="bankVAList" id="bankVAList" value="${bankVAList.id}">${bankVAList.bankName}</option>
												</c:forEach>
											</select>
										</div>
									</div>
									<div class="form-group">
										<label class="col-sm-3 control-label">Name</label>
										<div class="col-sm-9">
											<span style="border:none; box-shadow: none; font-size: 12; color:red;">${status}</span>
											<input id="name" name="name" required="required" class="form-control" type="text" value="">
										</div>
									</div>
									<div class="form-group">
										<label class="col-sm-3 control-label">Mobile No.</label>
										<div class="col-sm-9">
											<input id="msisdn" name="msisdn" required="required" class="form-control" type="tel" value="" pattern="\d{1,20}">
											<span>Format: 08xx xxxx xxxx</span>
										</div>
									</div>
									<div class="form-group">
										<label class="col-sm-3 control-label">Email</label>
										<div class="col-sm-9">
											<input type="email" id="email" required="required" name="email" class="form-control">
										</div>
									</div>
									<c:choose>
										<c:when test="${amount1 == 0}">
											<div class="form-group">
												<label class="col-sm-3 control-label">Amount</label>
												<div class="col-sm-9">
													<input type="text" id="amountFix" name="amountFix" min="0" pattern="[0-9]{1,25}" class="form-control">
												</div>
											</div>
										</c:when>
										<c:otherwise>
											<input type="hidden" id="amountFix" name="amountFix" value="${amount1}" class="form-control">
										</c:otherwise>
									</c:choose>
									<div class="form-group">
										<div class="col-sm-offset-3 col-sm-6">
											<input id="amountFix2" name="amountFix2" class="form-control" type="hidden">
											<input id="ticketID" name="ticketID" class="form-control" type="hidden" value="${ticketID}">
											<button type="submit" class="btn btn-success" onclick="status();">Submit</button>
											<button type="button" onclick="quitBox('quit');" class="btn btn-success">Cancel</button>
										</div>
									</div>
								</form>
							</div>
						</div>
					</div>
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