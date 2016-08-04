<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!DOCTYPE html>
<html>
<head>
	<title>SpringMVC - Home</title>
	 <meta charset="utf-8">
    <!-- NOTE: Static sites shouldn't have the meta-viewport because it would force the user to scroll to see the full page -->
    <meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body>
    <header>
        <h1> Hello home! </h1>
    </header>
${controllerMessage}<br/>
<br/>
<br/>
<a href="person/list">Go to the person list</a>
    <footer>
    HomeController controller /
    </footer>
</body>
</html>
