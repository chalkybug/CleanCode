# Cấu trúc source code

## AbstractCustomer.java
- Chứa các thuộc tính chung của Customer và Abstract method `calculateMonthlyFee`
## CustomerFactory.java
- Dùng để khởi tạo đối tượng mà k cần biết rõ kiểu đối tượng cần tạo
## CustomerInfo.java
- Chứa các thuộc tính input của Customer(thời lượng gọi, số tin nhắn)
## CustomerPayAsYouGo.java
- Class định nghĩa cho khách hàng trả trước và ghi đè phương thức `calculateMonthlyFee`
## CustomerType.java
- Enum chứa các kiểu Customer
## CustomerUnlimited.java
- Class định nghĩa cho khách hàng trả sau và ghi đè phương thức `calculateMonthlyFee`
## Main.java
- Class chạy chương trình
