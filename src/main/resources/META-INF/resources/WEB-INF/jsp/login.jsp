<html>
	<head>
		<title>Login </title>
		<style type="text/css">
		<link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet"> 
		input{
		display: block;
		margin: 20px;
		margin-left:10px;
		margin-top:40px;
		background: silver;
		border-radius: 15px;
		height:30px;
		width:250px
		}
				
		form ,h1{
		margin-top:20px;
		margin-left: 500px;
		
			
		}p{
		margin-left: 600px;
		
		
		}
		h1{
			margin-left: 600px;
		
		}
		form{
		border: 1px solid black;
		width:350px;
		padding-left: 100px;
		background: gray;
		height: 300px;
		border-radius: 15px;
		
		}
		
		#submit{
		margin-top:80px;
		margin-left:60px;
		width:100px;
		height:35px;
		border-radius: 15px
		}
	
	</style>	
</head>
	<body>
		<div class="container">
			<h1>Welcome to Login Page</h1>	
			<p>${error}</p>	
			<form  action="login" method="post">
			<input type="text" placeholder="Enter user name" name="userName">
			<input type="password" placeholder="Enter password" name="password">
			<input type ="submit" id="submit">
			</form>
		</div>
	</body>

</html>