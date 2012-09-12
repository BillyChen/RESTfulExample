<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Billy's REST TestSite</title>
</head>
<body style="font-family: courier">
	<h1 style="font-family: verdana">Billy's REST TestSite</h1>
	<h2 style="font-family: verdana">Basic Examples</h2>
	<h3 style="font-family: verdana">JAX-RS @Path URI Matching Example</h3>
	<a
		href=http://localhost:8080/RESTfulExample/rest/Take%20a%20good%20REST>
		http://localhost:8080/RESTfulExample/rest/Take a good REST</a>
	<br>
	<h3 style="font-family: verdana">JAX-RS @Path URI Matching Example</h3>
	<a
		href=http://localhost:8080/RESTfulExample/rest/books/2012;author=Billy;country=China>http://localhost:8080/RESTfulExample/rest/books/2012;author=Billy;country=China</a>

	<br />
	<h3 style="font-family: verdana">JAX-RS @FormParam Example</h3>
	<a href=FormParaEpl.jsp>JAX-RS @FormParam Example</a>
	<h3 style="font-family: verdana">Get HTTP headers in JAX-RS</h3>
	<a href=http://localhost:8080/RESTfulExample/rest/users/get>Get
		HTTP headers in JAX-RS</a>
	<h3 style="font-family: verdana">Download Text File From JAX-RS</h3>
	<a href=http://localhost:8080/RESTfulExample/rest/file/get>Saying
		Goodbye to Cambridge Again</a>
	<h3 style="font-family: verdana">File upload example in RESTEasy</h3>
	<a href=FileUpload.jsp>File upload example in RESTEasy</a>

	<h3 style="font-family: verdana">JSON Example With RESTEasy + Jackson</h3>
	<a href=http://localhost:8080/RESTfulExample/rest/json/product/get>JSON Product Get</a>
	
	<!-- script type="text/javascript">
		var jsonObj;
		function postBtnClick(){
			jsonObj = {"name":"iPhone 5","amount":99};
			document.postForm.submit();
		}
	</script>
	<br/>
	
	<form name="postForm" action="rest/json/product/post" method="post" enctype="application/json">
		<input type="button" value="Post Product" onclick="postBtnClick()"/>
	</form-->
</body>
</html>
