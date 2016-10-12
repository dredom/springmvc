<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!DOCTYPE html>
<html>
<head>
	<title>Research</title>
	<meta charset="utf-8">
    <!-- NOTE: Static sites shouldn't have the meta-viewport because it would force the user to scroll to see the full page -->
    <meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" type="text/css" href="resources/css/screen.css">
</head>
<body>
 <header>
  <h1>
	Hello research!
  </h1>
 </header>
<div class="panel">
    Notice file: ${noticeFile}
    <br/>filename: ${noticeFile.filename}
    <br/>file:  ${noticeFile.file}
    <br/>URL: ${noticeFile.URL}
</div>
<div class="panel">
<c:if test="${not empty testFile}">
    Test file: ${testFile}
    <br/>path: ${testFile.file.path} filename: ${testFile.filename}
    <br/>canonical path:  ${testFile.file.canonicalPath}
</c:if>
<c:if test="${empty testFile}">
    <p>Add command-line -Dexternal.location=my/ext/dir </p>
</c:if>
</div>

    <footer>
    Research controller /
    </footer>
</body>
</html>
