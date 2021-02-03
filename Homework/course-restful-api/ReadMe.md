## Bài 4

### Danh sách các API

| HTTP Method | URI                                                                     | Mô tả                                  |
|-------------|-------------------------------------------------------------------------|----------------------------------------|
| POST         | http://localhost:8080/api/v1/users        | Đăng ký người dùng (cả giảng viên và học viên):          |
        |
- Đăng ký giảng viên:
```
{
    "name": "Nguyen Van A",
    "email": "a.nguyen@gmali.com",
    "password": "123456",
    "teacher": {
        "phone": "0987654321",
        "experiences": 5
    },
    "mode": "TEACHER"
}
```
- Đăng ký học viên:
```
{
    "name": "Tran Van B",
    "email": "b.tran@gmali.com",
    "password": "123456",
    "student": {
        "year": 2020
    },
    "mode": "STUDENT"
}
```
### Cách chức năng đã làm

1. Tạo các entity User, Teacher, Student và sử dụng annotation @Inheritance của Hibernate/Spring Data JPA để mapping quan hệ kế thừa giữa Teacher và Student với User.
2. Sử dụng Factory Method pattern để khởi tạo đối tượng phù hợp với request.
3. Endpoint của API cần phải phù hợp với các convention đã được học và được đánh version.
4. Response của API cần ẩn trường password hoặc convert thành ******.
5. Tích hợp Swagger để sinh tài liệu cho API.
6. Cần kiểm tra email đã được đăng ký bởi người dùng khác hay chưa.
7. Throw exception và có cơ chế error handling thích hợp.
8. Error message trong response body cần rõ ràng, cung cấp các thông tin cần thiết để xác định nguyên nhân lỗi, không chứa thông tin password.
9. HTTP status code phù hợp
10. Cho phép log request body của API nhưng email và password cần được convert thành ******