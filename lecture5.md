## Các loại code smell
- Bloaters : code càng ngày càng sinh ra nhiều
- Change Preventers: muốn thay đổi thì khó thay đổi
- Couplers: Liên kết giữa các lớp khiến khó có thể thay đổi nếu thay đổi lớp
- Dispensables: Nếu k dùng nhưng vẫn đứng đấy

## Long menthod
## Lagre class
1. Extract class
- chia nhỏ ra
3. Duplicate Observed data
- Muốn tách tính toán thì phải chấp nhận lặp code
4. Dùng quá nhiều biến dạng nguyên thủy(Nhiều biến nên khó đọc)
- 7 giải pháp
- Sử dụng object thay thế: ModelInfo
- tách thành 2 class với 2 nhóm người: employee,engineer,salesman
- nếu k thể tách được thì sẽ sử dụng EmployeeType sau đó engineer,salesman kế thừa EmployeeType
- sử dụng object cho rõ ràng hơn array
## data clumps
## Thay đổi cái gì thì khó thay đổi


## sử dùng clean code trong câu lệnh if else 
