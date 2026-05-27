<%@page import="model.Product"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Product Table</title>

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

</head>

<body class="bg-light">

    <div class="container mt-5">

        <div class="card shadow">
            <div class="card-header bg-primary text-white">
                <h3 class="mb-0">Product List
                <a href="index.jsp" class="btn btn-danger">ADD PRODUCT</a></h3>
            </div>

            <div class="card-body">

                <table class="table table-bordered table-hover text-center align-middle">
                    <thead class="table-dark">
                        <tr>
                            <th>ID</th>
                            <th>Product Name</th>
                            <th>Price</th>
                            <th>Quantity</th>
                            <th colspan="2">Action</th>
                        </tr>
                    </thead>

                    <tbody>
                    
                    <%
                    	ArrayList<Product> prods = (ArrayList)request.getAttribute("products");
                    	for(Product p : prods)
                    	{ %>
                    	
                    	<tr>
                            <td><%=p.getId() %></td>
                            <td><%=p.getName() %></td>
                            <td>₹<%=p.getPrice() %></td>
                            <td><%=p.getQty() %></td>
                            <td><a href="update?action=update&id=<%=p.getId()%>" class="btn btn-primary">Update</a></td>
                        <td><a href="update?action=delete&id=<%=p.getId()%>" class="btn btn-danger">Delete</a></td>
                     
                        </tr>
                    		
                    	<%}
                    %>
                        

                        
                    </tbody>
                </table>

            </div>
        </div>

    </div>

</body>

</html>