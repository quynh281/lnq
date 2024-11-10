<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Contact Form</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f2f2f2;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }
        .contact-form {
            background-color: #fff;
            padding: 20px;
            border-radius: 8px;
            width: 400px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);
        }
        .contact-form h2 {
            text-align: center;
            margin-bottom: 20px;
        }
        .contact-form label {
            display: block;
            margin-bottom: 5px;
            font-weight: bold;
        }
        .contact-form input[type="text"],
        .contact-form input[type="email"],
        .contact-form input[type="tel"],
        .contact-form select,
        .contact-form textarea {
            width: 100%;
            padding: 10px;
            margin-bottom: 15px;
            border: 1px solid #ccc;
            border-radius: 4px;
            box-sizing: border-box;
        }
        .contact-form input[type="radio"] {
            margin-right: 10px;
        }
        .contact-form .radio-group {
            margin-bottom: 15px;
        }
        .contact-form textarea {
            resize: vertical;
            height: 100px;
        }
        .contact-form button {
            width: 100%;
            padding: 10px;
            background-color: #ff6600;
            border: none;
            border-radius: 4px;
            color: #fff;
            font-size: 16px;
            cursor: pointer;
        }
        .contact-form button:hover {
            background-color: #e65c00;
        }
    </style>
</head>
<body>

<div class="contact-form">
    <h2>Contact Us Today!</h2>
    <form>
        <label for="first-name">First Name</label>
        <input type="text" id="first-name" name="first-name" placeholder="First Name">

        <label for="last-name">Last Name</label>
        <input type="text" id="last-name" name="last-name" placeholder="Last Name">

        <label for="email">E-Mail</label>
        <input type="email" id="email" name="email" placeholder="E-Mail Address">

        <label for="phone">Phone #</label>
        <input type="tel" id="phone" name="phone" placeholder="(845)555-1212">

        <label for="address">Address</label>
        <input type="text" id="address" name="address" placeholder="Address">

        <label for="city">City</label>
        <input type="text" id="city" name="city" placeholder="City">

        <label for="state">State</label>
        <select id="state" name="state">
            <option value="">Please select your state</option>
            <option value="ny">New York</option>
            <option value="ca">California</option>
            <option value="tx">Texas</option>
            <!-- Thêm các tùy chọn khác -->
        </select>

        <label for="zip">Zip Code</label>
        <input type="text" id="zip" name="zip" placeholder="Zip Code">

        <label for="website">Website or domain name</label>
        <input type="text" id="website" name="website" placeholder="Website or domain name">

        <div class="radio-group">
            <label>Do you have hosting?</label>
            <input type="radio" id="hosting-yes" name="hosting" value="yes">
            <label for="hosting-yes">Yes</label>
            <input type="radio" id="hosting-no" name="hosting" value="no">
            <label for="hosting-no">No</label>
        </div>

        <label for="project-description">Project Description</label>
        <textarea id="project-description" name="project-description" placeholder="Project Description"></textarea>

        <button type="submit">Send</button>
    </form>
</div>

</body>
</html>