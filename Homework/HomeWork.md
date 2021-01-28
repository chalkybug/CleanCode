# Nguyễn Đức Lương
## Khoá học Clean Code - Luvina 2020


## Phần 1: Clean Code căn bản
1. **5 mục tiêu chính của Clean Code là:**
   - Mục tiêu 1:  Làm cho code trở nên trang nhã, hiệu quả, dễ đọc, đơn giản, không trùng lặp và được viết tốt.
   - Mục tiêu 2:  Làm tăng giá trị cho công việc bằng code của mình
   - Mục tiêu 3:  Clean code mang lại sự dễ hiểu và chất lượng khi chúng ta đọc code.
   - Mục tiêu 4:  Điều cần thiết là code của bạn phải sạch sẽ và dễ đọc để mọi người có thể tìm thấy và dễ dàng hiểu.
   - Mục tiêu 5:  luôn tìm ra nguyên nhân gốc rễ. luôn luôn tìm kiếm nguyên nhân gốc rễ của một vấn đề(nháp)
2. **Đáp án của tôi là team C bởi vì:**
   - Lý do 1: Tiến độ là yếu tố quan trọng quyết định sự thành bại của dự án. Deadline luôn phải được ưu tiên.
   - Lý do 2: Nếu code một cách tự do ở SPIN 1 để đáp ứng dealine nhưng sẽ phải tốn nhiều thời gian và nhân lực cho những SPIN sau để khắc phục những đoạn `code smell` là một điều tệ.
   - Lý do 3: Thay đổi require là một điều thường gặp ở khách hàng. Clean code sẽ giúp chúng ta tốn ít thời gian và nhân lực hơn cho việc `change require`
   - Lý do 4: Clean code giúp đội dev có một tiếng nói chung. vd: Hãy sử dụng Factory pattern cho trường hợp A
   
3. **Những nội dung cần trả lời**
```
Bạn là một team lead, khi bạn giới thiệu các quy tắc Clean Code cho các đồng đội trẻ. Có một số bạn cho rằng Clean Code chỉ làm phức tạp thêm vấn đề, và chậm lại hiệu suất làm việc của nhóm. Bạn sẽ trả lời họ thế nào?
```
   
   - Code chạy được là một điều tốt nhưng chỉ chạy được thôi thì chưa đủ, Clean code sẽ giúp chúng ta dễ bảo trì, dễ dàng mở rộng.
   - Thay đổi require là một điều thường gặp ở khách hàng. Clean code sẽ giúp chúng ta tốn ít thời gian và nhân lực hơn cho việc `change require`
   - Code ra một đoạn code chỉ một mình có thể hiểu được là một đoạn code tệ. Sử dụng những quy tắc clean code sẽ giúp code của chúng ta dễ đọc hơn.

4. **Đề xuất của Vân là phù hợp với quy ước trong CleanCode?**
```
Đề xuất của Vân float raise là thuộc tính trong class Salary rồi.

int calculateSalaryAfterYears(int initialSalary, int NthYear);
```

5. 
```
Hãy lập trình mô hình hoá nghiệp vụ sau đây. Cụ thể là hãy bổ xung các method để hoàn thiện logic. Quan trọng hãy tuân thủ quy tắc Clean Code.
1 User có thể viết nhiều bài Post, hoặc xoá
1 User có thể viết Comment cho bài Post của người khác và chính mình. User có thể xoá comment của chính mình
```



## Phần 2: OOP và SOLID
### 1. Hãy lập trình Java để thực hiện thiết kế như hình vẽ
Gõ link đến mã nguồn bài này vào đây. Đừng comment code. Nếu thực sự CleanCode thì không cần comment vẫn hiểu được.

### 2. Composition over Inheritance và DI
Gõ link đến mã nguồn bài này vào đây


## Phần 3: Thiết kế CSDL Quan hệ theo đặc tả

## Phần 4: Thiết kế RESTful API

## Phần 5: Lập trình Restful API

## Trắc nghiệm