<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" import="test.AdminBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Message Page</title>

<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f4f4f4;
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
        margin: 0;
    }
    .container {
        background: white;
        padding: 20px;
        border-radius: 10px;
        box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
        text-align: center;
    }
    .message {
        font-size: 18px;
        color: #333;
        padding: 10px;
    }
</style>

</head>
<body>

<div class="container">
    <p class="message" id="msg">
        <%
            String msg = (String) request.getAttribute("msg");
            if (msg != null && !msg.isEmpty()) {
                out.println(msg);
            } else {
                out.println("No message available.");
            }
        %>
    </p>
</div>

<script>
    document.addEventListener("DOMContentLoaded", function() {
        let message = document.getElementById("msg");
        if (message.innerHTML.trim() === "No message available.") {
            message.style.color = "red";
        }
    });
</script>

</body>
</html>
