<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Login Page</title>

    <!-- Bootstrap CSS -->
    <link
        href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
        rel="stylesheet"
    />

    <style>
        body {
            background: linear-gradient(to right, #4facfe, #00f2fe);
            height: 100vh;
        }

        .login-card {
            width: 100%;
            max-width: 400px;
            border: none;
            border-radius: 15px;
        }

        .form-control {
            height: 45px;
        }

        .btn-login {
            height: 45px;
            font-weight: 600;
        }
    </style>
</head>
<body>

    <div class="container d-flex justify-content-center align-items-center vh-100">
        <div class="card shadow-lg login-card p-4">
            
            <div class="text-center mb-4">
                <h2 class="fw-bold">Login</h2>
                <p class="text-muted">Enter your credentials</p>
            </div>
			<span class="text-danger">${err}</span>
            <form method="post" action="login">
                <!-- Username -->
                <div class="mb-3">
                    <label class="form-label">Username</label>
                    <input 
                        type="text" 
                        class="form-control" 
                        name="username"
                        placeholder="Enter username"
                        required
                    />
                </div>

                <!-- Password -->
                <div class="mb-3">
                    <label class="form-label">Password</label>
                    <input 
                        type="password" 
                        class="form-control"
						name="password"
                        placeholder="Enter password"
                        required
                    />
                </div>

                <!-- Remember Me -->
                <div class="d-flex justify-content-between mb-3">
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" id="remember">
                        <label class="form-check-label" for="remember">
                            Remember me
                        </label>
                    </div>

                    <a href="#" class="text-decoration-none">
                        Forgot Password?
                    </a>
                </div>

                <!-- Login Button -->
                <div class="d-grid">
                    <button type="submit" class="btn btn-primary btn-login">
                        Login
                    </button>
                </div>
                
                <div class="text-center mt-3">
                   New user ? Register here
                    <a href="reg.jsp" class="text-decoration-none">Register</a>
                </div>
                
            </form>

        </div>
    </div>

</body>
</html>