<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="test.AdminBean"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Admin Message</title>
    <style>
        /* Reset styles */
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

        /* Heading */
        h2 {
            color: white;
            font-size: 1.8rem;
            margin-bottom: 20px;
        }

        /* Message Styling */
        p {
            font-size: 16px;
            color: white;
            margin-top: 10px;
            line-height: 1.5;
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

            p {
                font-size: 14px;
            }
        }
    </style>
</head>
<body>

    <div class="message-container">
        <h2>Admin Message</h2>

        <%
            AdminBean ab = (AdminBean) session.getAttribute("bean");
            String msg = (String) request.getAttribute("msg");
            out.println("<p>Welcome Admin: <strong>" + ab.getFname() + "</strong></p>");
            out.println("<p>" + msg + "</p>");
        %>
    </div>

</body>
</html>
