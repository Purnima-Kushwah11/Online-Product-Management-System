<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" import="test.AdminBean"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Message Page</title>

    <style>
        /* General Styling */
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
            font-family: Arial, sans-serif;
        }

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

        .message-container {
            background: rgba(255, 255, 255, 0.2);
            padding: 30px 50px;
            border-radius: 12px;
            box-shadow: 0 10px 25px rgba(0, 0, 0, 0.2);
            backdrop-filter: blur(12px);
            border: 1px solid rgba(255, 255, 255, 0.3);
            animation: slideUp 1s ease-in-out;
            max-width: 400px;
            width: 80%;
        }

        h1 {
            font-size: 2rem;
            margin-bottom: 15px;
        }

        p {
            font-size: 1.2rem;
            background: rgba(255, 255, 255, 0.8);
            color: black;
            padding: 10px;
            border-radius: 6px;
            display: inline-block;
            max-width: 100%;
            animation: fadeIn 1s ease-in-out;
        }

        .btn-container {
            margin-top: 15px;
        }

        button {
            padding: 10px 20px;
            border: none;
            border-radius: 6px;
            background: linear-gradient(45deg, #ff7e5f, #feb47b);
            color: white;
            font-size: 16px;
            font-weight: bold;
            border: 2px solid transparent;
            transition: transform 0.3s, box-shadow 0.3s;
            cursor: pointer;
        }

        button:hover {
            transform: translateY(-3px);
            box-shadow: 0 5px 15px rgba(255, 126, 95, 0.3);
            border: 2px solid white;
        }

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
    <div class="message-container">
        <h1>Message</h1>
        <p id="message-text">
            <%
                String msg = (String) request.getAttribute("msg");
                if (msg != null && !msg.trim().isEmpty()) {
                    out.println(msg);
                } else {
                    out.println("No message available.");
                }
            %>
        </p>
        <div class="btn-container">
            <button onclick="goBack()">Go Back</button>
        </div>
    </div>

    <script>
        function goBack() {
            window.history.back();
        }
    </script>
</body>
</html>
