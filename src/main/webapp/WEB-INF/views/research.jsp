<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!DOCTYPE html>
<html>
<head>
	<title>Research</title>
	<meta charset="utf-8">
    <!-- NOTE: Static sites shouldn't have the meta-viewport because it would force the user to scroll to see the full page -->
    <meta name="viewport" content="width=device-width, initial-scale=1">
	
</head>
<body>
<h1>
	Hello research!
</h1>
<section>
    Notice file: ${noticeFile}
    <br/>filename: ${noticeFile.filename}
    <br/>file:  ${noticeFile.file}
    <br/>URL: ${noticeFile.URL}
</section>
<br/>
<br/>

    <footer>
    Research controller /
    </footer>
</body>
</html>
