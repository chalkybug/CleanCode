## Single
- Không nên trộn những tác vụ bất đồng bộ và động bộ như gửi thư, xuất pdf và tính toán với nhau(tách ra các lớp riêng biệt)
- Call request/response: phản hồi càng nhanh càng tốt
- gửi message: thằng nhanh gửi mes cho thằng chậm. Gửi message queue
- Viết những hàm gọi lẫn nhau thì rất là dở cho những ứng dụng scale hệ thống lớn
- RabbitMQ: xử lý khó scale, zeroMQ, Kafka(Grab,Tiki) là các lib cho message queue
## Liskov Principle
- Thằng con hãy tuân thủ những quy tắc của thằng cha

## Interface Segregation Principle
- Những cái chung thì bỏ vào abstract còn lại thì ném vào các interface riêng.

## Dependency Injection Principle
- Sản phẩm ứng dụng có thể tùy thuộc theo nhu cầu của khách hàng

## Microservice
- Chiều query thì thì sử dụng sql để join kết quả cho đẹp
- Chiều command thì sử dụng NoSQL
- Giữa thằng NoSQL và SQL sẽ sử dụng Message Queue (Kafka) để đồng bộ giữa 2 hệ quản trị cơ sở dữ liệu

## 
- netstat -ao |find /i "listening"
- Taskkill /F /IM 12704
