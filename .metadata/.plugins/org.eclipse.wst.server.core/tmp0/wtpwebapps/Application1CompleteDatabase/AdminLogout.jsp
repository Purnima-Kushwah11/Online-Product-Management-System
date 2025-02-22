<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Logout</title>
    <style>
        /* Reset Styles */
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }

        /* Background */
        body {
            font-family: Arial, sans-serif;
            background: linear-gradient(135deg, #FF6F61, #DE5499, #7257FA);
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
            text-align: center;
        }

        /* Message Container */
        .message-container {
            background: rgba(255, 255, 255, 0.2);
            padding: 40px;
            border-radius: 10px;
            box-shadow: 0 4px 12px rgba(0, 0, 0, 0.3);
            width: 100%;
            max-width: 400px;
            backdrop-filter: blur(10px);
            border: 1px solid rgba(255, 255, 255, 0.2);
            animation: fadeIn 1s ease-in-out;
        }

        /* Logout Message */
        h2 {
            color: white;
            font-size: 1.8rem;
            margin-bottom: 20px;
        }

        p {
            color: white;
            font-size: 1.2rem;
            margin-bottom: 20px;
        }

        /* Button */
        a {
            display: inline-block;
            padding: 12px 25px;
            background: linear-gradient(45deg, #28a745, #218838);
            color: white;
            text-decoration: none;
            border-radius: 8px;
            font-size: 16px;
            font-weight: bold;
            transition: 0.3s;
        }

        a:hover {
            transform: translateY(-3px);
            box-shadow: 0 4px 10px rgba(40, 167, 69, 0.3);
        }

        /* Animation */
        @keyframes fadeIn {
            from { opacity: 0; transform: translateY(-20px); }
            to { opacity: 1; transform: translateY(0); }
        }

        /* Responsive */
        @media (max-width: 600px) {
            .message-container {
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

    <div class="message-container">
        <h2>Logout Successful</h2>

        <%
            String msg = (String) request.getAttribute("msg");
            session.invalidate();
            out.println("<p>" + msg + "</p>");
        %>

        <a href="AdminLogin.html">Go to Login</a>
    </div>

</body>
</html>
