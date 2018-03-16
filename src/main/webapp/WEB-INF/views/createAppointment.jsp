<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css"
	integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7"
	crossorigin="anonymous">
<!-- Latest compiled and minified JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"
	integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS"
	crossorigin="anonymous"></script>
<script	src="http://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"
	type="text/javascript"></script>
<script type="text/javascript">
	var test = "";
	$(document)
			.ready(
					function() {

						$
								.ajax({
									"url" : "${pageContext.request.contextPath}/getlistDoctor",
									"type" : "GET",
									data : {
										id : $("#txtinput").val()
									},
									"success" : myAjaxSuccessFunction,
									"error" : ajaxFailure,

								});

						$("#optStatus").change(function() {
							//	alert($('#optStatus option:selected').val());
							getDatafromserver();
						});
						function myAjaxSuccessFunctionDate(data) {
							//alert("asd");

							for (var i = 0; i < data.length; i++) {
								$('#opttime').append(
										new Option(data[i].date, data[i].id));
								//$('<option>').val(key).text(value).appendTo($select);
								//	alert(data[i].date);
							}
							$("#scheduleId").val(
									$('#opttime option:selected').text());
							//$("#doctorid").val(
							//	$('#optStatus option:selected').val());

						}
						function getDatafromserver() {

							$
									.ajax({
										"url" : "${pageContext.request.contextPath}/getlistdate/"
												+ $(
														'#optStatus option:selected')
														.val(),
										"type" : "GET",

										"success" : myAjaxSuccessFunctionDate,
										"error" : ajaxFailure,

									});

						}
						;
						function myAjaxSuccessFunction(data) {
							/* console.log(data);
							test = data;

							alert(data.length); */
							for (var i = 0; i < data.length; i++) {
								$('#optStatus').append(
										new Option(data[i].firstName,
												data[i].id));
								//	getDatafromserver();
								//$('<option>').val(key).text(value).appendTo($select);
								//alert(data[i].date);
							}
							//	$("#doctorid").val(data[0].id);
						}
						function ajaxFailure(xhr, status, exception) {
							console.log(xhr, status, exception);
						}

					});
</script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>make</title>
<style type="text/css">
#divprop {
	width: 250px;
	top: 20px;
	left: 100px;
	margin-left: 110px;
	margin-top: 30px;
}
</style>

</head>
<body>
	<div style="margin-left: 400px; margin-top:130pt; font: menu; font-size: larger;">   

	<div id="divprop">
	
	
	<h3>Make an appointment</h1>
	 <a  style="margin-left: 400px; margin-top:130pt;  font: menu; font-size:medium;" href="/E_Clinic_EA/j_spring_security_logout">logout</a>
	
		<form method="GET"
			action="${pageContext.request.contextPath}/appointment/makeAppointment">
			<!-- 	<input type="hidden" name="doctorid" /> -->
			<fieldset class="form-group">
				<label for="formGroupExampleInput">Select Doctor</label> <select
					class="form-control"  id="optStatus"
					name="optStatus">
				</select>
			</fieldset>
			<fieldset class="form-group">
				<label for="formGroupExampleInput">select Time</label> <input type="hidden" name="scheduleId" />
				<select class="form-control"  id="opttime" name="opttime">
				</select>
			</fieldset>
			<br /> <input class="selectpicker" type="submit"
				value="Make Appoinment" />
		</form>
	</div>
	
	</div>
	
</body>
</html>