## Single
- Không nên trộn những tác vụ bất đồng bộ và động bộ như gửi thư, xuất pdf và tính toán với nhau(tách ra các lớp riêng biệt)
- Call request/response: phản hồi càng nhanh càng tốt
- gửi message: thằng nhanh gửi mes cho thằng chậm. Gửi message queue
- Viết những hàm gọi lẫn nhau thì rất là dở cho những ứng dụng scale hệ thống lớn
- RabbitMQ: xử lý khó scale, zeroMQ, Kafka(Grab,Tiki) là các lib cho message queue
