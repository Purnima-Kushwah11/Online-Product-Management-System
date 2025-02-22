<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="test.*"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Update Product</title>
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
            text-align: center;
        }

        /* Form Container */
        .form-container {
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

        h2 {
            color: white;
            font-size: 1.8rem;
            margin-bottom: 20px;
        }

        input[type="text"] {
            width: 100%;
            padding: 12px;
            margin: 10px 0;
            border: 1px solid #ccc;
            border-radius: 5px;
            font-size: 16px;
            outline: none;
        }

        input[type="submit"] {
            width: 100%;
            padding: 12px;
            background-color: #28a745;
            color: white;
            border: none;
            border-radius: 5px;
            font-size: 18px;
            cursor: pointer;
            transition: background-color 0.3s;
        }

        input[type="submit"]:hover {
            background-color: #218838;
        }

        /* Animation */
        @keyframes fadeIn {
            from { opacity: 0; transform: translateY(-20px); }
            to { opacity: 1; transform: translateY(0); }
        }

        /* Responsive */
        @media (max-width: 600px) {
            .form-container {
                padding: 30px;
            }

            h2 {
                font-size: 1.5rem;
            }

            input[type="submit"] {
                font-size: 16px;
            }
        }
    </style>

    <script>
        function validateForm() {
            var id = document.forms["updateForm"]["id"].value;
            var name = document.forms["updateForm"]["name"].value;
            var price = document.forms["updateForm"]["price"].value;
            var qty = document.forms["updateForm"]["qty"].value;

            if (id == "" || name == "" || price == "" || qty == "") {
                alert("All fields must be filled out!");
                return false;
            }
            return true;
        }
    </script>
</head>
<body>

    <div class="form-container">
        <h2>Update Product</h2>

        <%
            AdminBean ab = (AdminBean) session.getAttribute("bean");
            ProdcutBean pb = (ProdcutBean) request.getAttribute("pbean");
            out.println("<p>Welcome Admin: <strong>" + ab.getFname() + "</strong></p>");
        %>

        <form name="updateForm" action="update" method="post" onsubmit="return validateForm()">
            <input type="text" name="id" value="<%=pb.getPid()%>" placeholder="Product ID"><br>
            <input type="text" name="name" value="<%=pb.getPname()%>" placeholder="Product Name"><br>
            <input type="text" name="price" value="<%=pb.getPrice()%>" placeholder="Product Price"><br>
            <input type="text" name="qty" value="<%=pb.getQty()%>" placeholder="Product Quantity"><br>
            <input type="submit" value="Update Product">
        </form>
    </div>

</body>
</html>
