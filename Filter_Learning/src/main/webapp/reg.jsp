<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
    <!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Registration Form</title>

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>

<body class="bg-light">

    <div class="container mt-5">
        <div class="row justify-content-center">
            <div class="col-md-5">

                <div class="card shadow">
                    <div class="card-header text-center bg-primary text-white">
                        <h3>Registration Form</h3>
                    </div>

                    <div class="card-body">

                        <form method="post" action="reg">

                            <div class="mb-3">
                                <label class="form-label">Username</label>
                                <input type="text" name="username"
                                value="<%=request.getParameter("username")==null ? "" : request.getParameter("username") %>"
                                 class="form-control" placeholder="Enter Username">
                            	<span class="text-danger">${unameErr}</span>
                            </div>

                            <div class="mb-3">
                                <label class="form-label">Email</label>
                                <input type="text" name="email" class="form-control" 
                                 value="<%=request.getParameter("email")==null ? "" : request.getParameter("email") %>"
                               
                                placeholder="Enter Email">
                          <span class="text-danger">${emailErr}</span>
                            </div>

                            <div class="mb-3">
                                <label class="form-label">Phone</label>
                         
                                <input type="text" name="phone" class="form-control" 
                                 value="<%=request.getParameter("phone")==null ? "" : request.getParameter("phone") %>"
                               
                                placeholder="Enter Phone Number">
                             <span class="text-danger">${phoneErr}</span>
                            </div>

                            <div class="mb-3">
                                <label class="form-label">Password</label>
                                <input type="password" name="password" 
                                 value="<%=request.getParameter("password")==null ? "" : request.getParameter("password") %>"
                               
                                class="form-control"
                                    placeholder="Enter Password">
                                     <span class="text-danger">${passErr}</span>
                            </div>

                            <div class="mb-3">
                                <label class="form-label">Confirm Password</label>
                                <input type="password" name="confirm_password" 
                                 value="<%=request.getParameter("confirm_password")==null ? "" : request.getParameter("confirm_password") %>"
                               
                                class="form-control"
                                    placeholder="Confirm Password">
                                     <span class="text-danger">${cpassErr}</span>
                            </div>

                            <div class="d-grid">
                                <button type="submit" class="btn btn-primary">
                                    Register
                                </button>
                            </div>

                        </form>

                    </div>
                </div>

            </div>
        </div>
    </div>

</body>

</html>