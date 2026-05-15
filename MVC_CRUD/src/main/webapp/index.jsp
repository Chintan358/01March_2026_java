<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <title>Bootstrap Form</title>

    <!-- Bootstrap CSS -->
    <link
        href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
        rel="stylesheet"
    >
</head>
<body class="bg-light">

    <div class="container mt-5">
        <div class="row justify-content-center">
            <div class="col-md-6">

                <div class="card shadow">
                    <div class="card-header bg-primary text-white text-center">
                        <h3>User Form</h3>
                    </div>

                    <div class="card-body">
						<span class="text-success">${msg}</span>
                        <form action="reg" method="post">

                            <div class="mb-3">
                                <label class="form-label">Name</label>
                                <input 
                                    type="text" 
                                    class="form-control" 
                                    placeholder="Enter your name" 
                                    name="name"
                                >
                            </div>

                            <div class="mb-3">
                                <label class="form-label">Email</label>
                                <input 
                                    type="email" 
                                    class="form-control" 
                                    placeholder="Enter your email"
                                    name="email"
                                >
                            </div>

                            <div class="mb-3">
                                <label class="form-label">Age</label>
                                <input 
                                    type="number" 
                                    class="form-control" 
                                    placeholder="Enter your age"
                                    name="age"
                                >
                            </div>

                            <div class="d-grid">
                                <button type="submit" class="btn btn-success">
                                    Submit
                                </button>
                            </div>
                            <br>
                            <div class="d-grid">
                                <a href="display" class="btn btn-primary">View all Stduents</a>
                            </div>

                        </form>

                    </div>
                </div>

            </div>
        </div>
    </div>

</body>
</html>