<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New User</title>
<style type="text/css">
.card {
	border-radius: 4px;
	background: #fff;
	box-shadow: 0 6px 10px rgba(0, 0, 0, .08), 0 0 6px rgba(0, 0, 0, .05);
	transition: .3s transform cubic-bezier(.155, 1.105, .295, 1.12), .3s
		box-shadow, .3s -webkit-transform
		cubic-bezier(.155, 1.105, .295, 1.12);
	cursor: pointer;
}

.card:hover {
	transform: scale(1.05);
	box-shadow: 0 10px 20px rgba(0, 0, 0, .12), 0 4px 8px rgba(0, 0, 0, .06);
}
</style>
<%@include file="Components/common_css_js.jsp"%>
</head>
<body>
	<%@include file="Components/navbar.jsp"%>
	<div class="container-fluid">

		<div class="row mt-5">
			<div class="col-md-4 offset-md-4">

				<div class="card">

					<div class="card-body px-5">

						<h3 class="text-center my-3">Sign up here</h3>
						<form action="RegisterServlet" method="post">
							<div class="form-group">
								<label for="name">User Name</label> <input type="text"
									class="form-control" name="user_name" id="name" aria-describedby="emailHelp"
									placeholder="Enter Name">
							</div>

							<div class="form-group">
								<label for="email">User Email</label> <input type="email"
									class="form-control" id="email" name="user_email" aria-describedby="emailHelp"
									placeholder="Enter E-mail">
							</div>

							<div class="form-group">
								<label for="password">User Password</label> <input
									type="password" class="form-control" id="password"
									aria-describedby="emailHelp" name="user_password" placeholder="Enter Passward">
							</div>

							<div class="form-group">
								<label for="phone">User Phone</label> <input type="number"
									class="form-control" id="phone" name="user_phone"aria-describedby="emailHelp"
									placeholder="Enter Phone Number">
							</div>

							<div class="form-group">
								<label for="Address" >User Address</label>
								<textarea style="height: 200px;"  name="user_address" class="form-control" 
									placeholder="Enter user address"></textarea>
							</div>

							<div class="container text-center">
								<button class="btn btn-outline-success">Register Here</button>
								<button class="btn btn-outline-warning">Reset</button>
							</div>
						</form>
					</div>
				</div>

			</div>
		</div>
	</div>
</body>
</html>