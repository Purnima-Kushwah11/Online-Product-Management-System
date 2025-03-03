<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" import="test.AdminBean"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Admin Dashboard</title>
    <style>
        /* Reset Styles */
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
            font-family: Arial, sans-serif;
        }

        /* Full Page Styling */
        body {
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            background: linear-gradient(135deg, #1e3c72, #2a5298);
            color: white;
            text-align: center;
            animation: fadeIn 1s ease-in-out;
        }

        /* Admin Panel */
        .admin-container {
            background: rgba(255, 255, 255, 0.2);
            padding: 40px;
            border-radius: 12px;
            box-shadow: 0 10px 25px rgba(0, 0, 0, 0.2);
            backdrop-filter: blur(12px);
            border: 1px solid rgba(255, 255, 255, 0.3);
            animation: slideUp 1s ease-in-out;
            max-width: 400px;
            width: 80%;
        }

        h1 {
            font-size: 1.8rem;
            margin-bottom: 15px;
            letter-spacing: 1px;
        }

        p {
            font-size: 1.2rem;
            font-weight: bold;
            padding: 10px;
        }

        /* Navigation Buttons */
        .nav-links {
            display: flex;
            flex-direction: column;
            gap: 15px;
            margin-top: 20px;
        }

        .nav-links a {
            display: block;
            padding: 12px;
            background: linear-gradient(45deg, #ff7e5f, #feb47b);
            color: white;
            text-decoration: none;
            font-size: 16px;
            font-weight: bold;
            border-radius: 8px;
            border: 2px solid transparent;
            transition: transform 0.3s, box-shadow 0.3s;
        }

        .nav-links a:hover {
            transform: translateY(-3px);
            box-shadow: 0 5px 15px rgba(255, 126, 95, 0.3);
            border: 2px solid white;
        }

        /* Animations */
        @keyframes fadeIn {
            from { opacity: 0; }
            to { opacity: 1; }
        }

        @keyframes slideUp {
            from { transform: translateY(50px); opacity: 0; }
            to { transform: translateY(0); opacity: 1; }
        }
    </style>
</head>
<body>

    <div class="admin-container">
        <h1>Welcome, Admin</h1>
        <p>
            <%
                AdminBean ab = (AdminBean) session.getAttribute("bean");
                String msg = (String) request.getAttribute("msg");

                if (ab != null) {
                    out.println(ab.getFname());
                } else {
                    out.println("No Admin Found.");
                }

                if (msg != null) {
                    out.println("<br>" + msg);
                }
            %>
        </p>

        <div class="nav-links">
            <a href="Product.html">Add Products</a>
            <a href="view">View All Products</a>
            <a href="Logout">Logout</a>
        </div>
    </div>

    <script>
        // Smooth fade-in effect on page load
        document.addEventListener("DOMContentLoaded", function() {
            document.body.style.opacity = "0";
            setTimeout(() => {
                document.body.style.transition = "opacity 1s ease-in-out";
                document.body.style.opacity = "1";
            }, 100);
        });
    </script>

</body>
</html>
