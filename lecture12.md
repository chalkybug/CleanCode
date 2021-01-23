## Các anti-partten thiết kế csdl

## Jaywalking
- Định nghĩa: Lưu các giá trị vào 1 trường phân cách bởi dấu `,` hoặc `;`
- Giải pháp: với mối quan hệ nhiều nhiều giữa 2 bảng thì dùng bảng tạm
- Khi nào thì cần dùng:
1. Lưu một danh sách các phần tử **mà không cần truy vấn từng phần tử**
2. Chỉ cần **truy vấn** nó

***
##  Multi-column Attributes
- Định nghĩa: Tạo quá nhiều column trong 1 bảng để định nghĩa các thuộc tính
- Giải pháp: Chuyển các `cột` thành các `hàng` để k bị giới hạn thuộc tính
- Khi nào thì cần dùng:
1. Số cột trong bảng là cố định và không có nhu cầu mở rộng
2. Chấp nhận xử lý phức tạp để đổi lấy sự đơn giản trong thiết kế


***
##  Entity-Attribute-Value
- Định nghĩa: Định nghĩa 1 bảng để lưu các `Attribute-Value`
- Giải pháp: 
1. **Single Table Inheritance** Sử dụng 1 bảng duy nhất, có thuộc tính `type` để định danh. Có những thuộc tính null
2. **Concrete Table Inheritance** Mỗi một loại được lưu trữ trong 1 bảng riêng. Các trường trong 2 bảng bị lặp
3. **Class Table Inheritance** Tạo một bảng chung để lưu các thuộc tính chung. Các thuộc tính riêng để ở bảng riêng. Bảng riêng chứa key của bảng riêng.
- Khi nào thì cần dùng:
1. Thiết kế đơn giản, số lượng ở cả 2 bảng ít
2. Nếu số lượng thuộc tính tăng lên thì số lượng cột vẫn giữa nguyên
3. Không còn tình trạng có giá trị null nếu thuộc tính không tồn tại




***
##  Naive Tree
- Định nghĩa: T
- Vấn đề: Để query một subtree có độ sâu bằng N thì phải sử dụng N phép join
- Giải pháp: 
  1. Query tất cả theo parentId rồi sử dụng `Đệ quy` Trong code để tìm
  2. RDBMS như MySQL 8+, PostgresSQL 8.4+, cung cấp cơ chế `CTE` cho phép dùng để quy trong query
- Khi nào thì cần dùng:
1. Chỉ cần thực hiện các thao tác query node cha và các node con, thêm, mà k đòi hỏi phải xóa thì `Adjacency List`
- Các giải pháp thay thế:
1. ***Path Enumeration***
- Thay thế `ParentId` bằng `Path`:  vd: path='2/', path='1/3'
- Hạn chế lúc thêm sẽ mất nhiều thao tác
2. ***Nested Set***
- Mỗi bản ghi có 2 attr `left` và `right`
  - Số left luôn bé hơn số left và right của `child`
  - Số right luôn lớn hơn số left và right của `child`
- Hạn chế lúc thêm sẽ phải tính toán lại hết các chỉ số `left, right`
3. ***Closure Table***
- Tạo ra một bảng mới để lưu ID của tất cả các comment con của một comment ở tất cả các cấp



## bài tập cuối khóa
- Thiết kế Csdl
- Áp dụng: Factory, Stagy 
- Api




