<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>upload form</title>
	</head>
	<body>
		<h1>file upload</h1>
		
		
		<form action="upload_action" method="post" enctype="multipart/form-data">
			upload file <input type="file" name="uploadFile"><br>
			uploader name <input type="text" name="uploader_name"><br>
			<input type="submit" name="upload">
		</form>
	</body>
</html>