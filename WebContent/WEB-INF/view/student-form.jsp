<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  

<!DOCTYPE HTML>
<html lang="en">
<head>
  <title>Spring Tutorial</title>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
  <meta name="Author" content="W3docs">
  <!-- <link rel="stylesheet" type="text/css" href="style.css"> -->
</head>

<body>
  <h1>Student Registration Form</h1>
  <hr>
  <form:form action="processForm" modelAttribute="student">
  
  	<form:input path="firstName" />
  	<br>
  	<form:input path="lastName" />
  	<br><br>
  	Country: 
  	<form:select path="country">
  		<form:options items="${student.countryOption}"/>
  	</form:select>
  	<br><br>
  	<%-- Language: 
  	
  	<form:radiobuttons path="language" items="${student.language} "/> --%>
  	<br><br>
  	Operating Systems:
  	
  	Linux <form:checkbox path="operatingSystem" value="Linux"/>
  	Mac OS <form:checkbox path="operatingSystem" value="MacOS"/>
  	Windows <form:checkbox path="operatingSystem" value="Windows"/>
  	Ubuntu <form:checkbox path="operatingSystem" value="Ubuntu"/>
  	CommandLine <form:checkbox path="operatingSystem" value="CommandLine"/>
  	
  	<br><br>
  	
  	<input type="submit" value="Submit">
  	
  
  </form:form>
</body>

</html>