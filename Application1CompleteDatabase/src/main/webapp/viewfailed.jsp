<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Message Page</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            background: linear-gradient(135deg, #1e3c72, #2a5298);
            color: white;
            text-align: center;
        }
        .message-box {
            background: rgba(255, 255, 255, 0.2);
            padding: 20px 40px;
            border-radius: 10px;
            box-shadow: 0 8px 20px rgba(0, 0, 0, 0.2);
            backdrop-filter: blur(10px);
            border: 1px solid rgba(255, 255, 255, 0.3);
        }
        h1 {
            font-size: 1.8rem;
        }
    </style>
</head>
<body>

    <div class="message-box">
        <h1>System Message</h1>
        <p>
            <%
                String msg = (String) request.getAttribute("msg");
                if (msg != null) {
                    out.println(msg);
                } else {
                    out.println("No message available.");
                }
            %>
        </p>
    </div>

</body>
</html>
