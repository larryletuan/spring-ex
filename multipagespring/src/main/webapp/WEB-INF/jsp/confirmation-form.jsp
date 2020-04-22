<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<body>  
<p>Your reservation is confirmed successfully. Please, re-check the details.</p>  
First Name : ${reservation.firstName} <br>  
Last Name : ${reservation.lastName}  <br>
Gender: ${reservation.gender} <br>
Meal:
<ul>
	<c:forEach var="meal" items="${reservation.food}">
	<li>${meal}</li>
	</c:forEach>
</ul>
</body>  
</body>
</html>