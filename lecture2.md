# Git
## Sử dụng để quay lại commit khi chưa up lên repo
- git reset --hard hash_commit
## Nếu vừa xóa muốn lấy lại thì sử dụng
- git reflog HEAD@{1}
## Git revert thì sẽ lấy commit từ commit A để merger vào nhánh hiện tại(không xóa những commit những commit nằm giữa A vào ~head)
- => phải xử lý conflic
- git log --oneline
- git revert hash_id
## NOTE: nó sẽ lấy lại commit của commit trước hash_id vừa nhập chứ không phải là commit có hash_id được nhập
