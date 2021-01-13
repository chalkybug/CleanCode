## Chữa bài cũ
- trong thực tế thì sẽ sử dụng **connection** pool thay thế cho singleton parttern
## Connection pool
1. Cố định số conn trong pool
2. Nếu bị hết conn trong pool thì sẽ tạo mới < max pool
3. Nếu còn dư cố conn trong pool thì sẽ lấy , dùng xong sẽ trả lại pool

## trong spring sẽ có thể inject trực tiếp vào map(tìm hiểu thêm)

