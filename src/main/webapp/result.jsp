<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<<!DOCTYPE html>
<html>
<head>
    <title>Question Result</title>
</head>
<body>
<fieldset>
<h2>Food statistic:</h2>
<p>Meat: <%= request.getAttribute("meatCount") %></p>
<p>Veggies: <%= request.getAttribute("veggiesCount") %></p>
</fieldset>
<fieldset>
<h2>Animal statistic:</h2>
<p>Cat: <%= request.getAttribute("catCount") %></p>
<p>Dog: <%= request.getAttribute("dogCount") %></p>
</fieldset>
<a href="index.jsp">Answer the question again</a>
</body>
</html>