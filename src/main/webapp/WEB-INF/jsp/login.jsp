<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<c:set var="contextPath" value="" />
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial- scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<meta name="description" content="">
<meta name="author" content="">
<title>Log in with your credentials</title>
	<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
	<link href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.6.1/css/bootstrap.min.css" rel="stylesheet" />
	<script src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.6.1/js/bootstrap.bundle.min.js"></script>
</head>
<body>
	<div class="container">
		<form method="POST" action="/login" class="form-signin">
			<h2 class="form-heading">Log in</h2>
			<div class="form-group ">
				<span></span> <input class="form-control" name="username"
					type="text" placeholder="Username" autofocus="true" /> <input
					class="form-control" name="password" type="password"
					placeholder="Password" /> <span></span>
				<button class="btn btn-lg btn-primary btn-block" type="submit">Log In</button>
			</div>
		</form>
	</div>
</body>


</html>