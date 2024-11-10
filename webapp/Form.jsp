<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Murach's Java Servlets and JSP</title>
</head>
<body>
<h1>From Đăng ký thông tin khách hàng</h1>
<p> To join our email list, enter yourname and email address below.</p>
<form action="./quynh" method= "post" >
   <input type="hidden" name="action" value="add">
   <label>Email: </label>
   <input type="email"  name="email" id="email" required><br>
   
   <label>Họ và tên: </label>
   <input type="text"  name="name" id= "name" required><br>
   
   <label>Ngày sinh: </label>
   <input type="date"  name="Ngay" id= "Ngay" required><br>
   
   <label>Địa chỉ: </label>
   <input type="text"  name="Diachi" required><br>
   
   <label>Thành phố: </label>
   <select name="Thanhpho" required>
   <option value="">Chọn thành phố </option>
   <option value="Hà Nội ">Hà Nội</option>
   <option value="TP Hồ Chí Minh">TP Hồ Chí Minh</option>
   <option value="Đà Nẵng ">Đà Nẵng</option>
   <option value="Quảng Nam">Quảng Nam</option>
   <option value="Thanh Hóa">Thanh Hóa</option>
   <option value="Huế">Huế</option>
   <option value="Quảng Trị">Quảng Trị</option>
   <option value="Vũng Tàu">Vũng Tàu</option>
   <option value="Đồng Tháp">Đồng Tháp</option>
   <option value="Phú Yên">Phú Yên</option>
   </select><br>
    
   <label>Giới tính</label>
   <input type="radio" id="nam" name="gt" value="nam" required>
   <label form="nam" >Nam </label>
   <input type="radio" id="nu" name="gt" value="nu" required>
   <label form="nu" >Nữ </label>
   <input type="radio" id="khac" name="gt" value="khac" required>
   <label form="khac" >Khác </label> <br>
   
   <label>Nghề Nghiệp</label>
   <input type="text" name="nghe" required><br>
   
   <label>Giao hàng</label>
   <select name="Giaohang" required>
   <option value="">Chọn địa điểm giao hàng </option>
   <option value="tai nha">Tại nhà</option>
   <option value="tai co quan">Tại cơ quan</option>
   <option value="khac">Khác</option>
   </select><br>
 
   <button type="submit" name="submitAction" value="submit">Submit</button>
</form>
   
</form>
</body>
</html>