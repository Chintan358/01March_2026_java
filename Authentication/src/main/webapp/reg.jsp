<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Registration Page</title>

    <!-- Bootstrap CSS -->
    <link
        href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
        rel="stylesheet"
    />

    <style>
        body {
            background: linear-gradient(to right, #4facfe, #00f2fe);
            min-height: 100vh;
        }

        .register-card {
            width: 100%;
            max-width: 500px;
            border: none;
            border-radius: 15px;
        }

        .form-control {
            height: 45px;
        }

        .btn-register {
            height: 45px;
            font-weight: 600;
        }
    </style>
</head>
<body>

    <div class="container d-flex justify-content-center align-items-center py-5">
        <div class="card shadow-lg register-card p-4">

            <div class="text-center mb-4">
                <h2 class="fw-bold">Register</h2>
                <p class="text-muted">Create your account</p>
            </div>
			<span class="text-success">${msg}</span>
            <form method="post" action="reg">

             

                <!-- Username -->
                <div class="mb-3">
                    <label class="form-label">Username</label>
                    <input 
                        type="text" 
                        class="form-control" 
                        placeholder="Choose username"
                        name="username"
                        required
                        
                    />
                </div>

                <!-- Password -->
                <div class="mb-3">
                    <label class="form-label">Password</label>
                    <input 
                        type="password" 
                        class="form-control" 
                        placeholder="Create password"
                        name="password"
                        required
                    />
                </div>

                <!-- Confirm Password -->
                <div class="mb-3">
                    <label class="form-label">Confirm Password</label>
                    <input 
                        type="password" 
                        class="form-control" 
                        placeholder="Confirm password"
                        required
                    />
                </div>

                <!-- Terms Checkbox -->
                <div class="form-check mb-4">
                    <input class="form-check-input" type="checkbox" id="terms" required>
                    <label class="form-check-label" for="terms">
                        I agree to the Terms & Conditions
                    </label>
                </div>

                <!-- Register Button -->
                <div class="d-grid">
                    <button type="submit" class="btn btn-primary btn-register">
                        Create Account
                    </button>
                </div>

                <!-- Login Link -->
                <div class="text-center mt-3">
                    Already have an account?
                    <a href="index.jsp" class="text-decoration-none">Login</a>
                </div>

            </form>

        </div>
    </div>

</body>
</html>