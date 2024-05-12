<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
   import="adminLogin.*,addProduct.* "  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%   AdminBean ab = (AdminBean) session.getAttribute("adminlogin");  
     String msg = (String) request.getAttribute("msg");

%>
<div> 

<p  align="right" > <% out.println("Admin: "+ab.getName()); %>  </p> <br> <br>
<script> 
 
  window.alert(" Product added  sucessfully..... ");

</script>                      






<div> 
<a href="veiw"> <button> View All Product  </button> </a> <br> <br>
<a href="edit"> <button> Edit Product Details  </button></a> <br> <br>
<a href="delete"> <button> Delete product Account </button></a> <br> <br>
</div>


</div>



</body>
</html>