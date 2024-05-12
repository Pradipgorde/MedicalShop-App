<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    
    import="java.util.* , addProduct.*, delete.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%  


ArrayList<ProductBean> list =   (ArrayList<ProductBean>) session.getAttribute("Pbean");

String code = (String)request.getParameter("Pcode");
Iterator<ProductBean> it = list.iterator();




	out.println("in true block");

	int k = new DeleteDAO().deleteData(code);


while(it.hasNext())
{
	ProductBean pb = it.next();
	
	
	if(code.equals(pb.getProductCode()))
	{
		list.remove(pb);
		
%>    <script> 
 
  window.alert(" Delete sucessfully..... ");

</script>                      <% 
		break;
	}}
	
	
	
	




%>

<%@include file="add.html" %>



</body>
</html>