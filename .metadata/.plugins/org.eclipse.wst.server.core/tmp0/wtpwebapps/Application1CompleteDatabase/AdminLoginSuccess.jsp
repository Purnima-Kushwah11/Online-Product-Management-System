<%@page import="test.AdminBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
        }

        /* Body Background */
        body {
            font-family: Arial, sans-serif;
            background: linear-gradient(135deg, #FF6F61, #DE5499, #7257FA);
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }

        /* Dashboard Container */
        .dashboard-container {
            background: rgba(255, 255, 255, 0.2);
            padding: 40px;
            border-radius: 10px;
            box-shadow: 0 4px 12px rgba(0, 0, 0, 0.3);
            width: 100%;
            max-width: 450px;
            text-align: center;
            backdrop-filter: blur(10px);
            border: 1px solid rgba(255, 255, 255, 0.2);
            animation: fadeIn 1s ease-in-out;
        }

        /* Heading */
        h2 {
            color: white;
            margin-bottom: 20px;
            font-size: 1.8rem;
        }

        /* Admin Name */
        p {
            color: white;
            font-size: 1.2rem;
            margin-bottom: 20px;
        }

        /* Buttons */
        a {
            display: inline-block;
            margin: 12px 0;
            padding: 12px 20px;
            background: linear-gradient(45deg, #28a745, #218838);
            color: white;
            text-decoration: none;
            border-radius: 8px;
            font-size: 16px;
            font-weight: bold;
            width: 100%;
            transition: 0.3s;
        }

        a:hover {
            transform: translateY(-3px);
            box-shadow: 0 4px 10px rgba(40, 167, 69, 0.3);
        }

        /* Logout Button */
        .logout {
            background: linear-gradient(45deg, #dc3545, #c82333);
        }

        .logout:hover {
            box-shadow: 0 4px 10px rgba(220, 53, 69, 0.3);
        }

        /* Animation */
        @keyframes fadeIn {
            from { opacity: 0; transform: translateY(-20px); }
            to { opacity: 1; transform: translateY(0); }
        }

        /* Responsive */
        @media (max-width: 600px) {
            .dashboard-container {
                padding: 30px;
            }

            h2 {
                font-size: 1.5rem;
            }

            a {
                font-size: 14px;
                padding: 10px 20px;
            }
        }
    </style>
</head>
<body>

    <div class="dashboard-container">
        <h2>Welcome Admin</h2>

        <%
            AdminBean ab = (AdminBean) session.getAttribute("bean");
            if (ab != null) {
                out.println("<p id='adminName'>Hello, " + ab.getUname() + "!</p>");
            } else {
                out.println("<p>User not found</p>");
            }
        %>

        <a href="Product.html">Add Product</a>
        <a href="view">View All Products</a>
        <a href="Logout" class="logout" onclick="return confirmLogout()">Logout</a>
    </div>

    <script>
        // Logout Confirmation
        function confirmLogout() {
            return confirm("Are you sure you want to log out?");
        }

        // Animated Greeting Message
        document.addEventListener("DOMContentLoaded", function () {
            let adminName = document.getElementById("adminName");
            if (adminName) {
                adminName.style.opacity = "0";
                setTimeout(() => {
                    adminName.style.transition = "opacity 1s";
                    adminName.style.opacity = "1";
                }, 500);
            }
        });
    </script>

</body>
</html>
