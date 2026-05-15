<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>View Data</title>

    <!-- Bootstrap CSS -->
    <link 
        href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" 
        rel="stylesheet"
    >
</head>
<body class="bg-light">

    <div class="container mt-5">

        <div class="card shadow">
            
            <div class="card-header bg-primary text-white text-center">
                <h3>User Data Table</h3>
            </div>

            <div class="card-body">

                <table class="table table-bordered table-hover text-center">
                    
                    <thead class="table-dark">
                        <tr>
                            <th>ID</th>
                            <th>Name</th>
                            <th>Email</th>
                            <th>Age</th>
                            <th colspan="2">Action</th>
                        </tr>
                    </thead>

                    <tbody>
                        <tr>
                            <td>1</td>
                            <td>Chintan</td>
                            <td>chintan@gmail.com</td>
                            <td>25</td>

                            <td>
                                <button class="btn btn-warning btn-sm">
                                    Edit
                                </button>
                            </td>

                            <td>
                                <button class="btn btn-danger btn-sm">
                                    Delete
                                </button>
                            </td>
                        </tr>

                        <tr>
                            <td>2</td>
                            <td>Rahul</td>
                            <td>rahul@gmail.com</td>
                            <td>22</td>

                            <td>
                                <button class="btn btn-warning btn-sm">
                                    Edit
                                </button>
                            </td>

                            <td>
                                <button class="btn btn-danger btn-sm">
                                    Delete
                                </button>
                            </td>
                        </tr>
                    </tbody>

                </table>

            </div>

        </div>

    </div>

</body>
</html>