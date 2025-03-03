<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" import="test.*,java.util.*"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Admin Dashboard - Product Management</title>
    <style>
        /* Reset Styles */
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
            font-family: Arial, sans-serif;
        }

        /* Page Background */
        body {
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            background: linear-gradient(135deg, #1e3c72, #2a5298);
            color: white;
            text-align: center;
            animation: fadeIn 1s ease-in-out;
            flex-direction: column;
        }

        /* Container */
        .admin-container {
            background: rgba(255, 255, 255, 0.2);
            padding: 20px;
            border-radius: 12px;
            box-shadow: 0 10px 25px rgba(0, 0, 0, 0.2);
            backdrop-filter: blur(12px);
            border: 1px solid rgba(255, 255, 255, 0.3);
            animation: slideUp 1s ease-in-out;
            max-width: 600px;
            width: 90%;
        }

        h1 {
            font-size: 1.8rem;
            margin-bottom: 15px;
        }

        /* Product Table */
        table {
            width: 100%;
            border-collapse: collapse;
            margin-top: 15px;
            background: rgba(255, 255, 255, 0.1);
        }

        th, td {
            padding: 10px;
            border: 1px solid white;
        }

        th {
            background: rgba(255, 255, 255, 0.3);
        }

        a {
            color: yellow;
            text-decoration: none;
            font-weight: bold;
        }

        a:hover {
            color: lightgreen;
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
        <h1>Admin Dashboard</h1>
        <div>
            <%
                AdminBean ab = (AdminBean) session.getAttribute("bean");
               ArrayList<ProdcutBean> al = (ArrayList<ProdcutBean>) session.getAttribute("alist");
                 
                 if (ab != null) {
                    out.println("<p>Welcome, " + ab.getFname() + "!</p>");
                } else {
                    out.println("<p>No Admin Found.</p>");
                }

                if (al == null || al.isEmpty()) {
                    out.println("<p><strong>Product not available!!!</strong></p>");
                } else {
            %>
                <table>
                    <tr>
                        <th>ID</th>
                        <th>Name</th>
                        <th>Price</th>
                        <th>Qty</th>
                        <th>Actions</th>
                    </tr>
                    <%
                        for (ProdcutBean pb : al) {
                            out.println("<tr>"
                                    + "<td>" + pb.getPid() + "</td>"
                                    + "<td>" + pb.getPname() + "</td>"
                                    + "<td>" + pb.getPrice() + "</td>"
                                    + "<td>" + pb.getQty() + "</td>"
                                    + "<td><a href='edit?pId=" + pb.getPid() + "'>Edit</a> | "
                                    + "<a href='delete?pId=" + pb.getPid() + "'>Delete</a></td>"
                                    + "</tr>");
                        }
                    %>
                </table>
            <% } %>
        </div>
        <br>
        <a href="Product.html">➕ Add Product</a> | 
        <a href="Logout">🚪 Logout</a>
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
