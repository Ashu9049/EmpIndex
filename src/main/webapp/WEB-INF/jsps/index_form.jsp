<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>index form</title>
</head>
<body>

      <h2>Employee Satisfaction Index</h2>
      
      <form action="saveIndex" method="post">
      First Name :<input type="text" name="firstName"/>
      Last  Name :<input type="text" name="lastName"/>
      
      <h4>Question</h4>
      
      1. How satisfied are you with your job responsibilities and tasks?<br>
      <B>Rate 1 to 10</B>
      <input type="text" name="Q1"/><br>
      
      2. How satisfied are you with your current salary and benefits?<br>
      <input type="checkbox" name="Q2" value="5"/>5<br>
      <input type="checkbox" name="Q2" value="10"/>10<br>
      <input type="checkbox" name="Q2" value="15"/>15<br>
      <input type="checkbox" name="Q2" value="20"/>20<br>
      
      3. How satisfied are you with the level of support and resources provided by the company?<br>
      <input type="radio" name="Q3" value="2"/>2<br>
      <input type="radio" name="Q3" value="4"/>4<br>
      <input type="radio" name="Q3" value="6"/>6<br>
      <input type="radio" name="Q3" value="8"/>8<br>
      <input type="radio" name="Q3" value="10"/>10<br>
      
      4. How satisfied are you with the communication and feedback provided by your manager?<br>
      <input type="range" name="Q4" min="1" max="20"/><br>
      
      5. How you feel  to go on work on monday?<br>
       <select name="Q5">
     <option value="10">Bad</option>
     <option value="20">Average</option>
     <option value="30">Good</option>
     <option value="40">Best</option>
     </select><br>
      
      
      <input type="submit" value="Submit"/>
      </form>

</body>
</html>