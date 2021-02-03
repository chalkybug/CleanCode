## Bài 5

### Danh sách các API

| HTTP Method | URI                                                                     | Mô tả                                  |
|-------------|-------------------------------------------------------------------------|----------------------------------------|
| GET         | http://localhost:8080/api/v1/courses?keyword=SQL&sortBy=name         | Lấy danh sách tất cả các khóa học theo từ khóa SQL và sort theo `name` hoặc `opened`          |
        

### Cách chức năng đã làm

1. Tạo entity Course và sử dụng annotation @ManyToOne của Hibernate/Spring Data JPA để mapping quan hệ giữa Course và Teacher.
2. Sử dụng Strategy pattern để cài đặt các thuật toán sắp xếp.
3. RESTful API endpoint cần phải phù hợp với các convention đã được học và được đánh version.
4. Áp dụng caching cho API để tăng performance.
5. Đảm bảo các chức năng của bài tập 2 vẫn hoạt động đúng.
