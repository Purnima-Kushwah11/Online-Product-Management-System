<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Message Page</title>
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

        /* Message Box */
        .message-box {
            background: rgba(255, 255, 255, 0.2);
            padding: 20px 40px;
            border-radius: 10px;
            box-shadow: 0 8px 20px rgba(0, 0, 0, 0.2);
            backdrop-filter: blur(10px);
            border: 1px solid rgba(255, 255, 255, 0.3);
            animation: slideUp 1s ease-in-out;
        }

        h1 {
            font-size: 1.8rem;
            margin-bottom: 10px;
        }

        p {
            font-size: 1.2rem;
            font-weight: bold;
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
