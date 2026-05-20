<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Product Form</title>

    <!-- Bootstrap CSS -->
    <link
        href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
        rel="stylesheet"
    />
</head>
<body class="bg-light">

    <div class="container mt-5">
        <div class="row justify-content-center">
            <div class="col-md-6">

                <div class="card shadow">
                    <div class="card-header text-center bg-primary text-white">
                        <h3>Add Product</h3>
                    </div>

                    <div class="card-body">
						<span class="text-success">${msg}</span>
                        <form method="post" action="reg">

                            <!-- Product Name -->
                            <div class="mb-3">
                                <label class="form-label">Product Name</label>
                                <input
                                    type="text"
                                    class="form-control"
                                    name="name"
                                    placeholder="Enter product name"
                                />
                            </div>

                            <!-- Product Price -->
                            <div class="mb-3">
                                <label class="form-label">Price</label>
                                <input
                                    type="number"
                                    class="form-control"
                                    name="price"
                                    placeholder="Enter price"
                                />
                            </div>

                            <!-- Product Quantity -->
                            <div class="mb-3">
                                <label class="form-label">Quantity</label>
                                <input
                                    type="number"
                                    class="form-control"
                                    name="qty"
                                    placeholder="Enter quantity"
                                />
                            </div>

                            <!-- Submit Button -->
                            <div class="text-center">
                                <button type="submit" class="btn btn-success px-4">
                                    Save Product
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