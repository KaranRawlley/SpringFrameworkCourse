<!DOCTYPE HTML>
<html lang="en">
<head>
  <title>W3Docs - Learn Programming Languages Online.</title>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
  <meta name="Author" content="W3docs">
  <!-- <link rel="stylesheet" type="text/css" href="style.css"> -->
</head>

<body>
  <h1>Student Information</h1>
  
  <h4>${student.firstName}  ${student.lastName}</h4>
  <h4>${student.country} </h4>
  <!-- <h4>{student.language} </h4> -->
  
  <ul>
  	<c:forEach var="temp" items="${student.operatingSystem}">
  		<li>${temp}</li>
  	</c:forEach>
  </ul>
</body>

</html>